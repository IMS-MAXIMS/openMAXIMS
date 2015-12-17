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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class CommunityServices extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100077;
	private static final long serialVersionUID = 1003100077L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	private ims.core.resource.place.domain.objects.LocationService locationService;
	/** Current Frequency Of Service */
	private String currentFrequency;
	private String comments;
	private Boolean isCurrentlyActive;
	/** SuppliedService */
	private ims.core.clinical.domain.objects.SuppNetworkServiceProfessionDetail suppliedService;
	/** Service */
	private ims.core.clinical.domain.objects.Service service;
	/** Frequency Of Services on Discharge */
	private String dischargeFrequency;
	/** Service Requested for Discharge */
	private Boolean isDischargeService;
	/** Service in Place */
	private Boolean isServiceInPlace;
	/** Confirmed Start Date */
	private java.util.Date confirmedDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CommunityServices (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CommunityServices ()
    {
    	super();
    }
    public CommunityServices (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.CommunityServices.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.resource.place.domain.objects.LocationService getLocationService() {
		return locationService;
	}
	public void setLocationService(ims.core.resource.place.domain.objects.LocationService locationService) {
		this.locationService = locationService;
	}

	public String getCurrentFrequency() {
		return currentFrequency;
	}
	public void setCurrentFrequency(String currentFrequency) {
		this.currentFrequency = currentFrequency;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public Boolean isIsCurrentlyActive() {
		return isCurrentlyActive;
	}
	public void setIsCurrentlyActive(Boolean isCurrentlyActive) {
		this.isCurrentlyActive = isCurrentlyActive;
	}

	public ims.core.clinical.domain.objects.SuppNetworkServiceProfessionDetail getSuppliedService() {
		return suppliedService;
	}
	public void setSuppliedService(ims.core.clinical.domain.objects.SuppNetworkServiceProfessionDetail suppliedService) {
		this.suppliedService = suppliedService;
	}

	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
	}

	public String getDischargeFrequency() {
		return dischargeFrequency;
	}
	public void setDischargeFrequency(String dischargeFrequency) {
		this.dischargeFrequency = dischargeFrequency;
	}

	public Boolean isIsDischargeService() {
		return isDischargeService;
	}
	public void setIsDischargeService(Boolean isDischargeService) {
		this.isDischargeService = isDischargeService;
	}

	public Boolean isIsServiceInPlace() {
		return isServiceInPlace;
	}
	public void setIsServiceInPlace(Boolean isServiceInPlace) {
		this.isServiceInPlace = isServiceInPlace;
	}

	public java.util.Date getConfirmedDate() {
		return confirmedDate;
	}
	public void setConfirmedDate(java.util.Date confirmedDate) {
		this.confirmedDate = confirmedDate;
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
		
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*locationService* :");
		if (locationService != null)
		{
			auditStr.append(toShortClassName(locationService));
				
		    auditStr.append(locationService.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentFrequency* :");
		auditStr.append(currentFrequency);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*isCurrentlyActive* :");
		auditStr.append(isCurrentlyActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*suppliedService* :");
		if (suppliedService != null)
		{
			auditStr.append(toShortClassName(suppliedService));
				
		    auditStr.append(suppliedService.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeFrequency* :");
		auditStr.append(dischargeFrequency);
	    auditStr.append("; ");
		auditStr.append("\r\n*isDischargeService* :");
		auditStr.append(isDischargeService);
	    auditStr.append("; ");
		auditStr.append("\r\n*isServiceInPlace* :");
		auditStr.append(isServiceInPlace);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedDate* :");
		auditStr.append(confirmedDate);
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
		
		String keyClassName = "CommunityServices";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getLocationService() != null)
		{
			sb.append("<locationService>");
			sb.append(this.getLocationService().toXMLString(domMap)); 	
			sb.append("</locationService>");		
		}
		if (this.getCurrentFrequency() != null)
		{
			sb.append("<currentFrequency>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCurrentFrequency().toString()));
			sb.append("</currentFrequency>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.isIsCurrentlyActive() != null)
		{
			sb.append("<isCurrentlyActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCurrentlyActive().toString()));
			sb.append("</isCurrentlyActive>");		
		}
		if (this.getSuppliedService() != null)
		{
			sb.append("<suppliedService>");
			sb.append(this.getSuppliedService().toXMLString(domMap)); 	
			sb.append("</suppliedService>");		
		}
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
		}
		if (this.getDischargeFrequency() != null)
		{
			sb.append("<dischargeFrequency>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDischargeFrequency().toString()));
			sb.append("</dischargeFrequency>");		
		}
		if (this.isIsDischargeService() != null)
		{
			sb.append("<isDischargeService>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDischargeService().toString()));
			sb.append("</isDischargeService>");		
		}
		if (this.isIsServiceInPlace() != null)
		{
			sb.append("<isServiceInPlace>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsServiceInPlace().toString()));
			sb.append("</isServiceInPlace>");		
		}
		if (this.getConfirmedDate() != null)
		{
			sb.append("<confirmedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getConfirmedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</confirmedDate>");		
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
			CommunityServices domainObject = getCommunityServicesfromXML(itemEl, factory, domMap);

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
			CommunityServices domainObject = getCommunityServicesfromXML(itemEl, factory, domMap);

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
		
	public static CommunityServices getCommunityServicesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCommunityServicesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CommunityServices getCommunityServicesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CommunityServices.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CommunityServices.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CommunityServices class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CommunityServices)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CommunityServices.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CommunityServices ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CommunityServices)factory.getImportedDomainObject(CommunityServices.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CommunityServices();
		}
		String keyClassName = "CommunityServices";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CommunityServices)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CommunityServices obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("locationService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocationService(ims.core.resource.place.domain.objects.LocationService.getLocationServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentFrequency");
		if(fldEl != null)
		{	
    		obj.setCurrentFrequency(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isCurrentlyActive");
		if(fldEl != null)
		{	
    		obj.setIsCurrentlyActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("suppliedService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSuppliedService(ims.core.clinical.domain.objects.SuppNetworkServiceProfessionDetail.getSuppNetworkServiceProfessionDetailfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dischargeFrequency");
		if(fldEl != null)
		{	
    		obj.setDischargeFrequency(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isDischargeService");
		if(fldEl != null)
		{	
    		obj.setIsDischargeService(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isServiceInPlace");
		if(fldEl != null)
		{	
    		obj.setIsServiceInPlace(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("confirmedDate");
		if(fldEl != null)
		{	
    		obj.setConfirmedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String AuthoringInformation = "authoringInformation";
		public static final String CareContext = "careContext";
		public static final String ClinicalContact = "clinicalContact";
		public static final String LocationService = "locationService";
		public static final String CurrentFrequency = "currentFrequency";
		public static final String Comments = "comments";
		public static final String IsCurrentlyActive = "isCurrentlyActive";
		public static final String SuppliedService = "suppliedService";
		public static final String Service = "service";
		public static final String DischargeFrequency = "dischargeFrequency";
		public static final String IsDischargeService = "isDischargeService";
		public static final String IsServiceInPlace = "isServiceInPlace";
		public static final String ConfirmedDate = "confirmedDate";
	}
}

