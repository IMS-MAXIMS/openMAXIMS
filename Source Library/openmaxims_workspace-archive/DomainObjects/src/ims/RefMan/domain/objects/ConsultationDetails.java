/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ConsultationDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100000;
	private static final long serialVersionUID = 1096100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CATS Referral */
	private ims.RefMan.domain.objects.CatsReferral cATSReferral;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** ConsultationTime
	  * Collection of ims.RefMan.domain.objects.ConsultationTime.
	  */
	private java.util.Set consultationTimes;
	/** ClinicalContactTime
	  * Collection of ims.RefMan.domain.objects.ClinicalContactTime.
	  */
	private java.util.Set clinicalContactTime;
	/** ClinicalContactTime
	  * Collection of ims.RefMan.domain.objects.TltContactTime.
	  */
	private java.util.Set tltTimes;
	/** Referral Summary */
	private ims.RefMan.domain.objects.PresentationReferralSummary referralSummary;
	/** Baseline Observations */
	private ims.RefMan.domain.objects.NursingNotes baselineObs;
	/** OnExam */
	private ims.RefMan.domain.objects.OnExamination onExam;
	/** At Consultation */
	private ims.RefMan.domain.objects.AtConsultation atConsultation;
	/** Outcome */
	private ims.RefMan.domain.objects.ReferralOutcome outcome;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ConsultationDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ConsultationDetails ()
    {
    	super();
    }
    public ConsultationDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.ConsultationDetails.class;
	}


	public ims.RefMan.domain.objects.CatsReferral getCATSReferral() {
		return cATSReferral;
	}
	public void setCATSReferral(ims.RefMan.domain.objects.CatsReferral cATSReferral) {
		this.cATSReferral = cATSReferral;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public java.util.Set getConsultationTimes() {
		if ( null == consultationTimes ) {
			consultationTimes = new java.util.HashSet();
		}
		return consultationTimes;
	}
	public void setConsultationTimes(java.util.Set paramValue) {
		this.consultationTimes = paramValue;
	}

	public java.util.Set getClinicalContactTime() {
		if ( null == clinicalContactTime ) {
			clinicalContactTime = new java.util.HashSet();
		}
		return clinicalContactTime;
	}
	public void setClinicalContactTime(java.util.Set paramValue) {
		this.clinicalContactTime = paramValue;
	}

	public java.util.Set getTltTimes() {
		if ( null == tltTimes ) {
			tltTimes = new java.util.HashSet();
		}
		return tltTimes;
	}
	public void setTltTimes(java.util.Set paramValue) {
		this.tltTimes = paramValue;
	}

	public ims.RefMan.domain.objects.PresentationReferralSummary getReferralSummary() {
		return referralSummary;
	}
	public void setReferralSummary(ims.RefMan.domain.objects.PresentationReferralSummary referralSummary) {
		this.referralSummary = referralSummary;
	}

	public ims.RefMan.domain.objects.NursingNotes getBaselineObs() {
		return baselineObs;
	}
	public void setBaselineObs(ims.RefMan.domain.objects.NursingNotes baselineObs) {
		this.baselineObs = baselineObs;
	}

	public ims.RefMan.domain.objects.OnExamination getOnExam() {
		return onExam;
	}
	public void setOnExam(ims.RefMan.domain.objects.OnExamination onExam) {
		this.onExam = onExam;
	}

	public ims.RefMan.domain.objects.AtConsultation getAtConsultation() {
		return atConsultation;
	}
	public void setAtConsultation(ims.RefMan.domain.objects.AtConsultation atConsultation) {
		this.atConsultation = atConsultation;
	}

	public ims.RefMan.domain.objects.ReferralOutcome getOutcome() {
		return outcome;
	}
	public void setOutcome(ims.RefMan.domain.objects.ReferralOutcome outcome) {
		this.outcome = outcome;
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
		
		auditStr.append("\r\n*cATSReferral* :");
		if (cATSReferral != null)
		{
			auditStr.append(toShortClassName(cATSReferral));
				
		    auditStr.append(cATSReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*consultationTimes* :");
		if (consultationTimes != null)
		{
			java.util.Iterator it3 = consultationTimes.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.ConsultationTime obj = (ims.RefMan.domain.objects.ConsultationTime)it3.next();
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
		auditStr.append("\r\n*clinicalContactTime* :");
		if (clinicalContactTime != null)
		{
			java.util.Iterator it4 = clinicalContactTime.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.ClinicalContactTime obj = (ims.RefMan.domain.objects.ClinicalContactTime)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tltTimes* :");
		if (tltTimes != null)
		{
			java.util.Iterator it5 = tltTimes.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.TltContactTime obj = (ims.RefMan.domain.objects.TltContactTime)it5.next();
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
		auditStr.append("\r\n*referralSummary* :");
		if (referralSummary != null)
		{
			auditStr.append(toShortClassName(referralSummary));
				
		    auditStr.append(referralSummary.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*baselineObs* :");
		if (baselineObs != null)
		{
			auditStr.append(toShortClassName(baselineObs));
				
		    auditStr.append(baselineObs.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*onExam* :");
		if (onExam != null)
		{
			auditStr.append(toShortClassName(onExam));
				
		    auditStr.append(onExam.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*atConsultation* :");
		if (atConsultation != null)
		{
			auditStr.append(toShortClassName(atConsultation));
				
		    auditStr.append(atConsultation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*outcome* :");
		if (outcome != null)
		{
			auditStr.append(toShortClassName(outcome));
				
		    auditStr.append(outcome.getId());
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
		
		String keyClassName = "ConsultationDetails";
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
		if (this.getCATSReferral() != null)
		{
			sb.append("<cATSReferral>");
			sb.append(this.getCATSReferral().toXMLString(domMap)); 	
			sb.append("</cATSReferral>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getConsultationTimes() != null)
		{
			if (this.getConsultationTimes().size() > 0 )
			{
			sb.append("<consultationTimes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getConsultationTimes(), domMap));
			sb.append("</consultationTimes>");		
			}
		}
		if (this.getClinicalContactTime() != null)
		{
			if (this.getClinicalContactTime().size() > 0 )
			{
			sb.append("<clinicalContactTime>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getClinicalContactTime(), domMap));
			sb.append("</clinicalContactTime>");		
			}
		}
		if (this.getTltTimes() != null)
		{
			if (this.getTltTimes().size() > 0 )
			{
			sb.append("<tltTimes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTltTimes(), domMap));
			sb.append("</tltTimes>");		
			}
		}
		if (this.getReferralSummary() != null)
		{
			sb.append("<referralSummary>");
			sb.append(this.getReferralSummary().toXMLString(domMap)); 	
			sb.append("</referralSummary>");		
		}
		if (this.getBaselineObs() != null)
		{
			sb.append("<baselineObs>");
			sb.append(this.getBaselineObs().toXMLString(domMap)); 	
			sb.append("</baselineObs>");		
		}
		if (this.getOnExam() != null)
		{
			sb.append("<onExam>");
			sb.append(this.getOnExam().toXMLString(domMap)); 	
			sb.append("</onExam>");		
		}
		if (this.getAtConsultation() != null)
		{
			sb.append("<atConsultation>");
			sb.append(this.getAtConsultation().toXMLString(domMap)); 	
			sb.append("</atConsultation>");		
		}
		if (this.getOutcome() != null)
		{
			sb.append("<outcome>");
			sb.append(this.getOutcome().toXMLString(domMap)); 	
			sb.append("</outcome>");		
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
			ConsultationDetails domainObject = getConsultationDetailsfromXML(itemEl, factory, domMap);

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
			ConsultationDetails domainObject = getConsultationDetailsfromXML(itemEl, factory, domMap);

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
		
	public static ConsultationDetails getConsultationDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getConsultationDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ConsultationDetails getConsultationDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ConsultationDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ConsultationDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ConsultationDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ConsultationDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ConsultationDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ConsultationDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ConsultationDetails)factory.getImportedDomainObject(ConsultationDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ConsultationDetails();
		}
		String keyClassName = "ConsultationDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ConsultationDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ConsultationDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("cATSReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCATSReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("consultationTimes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setConsultationTimes(ims.RefMan.domain.objects.ConsultationTime.fromSetXMLString(fldEl, factory, obj.getConsultationTimes(), domMap));
		}
		fldEl = el.element("clinicalContactTime");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setClinicalContactTime(ims.RefMan.domain.objects.ClinicalContactTime.fromSetXMLString(fldEl, factory, obj.getClinicalContactTime(), domMap));
		}
		fldEl = el.element("tltTimes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTltTimes(ims.RefMan.domain.objects.TltContactTime.fromSetXMLString(fldEl, factory, obj.getTltTimes(), domMap));
		}
		fldEl = el.element("referralSummary");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferralSummary(ims.RefMan.domain.objects.PresentationReferralSummary.getPresentationReferralSummaryfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("baselineObs");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBaselineObs(ims.RefMan.domain.objects.NursingNotes.getNursingNotesfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("onExam");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOnExam(ims.RefMan.domain.objects.OnExamination.getOnExaminationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("atConsultation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAtConsultation(ims.RefMan.domain.objects.AtConsultation.getAtConsultationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("outcome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOutcome(ims.RefMan.domain.objects.ReferralOutcome.getReferralOutcomefromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "consultationTimes"
		, "clinicalContactTime"
		, "tltTimes"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CATSReferral = "cATSReferral";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String ConsultationTimes = "consultationTimes";
		public static final String ClinicalContactTime = "clinicalContactTime";
		public static final String TltTimes = "tltTimes";
		public static final String ReferralSummary = "referralSummary";
		public static final String BaselineObs = "baselineObs";
		public static final String OnExam = "onExam";
		public static final String AtConsultation = "atConsultation";
		public static final String Outcome = "outcome";
	}
}

