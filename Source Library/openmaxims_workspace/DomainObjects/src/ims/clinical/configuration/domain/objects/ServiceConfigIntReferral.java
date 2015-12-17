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
 * @author Barbara Worwood
 * Generated.
 */


public class ServiceConfigIntReferral extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1028100078;
	private static final long serialVersionUID = 1028100078L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Clinical Service for configuration */
	private ims.core.clinical.domain.objects.Service service;
	/** Is this an active configuration record */
	private Boolean active;
	/** Does this service require Hcp Authorisation */
	private Boolean requiresHcpAuthorisation;
	/** Does this service allow non-hcp acceptance */
	private Boolean nonHcpAcceptance;
	/** Specify if no hcp is allowed for this service */
	private Boolean noHCPAllowedForService;
	/** Service Question
	  * Collection of ims.assessment.configuration.domain.objects.AssessmentQuestion.
	  */
	private java.util.List questions;
	/** Text that will be used as a tooltip on selection of service during instantiation */
	private String tooltipText;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ServiceConfigIntReferral (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ServiceConfigIntReferral ()
    {
    	super();
    }
    public ServiceConfigIntReferral (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.configuration.domain.objects.ServiceConfigIntReferral.class;
	}


	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean isRequiresHcpAuthorisation() {
		return requiresHcpAuthorisation;
	}
	public void setRequiresHcpAuthorisation(Boolean requiresHcpAuthorisation) {
		this.requiresHcpAuthorisation = requiresHcpAuthorisation;
	}

	public Boolean isNonHcpAcceptance() {
		return nonHcpAcceptance;
	}
	public void setNonHcpAcceptance(Boolean nonHcpAcceptance) {
		this.nonHcpAcceptance = nonHcpAcceptance;
	}

	public Boolean isNoHCPAllowedForService() {
		return noHCPAllowedForService;
	}
	public void setNoHCPAllowedForService(Boolean noHCPAllowedForService) {
		this.noHCPAllowedForService = noHCPAllowedForService;
	}

	public java.util.List getQuestions() {
		if ( null == questions ) {
			questions = new java.util.ArrayList();
		}
		return questions;
	}
	public void setQuestions(java.util.List paramValue) {
		this.questions = paramValue;
	}

	public String getTooltipText() {
		return tooltipText;
	}
	public void setTooltipText(String tooltipText) {
		if ( null != tooltipText && tooltipText.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for tooltipText. Tried to set value: "+
				tooltipText);
		}
		this.tooltipText = tooltipText;
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
		
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresHcpAuthorisation* :");
		auditStr.append(requiresHcpAuthorisation);
	    auditStr.append("; ");
		auditStr.append("\r\n*nonHcpAcceptance* :");
		auditStr.append(nonHcpAcceptance);
	    auditStr.append("; ");
		auditStr.append("\r\n*noHCPAllowedForService* :");
		auditStr.append(noHCPAllowedForService);
	    auditStr.append("; ");
		auditStr.append("\r\n*questions* :");
		if (questions != null)
		{
		int i6=0;
		for (i6=0; i6<questions.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.assessment.configuration.domain.objects.AssessmentQuestion obj = (ims.assessment.configuration.domain.objects.AssessmentQuestion)questions.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tooltipText* :");
		auditStr.append(tooltipText);
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
		
		String keyClassName = "ServiceConfigIntReferral";
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
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
		}
		if (this.isRequiresHcpAuthorisation() != null)
		{
			sb.append("<requiresHcpAuthorisation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresHcpAuthorisation().toString()));
			sb.append("</requiresHcpAuthorisation>");		
		}
		if (this.isNonHcpAcceptance() != null)
		{
			sb.append("<nonHcpAcceptance>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNonHcpAcceptance().toString()));
			sb.append("</nonHcpAcceptance>");		
		}
		if (this.isNoHCPAllowedForService() != null)
		{
			sb.append("<noHCPAllowedForService>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNoHCPAllowedForService().toString()));
			sb.append("</noHCPAllowedForService>");		
		}
		if (this.getQuestions() != null)
		{
			if (this.getQuestions().size() > 0 )
			{
			sb.append("<questions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getQuestions(), domMap));
			sb.append("</questions>");		
			}
		}
		if (this.getTooltipText() != null)
		{
			sb.append("<tooltipText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTooltipText().toString()));
			sb.append("</tooltipText>");		
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
			ServiceConfigIntReferral domainObject = getServiceConfigIntReferralfromXML(itemEl, factory, domMap);

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
			ServiceConfigIntReferral domainObject = getServiceConfigIntReferralfromXML(itemEl, factory, domMap);

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
		
	public static ServiceConfigIntReferral getServiceConfigIntReferralfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getServiceConfigIntReferralfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ServiceConfigIntReferral getServiceConfigIntReferralfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ServiceConfigIntReferral.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ServiceConfigIntReferral.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ServiceConfigIntReferral class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ServiceConfigIntReferral)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ServiceConfigIntReferral.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ServiceConfigIntReferral ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ServiceConfigIntReferral)factory.getImportedDomainObject(ServiceConfigIntReferral.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ServiceConfigIntReferral();
		}
		String keyClassName = "ServiceConfigIntReferral";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ServiceConfigIntReferral)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ServiceConfigIntReferral obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requiresHcpAuthorisation");
		if(fldEl != null)
		{	
    		obj.setRequiresHcpAuthorisation(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nonHcpAcceptance");
		if(fldEl != null)
		{	
    		obj.setNonHcpAcceptance(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noHCPAllowedForService");
		if(fldEl != null)
		{	
    		obj.setNoHCPAllowedForService(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("questions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setQuestions(ims.assessment.configuration.domain.objects.AssessmentQuestion.fromListXMLString(fldEl, factory, obj.getQuestions(), domMap));
		}
		fldEl = el.element("tooltipText");
		if(fldEl != null)
		{	
    		obj.setTooltipText(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "questions"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Service = "service";
		public static final String Active = "active";
		public static final String RequiresHcpAuthorisation = "requiresHcpAuthorisation";
		public static final String NonHcpAcceptance = "nonHcpAcceptance";
		public static final String NoHCPAllowedForService = "noHCPAllowedForService";
		public static final String Questions = "questions";
		public static final String TooltipText = "tooltipText";
	}
}

