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
package ims.clinical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class PatientCaseConference extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100018;
	private static final long serialVersionUID = 1072100018L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Case Conference Date */
	private java.util.Date caseConfDate;
	/** Discharge Case Conference */
	private Boolean isDischargeCaseConf;
	/** Case Conferance OutCome */
	private ims.domain.lookups.LookupInstance caseConfOutCome;
	/** Cancellation Reason */
	private ims.domain.lookups.LookupInstance cancellationReason;
	/** Comments */
	private String comments;
	/** Discharge Delay Value */
	private Integer dischargeDelayValue;
	/** Discharge Delay Unit */
	private ims.domain.lookups.LookupInstance dischargeDelayUnit;
	/** Predicted Next Case Conference */
	private Integer predictedNextCaseConf;
	/** Predicted Discharge Date */
	private Integer predicatedDischargeDate;
	/** Minutes (Needs to hold path to document) */
	private String minutes;
	/** MOS Attendance Status
	  * Collection of ims.clinical.domain.objects.CaseConfMOSStatus.
	  */
	private java.util.Set mOSStatus;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientCaseConference (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientCaseConference ()
    {
    	super();
    }
    public PatientCaseConference (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.PatientCaseConference.class;
	}


	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public java.util.Date getCaseConfDate() {
		return caseConfDate;
	}
	public void setCaseConfDate(java.util.Date caseConfDate) {
		this.caseConfDate = caseConfDate;
	}

	public Boolean isIsDischargeCaseConf() {
		return isDischargeCaseConf;
	}
	public void setIsDischargeCaseConf(Boolean isDischargeCaseConf) {
		this.isDischargeCaseConf = isDischargeCaseConf;
	}

	public ims.domain.lookups.LookupInstance getCaseConfOutCome() {
		return caseConfOutCome;
	}
	public void setCaseConfOutCome(ims.domain.lookups.LookupInstance caseConfOutCome) {
		this.caseConfOutCome = caseConfOutCome;
	}

	public ims.domain.lookups.LookupInstance getCancellationReason() {
		return cancellationReason;
	}
	public void setCancellationReason(ims.domain.lookups.LookupInstance cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public Integer getDischargeDelayValue() {
		return dischargeDelayValue;
	}
	public void setDischargeDelayValue(Integer dischargeDelayValue) {
		this.dischargeDelayValue = dischargeDelayValue;
	}

	public ims.domain.lookups.LookupInstance getDischargeDelayUnit() {
		return dischargeDelayUnit;
	}
	public void setDischargeDelayUnit(ims.domain.lookups.LookupInstance dischargeDelayUnit) {
		this.dischargeDelayUnit = dischargeDelayUnit;
	}

	public Integer getPredictedNextCaseConf() {
		return predictedNextCaseConf;
	}
	public void setPredictedNextCaseConf(Integer predictedNextCaseConf) {
		this.predictedNextCaseConf = predictedNextCaseConf;
	}

	public Integer getPredicatedDischargeDate() {
		return predicatedDischargeDate;
	}
	public void setPredicatedDischargeDate(Integer predicatedDischargeDate) {
		this.predicatedDischargeDate = predicatedDischargeDate;
	}

	public String getMinutes() {
		return minutes;
	}
	public void setMinutes(String minutes) {
		if ( null != minutes && minutes.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for minutes. Tried to set value: "+
				minutes);
		}
		this.minutes = minutes;
	}

	public java.util.Set getMOSStatus() {
		if ( null == mOSStatus ) {
			mOSStatus = new java.util.HashSet();
		}
		return mOSStatus;
	}
	public void setMOSStatus(java.util.Set paramValue) {
		this.mOSStatus = paramValue;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
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
		auditStr.append("\r\n*caseConfDate* :");
		auditStr.append(caseConfDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*isDischargeCaseConf* :");
		auditStr.append(isDischargeCaseConf);
	    auditStr.append("; ");
		auditStr.append("\r\n*caseConfOutCome* :");
		if (caseConfOutCome != null)
			auditStr.append(caseConfOutCome.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cancellationReason* :");
		if (cancellationReason != null)
			auditStr.append(cancellationReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDelayValue* :");
		auditStr.append(dischargeDelayValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDelayUnit* :");
		if (dischargeDelayUnit != null)
			auditStr.append(dischargeDelayUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*predictedNextCaseConf* :");
		auditStr.append(predictedNextCaseConf);
	    auditStr.append("; ");
		auditStr.append("\r\n*predicatedDischargeDate* :");
		auditStr.append(predicatedDischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*minutes* :");
		auditStr.append(minutes);
	    auditStr.append("; ");
		auditStr.append("\r\n*mOSStatus* :");
		if (mOSStatus != null)
		{
			java.util.Iterator it12 = mOSStatus.iterator();
			int i12=0;
			while (it12.hasNext())
			{
				if (i12 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.CaseConfMOSStatus obj = (ims.clinical.domain.objects.CaseConfMOSStatus)it12.next();
		if (obj != null)
		{
		   if (i12 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i12++;
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
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
		
		String keyClassName = "PatientCaseConference";
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
		if (this.getCaseConfDate() != null)
		{
			sb.append("<caseConfDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCaseConfDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</caseConfDate>");		
		}
		if (this.isIsDischargeCaseConf() != null)
		{
			sb.append("<isDischargeCaseConf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDischargeCaseConf().toString()));
			sb.append("</isDischargeCaseConf>");		
		}
		if (this.getCaseConfOutCome() != null)
		{
			sb.append("<caseConfOutCome>");
			sb.append(this.getCaseConfOutCome().toXMLString()); 
			sb.append("</caseConfOutCome>");		
		}
		if (this.getCancellationReason() != null)
		{
			sb.append("<cancellationReason>");
			sb.append(this.getCancellationReason().toXMLString()); 
			sb.append("</cancellationReason>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getDischargeDelayValue() != null)
		{
			sb.append("<dischargeDelayValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDischargeDelayValue().toString()));
			sb.append("</dischargeDelayValue>");		
		}
		if (this.getDischargeDelayUnit() != null)
		{
			sb.append("<dischargeDelayUnit>");
			sb.append(this.getDischargeDelayUnit().toXMLString()); 
			sb.append("</dischargeDelayUnit>");		
		}
		if (this.getPredictedNextCaseConf() != null)
		{
			sb.append("<predictedNextCaseConf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPredictedNextCaseConf().toString()));
			sb.append("</predictedNextCaseConf>");		
		}
		if (this.getPredicatedDischargeDate() != null)
		{
			sb.append("<predicatedDischargeDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPredicatedDischargeDate().toString()));
			sb.append("</predicatedDischargeDate>");		
		}
		if (this.getMinutes() != null)
		{
			sb.append("<minutes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMinutes().toString()));
			sb.append("</minutes>");		
		}
		if (this.getMOSStatus() != null)
		{
			if (this.getMOSStatus().size() > 0 )
			{
			sb.append("<mOSStatus>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getMOSStatus(), domMap));
			sb.append("</mOSStatus>");		
			}
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
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
			PatientCaseConference domainObject = getPatientCaseConferencefromXML(itemEl, factory, domMap);

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
			PatientCaseConference domainObject = getPatientCaseConferencefromXML(itemEl, factory, domMap);

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
		
	public static PatientCaseConference getPatientCaseConferencefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientCaseConferencefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientCaseConference getPatientCaseConferencefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientCaseConference.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientCaseConference.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientCaseConference class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientCaseConference)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientCaseConference.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientCaseConference ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientCaseConference)factory.getImportedDomainObject(PatientCaseConference.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientCaseConference();
		}
		String keyClassName = "PatientCaseConference";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientCaseConference)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientCaseConference obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("caseConfDate");
		if(fldEl != null)
		{	
    		obj.setCaseConfDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isDischargeCaseConf");
		if(fldEl != null)
		{	
    		obj.setIsDischargeCaseConf(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("caseConfOutCome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCaseConfOutCome(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cancellationReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCancellationReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeDelayValue");
		if(fldEl != null)
		{	
    		obj.setDischargeDelayValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeDelayUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeDelayUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("predictedNextCaseConf");
		if(fldEl != null)
		{	
    		obj.setPredictedNextCaseConf(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("predicatedDischargeDate");
		if(fldEl != null)
		{	
    		obj.setPredicatedDischargeDate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("minutes");
		if(fldEl != null)
		{	
    		obj.setMinutes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mOSStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setMOSStatus(ims.clinical.domain.objects.CaseConfMOSStatus.fromSetXMLString(fldEl, factory, obj.getMOSStatus(), domMap));
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "mOSStatus"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CaseConfDate = "caseConfDate";
		public static final String IsDischargeCaseConf = "isDischargeCaseConf";
		public static final String CaseConfOutCome = "caseConfOutCome";
		public static final String CancellationReason = "cancellationReason";
		public static final String Comments = "comments";
		public static final String DischargeDelayValue = "dischargeDelayValue";
		public static final String DischargeDelayUnit = "dischargeDelayUnit";
		public static final String PredictedNextCaseConf = "predictedNextCaseConf";
		public static final String PredicatedDischargeDate = "predicatedDischargeDate";
		public static final String Minutes = "minutes";
		public static final String MOSStatus = "mOSStatus";
		public static final String CareContext = "careContext";
	}
}

