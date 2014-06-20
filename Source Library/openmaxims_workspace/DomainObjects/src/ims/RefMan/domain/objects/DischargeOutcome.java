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


public class DischargeOutcome extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100017;
	private static final long serialVersionUID = 1096100017L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Discharge Type */
	private ims.domain.lookups.LookupInstance dischargeType;
	/** Further Management Instructions */
	private String furtherManagement;
	/** Discharge Other Type */
	private ims.domain.lookups.LookupInstance dischargeOtherType;
	/** Other Details */
	private String otherDetails;
	/** Onward Referral */
	private ims.RefMan.domain.objects.OnwardReferral currentOnwardReferral;
	/** Onward Referrals
	  * Collection of ims.RefMan.domain.objects.OnwardReferral.
	  */
	private java.util.Set onwardReferrals;
	/** Discharge Date */
	private java.util.Date dischargeDate;
	/** UniqueLineRefNo - Used for Monthly Activity Report */
	private String uniqueLineRefNo;
	/** DI UniqueLineRefNo - Used for Monthly Activity Report */
	private String uniqueLineRefNoDI;
	/** MP UniqueLineRefNo - Used for Monthly Activity Report */
	private String uniqueLineRefNoMP;
	/** Discharging HCP */
	private ims.core.clinical.domain.objects.AuthoringInformation dischargingHCP;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation recordingInformation;
	/** EndOfCareDate */
	private java.util.Date endOfCareDate;
	/** Results to be included in Report
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderInvestigation.
	  */
	private java.util.Set resultsForReport;
	/** Diagnosis to be included in Report
	  * Collection of ims.core.clinical.domain.objects.PatientDiagnosis.
	  */
	private java.util.List diagnosisForReport;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DischargeOutcome (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DischargeOutcome ()
    {
    	super();
    }
    public DischargeOutcome (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.DischargeOutcome.class;
	}


	public ims.domain.lookups.LookupInstance getDischargeType() {
		return dischargeType;
	}
	public void setDischargeType(ims.domain.lookups.LookupInstance dischargeType) {
		this.dischargeType = dischargeType;
	}

	public String getFurtherManagement() {
		return furtherManagement;
	}
	public void setFurtherManagement(String furtherManagement) {
		this.furtherManagement = furtherManagement;
	}

	public ims.domain.lookups.LookupInstance getDischargeOtherType() {
		return dischargeOtherType;
	}
	public void setDischargeOtherType(ims.domain.lookups.LookupInstance dischargeOtherType) {
		this.dischargeOtherType = dischargeOtherType;
	}

	public String getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	public ims.RefMan.domain.objects.OnwardReferral getCurrentOnwardReferral() {
		return currentOnwardReferral;
	}
	public void setCurrentOnwardReferral(ims.RefMan.domain.objects.OnwardReferral currentOnwardReferral) {
		this.currentOnwardReferral = currentOnwardReferral;
	}

	public java.util.Set getOnwardReferrals() {
		if ( null == onwardReferrals ) {
			onwardReferrals = new java.util.HashSet();
		}
		return onwardReferrals;
	}
	public void setOnwardReferrals(java.util.Set paramValue) {
		this.onwardReferrals = paramValue;
	}

	public java.util.Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(java.util.Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public String getUniqueLineRefNo() {
		return uniqueLineRefNo;
	}
	public void setUniqueLineRefNo(String uniqueLineRefNo) {
		if ( null != uniqueLineRefNo && uniqueLineRefNo.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uniqueLineRefNo. Tried to set value: "+
				uniqueLineRefNo);
		}
		this.uniqueLineRefNo = uniqueLineRefNo;
	}

	public String getUniqueLineRefNoDI() {
		return uniqueLineRefNoDI;
	}
	public void setUniqueLineRefNoDI(String uniqueLineRefNoDI) {
		if ( null != uniqueLineRefNoDI && uniqueLineRefNoDI.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uniqueLineRefNoDI. Tried to set value: "+
				uniqueLineRefNoDI);
		}
		this.uniqueLineRefNoDI = uniqueLineRefNoDI;
	}

	public String getUniqueLineRefNoMP() {
		return uniqueLineRefNoMP;
	}
	public void setUniqueLineRefNoMP(String uniqueLineRefNoMP) {
		if ( null != uniqueLineRefNoMP && uniqueLineRefNoMP.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uniqueLineRefNoMP. Tried to set value: "+
				uniqueLineRefNoMP);
		}
		this.uniqueLineRefNoMP = uniqueLineRefNoMP;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getDischargingHCP() {
		return dischargingHCP;
	}
	public void setDischargingHCP(ims.core.clinical.domain.objects.AuthoringInformation dischargingHCP) {
		this.dischargingHCP = dischargingHCP;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.AuthoringInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
	}

	public java.util.Date getEndOfCareDate() {
		return endOfCareDate;
	}
	public void setEndOfCareDate(java.util.Date endOfCareDate) {
		this.endOfCareDate = endOfCareDate;
	}

	public java.util.Set getResultsForReport() {
		if ( null == resultsForReport ) {
			resultsForReport = new java.util.HashSet();
		}
		return resultsForReport;
	}
	public void setResultsForReport(java.util.Set paramValue) {
		this.resultsForReport = paramValue;
	}

	public java.util.List getDiagnosisForReport() {
		if ( null == diagnosisForReport ) {
			diagnosisForReport = new java.util.ArrayList();
		}
		return diagnosisForReport;
	}
	public void setDiagnosisForReport(java.util.List paramValue) {
		this.diagnosisForReport = paramValue;
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
		
		auditStr.append("\r\n*dischargeType* :");
		if (dischargeType != null)
			auditStr.append(dischargeType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*furtherManagement* :");
		auditStr.append(furtherManagement);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeOtherType* :");
		if (dischargeOtherType != null)
			auditStr.append(dischargeOtherType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*otherDetails* :");
		auditStr.append(otherDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentOnwardReferral* :");
		if (currentOnwardReferral != null)
		{
			auditStr.append(toShortClassName(currentOnwardReferral));
				
		    auditStr.append(currentOnwardReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*onwardReferrals* :");
		if (onwardReferrals != null)
		{
			java.util.Iterator it6 = onwardReferrals.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.OnwardReferral obj = (ims.RefMan.domain.objects.OnwardReferral)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDate* :");
		auditStr.append(dischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*uniqueLineRefNo* :");
		auditStr.append(uniqueLineRefNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*uniqueLineRefNoDI* :");
		auditStr.append(uniqueLineRefNoDI);
	    auditStr.append("; ");
		auditStr.append("\r\n*uniqueLineRefNoMP* :");
		auditStr.append(uniqueLineRefNoMP);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargingHCP* :");
		if (dischargingHCP != null)
		{
			auditStr.append(toShortClassName(dischargingHCP));
				
		    auditStr.append(dischargingHCP.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*endOfCareDate* :");
		auditStr.append(endOfCareDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*resultsForReport* :");
		if (resultsForReport != null)
		{
			java.util.Iterator it14 = resultsForReport.iterator();
			int i14=0;
			while (it14.hasNext())
			{
				if (i14 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.OrderInvestigation obj = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)it14.next();
		if (obj != null)
		{
		   if (i14 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i14++;
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosisForReport* :");
		if (diagnosisForReport != null)
		{
		int i15=0;
		for (i15=0; i15<diagnosisForReport.size(); i15++)
		{
			if (i15 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.PatientDiagnosis obj = (ims.core.clinical.domain.objects.PatientDiagnosis)diagnosisForReport.get(i15);
		    if (obj != null)
			{
				if (i15 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i15 > 0)
			auditStr.append("] " + i15);
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
		
		String keyClassName = "DischargeOutcome";
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
		if (this.getDischargeType() != null)
		{
			sb.append("<dischargeType>");
			sb.append(this.getDischargeType().toXMLString()); 
			sb.append("</dischargeType>");		
		}
		if (this.getFurtherManagement() != null)
		{
			sb.append("<furtherManagement>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFurtherManagement().toString()));
			sb.append("</furtherManagement>");		
		}
		if (this.getDischargeOtherType() != null)
		{
			sb.append("<dischargeOtherType>");
			sb.append(this.getDischargeOtherType().toXMLString()); 
			sb.append("</dischargeOtherType>");		
		}
		if (this.getOtherDetails() != null)
		{
			sb.append("<otherDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherDetails().toString()));
			sb.append("</otherDetails>");		
		}
		if (this.getCurrentOnwardReferral() != null)
		{
			sb.append("<currentOnwardReferral>");
			sb.append(this.getCurrentOnwardReferral().toXMLString(domMap)); 	
			sb.append("</currentOnwardReferral>");		
		}
		if (this.getOnwardReferrals() != null)
		{
			if (this.getOnwardReferrals().size() > 0 )
			{
			sb.append("<onwardReferrals>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOnwardReferrals(), domMap));
			sb.append("</onwardReferrals>");		
			}
		}
		if (this.getDischargeDate() != null)
		{
			sb.append("<dischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDate>");		
		}
		if (this.getUniqueLineRefNo() != null)
		{
			sb.append("<uniqueLineRefNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUniqueLineRefNo().toString()));
			sb.append("</uniqueLineRefNo>");		
		}
		if (this.getUniqueLineRefNoDI() != null)
		{
			sb.append("<uniqueLineRefNoDI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUniqueLineRefNoDI().toString()));
			sb.append("</uniqueLineRefNoDI>");		
		}
		if (this.getUniqueLineRefNoMP() != null)
		{
			sb.append("<uniqueLineRefNoMP>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUniqueLineRefNoMP().toString()));
			sb.append("</uniqueLineRefNoMP>");		
		}
		if (this.getDischargingHCP() != null)
		{
			sb.append("<dischargingHCP>");
			sb.append(this.getDischargingHCP().toXMLString(domMap)); 	
			sb.append("</dischargingHCP>");		
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
		}
		if (this.getEndOfCareDate() != null)
		{
			sb.append("<endOfCareDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEndOfCareDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endOfCareDate>");		
		}
		if (this.getResultsForReport() != null)
		{
			if (this.getResultsForReport().size() > 0 )
			{
			sb.append("<resultsForReport>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getResultsForReport(), domMap));
			sb.append("</resultsForReport>");		
			}
		}
		if (this.getDiagnosisForReport() != null)
		{
			if (this.getDiagnosisForReport().size() > 0 )
			{
			sb.append("<diagnosisForReport>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDiagnosisForReport(), domMap));
			sb.append("</diagnosisForReport>");		
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
			DischargeOutcome domainObject = getDischargeOutcomefromXML(itemEl, factory, domMap);

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
			DischargeOutcome domainObject = getDischargeOutcomefromXML(itemEl, factory, domMap);

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
		
	public static DischargeOutcome getDischargeOutcomefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDischargeOutcomefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DischargeOutcome getDischargeOutcomefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DischargeOutcome.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DischargeOutcome.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DischargeOutcome class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DischargeOutcome)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DischargeOutcome.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DischargeOutcome ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DischargeOutcome)factory.getImportedDomainObject(DischargeOutcome.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DischargeOutcome();
		}
		String keyClassName = "DischargeOutcome";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DischargeOutcome)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DischargeOutcome obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dischargeType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("furtherManagement");
		if(fldEl != null)
		{	
    		obj.setFurtherManagement(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeOtherType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeOtherType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("otherDetails");
		if(fldEl != null)
		{	
    		obj.setOtherDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentOnwardReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentOnwardReferral(ims.RefMan.domain.objects.OnwardReferral.getOnwardReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("onwardReferrals");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setOnwardReferrals(ims.RefMan.domain.objects.OnwardReferral.fromSetXMLString(fldEl, factory, obj.getOnwardReferrals(), domMap));
		}
		fldEl = el.element("dischargeDate");
		if(fldEl != null)
		{	
    		obj.setDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("uniqueLineRefNo");
		if(fldEl != null)
		{	
    		obj.setUniqueLineRefNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("uniqueLineRefNoDI");
		if(fldEl != null)
		{	
    		obj.setUniqueLineRefNoDI(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("uniqueLineRefNoMP");
		if(fldEl != null)
		{	
    		obj.setUniqueLineRefNoMP(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDischargingHCP(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("endOfCareDate");
		if(fldEl != null)
		{	
    		obj.setEndOfCareDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("resultsForReport");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setResultsForReport(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.fromSetXMLString(fldEl, factory, obj.getResultsForReport(), domMap));
		}
		fldEl = el.element("diagnosisForReport");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setDiagnosisForReport(ims.core.clinical.domain.objects.PatientDiagnosis.fromListXMLString(fldEl, factory, obj.getDiagnosisForReport(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "onwardReferrals"
		, "resultsForReport"
		, "diagnosisForReport"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String DischargeType = "dischargeType";
		public static final String FurtherManagement = "furtherManagement";
		public static final String DischargeOtherType = "dischargeOtherType";
		public static final String OtherDetails = "otherDetails";
		public static final String CurrentOnwardReferral = "currentOnwardReferral";
		public static final String OnwardReferrals = "onwardReferrals";
		public static final String DischargeDate = "dischargeDate";
		public static final String UniqueLineRefNo = "uniqueLineRefNo";
		public static final String UniqueLineRefNoDI = "uniqueLineRefNoDI";
		public static final String UniqueLineRefNoMP = "uniqueLineRefNoMP";
		public static final String DischargingHCP = "dischargingHCP";
		public static final String RecordingInformation = "recordingInformation";
		public static final String EndOfCareDate = "endOfCareDate";
		public static final String ResultsForReport = "resultsForReport";
		public static final String DiagnosisForReport = "diagnosisForReport";
	}
}

