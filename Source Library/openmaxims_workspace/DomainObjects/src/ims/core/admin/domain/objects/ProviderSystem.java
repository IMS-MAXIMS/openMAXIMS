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
 * ProviderSystemTestCodes
 * @author Kevin O'Carroll
 * Generated.
 */


public class ProviderSystem extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1061100004;
	private static final long serialVersionUID = 1061100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** SystemName */
	private String systemName;
	/** Description */
	private String description;
	/** IPAddress */
	private String iPAddress;
	/** IPPort */
	private Integer iPPort;
	/** Hl7Application */
	private String hl7Application;
	private ims.domain.lookups.LookupInstance codeSystem;
	/** Which component (4 or 5) of CX in PID.3 contains the type code */
	private Integer idtypeComponent;
	/** Which Patient Identifier is primary for this interface */
	private ims.domain.lookups.LookupInstance primaryPatientId;
	/** Category either Pathology or Radiology */
	private ims.domain.lookups.LookupInstance category;
	/** Configuration Items for this Provider System
	  * Collection of ims.core.generic.domain.objects.ConfigProperty.
	  */
	private java.util.List configItems;
	/** Allows Alternate Specimen Types */
	private Boolean allowsAlternateSpecimenTypes;
	/** supports SpecimentSourceAnd Site */
	private Boolean supportsSpecimentSourceAndSite;
	/** Send Referral Letter */
	private Boolean sendReferralLetter;
	/** SendQuestionnaire */
	private Boolean sendQuestionnaire;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ProviderSystem (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ProviderSystem ()
    {
    	super();
    }
    public ProviderSystem (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.ProviderSystem.class;
	}


	public String getSystemName() {
		return systemName;
	}
	public static ProviderSystem getProviderSystemFromSystemName(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from ProviderSystem c where c.systemName = :systemName";		
		java.util.List l = factory.find(hql, new String[]{"systemName"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. ProviderSystem.systemName = " + val + " returned " + l.size() + " records. " );
		return (ProviderSystem)l.get(0);
	}
	public void setSystemName(String systemName) {
		if ( null != systemName && systemName.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for systemName. Tried to set value: "+
				systemName);
		}
		this.systemName = systemName;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public String getIPAddress() {
		return iPAddress;
	}
	public void setIPAddress(String iPAddress) {
		if ( null != iPAddress && iPAddress.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for iPAddress. Tried to set value: "+
				iPAddress);
		}
		this.iPAddress = iPAddress;
	}

	public Integer getIPPort() {
		return iPPort;
	}
	public void setIPPort(Integer iPPort) {
		this.iPPort = iPPort;
	}

	public String getHl7Application() {
		return hl7Application;
	}
	public static ProviderSystem getProviderSystemFromHl7Application(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from ProviderSystem c where c.hl7Application = :hl7Application";		
		java.util.List l = factory.find(hql, new String[]{"hl7Application"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. ProviderSystem.hl7Application = " + val + " returned " + l.size() + " records. " );
		return (ProviderSystem)l.get(0);
	}
	public void setHl7Application(String hl7Application) {
		if ( null != hl7Application && hl7Application.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for hl7Application. Tried to set value: "+
				hl7Application);
		}
		this.hl7Application = hl7Application;
	}

	public ims.domain.lookups.LookupInstance getCodeSystem() {
		return codeSystem;
	}
	public void setCodeSystem(ims.domain.lookups.LookupInstance codeSystem) {
		this.codeSystem = codeSystem;
	}

	public Integer getIdtypeComponent() {
		return idtypeComponent;
	}
	public void setIdtypeComponent(Integer idtypeComponent) {
		this.idtypeComponent = idtypeComponent;
	}

	public ims.domain.lookups.LookupInstance getPrimaryPatientId() {
		return primaryPatientId;
	}
	public void setPrimaryPatientId(ims.domain.lookups.LookupInstance primaryPatientId) {
		this.primaryPatientId = primaryPatientId;
	}

	public ims.domain.lookups.LookupInstance getCategory() {
		return category;
	}
	public void setCategory(ims.domain.lookups.LookupInstance category) {
		this.category = category;
	}

	public java.util.List getConfigItems() {
		if ( null == configItems ) {
			configItems = new java.util.ArrayList();
		}
		return configItems;
	}
	public void setConfigItems(java.util.List paramValue) {
		this.configItems = paramValue;
	}

	public Boolean isAllowsAlternateSpecimenTypes() {
		return allowsAlternateSpecimenTypes;
	}
	public void setAllowsAlternateSpecimenTypes(Boolean allowsAlternateSpecimenTypes) {
		this.allowsAlternateSpecimenTypes = allowsAlternateSpecimenTypes;
	}

	public Boolean isSupportsSpecimentSourceAndSite() {
		return supportsSpecimentSourceAndSite;
	}
	public void setSupportsSpecimentSourceAndSite(Boolean supportsSpecimentSourceAndSite) {
		this.supportsSpecimentSourceAndSite = supportsSpecimentSourceAndSite;
	}

	public Boolean isSendReferralLetter() {
		return sendReferralLetter;
	}
	public void setSendReferralLetter(Boolean sendReferralLetter) {
		this.sendReferralLetter = sendReferralLetter;
	}

	public Boolean isSendQuestionnaire() {
		return sendQuestionnaire;
	}
	public void setSendQuestionnaire(Boolean sendQuestionnaire) {
		this.sendQuestionnaire = sendQuestionnaire;
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
		
		auditStr.append("\r\n*systemName* :");
		auditStr.append(systemName);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*iPAddress* :");
		auditStr.append(iPAddress);
	    auditStr.append("; ");
		auditStr.append("\r\n*iPPort* :");
		auditStr.append(iPPort);
	    auditStr.append("; ");
		auditStr.append("\r\n*hl7Application* :");
		auditStr.append(hl7Application);
	    auditStr.append("; ");
		auditStr.append("\r\n*codeSystem* :");
		if (codeSystem != null)
			auditStr.append(codeSystem.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*idtypeComponent* :");
		auditStr.append(idtypeComponent);
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryPatientId* :");
		if (primaryPatientId != null)
			auditStr.append(primaryPatientId.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*category* :");
		if (category != null)
			auditStr.append(category.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*configItems* :");
		if (configItems != null)
		{
		int i10=0;
		for (i10=0; i10<configItems.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.core.generic.domain.objects.ConfigProperty obj = (ims.core.generic.domain.objects.ConfigProperty)configItems.get(i10);
		    if (obj != null)
			{
				if (i10 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*allowsAlternateSpecimenTypes* :");
		auditStr.append(allowsAlternateSpecimenTypes);
	    auditStr.append("; ");
		auditStr.append("\r\n*supportsSpecimentSourceAndSite* :");
		auditStr.append(supportsSpecimentSourceAndSite);
	    auditStr.append("; ");
		auditStr.append("\r\n*sendReferralLetter* :");
		auditStr.append(sendReferralLetter);
	    auditStr.append("; ");
		auditStr.append("\r\n*sendQuestionnaire* :");
		auditStr.append(sendQuestionnaire);
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
		
		String keyClassName = "ProviderSystem";
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
		if (this.getSystemName() != null)
		{
			sb.append("<systemName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSystemName().toString()));
			sb.append("</systemName>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getIPAddress() != null)
		{
			sb.append("<iPAddress>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIPAddress().toString()));
			sb.append("</iPAddress>");		
		}
		if (this.getIPPort() != null)
		{
			sb.append("<iPPort>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIPPort().toString()));
			sb.append("</iPPort>");		
		}
		if (this.getHl7Application() != null)
		{
			sb.append("<hl7Application>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHl7Application().toString()));
			sb.append("</hl7Application>");		
		}
		if (this.getCodeSystem() != null)
		{
			sb.append("<codeSystem>");
			sb.append(this.getCodeSystem().toXMLString()); 
			sb.append("</codeSystem>");		
		}
		if (this.getIdtypeComponent() != null)
		{
			sb.append("<idtypeComponent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIdtypeComponent().toString()));
			sb.append("</idtypeComponent>");		
		}
		if (this.getPrimaryPatientId() != null)
		{
			sb.append("<primaryPatientId>");
			sb.append(this.getPrimaryPatientId().toXMLString()); 
			sb.append("</primaryPatientId>");		
		}
		if (this.getCategory() != null)
		{
			sb.append("<category>");
			sb.append(this.getCategory().toXMLString()); 
			sb.append("</category>");		
		}
		if (this.getConfigItems() != null)
		{
			if (this.getConfigItems().size() > 0 )
			{
			sb.append("<configItems>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getConfigItems(), domMap));
			sb.append("</configItems>");		
			}
		}
		if (this.isAllowsAlternateSpecimenTypes() != null)
		{
			sb.append("<allowsAlternateSpecimenTypes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAllowsAlternateSpecimenTypes().toString()));
			sb.append("</allowsAlternateSpecimenTypes>");		
		}
		if (this.isSupportsSpecimentSourceAndSite() != null)
		{
			sb.append("<supportsSpecimentSourceAndSite>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSupportsSpecimentSourceAndSite().toString()));
			sb.append("</supportsSpecimentSourceAndSite>");		
		}
		if (this.isSendReferralLetter() != null)
		{
			sb.append("<sendReferralLetter>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSendReferralLetter().toString()));
			sb.append("</sendReferralLetter>");		
		}
		if (this.isSendQuestionnaire() != null)
		{
			sb.append("<sendQuestionnaire>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSendQuestionnaire().toString()));
			sb.append("</sendQuestionnaire>");		
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
			ProviderSystem domainObject = getProviderSystemfromXML(itemEl, factory, domMap);

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
			ProviderSystem domainObject = getProviderSystemfromXML(itemEl, factory, domMap);

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
		
	public static ProviderSystem getProviderSystemfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getProviderSystemfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ProviderSystem getProviderSystemfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ProviderSystem.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ProviderSystem.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ProviderSystem class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ProviderSystem)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ProviderSystem.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ProviderSystem ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ProviderSystem)factory.getImportedDomainObject(ProviderSystem.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ProviderSystem();
		}
		String keyClassName = "ProviderSystem";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ProviderSystem)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ProviderSystem obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("systemName");
		if(fldEl != null)
		{	
    		obj.setSystemName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("iPAddress");
		if(fldEl != null)
		{	
    		obj.setIPAddress(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("iPPort");
		if(fldEl != null)
		{	
    		obj.setIPPort(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hl7Application");
		if(fldEl != null)
		{	
    		obj.setHl7Application(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("codeSystem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCodeSystem(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("idtypeComponent");
		if(fldEl != null)
		{	
    		obj.setIdtypeComponent(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("primaryPatientId");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrimaryPatientId(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("category");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("configItems");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setConfigItems(ims.core.generic.domain.objects.ConfigProperty.fromListXMLString(fldEl, factory, obj.getConfigItems(), domMap));
		}
		fldEl = el.element("allowsAlternateSpecimenTypes");
		if(fldEl != null)
		{	
    		obj.setAllowsAlternateSpecimenTypes(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("supportsSpecimentSourceAndSite");
		if(fldEl != null)
		{	
    		obj.setSupportsSpecimentSourceAndSite(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sendReferralLetter");
		if(fldEl != null)
		{	
    		obj.setSendReferralLetter(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sendQuestionnaire");
		if(fldEl != null)
		{	
    		obj.setSendQuestionnaire(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "configItems"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String SystemName = "systemName";
		public static final String Description = "description";
		public static final String IPAddress = "iPAddress";
		public static final String IPPort = "iPPort";
		public static final String Hl7Application = "hl7Application";
		public static final String CodeSystem = "codeSystem";
		public static final String IdtypeComponent = "idtypeComponent";
		public static final String PrimaryPatientId = "primaryPatientId";
		public static final String Category = "category";
		public static final String ConfigItems = "configItems";
		public static final String AllowsAlternateSpecimenTypes = "allowsAlternateSpecimenTypes";
		public static final String SupportsSpecimentSourceAndSite = "supportsSpecimentSourceAndSite";
		public static final String SendReferralLetter = "sendReferralLetter";
		public static final String SendQuestionnaire = "sendQuestionnaire";
	}
}

