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
package ims.RefMan.domain.objects;

/**
 * 
 * @author Cristian Belciug
 * Generated.
 */


public class TriageOutcome extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100077;
	private static final long serialVersionUID = 1096100077L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance triageOutcomeStatus;
	private ims.RefMan.domain.objects.OutcomeAcceptedDetails acceptedDetails;
	/** 
	  * Collection of ims.RefMan.domain.objects.LinkedDiagnostic.
	  */
	private java.util.List triagePendingDiagnosticResult;
	private ims.RefMan.domain.objects.RedirectReferralDetails redirectReferralDetails;
	/** User */
	private ims.core.resource.people.domain.objects.MemberOfStaff recordingUser;
	/** Status Date Time */
	private java.util.Date recordingDateTime;
	private String triagePendingDiagnosticResultComment;
	private String awaitingClinicalInformationComment;
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TriageOutcome (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TriageOutcome ()
    {
    	super();
    }
    public TriageOutcome (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.TriageOutcome.class;
	}


	public ims.domain.lookups.LookupInstance getTriageOutcomeStatus() {
		return triageOutcomeStatus;
	}
	public void setTriageOutcomeStatus(ims.domain.lookups.LookupInstance triageOutcomeStatus) {
		this.triageOutcomeStatus = triageOutcomeStatus;
	}

	public ims.RefMan.domain.objects.OutcomeAcceptedDetails getAcceptedDetails() {
		return acceptedDetails;
	}
	public void setAcceptedDetails(ims.RefMan.domain.objects.OutcomeAcceptedDetails acceptedDetails) {
		this.acceptedDetails = acceptedDetails;
	}

	public java.util.List getTriagePendingDiagnosticResult() {
		if ( null == triagePendingDiagnosticResult ) {
			triagePendingDiagnosticResult = new java.util.ArrayList();
		}
		return triagePendingDiagnosticResult;
	}
	public void setTriagePendingDiagnosticResult(java.util.List paramValue) {
		this.triagePendingDiagnosticResult = paramValue;
	}

	public ims.RefMan.domain.objects.RedirectReferralDetails getRedirectReferralDetails() {
		return redirectReferralDetails;
	}
	public void setRedirectReferralDetails(ims.RefMan.domain.objects.RedirectReferralDetails redirectReferralDetails) {
		this.redirectReferralDetails = redirectReferralDetails;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRecordingUser() {
		return recordingUser;
	}
	public void setRecordingUser(ims.core.resource.people.domain.objects.MemberOfStaff recordingUser) {
		this.recordingUser = recordingUser;
	}

	public java.util.Date getRecordingDateTime() {
		return recordingDateTime;
	}
	public void setRecordingDateTime(java.util.Date recordingDateTime) {
		this.recordingDateTime = recordingDateTime;
	}

	public String getTriagePendingDiagnosticResultComment() {
		return triagePendingDiagnosticResultComment;
	}
	public void setTriagePendingDiagnosticResultComment(String triagePendingDiagnosticResultComment) {
		this.triagePendingDiagnosticResultComment = triagePendingDiagnosticResultComment;
	}

	public String getAwaitingClinicalInformationComment() {
		return awaitingClinicalInformationComment;
	}
	public void setAwaitingClinicalInformationComment(String awaitingClinicalInformationComment) {
		this.awaitingClinicalInformationComment = awaitingClinicalInformationComment;
	}

	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
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
		
		auditStr.append("\r\n*triageOutcomeStatus* :");
		if (triageOutcomeStatus != null)
			auditStr.append(triageOutcomeStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*acceptedDetails* :");
		if (acceptedDetails != null)
		{
			auditStr.append(toShortClassName(acceptedDetails));
				
		    auditStr.append(acceptedDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*triagePendingDiagnosticResult* :");
		if (triagePendingDiagnosticResult != null)
		{
		int i3=0;
		for (i3=0; i3<triagePendingDiagnosticResult.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.LinkedDiagnostic obj = (ims.RefMan.domain.objects.LinkedDiagnostic)triagePendingDiagnosticResult.get(i3);
		    if (obj != null)
			{
				if (i3 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*redirectReferralDetails* :");
		if (redirectReferralDetails != null)
		{
			auditStr.append(toShortClassName(redirectReferralDetails));
				
		    auditStr.append(redirectReferralDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingUser* :");
		if (recordingUser != null)
		{
			auditStr.append(toShortClassName(recordingUser));
				
		    auditStr.append(recordingUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingDateTime* :");
		auditStr.append(recordingDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*triagePendingDiagnosticResultComment* :");
		auditStr.append(triagePendingDiagnosticResultComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingClinicalInformationComment* :");
		auditStr.append(awaitingClinicalInformationComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*catsReferral* :");
		if (catsReferral != null)
		{
			auditStr.append(toShortClassName(catsReferral));
				
		    auditStr.append(catsReferral.getId());
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
		
		String keyClassName = "TriageOutcome";
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
		if (this.getTriageOutcomeStatus() != null)
		{
			sb.append("<triageOutcomeStatus>");
			sb.append(this.getTriageOutcomeStatus().toXMLString()); 
			sb.append("</triageOutcomeStatus>");		
		}
		if (this.getAcceptedDetails() != null)
		{
			sb.append("<acceptedDetails>");
			sb.append(this.getAcceptedDetails().toXMLString(domMap)); 	
			sb.append("</acceptedDetails>");		
		}
		if (this.getTriagePendingDiagnosticResult() != null)
		{
			if (this.getTriagePendingDiagnosticResult().size() > 0 )
			{
			sb.append("<triagePendingDiagnosticResult>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTriagePendingDiagnosticResult(), domMap));
			sb.append("</triagePendingDiagnosticResult>");		
			}
		}
		if (this.getRedirectReferralDetails() != null)
		{
			sb.append("<redirectReferralDetails>");
			sb.append(this.getRedirectReferralDetails().toXMLString(domMap)); 	
			sb.append("</redirectReferralDetails>");		
		}
		if (this.getRecordingUser() != null)
		{
			sb.append("<recordingUser>");
			sb.append(this.getRecordingUser().toXMLString(domMap)); 	
			sb.append("</recordingUser>");		
		}
		if (this.getRecordingDateTime() != null)
		{
			sb.append("<recordingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRecordingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</recordingDateTime>");		
		}
		if (this.getTriagePendingDiagnosticResultComment() != null)
		{
			sb.append("<triagePendingDiagnosticResultComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTriagePendingDiagnosticResultComment().toString()));
			sb.append("</triagePendingDiagnosticResultComment>");		
		}
		if (this.getAwaitingClinicalInformationComment() != null)
		{
			sb.append("<awaitingClinicalInformationComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingClinicalInformationComment().toString()));
			sb.append("</awaitingClinicalInformationComment>");		
		}
		if (this.getCatsReferral() != null)
		{
			sb.append("<catsReferral>");
			sb.append(this.getCatsReferral().toXMLString(domMap)); 	
			sb.append("</catsReferral>");		
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
			TriageOutcome domainObject = getTriageOutcomefromXML(itemEl, factory, domMap);

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
			TriageOutcome domainObject = getTriageOutcomefromXML(itemEl, factory, domMap);

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
		
	public static TriageOutcome getTriageOutcomefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTriageOutcomefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TriageOutcome getTriageOutcomefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TriageOutcome.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TriageOutcome.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TriageOutcome class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TriageOutcome)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TriageOutcome.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TriageOutcome ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TriageOutcome)factory.getImportedDomainObject(TriageOutcome.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TriageOutcome();
		}
		String keyClassName = "TriageOutcome";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TriageOutcome)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TriageOutcome obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("triageOutcomeStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTriageOutcomeStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("acceptedDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAcceptedDetails(ims.RefMan.domain.objects.OutcomeAcceptedDetails.getOutcomeAcceptedDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("triagePendingDiagnosticResult");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTriagePendingDiagnosticResult(ims.RefMan.domain.objects.LinkedDiagnostic.fromListXMLString(fldEl, factory, obj.getTriagePendingDiagnosticResult(), domMap));
		}
		fldEl = el.element("redirectReferralDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRedirectReferralDetails(ims.RefMan.domain.objects.RedirectReferralDetails.getRedirectReferralDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingDateTime");
		if(fldEl != null)
		{	
    		obj.setRecordingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("triagePendingDiagnosticResultComment");
		if(fldEl != null)
		{	
    		obj.setTriagePendingDiagnosticResultComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("awaitingClinicalInformationComment");
		if(fldEl != null)
		{	
    		obj.setAwaitingClinicalInformationComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "triagePendingDiagnosticResult"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TriageOutcomeStatus = "triageOutcomeStatus";
		public static final String AcceptedDetails = "acceptedDetails";
		public static final String TriagePendingDiagnosticResult = "triagePendingDiagnosticResult";
		public static final String RedirectReferralDetails = "redirectReferralDetails";
		public static final String RecordingUser = "recordingUser";
		public static final String RecordingDateTime = "recordingDateTime";
		public static final String TriagePendingDiagnosticResultComment = "triagePendingDiagnosticResultComment";
		public static final String AwaitingClinicalInformationComment = "awaitingClinicalInformationComment";
		public static final String CatsReferral = "catsReferral";
	}
}

