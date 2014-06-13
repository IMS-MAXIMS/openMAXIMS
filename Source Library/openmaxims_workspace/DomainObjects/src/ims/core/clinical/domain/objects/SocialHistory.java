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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class SocialHistory extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100026;
	private static final long serialVersionUID = 1003100026L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** MaritalStatus */
	private ims.core.clinical.domain.objects.SocialHistoryMaritalStatus maritalStatus;
	/** Current Smoking Status */
	private ims.domain.lookups.LookupInstance smokingStatus;
	/** Smoking Details
	  * Collection of ims.core.clinical.domain.objects.SmokingDetails.
	  */
	private java.util.Set smokingDetails;
	/** Alcohol Details */
	private ims.core.clinical.domain.objects.Alcohol alcohol;
	/** IllicitDrugs */
	private String illicitDrugs;
	/** Occupation */
	private ims.domain.lookups.LookupInstance occupation;
	/** Occupation Text: If Occupation is Other */
	private String occupationText;
	/** OccupationStatus */
	private ims.domain.lookups.LookupInstance occupationStatus;
	/** Lives With */
	private ims.domain.lookups.LookupInstance livesWith;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Lives With: Fit To Care For Patient? */
	private ims.domain.lookups.LookupInstance fitToCareForPatient;
	/** Lives With: Fit To Take Patient Home? */
	private ims.domain.lookups.LookupInstance fitToTakeHome;
	/** General Social History Notes */
	private String socialHistoryNotes;
	/** MobilityIndependence */
	private String mobilityIndependence;
	/** Diet */
	private ims.domain.lookups.LookupInstance diet;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Illicit Drugs */
	private ims.core.clinical.domain.objects.IllicitDrugs illicitDrugsList;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SocialHistory (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SocialHistory ()
    {
    	super();
    }
    public SocialHistory (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.SocialHistory.class;
	}


	public ims.core.clinical.domain.objects.SocialHistoryMaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(ims.core.clinical.domain.objects.SocialHistoryMaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public ims.domain.lookups.LookupInstance getSmokingStatus() {
		return smokingStatus;
	}
	public void setSmokingStatus(ims.domain.lookups.LookupInstance smokingStatus) {
		this.smokingStatus = smokingStatus;
	}

	public java.util.Set getSmokingDetails() {
		if ( null == smokingDetails ) {
			smokingDetails = new java.util.HashSet();
		}
		return smokingDetails;
	}
	public void setSmokingDetails(java.util.Set paramValue) {
		this.smokingDetails = paramValue;
	}

	public ims.core.clinical.domain.objects.Alcohol getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(ims.core.clinical.domain.objects.Alcohol alcohol) {
		this.alcohol = alcohol;
	}

	public String getIllicitDrugs() {
		return illicitDrugs;
	}
	public void setIllicitDrugs(String illicitDrugs) {
		if ( null != illicitDrugs && illicitDrugs.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for illicitDrugs. Tried to set value: "+
				illicitDrugs);
		}
		this.illicitDrugs = illicitDrugs;
	}

	public ims.domain.lookups.LookupInstance getOccupation() {
		return occupation;
	}
	public void setOccupation(ims.domain.lookups.LookupInstance occupation) {
		this.occupation = occupation;
	}

	public String getOccupationText() {
		return occupationText;
	}
	public void setOccupationText(String occupationText) {
		if ( null != occupationText && occupationText.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for occupationText. Tried to set value: "+
				occupationText);
		}
		this.occupationText = occupationText;
	}

	public ims.domain.lookups.LookupInstance getOccupationStatus() {
		return occupationStatus;
	}
	public void setOccupationStatus(ims.domain.lookups.LookupInstance occupationStatus) {
		this.occupationStatus = occupationStatus;
	}

	public ims.domain.lookups.LookupInstance getLivesWith() {
		return livesWith;
	}
	public void setLivesWith(ims.domain.lookups.LookupInstance livesWith) {
		this.livesWith = livesWith;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.domain.lookups.LookupInstance getFitToCareForPatient() {
		return fitToCareForPatient;
	}
	public void setFitToCareForPatient(ims.domain.lookups.LookupInstance fitToCareForPatient) {
		this.fitToCareForPatient = fitToCareForPatient;
	}

	public ims.domain.lookups.LookupInstance getFitToTakeHome() {
		return fitToTakeHome;
	}
	public void setFitToTakeHome(ims.domain.lookups.LookupInstance fitToTakeHome) {
		this.fitToTakeHome = fitToTakeHome;
	}

	public String getSocialHistoryNotes() {
		return socialHistoryNotes;
	}
	public void setSocialHistoryNotes(String socialHistoryNotes) {
		if ( null != socialHistoryNotes && socialHistoryNotes.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for socialHistoryNotes. Tried to set value: "+
				socialHistoryNotes);
		}
		this.socialHistoryNotes = socialHistoryNotes;
	}

	public String getMobilityIndependence() {
		return mobilityIndependence;
	}
	public void setMobilityIndependence(String mobilityIndependence) {
		if ( null != mobilityIndependence && mobilityIndependence.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for mobilityIndependence. Tried to set value: "+
				mobilityIndependence);
		}
		this.mobilityIndependence = mobilityIndependence;
	}

	public ims.domain.lookups.LookupInstance getDiet() {
		return diet;
	}
	public void setDiet(ims.domain.lookups.LookupInstance diet) {
		this.diet = diet;
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

	public ims.core.clinical.domain.objects.IllicitDrugs getIllicitDrugsList() {
		return illicitDrugsList;
	}
	public void setIllicitDrugsList(ims.core.clinical.domain.objects.IllicitDrugs illicitDrugsList) {
		this.illicitDrugsList = illicitDrugsList;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
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
		
		auditStr.append("\r\n*maritalStatus* :");
		if (maritalStatus != null)
		{
			auditStr.append(toShortClassName(maritalStatus));
				
		    auditStr.append(maritalStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*smokingStatus* :");
		if (smokingStatus != null)
			auditStr.append(smokingStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*smokingDetails* :");
		if (smokingDetails != null)
		{
			java.util.Iterator it3 = smokingDetails.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.SmokingDetails obj = (ims.core.clinical.domain.objects.SmokingDetails)it3.next();
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
		auditStr.append("\r\n*alcohol* :");
		if (alcohol != null)
		{
			auditStr.append(toShortClassName(alcohol));
				
		    auditStr.append(alcohol.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*illicitDrugs* :");
		auditStr.append(illicitDrugs);
	    auditStr.append("; ");
		auditStr.append("\r\n*occupation* :");
		if (occupation != null)
			auditStr.append(occupation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*occupationText* :");
		auditStr.append(occupationText);
	    auditStr.append("; ");
		auditStr.append("\r\n*occupationStatus* :");
		if (occupationStatus != null)
			auditStr.append(occupationStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*livesWith* :");
		if (livesWith != null)
			auditStr.append(livesWith.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*fitToCareForPatient* :");
		if (fitToCareForPatient != null)
			auditStr.append(fitToCareForPatient.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*fitToTakeHome* :");
		if (fitToTakeHome != null)
			auditStr.append(fitToTakeHome.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*socialHistoryNotes* :");
		auditStr.append(socialHistoryNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*mobilityIndependence* :");
		auditStr.append(mobilityIndependence);
	    auditStr.append("; ");
		auditStr.append("\r\n*diet* :");
		if (diet != null)
			auditStr.append(diet.getText());
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
		auditStr.append("\r\n*illicitDrugsList* :");
		if (illicitDrugsList != null)
		{
			auditStr.append(toShortClassName(illicitDrugsList));
				
		    auditStr.append(illicitDrugsList.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
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
		
		String keyClassName = "SocialHistory";
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
		if (this.getMaritalStatus() != null)
		{
			sb.append("<maritalStatus>");
			sb.append(this.getMaritalStatus().toXMLString(domMap)); 	
			sb.append("</maritalStatus>");		
		}
		if (this.getSmokingStatus() != null)
		{
			sb.append("<smokingStatus>");
			sb.append(this.getSmokingStatus().toXMLString()); 
			sb.append("</smokingStatus>");		
		}
		if (this.getSmokingDetails() != null)
		{
			if (this.getSmokingDetails().size() > 0 )
			{
			sb.append("<smokingDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSmokingDetails(), domMap));
			sb.append("</smokingDetails>");		
			}
		}
		if (this.getAlcohol() != null)
		{
			sb.append("<alcohol>");
			sb.append(this.getAlcohol().toXMLString(domMap)); 	
			sb.append("</alcohol>");		
		}
		if (this.getIllicitDrugs() != null)
		{
			sb.append("<illicitDrugs>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIllicitDrugs().toString()));
			sb.append("</illicitDrugs>");		
		}
		if (this.getOccupation() != null)
		{
			sb.append("<occupation>");
			sb.append(this.getOccupation().toXMLString()); 
			sb.append("</occupation>");		
		}
		if (this.getOccupationText() != null)
		{
			sb.append("<occupationText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOccupationText().toString()));
			sb.append("</occupationText>");		
		}
		if (this.getOccupationStatus() != null)
		{
			sb.append("<occupationStatus>");
			sb.append(this.getOccupationStatus().toXMLString()); 
			sb.append("</occupationStatus>");		
		}
		if (this.getLivesWith() != null)
		{
			sb.append("<livesWith>");
			sb.append(this.getLivesWith().toXMLString()); 
			sb.append("</livesWith>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getFitToCareForPatient() != null)
		{
			sb.append("<fitToCareForPatient>");
			sb.append(this.getFitToCareForPatient().toXMLString()); 
			sb.append("</fitToCareForPatient>");		
		}
		if (this.getFitToTakeHome() != null)
		{
			sb.append("<fitToTakeHome>");
			sb.append(this.getFitToTakeHome().toXMLString()); 
			sb.append("</fitToTakeHome>");		
		}
		if (this.getSocialHistoryNotes() != null)
		{
			sb.append("<socialHistoryNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSocialHistoryNotes().toString()));
			sb.append("</socialHistoryNotes>");		
		}
		if (this.getMobilityIndependence() != null)
		{
			sb.append("<mobilityIndependence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMobilityIndependence().toString()));
			sb.append("</mobilityIndependence>");		
		}
		if (this.getDiet() != null)
		{
			sb.append("<diet>");
			sb.append(this.getDiet().toXMLString()); 
			sb.append("</diet>");		
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
		if (this.getIllicitDrugsList() != null)
		{
			sb.append("<illicitDrugsList>");
			sb.append(this.getIllicitDrugsList().toXMLString(domMap)); 	
			sb.append("</illicitDrugsList>");		
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
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
			SocialHistory domainObject = getSocialHistoryfromXML(itemEl, factory, domMap);

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
			SocialHistory domainObject = getSocialHistoryfromXML(itemEl, factory, domMap);

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
		
	public static SocialHistory getSocialHistoryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSocialHistoryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SocialHistory getSocialHistoryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SocialHistory.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SocialHistory.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SocialHistory class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SocialHistory)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SocialHistory.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SocialHistory ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SocialHistory)factory.getImportedDomainObject(SocialHistory.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SocialHistory();
		}
		String keyClassName = "SocialHistory";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SocialHistory)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SocialHistory obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("maritalStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMaritalStatus(ims.core.clinical.domain.objects.SocialHistoryMaritalStatus.getSocialHistoryMaritalStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("smokingStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSmokingStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("smokingDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSmokingDetails(ims.core.clinical.domain.objects.SmokingDetails.fromSetXMLString(fldEl, factory, obj.getSmokingDetails(), domMap));
		}
		fldEl = el.element("alcohol");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAlcohol(ims.core.clinical.domain.objects.Alcohol.getAlcoholfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("illicitDrugs");
		if(fldEl != null)
		{	
    		obj.setIllicitDrugs(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("occupation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOccupation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("occupationText");
		if(fldEl != null)
		{	
    		obj.setOccupationText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("occupationStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOccupationStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("livesWith");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLivesWith(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("fitToCareForPatient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFitToCareForPatient(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("fitToTakeHome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFitToTakeHome(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("socialHistoryNotes");
		if(fldEl != null)
		{	
    		obj.setSocialHistoryNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mobilityIndependence");
		if(fldEl != null)
		{	
    		obj.setMobilityIndependence(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("diet");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDiet(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		fldEl = el.element("illicitDrugsList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setIllicitDrugsList(ims.core.clinical.domain.objects.IllicitDrugs.getIllicitDrugsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "smokingDetails"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String MaritalStatus = "maritalStatus";
		public static final String SmokingStatus = "smokingStatus";
		public static final String SmokingDetails = "smokingDetails";
		public static final String Alcohol = "alcohol";
		public static final String IllicitDrugs = "illicitDrugs";
		public static final String Occupation = "occupation";
		public static final String OccupationText = "occupationText";
		public static final String OccupationStatus = "occupationStatus";
		public static final String LivesWith = "livesWith";
		public static final String ClinicalContact = "clinicalContact";
		public static final String FitToCareForPatient = "fitToCareForPatient";
		public static final String FitToTakeHome = "fitToTakeHome";
		public static final String SocialHistoryNotes = "socialHistoryNotes";
		public static final String MobilityIndependence = "mobilityIndependence";
		public static final String Diet = "diet";
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String IllicitDrugsList = "illicitDrugsList";
		public static final String RecordingInformation = "recordingInformation";
	}
}

