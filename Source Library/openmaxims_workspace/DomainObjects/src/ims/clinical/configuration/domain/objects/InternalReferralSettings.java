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
package ims.clinical.configuration.domain.objects;

/**
 * 
 * @author George Cristian Josan
 * Generated.
 */


public class InternalReferralSettings extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1073100036;
	private static final long serialVersionUID = 1073100036L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** NewConditionReferralBackToGP */
	private ims.domain.lookups.LookupInstance newConditionReferralBackToGP;
	/** ReferralBackToGPOptionalMessage */
	private String referralBackToGPOptionalMessage;
	/** ReferralBackToGPMandatoryMessage */
	private String referralBackToGPMandatoryMessage;
	/** UrgentReferralBackgroundColour */
	private ims.framework.utils.Color urgentReferralBackgroundColour;
	/** AllowScanImport */
	private Boolean allowScanImport;
	/** Default Search Days Interval */
	private Integer searchNumberOfDays;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public InternalReferralSettings (Integer id, int ver)
    {
    	super(id, ver);
    }
    public InternalReferralSettings ()
    {
    	super();
    }
    public InternalReferralSettings (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.configuration.domain.objects.InternalReferralSettings.class;
	}


	public ims.domain.lookups.LookupInstance getNewConditionReferralBackToGP() {
		return newConditionReferralBackToGP;
	}
	public void setNewConditionReferralBackToGP(ims.domain.lookups.LookupInstance newConditionReferralBackToGP) {
		this.newConditionReferralBackToGP = newConditionReferralBackToGP;
	}

	public String getReferralBackToGPOptionalMessage() {
		return referralBackToGPOptionalMessage;
	}
	public void setReferralBackToGPOptionalMessage(String referralBackToGPOptionalMessage) {
		if ( null != referralBackToGPOptionalMessage && referralBackToGPOptionalMessage.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referralBackToGPOptionalMessage. Tried to set value: "+
				referralBackToGPOptionalMessage);
		}
		this.referralBackToGPOptionalMessage = referralBackToGPOptionalMessage;
	}

	public String getReferralBackToGPMandatoryMessage() {
		return referralBackToGPMandatoryMessage;
	}
	public void setReferralBackToGPMandatoryMessage(String referralBackToGPMandatoryMessage) {
		if ( null != referralBackToGPMandatoryMessage && referralBackToGPMandatoryMessage.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referralBackToGPMandatoryMessage. Tried to set value: "+
				referralBackToGPMandatoryMessage);
		}
		this.referralBackToGPMandatoryMessage = referralBackToGPMandatoryMessage;
	}

	public ims.framework.utils.Color getUrgentReferralBackgroundColour() {
		return urgentReferralBackgroundColour;
	}
	public void setUrgentReferralBackgroundColour(ims.framework.utils.Color urgentReferralBackgroundColour) {
		this.urgentReferralBackgroundColour = urgentReferralBackgroundColour;
	}

	public Boolean isAllowScanImport() {
		return allowScanImport;
	}
	public void setAllowScanImport(Boolean allowScanImport) {
		this.allowScanImport = allowScanImport;
	}

	public Integer getSearchNumberOfDays() {
		return searchNumberOfDays;
	}
	public void setSearchNumberOfDays(Integer searchNumberOfDays) {
		this.searchNumberOfDays = searchNumberOfDays;
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
		if ( "Configuration".equals("Configuration") )
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
		
		auditStr.append("\r\n*newConditionReferralBackToGP* :");
		if (newConditionReferralBackToGP != null)
			auditStr.append(newConditionReferralBackToGP.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referralBackToGPOptionalMessage* :");
		auditStr.append(referralBackToGPOptionalMessage);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralBackToGPMandatoryMessage* :");
		auditStr.append(referralBackToGPMandatoryMessage);
	    auditStr.append("; ");
		auditStr.append("\r\n*urgentReferralBackgroundColour* :");
		auditStr.append(urgentReferralBackgroundColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*allowScanImport* :");
		auditStr.append(allowScanImport);
	    auditStr.append("; ");
		auditStr.append("\r\n*searchNumberOfDays* :");
		auditStr.append(searchNumberOfDays);
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
		
		String keyClassName = "InternalReferralSettings";
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
		if (this.getNewConditionReferralBackToGP() != null)
		{
			sb.append("<newConditionReferralBackToGP>");
			sb.append(this.getNewConditionReferralBackToGP().toXMLString()); 
			sb.append("</newConditionReferralBackToGP>");		
		}
		if (this.getReferralBackToGPOptionalMessage() != null)
		{
			sb.append("<referralBackToGPOptionalMessage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferralBackToGPOptionalMessage().toString()));
			sb.append("</referralBackToGPOptionalMessage>");		
		}
		if (this.getReferralBackToGPMandatoryMessage() != null)
		{
			sb.append("<referralBackToGPMandatoryMessage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferralBackToGPMandatoryMessage().toString()));
			sb.append("</referralBackToGPMandatoryMessage>");		
		}
		if (this.getUrgentReferralBackgroundColour() != null)
		{
			sb.append("<urgentReferralBackgroundColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUrgentReferralBackgroundColour().toString()));
			sb.append("</urgentReferralBackgroundColour>");		
		}
		if (this.isAllowScanImport() != null)
		{
			sb.append("<allowScanImport>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAllowScanImport().toString()));
			sb.append("</allowScanImport>");		
		}
		if (this.getSearchNumberOfDays() != null)
		{
			sb.append("<searchNumberOfDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSearchNumberOfDays().toString()));
			sb.append("</searchNumberOfDays>");		
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
			InternalReferralSettings domainObject = getInternalReferralSettingsfromXML(itemEl, factory, domMap);

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
			InternalReferralSettings domainObject = getInternalReferralSettingsfromXML(itemEl, factory, domMap);

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
		
	public static InternalReferralSettings getInternalReferralSettingsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getInternalReferralSettingsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static InternalReferralSettings getInternalReferralSettingsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!InternalReferralSettings.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!InternalReferralSettings.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the InternalReferralSettings class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (InternalReferralSettings)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(InternalReferralSettings.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		InternalReferralSettings ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (InternalReferralSettings)factory.getImportedDomainObject(InternalReferralSettings.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new InternalReferralSettings();
		}
		String keyClassName = "InternalReferralSettings";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (InternalReferralSettings)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, InternalReferralSettings obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("newConditionReferralBackToGP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNewConditionReferralBackToGP(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referralBackToGPOptionalMessage");
		if(fldEl != null)
		{	
    		obj.setReferralBackToGPOptionalMessage(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referralBackToGPMandatoryMessage");
		if(fldEl != null)
		{	
    		obj.setReferralBackToGPMandatoryMessage(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("urgentReferralBackgroundColour");
		if(fldEl != null)
		{	
    		obj.setUrgentReferralBackgroundColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("allowScanImport");
		if(fldEl != null)
		{	
    		obj.setAllowScanImport(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("searchNumberOfDays");
		if(fldEl != null)
		{	
    		obj.setSearchNumberOfDays(new Integer(fldEl.getTextTrim()));	
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
		public static final String NewConditionReferralBackToGP = "newConditionReferralBackToGP";
		public static final String ReferralBackToGPOptionalMessage = "referralBackToGPOptionalMessage";
		public static final String ReferralBackToGPMandatoryMessage = "referralBackToGPMandatoryMessage";
		public static final String UrgentReferralBackgroundColour = "urgentReferralBackgroundColour";
		public static final String AllowScanImport = "allowScanImport";
		public static final String SearchNumberOfDays = "searchNumberOfDays";
	}
}

