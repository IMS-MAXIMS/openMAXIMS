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


public class CATSReferralStatus extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100007;
	private static final long serialVersionUID = 1096100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Referral Status */
	private ims.domain.lookups.LookupInstance referralStatus;
	/** User */
	private ims.core.resource.people.domain.objects.MemberOfStaff authoringUser;
	/** Status Date Time */
	private java.util.Date statusDateTime;
	/** Comment */
	private String comment;
	/** UniqueLineRefNo - Used for Monthly Activity Report */
	private String uniqueLineRefNo;
	/** Rejected UniqueLineRefNo - Used for Monthly Activity Report */
	private String uniqueLineRefNoRejected;
	/** Rejected UniqueLineRefNo - Used for Monthly Activity Report */
	private String uniqueLineRefNoDI;
	/** L1 - UniqueLineRefNo - Used for Monthly Activity Report */
	private String uniqueLineRefNoL1;
	/** wasOutputtedToWeeklyReport */
	private Boolean wasOutputtedToWeeklyReport;
	/** wasOutputtedToMonthlyReport */
	private Boolean wasOutputtedToMonthlyReport;
	/** wasOutputtedToWeeklyReportRej */
	private Boolean wasOutputtedToWeeklyReportRej;
	/** wasOutputtedToMonthlyReportRej */
	private Boolean wasOutputtedToMonthlyReportRej;
	/** wasOutputtedToWeeklyReportDI */
	private Boolean wasOutputtedToWeeklyReportDI;
	/** wasOutputtedToMonthlyReportDI */
	private Boolean wasOutputtedToMonthlyReportDI;
	/** wasOutputtedToWeeklyReportI1 */
	private Boolean wasOutputtedToWeeklyReportI1;
	/** wasOutputtedToMonthlyReportI1 */
	private Boolean wasOutputtedToMonthlyReportI1;
	/** Second Opinion Category */
	private ims.domain.lookups.LookupInstance secondOpinionCategory;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CATSReferralStatus (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CATSReferralStatus ()
    {
    	super();
    }
    public CATSReferralStatus (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.CATSReferralStatus.class;
	}


	public ims.domain.lookups.LookupInstance getReferralStatus() {
		return referralStatus;
	}
	public void setReferralStatus(ims.domain.lookups.LookupInstance referralStatus) {
		this.referralStatus = referralStatus;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getAuthoringUser() {
		return authoringUser;
	}
	public void setAuthoringUser(ims.core.resource.people.domain.objects.MemberOfStaff authoringUser) {
		this.authoringUser = authoringUser;
	}

	public java.util.Date getStatusDateTime() {
		return statusDateTime;
	}
	public void setStatusDateTime(java.util.Date statusDateTime) {
		this.statusDateTime = statusDateTime;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
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

	public String getUniqueLineRefNoRejected() {
		return uniqueLineRefNoRejected;
	}
	public void setUniqueLineRefNoRejected(String uniqueLineRefNoRejected) {
		if ( null != uniqueLineRefNoRejected && uniqueLineRefNoRejected.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uniqueLineRefNoRejected. Tried to set value: "+
				uniqueLineRefNoRejected);
		}
		this.uniqueLineRefNoRejected = uniqueLineRefNoRejected;
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

	public String getUniqueLineRefNoL1() {
		return uniqueLineRefNoL1;
	}
	public void setUniqueLineRefNoL1(String uniqueLineRefNoL1) {
		if ( null != uniqueLineRefNoL1 && uniqueLineRefNoL1.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uniqueLineRefNoL1. Tried to set value: "+
				uniqueLineRefNoL1);
		}
		this.uniqueLineRefNoL1 = uniqueLineRefNoL1;
	}

	public Boolean isWasOutputtedToWeeklyReport() {
		return wasOutputtedToWeeklyReport;
	}
	public void setWasOutputtedToWeeklyReport(Boolean wasOutputtedToWeeklyReport) {
		this.wasOutputtedToWeeklyReport = wasOutputtedToWeeklyReport;
	}

	public Boolean isWasOutputtedToMonthlyReport() {
		return wasOutputtedToMonthlyReport;
	}
	public void setWasOutputtedToMonthlyReport(Boolean wasOutputtedToMonthlyReport) {
		this.wasOutputtedToMonthlyReport = wasOutputtedToMonthlyReport;
	}

	public Boolean isWasOutputtedToWeeklyReportRej() {
		return wasOutputtedToWeeklyReportRej;
	}
	public void setWasOutputtedToWeeklyReportRej(Boolean wasOutputtedToWeeklyReportRej) {
		this.wasOutputtedToWeeklyReportRej = wasOutputtedToWeeklyReportRej;
	}

	public Boolean isWasOutputtedToMonthlyReportRej() {
		return wasOutputtedToMonthlyReportRej;
	}
	public void setWasOutputtedToMonthlyReportRej(Boolean wasOutputtedToMonthlyReportRej) {
		this.wasOutputtedToMonthlyReportRej = wasOutputtedToMonthlyReportRej;
	}

	public Boolean isWasOutputtedToWeeklyReportDI() {
		return wasOutputtedToWeeklyReportDI;
	}
	public void setWasOutputtedToWeeklyReportDI(Boolean wasOutputtedToWeeklyReportDI) {
		this.wasOutputtedToWeeklyReportDI = wasOutputtedToWeeklyReportDI;
	}

	public Boolean isWasOutputtedToMonthlyReportDI() {
		return wasOutputtedToMonthlyReportDI;
	}
	public void setWasOutputtedToMonthlyReportDI(Boolean wasOutputtedToMonthlyReportDI) {
		this.wasOutputtedToMonthlyReportDI = wasOutputtedToMonthlyReportDI;
	}

	public Boolean isWasOutputtedToWeeklyReportI1() {
		return wasOutputtedToWeeklyReportI1;
	}
	public void setWasOutputtedToWeeklyReportI1(Boolean wasOutputtedToWeeklyReportI1) {
		this.wasOutputtedToWeeklyReportI1 = wasOutputtedToWeeklyReportI1;
	}

	public Boolean isWasOutputtedToMonthlyReportI1() {
		return wasOutputtedToMonthlyReportI1;
	}
	public void setWasOutputtedToMonthlyReportI1(Boolean wasOutputtedToMonthlyReportI1) {
		this.wasOutputtedToMonthlyReportI1 = wasOutputtedToMonthlyReportI1;
	}

	public ims.domain.lookups.LookupInstance getSecondOpinionCategory() {
		return secondOpinionCategory;
	}
	public void setSecondOpinionCategory(ims.domain.lookups.LookupInstance secondOpinionCategory) {
		this.secondOpinionCategory = secondOpinionCategory;
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
		
		auditStr.append("\r\n*referralStatus* :");
		if (referralStatus != null)
			auditStr.append(referralStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringUser* :");
		if (authoringUser != null)
		{
			auditStr.append(toShortClassName(authoringUser));
				
		    auditStr.append(authoringUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*statusDateTime* :");
		auditStr.append(statusDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*uniqueLineRefNo* :");
		auditStr.append(uniqueLineRefNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*uniqueLineRefNoRejected* :");
		auditStr.append(uniqueLineRefNoRejected);
	    auditStr.append("; ");
		auditStr.append("\r\n*uniqueLineRefNoDI* :");
		auditStr.append(uniqueLineRefNoDI);
	    auditStr.append("; ");
		auditStr.append("\r\n*uniqueLineRefNoL1* :");
		auditStr.append(uniqueLineRefNoL1);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToWeeklyReport* :");
		auditStr.append(wasOutputtedToWeeklyReport);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToMonthlyReport* :");
		auditStr.append(wasOutputtedToMonthlyReport);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToWeeklyReportRej* :");
		auditStr.append(wasOutputtedToWeeklyReportRej);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToMonthlyReportRej* :");
		auditStr.append(wasOutputtedToMonthlyReportRej);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToWeeklyReportDI* :");
		auditStr.append(wasOutputtedToWeeklyReportDI);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToMonthlyReportDI* :");
		auditStr.append(wasOutputtedToMonthlyReportDI);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToWeeklyReportI1* :");
		auditStr.append(wasOutputtedToWeeklyReportI1);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToMonthlyReportI1* :");
		auditStr.append(wasOutputtedToMonthlyReportI1);
	    auditStr.append("; ");
		auditStr.append("\r\n*secondOpinionCategory* :");
		if (secondOpinionCategory != null)
			auditStr.append(secondOpinionCategory.getText());
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
		
		String keyClassName = "CATSReferralStatus";
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
		if (this.getReferralStatus() != null)
		{
			sb.append("<referralStatus>");
			sb.append(this.getReferralStatus().toXMLString()); 
			sb.append("</referralStatus>");		
		}
		if (this.getAuthoringUser() != null)
		{
			sb.append("<authoringUser>");
			sb.append(this.getAuthoringUser().toXMLString(domMap)); 	
			sb.append("</authoringUser>");		
		}
		if (this.getStatusDateTime() != null)
		{
			sb.append("<statusDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getStatusDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</statusDateTime>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.getUniqueLineRefNo() != null)
		{
			sb.append("<uniqueLineRefNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUniqueLineRefNo().toString()));
			sb.append("</uniqueLineRefNo>");		
		}
		if (this.getUniqueLineRefNoRejected() != null)
		{
			sb.append("<uniqueLineRefNoRejected>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUniqueLineRefNoRejected().toString()));
			sb.append("</uniqueLineRefNoRejected>");		
		}
		if (this.getUniqueLineRefNoDI() != null)
		{
			sb.append("<uniqueLineRefNoDI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUniqueLineRefNoDI().toString()));
			sb.append("</uniqueLineRefNoDI>");		
		}
		if (this.getUniqueLineRefNoL1() != null)
		{
			sb.append("<uniqueLineRefNoL1>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUniqueLineRefNoL1().toString()));
			sb.append("</uniqueLineRefNoL1>");		
		}
		if (this.isWasOutputtedToWeeklyReport() != null)
		{
			sb.append("<wasOutputtedToWeeklyReport>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasOutputtedToWeeklyReport().toString()));
			sb.append("</wasOutputtedToWeeklyReport>");		
		}
		if (this.isWasOutputtedToMonthlyReport() != null)
		{
			sb.append("<wasOutputtedToMonthlyReport>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasOutputtedToMonthlyReport().toString()));
			sb.append("</wasOutputtedToMonthlyReport>");		
		}
		if (this.isWasOutputtedToWeeklyReportRej() != null)
		{
			sb.append("<wasOutputtedToWeeklyReportRej>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasOutputtedToWeeklyReportRej().toString()));
			sb.append("</wasOutputtedToWeeklyReportRej>");		
		}
		if (this.isWasOutputtedToMonthlyReportRej() != null)
		{
			sb.append("<wasOutputtedToMonthlyReportRej>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasOutputtedToMonthlyReportRej().toString()));
			sb.append("</wasOutputtedToMonthlyReportRej>");		
		}
		if (this.isWasOutputtedToWeeklyReportDI() != null)
		{
			sb.append("<wasOutputtedToWeeklyReportDI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasOutputtedToWeeklyReportDI().toString()));
			sb.append("</wasOutputtedToWeeklyReportDI>");		
		}
		if (this.isWasOutputtedToMonthlyReportDI() != null)
		{
			sb.append("<wasOutputtedToMonthlyReportDI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasOutputtedToMonthlyReportDI().toString()));
			sb.append("</wasOutputtedToMonthlyReportDI>");		
		}
		if (this.isWasOutputtedToWeeklyReportI1() != null)
		{
			sb.append("<wasOutputtedToWeeklyReportI1>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasOutputtedToWeeklyReportI1().toString()));
			sb.append("</wasOutputtedToWeeklyReportI1>");		
		}
		if (this.isWasOutputtedToMonthlyReportI1() != null)
		{
			sb.append("<wasOutputtedToMonthlyReportI1>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasOutputtedToMonthlyReportI1().toString()));
			sb.append("</wasOutputtedToMonthlyReportI1>");		
		}
		if (this.getSecondOpinionCategory() != null)
		{
			sb.append("<secondOpinionCategory>");
			sb.append(this.getSecondOpinionCategory().toXMLString()); 
			sb.append("</secondOpinionCategory>");		
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
			CATSReferralStatus domainObject = getCATSReferralStatusfromXML(itemEl, factory, domMap);

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
			CATSReferralStatus domainObject = getCATSReferralStatusfromXML(itemEl, factory, domMap);

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
		
	public static CATSReferralStatus getCATSReferralStatusfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCATSReferralStatusfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CATSReferralStatus getCATSReferralStatusfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CATSReferralStatus.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CATSReferralStatus.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CATSReferralStatus class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CATSReferralStatus)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CATSReferralStatus.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CATSReferralStatus ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CATSReferralStatus)factory.getImportedDomainObject(CATSReferralStatus.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CATSReferralStatus();
		}
		String keyClassName = "CATSReferralStatus";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CATSReferralStatus)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CATSReferralStatus obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("referralStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("authoringUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusDateTime");
		if(fldEl != null)
		{	
    		obj.setStatusDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("uniqueLineRefNo");
		if(fldEl != null)
		{	
    		obj.setUniqueLineRefNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("uniqueLineRefNoRejected");
		if(fldEl != null)
		{	
    		obj.setUniqueLineRefNoRejected(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("uniqueLineRefNoDI");
		if(fldEl != null)
		{	
    		obj.setUniqueLineRefNoDI(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("uniqueLineRefNoL1");
		if(fldEl != null)
		{	
    		obj.setUniqueLineRefNoL1(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasOutputtedToWeeklyReport");
		if(fldEl != null)
		{	
    		obj.setWasOutputtedToWeeklyReport(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasOutputtedToMonthlyReport");
		if(fldEl != null)
		{	
    		obj.setWasOutputtedToMonthlyReport(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasOutputtedToWeeklyReportRej");
		if(fldEl != null)
		{	
    		obj.setWasOutputtedToWeeklyReportRej(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasOutputtedToMonthlyReportRej");
		if(fldEl != null)
		{	
    		obj.setWasOutputtedToMonthlyReportRej(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasOutputtedToWeeklyReportDI");
		if(fldEl != null)
		{	
    		obj.setWasOutputtedToWeeklyReportDI(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasOutputtedToMonthlyReportDI");
		if(fldEl != null)
		{	
    		obj.setWasOutputtedToMonthlyReportDI(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasOutputtedToWeeklyReportI1");
		if(fldEl != null)
		{	
    		obj.setWasOutputtedToWeeklyReportI1(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasOutputtedToMonthlyReportI1");
		if(fldEl != null)
		{	
    		obj.setWasOutputtedToMonthlyReportI1(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("secondOpinionCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSecondOpinionCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String ReferralStatus = "referralStatus";
		public static final String AuthoringUser = "authoringUser";
		public static final String StatusDateTime = "statusDateTime";
		public static final String Comment = "comment";
		public static final String UniqueLineRefNo = "uniqueLineRefNo";
		public static final String UniqueLineRefNoRejected = "uniqueLineRefNoRejected";
		public static final String UniqueLineRefNoDI = "uniqueLineRefNoDI";
		public static final String UniqueLineRefNoL1 = "uniqueLineRefNoL1";
		public static final String WasOutputtedToWeeklyReport = "wasOutputtedToWeeklyReport";
		public static final String WasOutputtedToMonthlyReport = "wasOutputtedToMonthlyReport";
		public static final String WasOutputtedToWeeklyReportRej = "wasOutputtedToWeeklyReportRej";
		public static final String WasOutputtedToMonthlyReportRej = "wasOutputtedToMonthlyReportRej";
		public static final String WasOutputtedToWeeklyReportDI = "wasOutputtedToWeeklyReportDI";
		public static final String WasOutputtedToMonthlyReportDI = "wasOutputtedToMonthlyReportDI";
		public static final String WasOutputtedToWeeklyReportI1 = "wasOutputtedToWeeklyReportI1";
		public static final String WasOutputtedToMonthlyReportI1 = "wasOutputtedToMonthlyReportI1";
		public static final String SecondOpinionCategory = "secondOpinionCategory";
	}
}

