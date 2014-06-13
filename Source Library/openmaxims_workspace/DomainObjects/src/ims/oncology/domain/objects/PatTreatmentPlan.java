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
 * @author Sean Nesbitt
 * Generated.
 */


public class PatTreatmentPlan extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1105100037;
	private static final long serialVersionUID = 1105100037L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance treatmentIntent;
	private ims.core.resource.people.domain.objects.Hcp consultant;
	/** Recording Date */
	private java.util.Date dateSeen;
	/** Decision To Treat */
	private java.util.Date decisionToTreat;
	/** 
	  * Collection of ims.oncology.domain.objects.PatAction.
	  */
	private java.util.Set actions;
	private ims.core.patient.domain.objects.Patient patient;
	/** Patient Identifier - dto value */
	private Integer pkey;
	/** PAS Referral Key (review if needed) */
	private Integer rkey;
	/** Earliest Clinically Appropriate Date */
	private java.util.Date ecad_date;
	/** Could be admin MOS and taken from old HCP who created action sheet */
	private ims.core.resource.people.domain.objects.MemberOfStaff creationUser;
	/** From seen_loc Seen At */
	private ims.domain.lookups.LookupInstance seenLocation;
	/** From pat_stat Patient Status - NHS,Private */
	private ims.domain.lookups.LookupInstance patientStatus;
	/** From tsite To be changed to new Primary Tumour Site (first for the Episode which has NO end date) */
	private ims.oncology.configuration.domain.objects.TumourSite primaryTumourSite;
	/** From rusr authoring user */
	private ims.core.clinical.domain.objects.AuthoringInformation authUser;
	/** (review if needed) */
	private Integer modu;
	/** From tp_cmnt Treatment Plan Comment */
	private String treatmentplanComment;
	/** From actstat ActiveStatus */
	private Boolean activeStatus;
	/** Surgery Required Pre/Post Op */
	private ims.domain.lookups.LookupInstance surgeryRequired;
	private ims.core.admin.domain.objects.EpisodeOfCare episode;
	private ims.oncology.configuration.domain.objects.TumourGroup primaryTumourGroup;
	private ims.oncology.configuration.domain.objects.TumourHistology primaryTumourHistology;
	/** 
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List treatmentSites;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatTreatmentPlan (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatTreatmentPlan ()
    {
    	super();
    }
    public PatTreatmentPlan (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.PatTreatmentPlan.class;
	}


	public ims.domain.lookups.LookupInstance getTreatmentIntent() {
		return treatmentIntent;
	}
	public void setTreatmentIntent(ims.domain.lookups.LookupInstance treatmentIntent) {
		this.treatmentIntent = treatmentIntent;
	}

	public ims.core.resource.people.domain.objects.Hcp getConsultant() {
		return consultant;
	}
	public void setConsultant(ims.core.resource.people.domain.objects.Hcp consultant) {
		this.consultant = consultant;
	}

	public java.util.Date getDateSeen() {
		return dateSeen;
	}
	public void setDateSeen(java.util.Date dateSeen) {
		this.dateSeen = dateSeen;
	}

	public java.util.Date getDecisionToTreat() {
		return decisionToTreat;
	}
	public void setDecisionToTreat(java.util.Date decisionToTreat) {
		this.decisionToTreat = decisionToTreat;
	}

	public java.util.Set getActions() {
		if ( null == actions ) {
			actions = new java.util.HashSet();
		}
		return actions;
	}
	public void setActions(java.util.Set paramValue) {
		this.actions = paramValue;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public Integer getPkey() {
		return pkey;
	}
	public void setPkey(Integer pkey) {
		this.pkey = pkey;
	}

	public Integer getRkey() {
		return rkey;
	}
	public void setRkey(Integer rkey) {
		this.rkey = rkey;
	}

	public java.util.Date getEcad_date() {
		return ecad_date;
	}
	public void setEcad_date(java.util.Date ecad_date) {
		this.ecad_date = ecad_date;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getCreationUser() {
		return creationUser;
	}
	public void setCreationUser(ims.core.resource.people.domain.objects.MemberOfStaff creationUser) {
		this.creationUser = creationUser;
	}

	public ims.domain.lookups.LookupInstance getSeenLocation() {
		return seenLocation;
	}
	public void setSeenLocation(ims.domain.lookups.LookupInstance seenLocation) {
		this.seenLocation = seenLocation;
	}

	public ims.domain.lookups.LookupInstance getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(ims.domain.lookups.LookupInstance patientStatus) {
		this.patientStatus = patientStatus;
	}

	public ims.oncology.configuration.domain.objects.TumourSite getPrimaryTumourSite() {
		return primaryTumourSite;
	}
	public void setPrimaryTumourSite(ims.oncology.configuration.domain.objects.TumourSite primaryTumourSite) {
		this.primaryTumourSite = primaryTumourSite;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthUser() {
		return authUser;
	}
	public void setAuthUser(ims.core.clinical.domain.objects.AuthoringInformation authUser) {
		this.authUser = authUser;
	}

	public Integer getModu() {
		return modu;
	}
	public void setModu(Integer modu) {
		this.modu = modu;
	}

	public String getTreatmentplanComment() {
		return treatmentplanComment;
	}
	public void setTreatmentplanComment(String treatmentplanComment) {
		if ( null != treatmentplanComment && treatmentplanComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for treatmentplanComment. Tried to set value: "+
				treatmentplanComment);
		}
		this.treatmentplanComment = treatmentplanComment;
	}

	public Boolean isActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	public ims.domain.lookups.LookupInstance getSurgeryRequired() {
		return surgeryRequired;
	}
	public void setSurgeryRequired(ims.domain.lookups.LookupInstance surgeryRequired) {
		this.surgeryRequired = surgeryRequired;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisode() {
		return episode;
	}
	public void setEpisode(ims.core.admin.domain.objects.EpisodeOfCare episode) {
		this.episode = episode;
	}

	public ims.oncology.configuration.domain.objects.TumourGroup getPrimaryTumourGroup() {
		return primaryTumourGroup;
	}
	public void setPrimaryTumourGroup(ims.oncology.configuration.domain.objects.TumourGroup primaryTumourGroup) {
		this.primaryTumourGroup = primaryTumourGroup;
	}

	public ims.oncology.configuration.domain.objects.TumourHistology getPrimaryTumourHistology() {
		return primaryTumourHistology;
	}
	public void setPrimaryTumourHistology(ims.oncology.configuration.domain.objects.TumourHistology primaryTumourHistology) {
		this.primaryTumourHistology = primaryTumourHistology;
	}

	public java.util.List getTreatmentSites() {
		if ( null == treatmentSites ) {
			treatmentSites = new java.util.ArrayList();
		}
		return treatmentSites;
	}
	public void setTreatmentSites(java.util.List paramValue) {
		this.treatmentSites = paramValue;
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
		
		auditStr.append("\r\n*treatmentIntent* :");
		if (treatmentIntent != null)
			auditStr.append(treatmentIntent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consultant* :");
		if (consultant != null)
		{
			auditStr.append(toShortClassName(consultant));
				
		    auditStr.append(consultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateSeen* :");
		auditStr.append(dateSeen);
	    auditStr.append("; ");
		auditStr.append("\r\n*decisionToTreat* :");
		auditStr.append(decisionToTreat);
	    auditStr.append("; ");
		auditStr.append("\r\n*actions* :");
		if (actions != null)
		{
			java.util.Iterator it5 = actions.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.oncology.domain.objects.PatAction obj = (ims.oncology.domain.objects.PatAction)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pkey* :");
		auditStr.append(pkey);
	    auditStr.append("; ");
		auditStr.append("\r\n*rkey* :");
		auditStr.append(rkey);
	    auditStr.append("; ");
		auditStr.append("\r\n*ecad_date* :");
		auditStr.append(ecad_date);
	    auditStr.append("; ");
		auditStr.append("\r\n*creationUser* :");
		if (creationUser != null)
		{
			auditStr.append(toShortClassName(creationUser));
				
		    auditStr.append(creationUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*seenLocation* :");
		if (seenLocation != null)
			auditStr.append(seenLocation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientStatus* :");
		if (patientStatus != null)
			auditStr.append(patientStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryTumourSite* :");
		if (primaryTumourSite != null)
		{
			auditStr.append(toShortClassName(primaryTumourSite));
				
		    auditStr.append(primaryTumourSite.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authUser* :");
		if (authUser != null)
		{
			auditStr.append(toShortClassName(authUser));
				
		    auditStr.append(authUser.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*modu* :");
		auditStr.append(modu);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentplanComment* :");
		auditStr.append(treatmentplanComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*activeStatus* :");
		auditStr.append(activeStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*surgeryRequired* :");
		if (surgeryRequired != null)
			auditStr.append(surgeryRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*episode* :");
		if (episode != null)
		{
			auditStr.append(toShortClassName(episode));
				
		    auditStr.append(episode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryTumourGroup* :");
		if (primaryTumourGroup != null)
		{
			auditStr.append(toShortClassName(primaryTumourGroup));
				
		    auditStr.append(primaryTumourGroup.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryTumourHistology* :");
		if (primaryTumourHistology != null)
		{
			auditStr.append(toShortClassName(primaryTumourHistology));
				
		    auditStr.append(primaryTumourHistology.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentSites* :");
		if (treatmentSites != null)
		{
		int i22=0;
		for (i22=0; i22<treatmentSites.size(); i22++)
		{
			if (i22 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)treatmentSites.get(i22);
			auditStr.append(obj.getText());
		}
		if (i22 > 0)
			auditStr.append("] " + i22);
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
		
		String keyClassName = "PatTreatmentPlan";
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
		if (this.getTreatmentIntent() != null)
		{
			sb.append("<treatmentIntent>");
			sb.append(this.getTreatmentIntent().toXMLString()); 
			sb.append("</treatmentIntent>");		
		}
		if (this.getConsultant() != null)
		{
			sb.append("<consultant>");
			sb.append(this.getConsultant().toXMLString(domMap)); 	
			sb.append("</consultant>");		
		}
		if (this.getDateSeen() != null)
		{
			sb.append("<dateSeen>");
			sb.append(new ims.framework.utils.DateTime(this.getDateSeen()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateSeen>");		
		}
		if (this.getDecisionToTreat() != null)
		{
			sb.append("<decisionToTreat>");
			sb.append(new ims.framework.utils.DateTime(this.getDecisionToTreat()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</decisionToTreat>");		
		}
		if (this.getActions() != null)
		{
			if (this.getActions().size() > 0 )
			{
			sb.append("<actions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActions(), domMap));
			sb.append("</actions>");		
			}
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getPkey() != null)
		{
			sb.append("<pkey>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPkey().toString()));
			sb.append("</pkey>");		
		}
		if (this.getRkey() != null)
		{
			sb.append("<rkey>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRkey().toString()));
			sb.append("</rkey>");		
		}
		if (this.getEcad_date() != null)
		{
			sb.append("<ecad_date>");
			sb.append(new ims.framework.utils.DateTime(this.getEcad_date()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</ecad_date>");		
		}
		if (this.getCreationUser() != null)
		{
			sb.append("<creationUser>");
			sb.append(this.getCreationUser().toXMLString(domMap)); 	
			sb.append("</creationUser>");		
		}
		if (this.getSeenLocation() != null)
		{
			sb.append("<seenLocation>");
			sb.append(this.getSeenLocation().toXMLString()); 
			sb.append("</seenLocation>");		
		}
		if (this.getPatientStatus() != null)
		{
			sb.append("<patientStatus>");
			sb.append(this.getPatientStatus().toXMLString()); 
			sb.append("</patientStatus>");		
		}
		if (this.getPrimaryTumourSite() != null)
		{
			sb.append("<primaryTumourSite>");
			sb.append(this.getPrimaryTumourSite().toXMLString(domMap)); 	
			sb.append("</primaryTumourSite>");		
		}
		if (this.getAuthUser() != null)
		{
			sb.append("<authUser>");
			sb.append(this.getAuthUser().toXMLString(domMap)); 	
			sb.append("</authUser>");		
		}
		if (this.getModu() != null)
		{
			sb.append("<modu>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getModu().toString()));
			sb.append("</modu>");		
		}
		if (this.getTreatmentplanComment() != null)
		{
			sb.append("<treatmentplanComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTreatmentplanComment().toString()));
			sb.append("</treatmentplanComment>");		
		}
		if (this.isActiveStatus() != null)
		{
			sb.append("<activeStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActiveStatus().toString()));
			sb.append("</activeStatus>");		
		}
		if (this.getSurgeryRequired() != null)
		{
			sb.append("<surgeryRequired>");
			sb.append(this.getSurgeryRequired().toXMLString()); 
			sb.append("</surgeryRequired>");		
		}
		if (this.getEpisode() != null)
		{
			sb.append("<episode>");
			sb.append(this.getEpisode().toXMLString(domMap)); 	
			sb.append("</episode>");		
		}
		if (this.getPrimaryTumourGroup() != null)
		{
			sb.append("<primaryTumourGroup>");
			sb.append(this.getPrimaryTumourGroup().toXMLString(domMap)); 	
			sb.append("</primaryTumourGroup>");		
		}
		if (this.getPrimaryTumourHistology() != null)
		{
			sb.append("<primaryTumourHistology>");
			sb.append(this.getPrimaryTumourHistology().toXMLString(domMap)); 	
			sb.append("</primaryTumourHistology>");		
		}
		if (this.getTreatmentSites() != null)
		{
			if (this.getTreatmentSites().size() > 0 )
			{
			sb.append("<treatmentSites>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getTreatmentSites())); 
			sb.append("</treatmentSites>");		
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
			PatTreatmentPlan domainObject = getPatTreatmentPlanfromXML(itemEl, factory, domMap);

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
			PatTreatmentPlan domainObject = getPatTreatmentPlanfromXML(itemEl, factory, domMap);

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
		
	public static PatTreatmentPlan getPatTreatmentPlanfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatTreatmentPlanfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatTreatmentPlan getPatTreatmentPlanfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatTreatmentPlan.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatTreatmentPlan.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatTreatmentPlan class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatTreatmentPlan)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatTreatmentPlan.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatTreatmentPlan ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatTreatmentPlan)factory.getImportedDomainObject(PatTreatmentPlan.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatTreatmentPlan();
		}
		String keyClassName = "PatTreatmentPlan";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatTreatmentPlan)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatTreatmentPlan obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("treatmentIntent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatmentIntent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConsultant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateSeen");
		if(fldEl != null)
		{	
    		obj.setDateSeen(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("decisionToTreat");
		if(fldEl != null)
		{	
    		obj.setDecisionToTreat(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("actions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setActions(ims.oncology.domain.objects.PatAction.fromSetXMLString(fldEl, factory, obj.getActions(), domMap));
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pkey");
		if(fldEl != null)
		{	
    		obj.setPkey(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rkey");
		if(fldEl != null)
		{	
    		obj.setRkey(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ecad_date");
		if(fldEl != null)
		{	
    		obj.setEcad_date(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("creationUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCreationUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("seenLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSeenLocation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("primaryTumourSite");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrimaryTumourSite(ims.oncology.configuration.domain.objects.TumourSite.getTumourSitefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthUser(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("modu");
		if(fldEl != null)
		{	
    		obj.setModu(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("treatmentplanComment");
		if(fldEl != null)
		{	
    		obj.setTreatmentplanComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activeStatus");
		if(fldEl != null)
		{	
    		obj.setActiveStatus(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("surgeryRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSurgeryRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("episode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisode(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("primaryTumourGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrimaryTumourGroup(ims.oncology.configuration.domain.objects.TumourGroup.getTumourGroupfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("primaryTumourHistology");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrimaryTumourHistology(ims.oncology.configuration.domain.objects.TumourHistology.getTumourHistologyfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("treatmentSites");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTreatmentSites(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getTreatmentSites())); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "actions"
		, "treatmentSites"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TreatmentIntent = "treatmentIntent";
		public static final String Consultant = "consultant";
		public static final String DateSeen = "dateSeen";
		public static final String DecisionToTreat = "decisionToTreat";
		public static final String Actions = "actions";
		public static final String Patient = "patient";
		public static final String Pkey = "pkey";
		public static final String Rkey = "rkey";
		public static final String Ecad_date = "ecad_date";
		public static final String CreationUser = "creationUser";
		public static final String SeenLocation = "seenLocation";
		public static final String PatientStatus = "patientStatus";
		public static final String PrimaryTumourSite = "primaryTumourSite";
		public static final String AuthUser = "authUser";
		public static final String Modu = "modu";
		public static final String TreatmentplanComment = "treatmentplanComment";
		public static final String ActiveStatus = "activeStatus";
		public static final String SurgeryRequired = "surgeryRequired";
		public static final String Episode = "episode";
		public static final String PrimaryTumourGroup = "primaryTumourGroup";
		public static final String PrimaryTumourHistology = "primaryTumourHistology";
		public static final String TreatmentSites = "treatmentSites";
	}
}

