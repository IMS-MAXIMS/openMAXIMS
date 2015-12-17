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
 * @author Neil McAnaspie
 * Generated.
 */


public class CancerReferralDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100046;
	private static final long serialVersionUID = 1074100046L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** PAS Referral */
	private ims.core.admin.domain.objects.Referral pASReferral;
	/** Assessment */
	private ims.assessment.instantiation.domain.objects.PatientAssessment assessment;
	/** AuthoringInfo */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInfo;
	/** Tumour related referral? */
	private Boolean tumourRel;
	/** First Therapeutic Intervention */
	private ims.domain.lookups.LookupInstance firstTheraInter;
	/** Performance Status at First Visit */
	private ims.domain.lookups.LookupInstance perfStatus;
	/** Non Tumour Related referral Diagnosis */
	private ims.core.clinical.domain.objects.PatientDiagnosis diagnosis;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CancerReferralDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CancerReferralDetails ()
    {
    	super();
    }
    public CancerReferralDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.CancerReferralDetails.class;
	}


	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public ims.core.admin.domain.objects.Referral getPASReferral() {
		return pASReferral;
	}
	public void setPASReferral(ims.core.admin.domain.objects.Referral pASReferral) {
		this.pASReferral = pASReferral;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getAssessment() {
		return assessment;
	}
	public void setAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment assessment) {
		this.assessment = assessment;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInfo() {
		return authoringInfo;
	}
	public void setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation authoringInfo) {
		this.authoringInfo = authoringInfo;
	}

	public Boolean isTumourRel() {
		return tumourRel;
	}
	public void setTumourRel(Boolean tumourRel) {
		this.tumourRel = tumourRel;
	}

	public ims.domain.lookups.LookupInstance getFirstTheraInter() {
		return firstTheraInter;
	}
	public void setFirstTheraInter(ims.domain.lookups.LookupInstance firstTheraInter) {
		this.firstTheraInter = firstTheraInter;
	}

	public ims.domain.lookups.LookupInstance getPerfStatus() {
		return perfStatus;
	}
	public void setPerfStatus(ims.domain.lookups.LookupInstance perfStatus) {
		this.perfStatus = perfStatus;
	}

	public ims.core.clinical.domain.objects.PatientDiagnosis getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(ims.core.clinical.domain.objects.PatientDiagnosis diagnosis) {
		this.diagnosis = diagnosis;
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
	// method generated based on 'referral_unq_idx1' unique index.
	public static boolean recordExistForEpisodeOfCareAndPASReferral(ims.domain.ILightweightDomainFactory factory,
		 ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare
	,
	 ims.core.admin.domain.objects.Referral pASReferral
	)	
	{
		return recordExistForEpisodeOfCareAndPASReferral(factory, episodeOfCare, pASReferral, null);
	}	

	// method generated based on 'referral_unq_idx1' unique index.
	public static boolean recordExistForEpisodeOfCareAndPASReferral(ims.domain.ILightweightDomainFactory factory,
		 ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare
	,
	 ims.core.admin.domain.objects.Referral pASReferral
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from CancerReferralDetails c where ");
		hql.append(" c.episodeOfCare = :episodeOfCare ");
		names[0] = "episodeOfCare";
		values[0] = episodeOfCare;		
		hql.append(" and "); 
		hql.append(" c.pASReferral = :pASReferral ");
		names[1] = "pASReferral";
		values[1] = pASReferral;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'referral_unq_idx1' unique index.
	public static CancerReferralDetails getRecordByEpisodeOfCareAndPASReferral(ims.domain.ILightweightDomainFactory factory,
	 ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare
	,
	 ims.core.admin.domain.objects.Referral pASReferral
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from CancerReferralDetails c where ");
		hql.append(" c.episodeOfCare = :episodeOfCare ");
		names[0] = "episodeOfCare";
		values[0] = episodeOfCare;		
		hql.append(" and "); 
		hql.append(" c.pASReferral = :pASReferral ");
		names[1] = "pASReferral";
		values[1] = pASReferral;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (CancerReferralDetails)l.get(0);
	}

	public static CancerReferralDetails getCancerReferralDetailsFromreferral_unq_idx1(ims.domain.ILightweightDomainFactory factory,
	 ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare
	,
	 ims.core.admin.domain.objects.Referral pASReferral
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from CancerReferralDetails c where ");
		hql.append(" c.episodeOfCare = :episodeOfCare ");
		names[0] = "episodeOfCare";
		values[0] = episodeOfCare;		
		hql.append(" and "); 
		hql.append(" c.pASReferral = :pASReferral ");
		names[1] = "pASReferral";
		values[1] = pASReferral;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (CancerReferralDetails)l.get(0);
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
		auditStr.append("\r\n*pASReferral* :");
		if (pASReferral != null)
		{
			auditStr.append(toShortClassName(pASReferral));
				
		    auditStr.append(pASReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessment* :");
		if (assessment != null)
		{
			auditStr.append(toShortClassName(assessment));
				
		    auditStr.append(assessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInfo* :");
		if (authoringInfo != null)
		{
			auditStr.append(toShortClassName(authoringInfo));
				
		    auditStr.append(authoringInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tumourRel* :");
		auditStr.append(tumourRel);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstTheraInter* :");
		if (firstTheraInter != null)
			auditStr.append(firstTheraInter.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*perfStatus* :");
		if (perfStatus != null)
			auditStr.append(perfStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosis* :");
		if (diagnosis != null)
		{
			auditStr.append(toShortClassName(diagnosis));
				
		    auditStr.append(diagnosis.getId());
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
		
		String keyClassName = "CancerReferralDetails";
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
		if (this.getPASReferral() != null)
		{
			sb.append("<pASReferral>");
			sb.append(this.getPASReferral().toXMLString(domMap)); 	
			sb.append("</pASReferral>");		
		}
		if (this.getAssessment() != null)
		{
			sb.append("<assessment>");
			sb.append(this.getAssessment().toXMLString(domMap)); 	
			sb.append("</assessment>");		
		}
		if (this.getAuthoringInfo() != null)
		{
			sb.append("<authoringInfo>");
			sb.append(this.getAuthoringInfo().toXMLString(domMap)); 	
			sb.append("</authoringInfo>");		
		}
		if (this.isTumourRel() != null)
		{
			sb.append("<tumourRel>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTumourRel().toString()));
			sb.append("</tumourRel>");		
		}
		if (this.getFirstTheraInter() != null)
		{
			sb.append("<firstTheraInter>");
			sb.append(this.getFirstTheraInter().toXMLString()); 
			sb.append("</firstTheraInter>");		
		}
		if (this.getPerfStatus() != null)
		{
			sb.append("<perfStatus>");
			sb.append(this.getPerfStatus().toXMLString()); 
			sb.append("</perfStatus>");		
		}
		if (this.getDiagnosis() != null)
		{
			sb.append("<diagnosis>");
			sb.append(this.getDiagnosis().toXMLString(domMap)); 	
			sb.append("</diagnosis>");		
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
			CancerReferralDetails domainObject = getCancerReferralDetailsfromXML(itemEl, factory, domMap);

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
			CancerReferralDetails domainObject = getCancerReferralDetailsfromXML(itemEl, factory, domMap);

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
		
	public static CancerReferralDetails getCancerReferralDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCancerReferralDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CancerReferralDetails getCancerReferralDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CancerReferralDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CancerReferralDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CancerReferralDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CancerReferralDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CancerReferralDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CancerReferralDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CancerReferralDetails)factory.getImportedDomainObject(CancerReferralDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CancerReferralDetails();
		}
		String keyClassName = "CancerReferralDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CancerReferralDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CancerReferralDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pASReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPASReferral(ims.core.admin.domain.objects.Referral.getReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tumourRel");
		if(fldEl != null)
		{	
    		obj.setTumourRel(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("firstTheraInter");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFirstTheraInter(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("perfStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPerfStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("diagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiagnosis(ims.core.clinical.domain.objects.PatientDiagnosis.getPatientDiagnosisfromXML(fldEl, factory, domMap)); 
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
		public static final String PASReferral = "pASReferral";
		public static final String Assessment = "assessment";
		public static final String AuthoringInfo = "authoringInfo";
		public static final String TumourRel = "tumourRel";
		public static final String FirstTheraInter = "firstTheraInter";
		public static final String PerfStatus = "perfStatus";
		public static final String Diagnosis = "diagnosis";
	}
}

