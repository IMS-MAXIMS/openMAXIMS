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


public class ProviderCancellation extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100016;
	private static final long serialVersionUID = 1096100016L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Provider Cancellation Reason */
	private ims.domain.lookups.LookupInstance reason;
	/** Comments */
	private String comments;
	/** Cancellation Date Time */
	private java.util.Date cancellationDateTime;
	/** Was the Referrer Informed */
	private Boolean wasGPInformed;
	/** Was the Patient Informed */
	private Boolean wasPatientInformed;
	/** UniqueLineRefNo - Used for Monthly Activity Report */
	private String uniqueLineRefNo;
	/** wasOutputtedToWeeklyReport */
	private Boolean wasOutputtedToWeeklyReport;
	/** wasOutputtedToMonthlyReport */
	private Boolean wasOutputtedToMonthlyReport;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ProviderCancellation (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ProviderCancellation ()
    {
    	super();
    }
    public ProviderCancellation (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.ProviderCancellation.class;
	}


	public ims.domain.lookups.LookupInstance getReason() {
		return reason;
	}
	public void setReason(ims.domain.lookups.LookupInstance reason) {
		this.reason = reason;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public java.util.Date getCancellationDateTime() {
		return cancellationDateTime;
	}
	public void setCancellationDateTime(java.util.Date cancellationDateTime) {
		this.cancellationDateTime = cancellationDateTime;
	}

	public Boolean isWasGPInformed() {
		return wasGPInformed;
	}
	public void setWasGPInformed(Boolean wasGPInformed) {
		this.wasGPInformed = wasGPInformed;
	}

	public Boolean isWasPatientInformed() {
		return wasPatientInformed;
	}
	public void setWasPatientInformed(Boolean wasPatientInformed) {
		this.wasPatientInformed = wasPatientInformed;
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
		
		auditStr.append("\r\n*reason* :");
		if (reason != null)
			auditStr.append(reason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*cancellationDateTime* :");
		auditStr.append(cancellationDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasGPInformed* :");
		auditStr.append(wasGPInformed);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasPatientInformed* :");
		auditStr.append(wasPatientInformed);
	    auditStr.append("; ");
		auditStr.append("\r\n*uniqueLineRefNo* :");
		auditStr.append(uniqueLineRefNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToWeeklyReport* :");
		auditStr.append(wasOutputtedToWeeklyReport);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToMonthlyReport* :");
		auditStr.append(wasOutputtedToMonthlyReport);
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
		
		String keyClassName = "ProviderCancellation";
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
		if (this.getReason() != null)
		{
			sb.append("<reason>");
			sb.append(this.getReason().toXMLString()); 
			sb.append("</reason>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getCancellationDateTime() != null)
		{
			sb.append("<cancellationDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getCancellationDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</cancellationDateTime>");		
		}
		if (this.isWasGPInformed() != null)
		{
			sb.append("<wasGPInformed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasGPInformed().toString()));
			sb.append("</wasGPInformed>");		
		}
		if (this.isWasPatientInformed() != null)
		{
			sb.append("<wasPatientInformed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasPatientInformed().toString()));
			sb.append("</wasPatientInformed>");		
		}
		if (this.getUniqueLineRefNo() != null)
		{
			sb.append("<uniqueLineRefNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUniqueLineRefNo().toString()));
			sb.append("</uniqueLineRefNo>");		
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
			ProviderCancellation domainObject = getProviderCancellationfromXML(itemEl, factory, domMap);

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
			ProviderCancellation domainObject = getProviderCancellationfromXML(itemEl, factory, domMap);

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
		
	public static ProviderCancellation getProviderCancellationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getProviderCancellationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ProviderCancellation getProviderCancellationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ProviderCancellation.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ProviderCancellation.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ProviderCancellation class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ProviderCancellation)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ProviderCancellation.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ProviderCancellation ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ProviderCancellation)factory.getImportedDomainObject(ProviderCancellation.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ProviderCancellation();
		}
		String keyClassName = "ProviderCancellation";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ProviderCancellation)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ProviderCancellation obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("reason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cancellationDateTime");
		if(fldEl != null)
		{	
    		obj.setCancellationDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("wasGPInformed");
		if(fldEl != null)
		{	
    		obj.setWasGPInformed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasPatientInformed");
		if(fldEl != null)
		{	
    		obj.setWasPatientInformed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("uniqueLineRefNo");
		if(fldEl != null)
		{	
    		obj.setUniqueLineRefNo(new String(fldEl.getTextTrim()));	
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
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Reason = "reason";
		public static final String Comments = "comments";
		public static final String CancellationDateTime = "cancellationDateTime";
		public static final String WasGPInformed = "wasGPInformed";
		public static final String WasPatientInformed = "wasPatientInformed";
		public static final String UniqueLineRefNo = "uniqueLineRefNo";
		public static final String WasOutputtedToWeeklyReport = "wasOutputtedToWeeklyReport";
		public static final String WasOutputtedToMonthlyReport = "wasOutputtedToMonthlyReport";
	}
}

