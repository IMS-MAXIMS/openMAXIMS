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
package ims.oncology.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class FollowUp extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100000;
	private static final long serialVersionUID = 1074100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** AssessmentDate */
	private java.util.Date assessmentDate;
	/** PrimaryTumourStatus */
	private ims.domain.lookups.LookupInstance primaryTumourStatus;
	/** NodalStatus */
	private ims.domain.lookups.LookupInstance nodalStatus;
	/** MetastaticStatus */
	private ims.domain.lookups.LookupInstance metastaticStatus;
	/** MarkerResponseStatus */
	private ims.domain.lookups.LookupInstance markerResponseStatus;
	/** PerformanceStatus */
	private ims.domain.lookups.LookupInstance performanceStatus;
	/** TreatmentType ( Treatment related morbidity type) */
	private ims.domain.lookups.LookupInstance treatmentType;
	/** PatientFollowUpStatus */
	private ims.domain.lookups.LookupInstance patientFollowUpStatus;
	/** Morbidity Code - Surgery */
	private ims.domain.lookups.LookupInstance morbidityCodeSurgery;
	/** Morbidity Code - Chemotherapy Treatment */
	private ims.domain.lookups.LookupInstance morbidityCodeCancerChemotherapy;
	/** Morbidity Code - Radiotherapy Treatment */
	private ims.domain.lookups.LookupInstance morbidityCodeCancerRadiotherapy;
	/** Morbidity Code - Combination Treatment */
	private ims.domain.lookups.LookupInstance morbidityCodeCancerCombination;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Seen By */
	private ims.core.resource.people.domain.objects.Hcp seenBy;
	/** Dyspnea Score */
	private ims.domain.lookups.LookupInstance dyspneaScore;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public FollowUp (Integer id, int ver)
    {
    	super(id, ver);
    }
    public FollowUp ()
    {
    	super();
    }
    public FollowUp (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.FollowUp.class;
	}


	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public java.util.Date getAssessmentDate() {
		return assessmentDate;
	}
	public void setAssessmentDate(java.util.Date assessmentDate) {
		this.assessmentDate = assessmentDate;
	}

	public ims.domain.lookups.LookupInstance getPrimaryTumourStatus() {
		return primaryTumourStatus;
	}
	public void setPrimaryTumourStatus(ims.domain.lookups.LookupInstance primaryTumourStatus) {
		this.primaryTumourStatus = primaryTumourStatus;
	}

	public ims.domain.lookups.LookupInstance getNodalStatus() {
		return nodalStatus;
	}
	public void setNodalStatus(ims.domain.lookups.LookupInstance nodalStatus) {
		this.nodalStatus = nodalStatus;
	}

	public ims.domain.lookups.LookupInstance getMetastaticStatus() {
		return metastaticStatus;
	}
	public void setMetastaticStatus(ims.domain.lookups.LookupInstance metastaticStatus) {
		this.metastaticStatus = metastaticStatus;
	}

	public ims.domain.lookups.LookupInstance getMarkerResponseStatus() {
		return markerResponseStatus;
	}
	public void setMarkerResponseStatus(ims.domain.lookups.LookupInstance markerResponseStatus) {
		this.markerResponseStatus = markerResponseStatus;
	}

	public ims.domain.lookups.LookupInstance getPerformanceStatus() {
		return performanceStatus;
	}
	public void setPerformanceStatus(ims.domain.lookups.LookupInstance performanceStatus) {
		this.performanceStatus = performanceStatus;
	}

	public ims.domain.lookups.LookupInstance getTreatmentType() {
		return treatmentType;
	}
	public void setTreatmentType(ims.domain.lookups.LookupInstance treatmentType) {
		this.treatmentType = treatmentType;
	}

	public ims.domain.lookups.LookupInstance getPatientFollowUpStatus() {
		return patientFollowUpStatus;
	}
	public void setPatientFollowUpStatus(ims.domain.lookups.LookupInstance patientFollowUpStatus) {
		this.patientFollowUpStatus = patientFollowUpStatus;
	}

	public ims.domain.lookups.LookupInstance getMorbidityCodeSurgery() {
		return morbidityCodeSurgery;
	}
	public void setMorbidityCodeSurgery(ims.domain.lookups.LookupInstance morbidityCodeSurgery) {
		this.morbidityCodeSurgery = morbidityCodeSurgery;
	}

	public ims.domain.lookups.LookupInstance getMorbidityCodeCancerChemotherapy() {
		return morbidityCodeCancerChemotherapy;
	}
	public void setMorbidityCodeCancerChemotherapy(ims.domain.lookups.LookupInstance morbidityCodeCancerChemotherapy) {
		this.morbidityCodeCancerChemotherapy = morbidityCodeCancerChemotherapy;
	}

	public ims.domain.lookups.LookupInstance getMorbidityCodeCancerRadiotherapy() {
		return morbidityCodeCancerRadiotherapy;
	}
	public void setMorbidityCodeCancerRadiotherapy(ims.domain.lookups.LookupInstance morbidityCodeCancerRadiotherapy) {
		this.morbidityCodeCancerRadiotherapy = morbidityCodeCancerRadiotherapy;
	}

	public ims.domain.lookups.LookupInstance getMorbidityCodeCancerCombination() {
		return morbidityCodeCancerCombination;
	}
	public void setMorbidityCodeCancerCombination(ims.domain.lookups.LookupInstance morbidityCodeCancerCombination) {
		this.morbidityCodeCancerCombination = morbidityCodeCancerCombination;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.resource.people.domain.objects.Hcp getSeenBy() {
		return seenBy;
	}
	public void setSeenBy(ims.core.resource.people.domain.objects.Hcp seenBy) {
		this.seenBy = seenBy;
	}

	public ims.domain.lookups.LookupInstance getDyspneaScore() {
		return dyspneaScore;
	}
	public void setDyspneaScore(ims.domain.lookups.LookupInstance dyspneaScore) {
		this.dyspneaScore = dyspneaScore;
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
		
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentDate* :");
		auditStr.append(assessmentDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryTumourStatus* :");
		if (primaryTumourStatus != null)
			auditStr.append(primaryTumourStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nodalStatus* :");
		if (nodalStatus != null)
			auditStr.append(nodalStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*metastaticStatus* :");
		if (metastaticStatus != null)
			auditStr.append(metastaticStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*markerResponseStatus* :");
		if (markerResponseStatus != null)
			auditStr.append(markerResponseStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*performanceStatus* :");
		if (performanceStatus != null)
			auditStr.append(performanceStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentType* :");
		if (treatmentType != null)
			auditStr.append(treatmentType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientFollowUpStatus* :");
		if (patientFollowUpStatus != null)
			auditStr.append(patientFollowUpStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*morbidityCodeSurgery* :");
		if (morbidityCodeSurgery != null)
			auditStr.append(morbidityCodeSurgery.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*morbidityCodeCancerChemotherapy* :");
		if (morbidityCodeCancerChemotherapy != null)
			auditStr.append(morbidityCodeCancerChemotherapy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*morbidityCodeCancerRadiotherapy* :");
		if (morbidityCodeCancerRadiotherapy != null)
			auditStr.append(morbidityCodeCancerRadiotherapy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*morbidityCodeCancerCombination* :");
		if (morbidityCodeCancerCombination != null)
			auditStr.append(morbidityCodeCancerCombination.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*seenBy* :");
		if (seenBy != null)
		{
			auditStr.append(toShortClassName(seenBy));
				
		    auditStr.append(seenBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dyspneaScore* :");
		if (dyspneaScore != null)
			auditStr.append(dyspneaScore.getText());
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
		
		String keyClassName = "FollowUp";
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
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getAssessmentDate() != null)
		{
			sb.append("<assessmentDate>");
			sb.append(new ims.framework.utils.DateTime(this.getAssessmentDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</assessmentDate>");		
		}
		if (this.getPrimaryTumourStatus() != null)
		{
			sb.append("<primaryTumourStatus>");
			sb.append(this.getPrimaryTumourStatus().toXMLString()); 
			sb.append("</primaryTumourStatus>");		
		}
		if (this.getNodalStatus() != null)
		{
			sb.append("<nodalStatus>");
			sb.append(this.getNodalStatus().toXMLString()); 
			sb.append("</nodalStatus>");		
		}
		if (this.getMetastaticStatus() != null)
		{
			sb.append("<metastaticStatus>");
			sb.append(this.getMetastaticStatus().toXMLString()); 
			sb.append("</metastaticStatus>");		
		}
		if (this.getMarkerResponseStatus() != null)
		{
			sb.append("<markerResponseStatus>");
			sb.append(this.getMarkerResponseStatus().toXMLString()); 
			sb.append("</markerResponseStatus>");		
		}
		if (this.getPerformanceStatus() != null)
		{
			sb.append("<performanceStatus>");
			sb.append(this.getPerformanceStatus().toXMLString()); 
			sb.append("</performanceStatus>");		
		}
		if (this.getTreatmentType() != null)
		{
			sb.append("<treatmentType>");
			sb.append(this.getTreatmentType().toXMLString()); 
			sb.append("</treatmentType>");		
		}
		if (this.getPatientFollowUpStatus() != null)
		{
			sb.append("<patientFollowUpStatus>");
			sb.append(this.getPatientFollowUpStatus().toXMLString()); 
			sb.append("</patientFollowUpStatus>");		
		}
		if (this.getMorbidityCodeSurgery() != null)
		{
			sb.append("<morbidityCodeSurgery>");
			sb.append(this.getMorbidityCodeSurgery().toXMLString()); 
			sb.append("</morbidityCodeSurgery>");		
		}
		if (this.getMorbidityCodeCancerChemotherapy() != null)
		{
			sb.append("<morbidityCodeCancerChemotherapy>");
			sb.append(this.getMorbidityCodeCancerChemotherapy().toXMLString()); 
			sb.append("</morbidityCodeCancerChemotherapy>");		
		}
		if (this.getMorbidityCodeCancerRadiotherapy() != null)
		{
			sb.append("<morbidityCodeCancerRadiotherapy>");
			sb.append(this.getMorbidityCodeCancerRadiotherapy().toXMLString()); 
			sb.append("</morbidityCodeCancerRadiotherapy>");		
		}
		if (this.getMorbidityCodeCancerCombination() != null)
		{
			sb.append("<morbidityCodeCancerCombination>");
			sb.append(this.getMorbidityCodeCancerCombination().toXMLString()); 
			sb.append("</morbidityCodeCancerCombination>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getSeenBy() != null)
		{
			sb.append("<seenBy>");
			sb.append(this.getSeenBy().toXMLString(domMap)); 	
			sb.append("</seenBy>");		
		}
		if (this.getDyspneaScore() != null)
		{
			sb.append("<dyspneaScore>");
			sb.append(this.getDyspneaScore().toXMLString()); 
			sb.append("</dyspneaScore>");		
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
			FollowUp domainObject = getFollowUpfromXML(itemEl, factory, domMap);

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
			FollowUp domainObject = getFollowUpfromXML(itemEl, factory, domMap);

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
		
	public static FollowUp getFollowUpfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getFollowUpfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static FollowUp getFollowUpfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!FollowUp.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!FollowUp.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the FollowUp class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (FollowUp)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(FollowUp.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		FollowUp ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (FollowUp)factory.getImportedDomainObject(FollowUp.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new FollowUp();
		}
		String keyClassName = "FollowUp";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (FollowUp)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, FollowUp obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assessmentDate");
		if(fldEl != null)
		{	
    		obj.setAssessmentDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("primaryTumourStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrimaryTumourStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nodalStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNodalStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("metastaticStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMetastaticStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("markerResponseStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMarkerResponseStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("performanceStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPerformanceStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatmentType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatmentType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientFollowUpStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientFollowUpStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("morbidityCodeSurgery");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMorbidityCodeSurgery(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("morbidityCodeCancerChemotherapy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMorbidityCodeCancerChemotherapy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("morbidityCodeCancerRadiotherapy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMorbidityCodeCancerRadiotherapy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("morbidityCodeCancerCombination");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMorbidityCodeCancerCombination(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("seenBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSeenBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dyspneaScore");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDyspneaScore(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String AssessmentDate = "assessmentDate";
		public static final String PrimaryTumourStatus = "primaryTumourStatus";
		public static final String NodalStatus = "nodalStatus";
		public static final String MetastaticStatus = "metastaticStatus";
		public static final String MarkerResponseStatus = "markerResponseStatus";
		public static final String PerformanceStatus = "performanceStatus";
		public static final String TreatmentType = "treatmentType";
		public static final String PatientFollowUpStatus = "patientFollowUpStatus";
		public static final String MorbidityCodeSurgery = "morbidityCodeSurgery";
		public static final String MorbidityCodeCancerChemotherapy = "morbidityCodeCancerChemotherapy";
		public static final String MorbidityCodeCancerRadiotherapy = "morbidityCodeCancerRadiotherapy";
		public static final String MorbidityCodeCancerCombination = "morbidityCodeCancerCombination";
		public static final String CareContext = "careContext";
		public static final String SeenBy = "seenBy";
		public static final String DyspneaScore = "dyspneaScore";
	}
}

