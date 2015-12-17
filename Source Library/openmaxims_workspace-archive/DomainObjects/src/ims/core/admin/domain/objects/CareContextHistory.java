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
package ims.core.admin.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class CareContextHistory extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100033;
	private static final long serialVersionUID = 1004100033L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Context type */
	private ims.domain.lookups.LookupInstance context;
	/** StartDateTime */
	private java.util.Date startDateTime;
	/** End Date Time */
	private java.util.Date endDateTime;
	/** LocationType - Home/Hospital/OPD */
	private ims.domain.lookups.LookupInstance locationType;
	/** Bed Number */
	private String bedNumber;
	/** Overall Responsible HCP */
	private ims.core.resource.people.domain.objects.Hcp responsibleHCP;
	/** PAS Event Number */
	private String pasEventId;
	/** used for saving history only if version changes in CareContext */
	private Integer cCVersion;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CareContextHistory (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CareContextHistory ()
    {
    	super();
    }
    public CareContextHistory (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.CareContextHistory.class;
	}


	public ims.domain.lookups.LookupInstance getContext() {
		return context;
	}
	public void setContext(ims.domain.lookups.LookupInstance context) {
		this.context = context;
	}

	public java.util.Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(java.util.Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public java.util.Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(java.util.Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public ims.domain.lookups.LookupInstance getLocationType() {
		return locationType;
	}
	public void setLocationType(ims.domain.lookups.LookupInstance locationType) {
		this.locationType = locationType;
	}

	public String getBedNumber() {
		return bedNumber;
	}
	public void setBedNumber(String bedNumber) {
		if ( null != bedNumber && bedNumber.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bedNumber. Tried to set value: "+
				bedNumber);
		}
		this.bedNumber = bedNumber;
	}

	public ims.core.resource.people.domain.objects.Hcp getResponsibleHCP() {
		return responsibleHCP;
	}
	public void setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp responsibleHCP) {
		this.responsibleHCP = responsibleHCP;
	}

	public String getPasEventId() {
		return pasEventId;
	}
	public void setPasEventId(String pasEventId) {
		if ( null != pasEventId && pasEventId.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pasEventId. Tried to set value: "+
				pasEventId);
		}
		this.pasEventId = pasEventId;
	}

	public Integer getCCVersion() {
		return cCVersion;
	}
	public void setCCVersion(Integer cCVersion) {
		this.cCVersion = cCVersion;
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
		
		auditStr.append("\r\n*context* :");
		if (context != null)
			auditStr.append(context.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*startDateTime* :");
		auditStr.append(startDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDateTime* :");
		auditStr.append(endDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*locationType* :");
		if (locationType != null)
			auditStr.append(locationType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*bedNumber* :");
		auditStr.append(bedNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleHCP* :");
		if (responsibleHCP != null)
		{
			auditStr.append(toShortClassName(responsibleHCP));
				
		    auditStr.append(responsibleHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pasEventId* :");
		auditStr.append(pasEventId);
	    auditStr.append("; ");
		auditStr.append("\r\n*cCVersion* :");
		auditStr.append(cCVersion);
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
		
		String keyClassName = "CareContextHistory";
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
		if (this.getContext() != null)
		{
			sb.append("<context>");
			sb.append(this.getContext().toXMLString()); 
			sb.append("</context>");		
		}
		if (this.getStartDateTime() != null)
		{
			sb.append("<startDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDateTime>");		
		}
		if (this.getEndDateTime() != null)
		{
			sb.append("<endDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDateTime>");		
		}
		if (this.getLocationType() != null)
		{
			sb.append("<locationType>");
			sb.append(this.getLocationType().toXMLString()); 
			sb.append("</locationType>");		
		}
		if (this.getBedNumber() != null)
		{
			sb.append("<bedNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBedNumber().toString()));
			sb.append("</bedNumber>");		
		}
		if (this.getResponsibleHCP() != null)
		{
			sb.append("<responsibleHCP>");
			sb.append(this.getResponsibleHCP().toXMLString(domMap)); 	
			sb.append("</responsibleHCP>");		
		}
		if (this.getPasEventId() != null)
		{
			sb.append("<pasEventId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPasEventId().toString()));
			sb.append("</pasEventId>");		
		}
		if (this.getCCVersion() != null)
		{
			sb.append("<cCVersion>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCCVersion().toString()));
			sb.append("</cCVersion>");		
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
			CareContextHistory domainObject = getCareContextHistoryfromXML(itemEl, factory, domMap);

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
			CareContextHistory domainObject = getCareContextHistoryfromXML(itemEl, factory, domMap);

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
		
	public static CareContextHistory getCareContextHistoryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCareContextHistoryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CareContextHistory getCareContextHistoryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CareContextHistory.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CareContextHistory.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CareContextHistory class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CareContextHistory)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CareContextHistory.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CareContextHistory ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CareContextHistory)factory.getImportedDomainObject(CareContextHistory.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CareContextHistory();
		}
		String keyClassName = "CareContextHistory";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CareContextHistory)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CareContextHistory obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("context");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setContext(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("startDateTime");
		if(fldEl != null)
		{	
    		obj.setStartDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDateTime");
		if(fldEl != null)
		{	
    		obj.setEndDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("locationType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLocationType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("bedNumber");
		if(fldEl != null)
		{	
    		obj.setBedNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("responsibleHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pasEventId");
		if(fldEl != null)
		{	
    		obj.setPasEventId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cCVersion");
		if(fldEl != null)
		{	
    		obj.setCCVersion(new Integer(fldEl.getTextTrim()));	
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
		public static final String Context = "context";
		public static final String StartDateTime = "startDateTime";
		public static final String EndDateTime = "endDateTime";
		public static final String LocationType = "locationType";
		public static final String BedNumber = "bedNumber";
		public static final String ResponsibleHCP = "responsibleHCP";
		public static final String PasEventId = "pasEventId";
		public static final String CCVersion = "cCVersion";
	}
}

