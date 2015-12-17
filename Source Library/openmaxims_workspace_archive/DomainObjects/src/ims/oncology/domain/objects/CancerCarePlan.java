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


public class CancerCarePlan extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100016;
	private static final long serialVersionUID = 1074100016L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** CarePlanDate */
	private java.util.Date carePlanDate;
	/** ConsultantInCharge */
	private ims.core.resource.people.domain.objects.Hcp consultantInCharge;
	/** CarePlanIntent */
	private ims.domain.lookups.LookupInstance carePlanIntent;
	/** RecurrenceIndicator */
	private ims.domain.lookups.LookupInstance recurrenceIndicator;
	/** CarePlanNotes */
	private String carePlanNotes;
	/** TreatmentModalities
	  * Collection of ims.oncology.domain.objects.CarePlanModality.
	  */
	private java.util.List treatmentModalities;
	/** CurrentStatus */
	private ims.domain.lookups.LookupInstance currentStatus;
	/** AgreedDate */
	private java.util.Date agreedDate;
	/** ReasonPatientPlanDiff */
	private String reasonPatientPlanDiffMDT;
	/** NoAntiCancerTxReason
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List noAntiCancerTxReason;
	/** AssociatedMDTMeeting */
	private Boolean hasAssociatedMDTMeeting;
	/** MDTMeeting */
	private ims.oncology.domain.objects.CancerMDTMeeting mdtMeeting;
	/** ReasonForRevision */
	private String reasonForRevision;
	/** IsCurrent */
	private Boolean isCurrent;
	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CancerCarePlan (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CancerCarePlan ()
    {
    	super();
    }
    public CancerCarePlan (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.CancerCarePlan.class;
	}


	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public java.util.Date getCarePlanDate() {
		return carePlanDate;
	}
	public void setCarePlanDate(java.util.Date carePlanDate) {
		this.carePlanDate = carePlanDate;
	}

	public ims.core.resource.people.domain.objects.Hcp getConsultantInCharge() {
		return consultantInCharge;
	}
	public void setConsultantInCharge(ims.core.resource.people.domain.objects.Hcp consultantInCharge) {
		this.consultantInCharge = consultantInCharge;
	}

	public ims.domain.lookups.LookupInstance getCarePlanIntent() {
		return carePlanIntent;
	}
	public void setCarePlanIntent(ims.domain.lookups.LookupInstance carePlanIntent) {
		this.carePlanIntent = carePlanIntent;
	}

	public ims.domain.lookups.LookupInstance getRecurrenceIndicator() {
		return recurrenceIndicator;
	}
	public void setRecurrenceIndicator(ims.domain.lookups.LookupInstance recurrenceIndicator) {
		this.recurrenceIndicator = recurrenceIndicator;
	}

	public String getCarePlanNotes() {
		return carePlanNotes;
	}
	public void setCarePlanNotes(String carePlanNotes) {
		if ( null != carePlanNotes && carePlanNotes.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for carePlanNotes. Tried to set value: "+
				carePlanNotes);
		}
		this.carePlanNotes = carePlanNotes;
	}

	public java.util.List getTreatmentModalities() {
		if ( null == treatmentModalities ) {
			treatmentModalities = new java.util.ArrayList();
		}
		return treatmentModalities;
	}
	public void setTreatmentModalities(java.util.List paramValue) {
		this.treatmentModalities = paramValue;
	}

	public ims.domain.lookups.LookupInstance getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.domain.lookups.LookupInstance currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.Date getAgreedDate() {
		return agreedDate;
	}
	public void setAgreedDate(java.util.Date agreedDate) {
		this.agreedDate = agreedDate;
	}

	public String getReasonPatientPlanDiffMDT() {
		return reasonPatientPlanDiffMDT;
	}
	public void setReasonPatientPlanDiffMDT(String reasonPatientPlanDiffMDT) {
		if ( null != reasonPatientPlanDiffMDT && reasonPatientPlanDiffMDT.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonPatientPlanDiffMDT. Tried to set value: "+
				reasonPatientPlanDiffMDT);
		}
		this.reasonPatientPlanDiffMDT = reasonPatientPlanDiffMDT;
	}

	public java.util.List getNoAntiCancerTxReason() {
		if ( null == noAntiCancerTxReason ) {
			noAntiCancerTxReason = new java.util.ArrayList();
		}
		return noAntiCancerTxReason;
	}
	public void setNoAntiCancerTxReason(java.util.List paramValue) {
		this.noAntiCancerTxReason = paramValue;
	}

	public Boolean isHasAssociatedMDTMeeting() {
		return hasAssociatedMDTMeeting;
	}
	public void setHasAssociatedMDTMeeting(Boolean hasAssociatedMDTMeeting) {
		this.hasAssociatedMDTMeeting = hasAssociatedMDTMeeting;
	}

	public ims.oncology.domain.objects.CancerMDTMeeting getMdtMeeting() {
		return mdtMeeting;
	}
	public void setMdtMeeting(ims.oncology.domain.objects.CancerMDTMeeting mdtMeeting) {
		this.mdtMeeting = mdtMeeting;
	}

	public String getReasonForRevision() {
		return reasonForRevision;
	}
	public void setReasonForRevision(String reasonForRevision) {
		if ( null != reasonForRevision && reasonForRevision.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonForRevision. Tried to set value: "+
				reasonForRevision);
		}
		this.reasonForRevision = reasonForRevision;
	}

	public Boolean isIsCurrent() {
		return isCurrent;
	}
	public void setIsCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
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
		
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*carePlanDate* :");
		auditStr.append(carePlanDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*consultantInCharge* :");
		if (consultantInCharge != null)
		{
			auditStr.append(toShortClassName(consultantInCharge));
				
		    auditStr.append(consultantInCharge.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*carePlanIntent* :");
		if (carePlanIntent != null)
			auditStr.append(carePlanIntent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*recurrenceIndicator* :");
		if (recurrenceIndicator != null)
			auditStr.append(recurrenceIndicator.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*carePlanNotes* :");
		auditStr.append(carePlanNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentModalities* :");
		if (treatmentModalities != null)
		{
		int i8=0;
		for (i8=0; i8<treatmentModalities.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.oncology.domain.objects.CarePlanModality obj = (ims.oncology.domain.objects.CarePlanModality)treatmentModalities.get(i8);
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
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
			auditStr.append(currentStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*agreedDate* :");
		auditStr.append(agreedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonPatientPlanDiffMDT* :");
		auditStr.append(reasonPatientPlanDiffMDT);
	    auditStr.append("; ");
		auditStr.append("\r\n*noAntiCancerTxReason* :");
		if (noAntiCancerTxReason != null)
		{
			java.util.Iterator it12 = noAntiCancerTxReason.iterator();
			int i12=0;
			while (it12.hasNext())
			{
				if (i12 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it12.next();
			auditStr.append(obj.getText());
			i12++;
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasAssociatedMDTMeeting* :");
		auditStr.append(hasAssociatedMDTMeeting);
	    auditStr.append("; ");
		auditStr.append("\r\n*mdtMeeting* :");
		if (mdtMeeting != null)
		{
			auditStr.append(toShortClassName(mdtMeeting));
				
		    auditStr.append(mdtMeeting.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForRevision* :");
		auditStr.append(reasonForRevision);
	    auditStr.append("; ");
		auditStr.append("\r\n*isCurrent* :");
		auditStr.append(isCurrent);
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
		
		String keyClassName = "CancerCarePlan";
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
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getCarePlanDate() != null)
		{
			sb.append("<carePlanDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCarePlanDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</carePlanDate>");		
		}
		if (this.getConsultantInCharge() != null)
		{
			sb.append("<consultantInCharge>");
			sb.append(this.getConsultantInCharge().toXMLString(domMap)); 	
			sb.append("</consultantInCharge>");		
		}
		if (this.getCarePlanIntent() != null)
		{
			sb.append("<carePlanIntent>");
			sb.append(this.getCarePlanIntent().toXMLString()); 
			sb.append("</carePlanIntent>");		
		}
		if (this.getRecurrenceIndicator() != null)
		{
			sb.append("<recurrenceIndicator>");
			sb.append(this.getRecurrenceIndicator().toXMLString()); 
			sb.append("</recurrenceIndicator>");		
		}
		if (this.getCarePlanNotes() != null)
		{
			sb.append("<carePlanNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCarePlanNotes().toString()));
			sb.append("</carePlanNotes>");		
		}
		if (this.getTreatmentModalities() != null)
		{
			if (this.getTreatmentModalities().size() > 0 )
			{
			sb.append("<treatmentModalities>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTreatmentModalities(), domMap));
			sb.append("</treatmentModalities>");		
			}
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString()); 
			sb.append("</currentStatus>");		
		}
		if (this.getAgreedDate() != null)
		{
			sb.append("<agreedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getAgreedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</agreedDate>");		
		}
		if (this.getReasonPatientPlanDiffMDT() != null)
		{
			sb.append("<reasonPatientPlanDiffMDT>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonPatientPlanDiffMDT().toString()));
			sb.append("</reasonPatientPlanDiffMDT>");		
		}
		if (this.getNoAntiCancerTxReason() != null)
		{
			if (this.getNoAntiCancerTxReason().size() > 0 )
			{
			sb.append("<noAntiCancerTxReason>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getNoAntiCancerTxReason())); 
			sb.append("</noAntiCancerTxReason>");		
			}
		}
		if (this.isHasAssociatedMDTMeeting() != null)
		{
			sb.append("<hasAssociatedMDTMeeting>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasAssociatedMDTMeeting().toString()));
			sb.append("</hasAssociatedMDTMeeting>");		
		}
		if (this.getMdtMeeting() != null)
		{
			sb.append("<mdtMeeting>");
			sb.append(this.getMdtMeeting().toXMLString(domMap)); 	
			sb.append("</mdtMeeting>");		
		}
		if (this.getReasonForRevision() != null)
		{
			sb.append("<reasonForRevision>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForRevision().toString()));
			sb.append("</reasonForRevision>");		
		}
		if (this.isIsCurrent() != null)
		{
			sb.append("<isCurrent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCurrent().toString()));
			sb.append("</isCurrent>");		
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
			CancerCarePlan domainObject = getCancerCarePlanfromXML(itemEl, factory, domMap);

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
			CancerCarePlan domainObject = getCancerCarePlanfromXML(itemEl, factory, domMap);

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
		
	public static CancerCarePlan getCancerCarePlanfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCancerCarePlanfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CancerCarePlan getCancerCarePlanfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CancerCarePlan.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CancerCarePlan.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CancerCarePlan class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CancerCarePlan)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CancerCarePlan.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CancerCarePlan ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CancerCarePlan)factory.getImportedDomainObject(CancerCarePlan.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CancerCarePlan();
		}
		String keyClassName = "CancerCarePlan";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CancerCarePlan)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CancerCarePlan obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("carePlanDate");
		if(fldEl != null)
		{	
    		obj.setCarePlanDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("consultantInCharge");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConsultantInCharge(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("carePlanIntent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCarePlanIntent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("recurrenceIndicator");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRecurrenceIndicator(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("carePlanNotes");
		if(fldEl != null)
		{	
    		obj.setCarePlanNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("treatmentModalities");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTreatmentModalities(ims.oncology.domain.objects.CarePlanModality.fromListXMLString(fldEl, factory, obj.getTreatmentModalities(), domMap));
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCurrentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("agreedDate");
		if(fldEl != null)
		{	
    		obj.setAgreedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reasonPatientPlanDiffMDT");
		if(fldEl != null)
		{	
    		obj.setReasonPatientPlanDiffMDT(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noAntiCancerTxReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setNoAntiCancerTxReason(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getNoAntiCancerTxReason())); 
		}
		fldEl = el.element("hasAssociatedMDTMeeting");
		if(fldEl != null)
		{	
    		obj.setHasAssociatedMDTMeeting(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mdtMeeting");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMdtMeeting(ims.oncology.domain.objects.CancerMDTMeeting.getCancerMDTMeetingfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("reasonForRevision");
		if(fldEl != null)
		{	
    		obj.setReasonForRevision(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isCurrent");
		if(fldEl != null)
		{	
    		obj.setIsCurrent(new Boolean(fldEl.getTextTrim()));	
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
		 "treatmentModalities"
		, "noAntiCancerTxReason"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String CarePlanDate = "carePlanDate";
		public static final String ConsultantInCharge = "consultantInCharge";
		public static final String CarePlanIntent = "carePlanIntent";
		public static final String RecurrenceIndicator = "recurrenceIndicator";
		public static final String CarePlanNotes = "carePlanNotes";
		public static final String TreatmentModalities = "treatmentModalities";
		public static final String CurrentStatus = "currentStatus";
		public static final String AgreedDate = "agreedDate";
		public static final String ReasonPatientPlanDiffMDT = "reasonPatientPlanDiffMDT";
		public static final String NoAntiCancerTxReason = "noAntiCancerTxReason";
		public static final String HasAssociatedMDTMeeting = "hasAssociatedMDTMeeting";
		public static final String MdtMeeting = "mdtMeeting";
		public static final String ReasonForRevision = "reasonForRevision";
		public static final String IsCurrent = "isCurrent";
		public static final String EpisodeOfCare = "episodeOfCare";
	}
}

