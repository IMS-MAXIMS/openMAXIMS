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
package ims.emergency.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class AttendDiagInvTreatStatus extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100056;
	private static final long serialVersionUID = 1086100056L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Emergency Episode */
	private ims.core.admin.domain.objects.EpisodeOfCare episode;
	/** Emergency Attendance */
	private ims.core.admin.domain.objects.CareContext attendance;
	/** NoInvestigations */
	private Boolean noInvestigations;
	/** InvestigationNotRecorded */
	private Boolean investigationNotRecorded;
	/** NoTreatments */
	private Boolean noTreatments;
	/** TreatmentsNotRecorded */
	private Boolean treatmentsNotRecorded;
	/** NoDiagnoses */
	private Boolean noDiagnoses;
	/** DiagnosesNotRecorded */
	private Boolean diagnosesNotRecorded;
	/** InvestigationReasonText */
	private String investigationReasonText;
	/** InvestigationReason */
	private ims.domain.lookups.LookupInstance investigationReason;
	/** TreatmentReasonText */
	private String treatmentReasonText;
	/** TreatmentReason */
	private ims.domain.lookups.LookupInstance treatmentReason;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AttendDiagInvTreatStatus (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AttendDiagInvTreatStatus ()
    {
    	super();
    }
    public AttendDiagInvTreatStatus (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.domain.objects.AttendDiagInvTreatStatus.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisode() {
		return episode;
	}
	public void setEpisode(ims.core.admin.domain.objects.EpisodeOfCare episode) {
		this.episode = episode;
	}

	public ims.core.admin.domain.objects.CareContext getAttendance() {
		return attendance;
	}
	public void setAttendance(ims.core.admin.domain.objects.CareContext attendance) {
		this.attendance = attendance;
	}

	public Boolean isNoInvestigations() {
		return noInvestigations;
	}
	public void setNoInvestigations(Boolean noInvestigations) {
		this.noInvestigations = noInvestigations;
	}

	public Boolean isInvestigationNotRecorded() {
		return investigationNotRecorded;
	}
	public void setInvestigationNotRecorded(Boolean investigationNotRecorded) {
		this.investigationNotRecorded = investigationNotRecorded;
	}

	public Boolean isNoTreatments() {
		return noTreatments;
	}
	public void setNoTreatments(Boolean noTreatments) {
		this.noTreatments = noTreatments;
	}

	public Boolean isTreatmentsNotRecorded() {
		return treatmentsNotRecorded;
	}
	public void setTreatmentsNotRecorded(Boolean treatmentsNotRecorded) {
		this.treatmentsNotRecorded = treatmentsNotRecorded;
	}

	public Boolean isNoDiagnoses() {
		return noDiagnoses;
	}
	public void setNoDiagnoses(Boolean noDiagnoses) {
		this.noDiagnoses = noDiagnoses;
	}

	public Boolean isDiagnosesNotRecorded() {
		return diagnosesNotRecorded;
	}
	public void setDiagnosesNotRecorded(Boolean diagnosesNotRecorded) {
		this.diagnosesNotRecorded = diagnosesNotRecorded;
	}

	public String getInvestigationReasonText() {
		return investigationReasonText;
	}
	public void setInvestigationReasonText(String investigationReasonText) {
		if ( null != investigationReasonText && investigationReasonText.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for investigationReasonText. Tried to set value: "+
				investigationReasonText);
		}
		this.investigationReasonText = investigationReasonText;
	}

	public ims.domain.lookups.LookupInstance getInvestigationReason() {
		return investigationReason;
	}
	public void setInvestigationReason(ims.domain.lookups.LookupInstance investigationReason) {
		this.investigationReason = investigationReason;
	}

	public String getTreatmentReasonText() {
		return treatmentReasonText;
	}
	public void setTreatmentReasonText(String treatmentReasonText) {
		if ( null != treatmentReasonText && treatmentReasonText.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for treatmentReasonText. Tried to set value: "+
				treatmentReasonText);
		}
		this.treatmentReasonText = treatmentReasonText;
	}

	public ims.domain.lookups.LookupInstance getTreatmentReason() {
		return treatmentReason;
	}
	public void setTreatmentReason(ims.domain.lookups.LookupInstance treatmentReason) {
		this.treatmentReason = treatmentReason;
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
		
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episode* :");
		if (episode != null)
		{
			auditStr.append(toShortClassName(episode));
				
		    auditStr.append(episode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*attendance* :");
		if (attendance != null)
		{
			auditStr.append(toShortClassName(attendance));
				
		    auditStr.append(attendance.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*noInvestigations* :");
		auditStr.append(noInvestigations);
	    auditStr.append("; ");
		auditStr.append("\r\n*investigationNotRecorded* :");
		auditStr.append(investigationNotRecorded);
	    auditStr.append("; ");
		auditStr.append("\r\n*noTreatments* :");
		auditStr.append(noTreatments);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentsNotRecorded* :");
		auditStr.append(treatmentsNotRecorded);
	    auditStr.append("; ");
		auditStr.append("\r\n*noDiagnoses* :");
		auditStr.append(noDiagnoses);
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosesNotRecorded* :");
		auditStr.append(diagnosesNotRecorded);
	    auditStr.append("; ");
		auditStr.append("\r\n*investigationReasonText* :");
		auditStr.append(investigationReasonText);
	    auditStr.append("; ");
		auditStr.append("\r\n*investigationReason* :");
		if (investigationReason != null)
			auditStr.append(investigationReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentReasonText* :");
		auditStr.append(treatmentReasonText);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentReason* :");
		if (treatmentReason != null)
			auditStr.append(treatmentReason.getText());
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
		
		String keyClassName = "AttendDiagInvTreatStatus";
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
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getEpisode() != null)
		{
			sb.append("<episode>");
			sb.append(this.getEpisode().toXMLString(domMap)); 	
			sb.append("</episode>");		
		}
		if (this.getAttendance() != null)
		{
			sb.append("<attendance>");
			sb.append(this.getAttendance().toXMLString(domMap)); 	
			sb.append("</attendance>");		
		}
		if (this.isNoInvestigations() != null)
		{
			sb.append("<noInvestigations>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNoInvestigations().toString()));
			sb.append("</noInvestigations>");		
		}
		if (this.isInvestigationNotRecorded() != null)
		{
			sb.append("<investigationNotRecorded>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isInvestigationNotRecorded().toString()));
			sb.append("</investigationNotRecorded>");		
		}
		if (this.isNoTreatments() != null)
		{
			sb.append("<noTreatments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNoTreatments().toString()));
			sb.append("</noTreatments>");		
		}
		if (this.isTreatmentsNotRecorded() != null)
		{
			sb.append("<treatmentsNotRecorded>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTreatmentsNotRecorded().toString()));
			sb.append("</treatmentsNotRecorded>");		
		}
		if (this.isNoDiagnoses() != null)
		{
			sb.append("<noDiagnoses>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNoDiagnoses().toString()));
			sb.append("</noDiagnoses>");		
		}
		if (this.isDiagnosesNotRecorded() != null)
		{
			sb.append("<diagnosesNotRecorded>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDiagnosesNotRecorded().toString()));
			sb.append("</diagnosesNotRecorded>");		
		}
		if (this.getInvestigationReasonText() != null)
		{
			sb.append("<investigationReasonText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInvestigationReasonText().toString()));
			sb.append("</investigationReasonText>");		
		}
		if (this.getInvestigationReason() != null)
		{
			sb.append("<investigationReason>");
			sb.append(this.getInvestigationReason().toXMLString()); 
			sb.append("</investigationReason>");		
		}
		if (this.getTreatmentReasonText() != null)
		{
			sb.append("<treatmentReasonText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTreatmentReasonText().toString()));
			sb.append("</treatmentReasonText>");		
		}
		if (this.getTreatmentReason() != null)
		{
			sb.append("<treatmentReason>");
			sb.append(this.getTreatmentReason().toXMLString()); 
			sb.append("</treatmentReason>");		
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
			AttendDiagInvTreatStatus domainObject = getAttendDiagInvTreatStatusfromXML(itemEl, factory, domMap);

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
			AttendDiagInvTreatStatus domainObject = getAttendDiagInvTreatStatusfromXML(itemEl, factory, domMap);

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
		
	public static AttendDiagInvTreatStatus getAttendDiagInvTreatStatusfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAttendDiagInvTreatStatusfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AttendDiagInvTreatStatus getAttendDiagInvTreatStatusfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AttendDiagInvTreatStatus.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AttendDiagInvTreatStatus.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AttendDiagInvTreatStatus class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AttendDiagInvTreatStatus)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AttendDiagInvTreatStatus.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AttendDiagInvTreatStatus ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AttendDiagInvTreatStatus)factory.getImportedDomainObject(AttendDiagInvTreatStatus.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AttendDiagInvTreatStatus();
		}
		String keyClassName = "AttendDiagInvTreatStatus";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AttendDiagInvTreatStatus)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AttendDiagInvTreatStatus obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisode(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("attendance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAttendance(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("noInvestigations");
		if(fldEl != null)
		{	
    		obj.setNoInvestigations(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("investigationNotRecorded");
		if(fldEl != null)
		{	
    		obj.setInvestigationNotRecorded(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noTreatments");
		if(fldEl != null)
		{	
    		obj.setNoTreatments(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("treatmentsNotRecorded");
		if(fldEl != null)
		{	
    		obj.setTreatmentsNotRecorded(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noDiagnoses");
		if(fldEl != null)
		{	
    		obj.setNoDiagnoses(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("diagnosesNotRecorded");
		if(fldEl != null)
		{	
    		obj.setDiagnosesNotRecorded(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("investigationReasonText");
		if(fldEl != null)
		{	
    		obj.setInvestigationReasonText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("investigationReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInvestigationReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatmentReasonText");
		if(fldEl != null)
		{	
    		obj.setTreatmentReasonText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("treatmentReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatmentReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String Patient = "patient";
		public static final String Episode = "episode";
		public static final String Attendance = "attendance";
		public static final String NoInvestigations = "noInvestigations";
		public static final String InvestigationNotRecorded = "investigationNotRecorded";
		public static final String NoTreatments = "noTreatments";
		public static final String TreatmentsNotRecorded = "treatmentsNotRecorded";
		public static final String NoDiagnoses = "noDiagnoses";
		public static final String DiagnosesNotRecorded = "diagnosesNotRecorded";
		public static final String InvestigationReasonText = "investigationReasonText";
		public static final String InvestigationReason = "investigationReason";
		public static final String TreatmentReasonText = "treatmentReasonText";
		public static final String TreatmentReason = "treatmentReason";
	}
}

