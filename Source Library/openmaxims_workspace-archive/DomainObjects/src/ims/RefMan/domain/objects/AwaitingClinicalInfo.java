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


public class AwaitingClinicalInfo extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100044;
	private static final long serialVersionUID = 1096100044L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Awaiting Clinical Information
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List clinicalInfoAwaiting;
	/** Other Awaiting Clinical Information */
	private String otherClinicalInformation;
	/** Received Clinical Information
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List clinicalInfoReceived;
	/** Date Awaiting Clinical Information */
	private java.util.Date dateAwaitingClinicalInfo;
	/** Date Clinical Information Received */
	private java.util.Date dateClinicalInfoReceived;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AwaitingClinicalInfo (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AwaitingClinicalInfo ()
    {
    	super();
    }
    public AwaitingClinicalInfo (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.AwaitingClinicalInfo.class;
	}


	public java.util.List getClinicalInfoAwaiting() {
		if ( null == clinicalInfoAwaiting ) {
			clinicalInfoAwaiting = new java.util.ArrayList();
		}
		return clinicalInfoAwaiting;
	}
	public void setClinicalInfoAwaiting(java.util.List paramValue) {
		this.clinicalInfoAwaiting = paramValue;
	}

	public String getOtherClinicalInformation() {
		return otherClinicalInformation;
	}
	public void setOtherClinicalInformation(String otherClinicalInformation) {
		if ( null != otherClinicalInformation && otherClinicalInformation.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherClinicalInformation. Tried to set value: "+
				otherClinicalInformation);
		}
		this.otherClinicalInformation = otherClinicalInformation;
	}

	public java.util.List getClinicalInfoReceived() {
		if ( null == clinicalInfoReceived ) {
			clinicalInfoReceived = new java.util.ArrayList();
		}
		return clinicalInfoReceived;
	}
	public void setClinicalInfoReceived(java.util.List paramValue) {
		this.clinicalInfoReceived = paramValue;
	}

	public java.util.Date getDateAwaitingClinicalInfo() {
		return dateAwaitingClinicalInfo;
	}
	public void setDateAwaitingClinicalInfo(java.util.Date dateAwaitingClinicalInfo) {
		this.dateAwaitingClinicalInfo = dateAwaitingClinicalInfo;
	}

	public java.util.Date getDateClinicalInfoReceived() {
		return dateClinicalInfoReceived;
	}
	public void setDateClinicalInfoReceived(java.util.Date dateClinicalInfoReceived) {
		this.dateClinicalInfoReceived = dateClinicalInfoReceived;
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
		
		auditStr.append("\r\n*clinicalInfoAwaiting* :");
		if (clinicalInfoAwaiting != null)
		{
		int i1=0;
		for (i1=0; i1<clinicalInfoAwaiting.size(); i1++)
		{
			if (i1 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)clinicalInfoAwaiting.get(i1);
			auditStr.append(obj.getText());
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherClinicalInformation* :");
		auditStr.append(otherClinicalInformation);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalInfoReceived* :");
		if (clinicalInfoReceived != null)
		{
		int i3=0;
		for (i3=0; i3<clinicalInfoReceived.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)clinicalInfoReceived.get(i3);
			auditStr.append(obj.getText());
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateAwaitingClinicalInfo* :");
		auditStr.append(dateAwaitingClinicalInfo);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateClinicalInfoReceived* :");
		auditStr.append(dateClinicalInfoReceived);
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
		
		String keyClassName = "AwaitingClinicalInfo";
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
		if (this.getClinicalInfoAwaiting() != null)
		{
			if (this.getClinicalInfoAwaiting().size() > 0 )
			{
			sb.append("<clinicalInfoAwaiting>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getClinicalInfoAwaiting())); 
			sb.append("</clinicalInfoAwaiting>");		
			}
		}
		if (this.getOtherClinicalInformation() != null)
		{
			sb.append("<otherClinicalInformation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherClinicalInformation().toString()));
			sb.append("</otherClinicalInformation>");		
		}
		if (this.getClinicalInfoReceived() != null)
		{
			if (this.getClinicalInfoReceived().size() > 0 )
			{
			sb.append("<clinicalInfoReceived>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getClinicalInfoReceived())); 
			sb.append("</clinicalInfoReceived>");		
			}
		}
		if (this.getDateAwaitingClinicalInfo() != null)
		{
			sb.append("<dateAwaitingClinicalInfo>");
			sb.append(new ims.framework.utils.DateTime(this.getDateAwaitingClinicalInfo()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateAwaitingClinicalInfo>");		
		}
		if (this.getDateClinicalInfoReceived() != null)
		{
			sb.append("<dateClinicalInfoReceived>");
			sb.append(new ims.framework.utils.DateTime(this.getDateClinicalInfoReceived()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateClinicalInfoReceived>");		
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
			AwaitingClinicalInfo domainObject = getAwaitingClinicalInfofromXML(itemEl, factory, domMap);

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
			AwaitingClinicalInfo domainObject = getAwaitingClinicalInfofromXML(itemEl, factory, domMap);

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
		
	public static AwaitingClinicalInfo getAwaitingClinicalInfofromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAwaitingClinicalInfofromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AwaitingClinicalInfo getAwaitingClinicalInfofromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AwaitingClinicalInfo.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AwaitingClinicalInfo.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AwaitingClinicalInfo class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AwaitingClinicalInfo)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AwaitingClinicalInfo.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AwaitingClinicalInfo ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AwaitingClinicalInfo)factory.getImportedDomainObject(AwaitingClinicalInfo.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AwaitingClinicalInfo();
		}
		String keyClassName = "AwaitingClinicalInfo";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AwaitingClinicalInfo)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AwaitingClinicalInfo obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalInfoAwaiting");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setClinicalInfoAwaiting(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getClinicalInfoAwaiting())); 
		}
		fldEl = el.element("otherClinicalInformation");
		if(fldEl != null)
		{	
    		obj.setOtherClinicalInformation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalInfoReceived");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setClinicalInfoReceived(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getClinicalInfoReceived())); 
		}
		fldEl = el.element("dateAwaitingClinicalInfo");
		if(fldEl != null)
		{	
    		obj.setDateAwaitingClinicalInfo(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateClinicalInfoReceived");
		if(fldEl != null)
		{	
    		obj.setDateClinicalInfoReceived(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "clinicalInfoAwaiting"
		, "clinicalInfoReceived"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalInfoAwaiting = "clinicalInfoAwaiting";
		public static final String OtherClinicalInformation = "otherClinicalInformation";
		public static final String ClinicalInfoReceived = "clinicalInfoReceived";
		public static final String DateAwaitingClinicalInfo = "dateAwaitingClinicalInfo";
		public static final String DateClinicalInfoReceived = "dateClinicalInfoReceived";
	}
}

