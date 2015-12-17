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


public class ReferralOutcome extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100005;
	private static final long serialVersionUID = 1096100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Cats Referral */
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Discharge Details for the Referral */
	private ims.RefMan.domain.objects.DischargeOutcome referralDischarge;
	/** Further Management Details
	  * Collection of ims.RefMan.domain.objects.FurtherManagement.
	  */
	private java.util.Set furtherManagementDetails;
	/** Prescriptions
	  * Collection of ims.RefMan.domain.objects.Prescription.
	  */
	private java.util.Set prescriptions;
	/** Discharge Details for the Referral
	  * Collection of ims.RefMan.domain.objects.DischargeOutcome.
	  */
	private java.util.Set referralDischargeHistory;
	/** CATS Final Report Status */
	private ims.domain.lookups.LookupInstance catsFinalReportStatus;
	/** Active Monitoring */
	private ims.RefMan.domain.objects.ActiveMonitoring activeMonitoring;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ReferralOutcome (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ReferralOutcome ()
    {
    	super();
    }
    public ReferralOutcome (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.ReferralOutcome.class;
	}


	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.RefMan.domain.objects.DischargeOutcome getReferralDischarge() {
		return referralDischarge;
	}
	public void setReferralDischarge(ims.RefMan.domain.objects.DischargeOutcome referralDischarge) {
		this.referralDischarge = referralDischarge;
	}

	public java.util.Set getFurtherManagementDetails() {
		if ( null == furtherManagementDetails ) {
			furtherManagementDetails = new java.util.HashSet();
		}
		return furtherManagementDetails;
	}
	public void setFurtherManagementDetails(java.util.Set paramValue) {
		this.furtherManagementDetails = paramValue;
	}

	public java.util.Set getPrescriptions() {
		if ( null == prescriptions ) {
			prescriptions = new java.util.HashSet();
		}
		return prescriptions;
	}
	public void setPrescriptions(java.util.Set paramValue) {
		this.prescriptions = paramValue;
	}

	public java.util.Set getReferralDischargeHistory() {
		if ( null == referralDischargeHistory ) {
			referralDischargeHistory = new java.util.HashSet();
		}
		return referralDischargeHistory;
	}
	public void setReferralDischargeHistory(java.util.Set paramValue) {
		this.referralDischargeHistory = paramValue;
	}

	public ims.domain.lookups.LookupInstance getCatsFinalReportStatus() {
		return catsFinalReportStatus;
	}
	public void setCatsFinalReportStatus(ims.domain.lookups.LookupInstance catsFinalReportStatus) {
		this.catsFinalReportStatus = catsFinalReportStatus;
	}

	public ims.RefMan.domain.objects.ActiveMonitoring getActiveMonitoring() {
		return activeMonitoring;
	}
	public void setActiveMonitoring(ims.RefMan.domain.objects.ActiveMonitoring activeMonitoring) {
		this.activeMonitoring = activeMonitoring;
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
		
		auditStr.append("\r\n*catsReferral* :");
		if (catsReferral != null)
		{
			auditStr.append(toShortClassName(catsReferral));
				
		    auditStr.append(catsReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referralDischarge* :");
		if (referralDischarge != null)
		{
			auditStr.append(toShortClassName(referralDischarge));
				
		    auditStr.append(referralDischarge.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*furtherManagementDetails* :");
		if (furtherManagementDetails != null)
		{
			java.util.Iterator it4 = furtherManagementDetails.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.FurtherManagement obj = (ims.RefMan.domain.objects.FurtherManagement)it4.next();
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
		auditStr.append("\r\n*prescriptions* :");
		if (prescriptions != null)
		{
			java.util.Iterator it5 = prescriptions.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.Prescription obj = (ims.RefMan.domain.objects.Prescription)it5.next();
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
		auditStr.append("\r\n*referralDischargeHistory* :");
		if (referralDischargeHistory != null)
		{
			java.util.Iterator it6 = referralDischargeHistory.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.DischargeOutcome obj = (ims.RefMan.domain.objects.DischargeOutcome)it6.next();
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
		auditStr.append("\r\n*catsFinalReportStatus* :");
		if (catsFinalReportStatus != null)
			auditStr.append(catsFinalReportStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activeMonitoring* :");
		if (activeMonitoring != null)
		{
			auditStr.append(toShortClassName(activeMonitoring));
				
		    auditStr.append(activeMonitoring.getId());
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
		
		String keyClassName = "ReferralOutcome";
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
		if (this.getCatsReferral() != null)
		{
			sb.append("<catsReferral>");
			sb.append(this.getCatsReferral().toXMLString(domMap)); 	
			sb.append("</catsReferral>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getReferralDischarge() != null)
		{
			sb.append("<referralDischarge>");
			sb.append(this.getReferralDischarge().toXMLString(domMap)); 	
			sb.append("</referralDischarge>");		
		}
		if (this.getFurtherManagementDetails() != null)
		{
			if (this.getFurtherManagementDetails().size() > 0 )
			{
			sb.append("<furtherManagementDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFurtherManagementDetails(), domMap));
			sb.append("</furtherManagementDetails>");		
			}
		}
		if (this.getPrescriptions() != null)
		{
			if (this.getPrescriptions().size() > 0 )
			{
			sb.append("<prescriptions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPrescriptions(), domMap));
			sb.append("</prescriptions>");		
			}
		}
		if (this.getReferralDischargeHistory() != null)
		{
			if (this.getReferralDischargeHistory().size() > 0 )
			{
			sb.append("<referralDischargeHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReferralDischargeHistory(), domMap));
			sb.append("</referralDischargeHistory>");		
			}
		}
		if (this.getCatsFinalReportStatus() != null)
		{
			sb.append("<catsFinalReportStatus>");
			sb.append(this.getCatsFinalReportStatus().toXMLString()); 
			sb.append("</catsFinalReportStatus>");		
		}
		if (this.getActiveMonitoring() != null)
		{
			sb.append("<activeMonitoring>");
			sb.append(this.getActiveMonitoring().toXMLString(domMap)); 	
			sb.append("</activeMonitoring>");		
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
			ReferralOutcome domainObject = getReferralOutcomefromXML(itemEl, factory, domMap);

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
			ReferralOutcome domainObject = getReferralOutcomefromXML(itemEl, factory, domMap);

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
		
	public static ReferralOutcome getReferralOutcomefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getReferralOutcomefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ReferralOutcome getReferralOutcomefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ReferralOutcome.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ReferralOutcome.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ReferralOutcome class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ReferralOutcome)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ReferralOutcome.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ReferralOutcome ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ReferralOutcome)factory.getImportedDomainObject(ReferralOutcome.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ReferralOutcome();
		}
		String keyClassName = "ReferralOutcome";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ReferralOutcome)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ReferralOutcome obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referralDischarge");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferralDischarge(ims.RefMan.domain.objects.DischargeOutcome.getDischargeOutcomefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("furtherManagementDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setFurtherManagementDetails(ims.RefMan.domain.objects.FurtherManagement.fromSetXMLString(fldEl, factory, obj.getFurtherManagementDetails(), domMap));
		}
		fldEl = el.element("prescriptions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPrescriptions(ims.RefMan.domain.objects.Prescription.fromSetXMLString(fldEl, factory, obj.getPrescriptions(), domMap));
		}
		fldEl = el.element("referralDischargeHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setReferralDischargeHistory(ims.RefMan.domain.objects.DischargeOutcome.fromSetXMLString(fldEl, factory, obj.getReferralDischargeHistory(), domMap));
		}
		fldEl = el.element("catsFinalReportStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCatsFinalReportStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activeMonitoring");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActiveMonitoring(ims.RefMan.domain.objects.ActiveMonitoring.getActiveMonitoringfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "furtherManagementDetails"
		, "prescriptions"
		, "referralDischargeHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CatsReferral = "catsReferral";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String ReferralDischarge = "referralDischarge";
		public static final String FurtherManagementDetails = "furtherManagementDetails";
		public static final String Prescriptions = "prescriptions";
		public static final String ReferralDischargeHistory = "referralDischargeHistory";
		public static final String CatsFinalReportStatus = "catsFinalReportStatus";
		public static final String ActiveMonitoring = "activeMonitoring";
	}
}

