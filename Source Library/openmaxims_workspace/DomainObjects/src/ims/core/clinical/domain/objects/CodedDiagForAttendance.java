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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Cristian Belciug
 * Generated.
 */


public class CodedDiagForAttendance extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100138;
	private static final long serialVersionUID = 1003100138L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Diagnosis Lookup */
	private ims.core.clinical.domain.objects.Diagnosis diagnosis;
	/** Diagnosis Description */
	private String diagnosisDescription;
	/** Laterality */
	private ims.domain.lookups.LookupInstance diagLaterality;
	/** Source of Information - GP/Patient/Notes */
	private ims.domain.lookups.LookupInstance sourceofInformation;
	/** Date Diagnosis Made */
	private Integer diagnosedDate;
	/** CurrentStatus */
	private ims.core.clinical.domain.objects.CodedDiagnosisStatus currentStatus;
	/** Status History
	  * Collection of ims.core.clinical.domain.objects.CodedDiagnosisStatus.
	  */
	private java.util.Set statusHistory;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** Coding Sequence set on Coding Form */
	private Integer codingSequence;
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInfo;
	private Boolean isMain;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CodedDiagForAttendance (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CodedDiagForAttendance ()
    {
    	super();
    }
    public CodedDiagForAttendance (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.CodedDiagForAttendance.class;
	}


	public ims.core.clinical.domain.objects.Diagnosis getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(ims.core.clinical.domain.objects.Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDiagnosisDescription() {
		return diagnosisDescription;
	}
	public void setDiagnosisDescription(String diagnosisDescription) {
		if ( null != diagnosisDescription && diagnosisDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for diagnosisDescription. Tried to set value: "+
				diagnosisDescription);
		}
		this.diagnosisDescription = diagnosisDescription;
	}

	public ims.domain.lookups.LookupInstance getDiagLaterality() {
		return diagLaterality;
	}
	public void setDiagLaterality(ims.domain.lookups.LookupInstance diagLaterality) {
		this.diagLaterality = diagLaterality;
	}

	public ims.domain.lookups.LookupInstance getSourceofInformation() {
		return sourceofInformation;
	}
	public void setSourceofInformation(ims.domain.lookups.LookupInstance sourceofInformation) {
		this.sourceofInformation = sourceofInformation;
	}

	public Integer getDiagnosedDate() {
		return diagnosedDate;
	}
	public void setDiagnosedDate(Integer diagnosedDate) {
		this.diagnosedDate = diagnosedDate;
	}

	public ims.core.clinical.domain.objects.CodedDiagnosisStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.core.clinical.domain.objects.CodedDiagnosisStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.Set getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.HashSet();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.Set paramValue) {
		this.statusHistory = paramValue;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public Integer getCodingSequence() {
		return codingSequence;
	}
	public void setCodingSequence(Integer codingSequence) {
		this.codingSequence = codingSequence;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInfo() {
		return recordingInfo;
	}
	public void setRecordingInfo(ims.core.clinical.domain.objects.RecordingUserInformation recordingInfo) {
		this.recordingInfo = recordingInfo;
	}

	public Boolean isIsMain() {
		return isMain;
	}
	public void setIsMain(Boolean isMain) {
		this.isMain = isMain;
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
		
		auditStr.append("\r\n*diagnosis* :");
		if (diagnosis != null)
		{
			auditStr.append(toShortClassName(diagnosis));
				
		    auditStr.append(diagnosis.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosisDescription* :");
		auditStr.append(diagnosisDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*diagLaterality* :");
		if (diagLaterality != null)
			auditStr.append(diagLaterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceofInformation* :");
		if (sourceofInformation != null)
			auditStr.append(sourceofInformation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosedDate* :");
		auditStr.append(diagnosedDate);
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
			java.util.Iterator it7 = statusHistory.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.CodedDiagnosisStatus obj = (ims.core.clinical.domain.objects.CodedDiagnosisStatus)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*codingSequence* :");
		auditStr.append(codingSequence);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInfo* :");
		if (recordingInfo != null)
		{
			auditStr.append(toShortClassName(recordingInfo));
				
		    auditStr.append(recordingInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isMain* :");
		auditStr.append(isMain);
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
		
		String keyClassName = "CodedDiagForAttendance";
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
		if (this.getDiagnosis() != null)
		{
			sb.append("<diagnosis>");
			sb.append(this.getDiagnosis().toXMLString(domMap)); 	
			sb.append("</diagnosis>");		
		}
		if (this.getDiagnosisDescription() != null)
		{
			sb.append("<diagnosisDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDiagnosisDescription().toString()));
			sb.append("</diagnosisDescription>");		
		}
		if (this.getDiagLaterality() != null)
		{
			sb.append("<diagLaterality>");
			sb.append(this.getDiagLaterality().toXMLString()); 
			sb.append("</diagLaterality>");		
		}
		if (this.getSourceofInformation() != null)
		{
			sb.append("<sourceofInformation>");
			sb.append(this.getSourceofInformation().toXMLString()); 
			sb.append("</sourceofInformation>");		
		}
		if (this.getDiagnosedDate() != null)
		{
			sb.append("<diagnosedDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDiagnosedDate().toString()));
			sb.append("</diagnosedDate>");		
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getCodingSequence() != null)
		{
			sb.append("<codingSequence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCodingSequence().toString()));
			sb.append("</codingSequence>");		
		}
		if (this.getRecordingInfo() != null)
		{
			sb.append("<recordingInfo>");
			sb.append(this.getRecordingInfo().toXMLString(domMap)); 	
			sb.append("</recordingInfo>");		
		}
		if (this.isIsMain() != null)
		{
			sb.append("<isMain>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMain().toString()));
			sb.append("</isMain>");		
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
			CodedDiagForAttendance domainObject = getCodedDiagForAttendancefromXML(itemEl, factory, domMap);

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
			CodedDiagForAttendance domainObject = getCodedDiagForAttendancefromXML(itemEl, factory, domMap);

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
		
	public static CodedDiagForAttendance getCodedDiagForAttendancefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCodedDiagForAttendancefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CodedDiagForAttendance getCodedDiagForAttendancefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CodedDiagForAttendance.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CodedDiagForAttendance.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CodedDiagForAttendance class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CodedDiagForAttendance)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CodedDiagForAttendance.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CodedDiagForAttendance ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CodedDiagForAttendance)factory.getImportedDomainObject(CodedDiagForAttendance.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CodedDiagForAttendance();
		}
		String keyClassName = "CodedDiagForAttendance";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CodedDiagForAttendance)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CodedDiagForAttendance obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("diagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiagnosis(ims.core.clinical.domain.objects.Diagnosis.getDiagnosisfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("diagnosisDescription");
		if(fldEl != null)
		{	
    		obj.setDiagnosisDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("diagLaterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDiagLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sourceofInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceofInformation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("diagnosedDate");
		if(fldEl != null)
		{	
    		obj.setDiagnosedDate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.core.clinical.domain.objects.CodedDiagnosisStatus.getCodedDiagnosisStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStatusHistory(ims.core.clinical.domain.objects.CodedDiagnosisStatus.fromSetXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("codingSequence");
		if(fldEl != null)
		{	
    		obj.setCodingSequence(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recordingInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInfo(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isMain");
		if(fldEl != null)
		{	
    		obj.setIsMain(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "statusHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Diagnosis = "diagnosis";
		public static final String DiagnosisDescription = "diagnosisDescription";
		public static final String DiagLaterality = "diagLaterality";
		public static final String SourceofInformation = "sourceofInformation";
		public static final String DiagnosedDate = "diagnosedDate";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String CareContext = "careContext";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String CodingSequence = "codingSequence";
		public static final String RecordingInfo = "recordingInfo";
		public static final String IsMain = "isMain";
	}
}

