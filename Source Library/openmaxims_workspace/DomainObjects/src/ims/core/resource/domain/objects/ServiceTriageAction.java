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
package ims.core.resource.domain.objects;

/**
 * 
 * @author Cristian Belciug
 * Generated.
 */


public class ServiceTriageAction extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1005100010;
	private static final long serialVersionUID = 1005100010L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Service */
	private ims.core.clinical.domain.objects.Service service;
	private ims.domain.lookups.LookupInstance linkedOPAsAndDiagnostic;
	private ims.domain.lookups.LookupInstance oPA;
	private ims.domain.lookups.LookupInstance oPAAndLinkedDiagostic;
	private ims.domain.lookups.LookupInstance directToList;
	private ims.domain.lookups.LookupInstance directToListAndOPA;
	private Boolean consultant;
	private Boolean sPR;
	private Boolean associateSpecialist;
	private Boolean anyDoctorToSee;
	private ims.domain.lookups.LookupInstance linkedDiagnostic;
	private Boolean otherHCP;
	/** 
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List otherHCPValues;
	private ims.domain.lookups.LookupInstance linkedOPAs;
	/** Default Action For Manual Referral */
	private ims.domain.lookups.LookupInstance defaultActionForManualReferral;
	/** Default Action For CAB Referral */
	private ims.domain.lookups.LookupInstance defaultActionForCABReferral;
	private ims.domain.lookups.LookupInstance changeCABOPA;
	private ims.domain.lookups.LookupInstance changeCABOPAandDirectToList;
	private ims.domain.lookups.LookupInstance cABOPAandDirectToList;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ServiceTriageAction (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ServiceTriageAction ()
    {
    	super();
    }
    public ServiceTriageAction (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.domain.objects.ServiceTriageAction.class;
	}


	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public static ServiceTriageAction getServiceTriageActionFromService(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from ServiceTriageAction c where c.service.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. ServiceTriageAction.service.id = " + id + " returned " + l.size() + " records. " );
		return (ServiceTriageAction)l.get(0);
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
	}

	public ims.domain.lookups.LookupInstance getLinkedOPAsAndDiagnostic() {
		return linkedOPAsAndDiagnostic;
	}
	public void setLinkedOPAsAndDiagnostic(ims.domain.lookups.LookupInstance linkedOPAsAndDiagnostic) {
		this.linkedOPAsAndDiagnostic = linkedOPAsAndDiagnostic;
	}

	public ims.domain.lookups.LookupInstance getOPA() {
		return oPA;
	}
	public void setOPA(ims.domain.lookups.LookupInstance oPA) {
		this.oPA = oPA;
	}

	public ims.domain.lookups.LookupInstance getOPAAndLinkedDiagostic() {
		return oPAAndLinkedDiagostic;
	}
	public void setOPAAndLinkedDiagostic(ims.domain.lookups.LookupInstance oPAAndLinkedDiagostic) {
		this.oPAAndLinkedDiagostic = oPAAndLinkedDiagostic;
	}

	public ims.domain.lookups.LookupInstance getDirectToList() {
		return directToList;
	}
	public void setDirectToList(ims.domain.lookups.LookupInstance directToList) {
		this.directToList = directToList;
	}

	public ims.domain.lookups.LookupInstance getDirectToListAndOPA() {
		return directToListAndOPA;
	}
	public void setDirectToListAndOPA(ims.domain.lookups.LookupInstance directToListAndOPA) {
		this.directToListAndOPA = directToListAndOPA;
	}

	public Boolean isConsultant() {
		return consultant;
	}
	public void setConsultant(Boolean consultant) {
		this.consultant = consultant;
	}

	public Boolean isSPR() {
		return sPR;
	}
	public void setSPR(Boolean sPR) {
		this.sPR = sPR;
	}

	public Boolean isAssociateSpecialist() {
		return associateSpecialist;
	}
	public void setAssociateSpecialist(Boolean associateSpecialist) {
		this.associateSpecialist = associateSpecialist;
	}

	public Boolean isAnyDoctorToSee() {
		return anyDoctorToSee;
	}
	public void setAnyDoctorToSee(Boolean anyDoctorToSee) {
		this.anyDoctorToSee = anyDoctorToSee;
	}

	public ims.domain.lookups.LookupInstance getLinkedDiagnostic() {
		return linkedDiagnostic;
	}
	public void setLinkedDiagnostic(ims.domain.lookups.LookupInstance linkedDiagnostic) {
		this.linkedDiagnostic = linkedDiagnostic;
	}

	public Boolean isOtherHCP() {
		return otherHCP;
	}
	public void setOtherHCP(Boolean otherHCP) {
		this.otherHCP = otherHCP;
	}

	public java.util.List getOtherHCPValues() {
		if ( null == otherHCPValues ) {
			otherHCPValues = new java.util.ArrayList();
		}
		return otherHCPValues;
	}
	public void setOtherHCPValues(java.util.List paramValue) {
		this.otherHCPValues = paramValue;
	}

	public ims.domain.lookups.LookupInstance getLinkedOPAs() {
		return linkedOPAs;
	}
	public void setLinkedOPAs(ims.domain.lookups.LookupInstance linkedOPAs) {
		this.linkedOPAs = linkedOPAs;
	}

	public ims.domain.lookups.LookupInstance getDefaultActionForManualReferral() {
		return defaultActionForManualReferral;
	}
	public void setDefaultActionForManualReferral(ims.domain.lookups.LookupInstance defaultActionForManualReferral) {
		this.defaultActionForManualReferral = defaultActionForManualReferral;
	}

	public ims.domain.lookups.LookupInstance getDefaultActionForCABReferral() {
		return defaultActionForCABReferral;
	}
	public void setDefaultActionForCABReferral(ims.domain.lookups.LookupInstance defaultActionForCABReferral) {
		this.defaultActionForCABReferral = defaultActionForCABReferral;
	}

	public ims.domain.lookups.LookupInstance getChangeCABOPA() {
		return changeCABOPA;
	}
	public void setChangeCABOPA(ims.domain.lookups.LookupInstance changeCABOPA) {
		this.changeCABOPA = changeCABOPA;
	}

	public ims.domain.lookups.LookupInstance getChangeCABOPAandDirectToList() {
		return changeCABOPAandDirectToList;
	}
	public void setChangeCABOPAandDirectToList(ims.domain.lookups.LookupInstance changeCABOPAandDirectToList) {
		this.changeCABOPAandDirectToList = changeCABOPAandDirectToList;
	}

	public ims.domain.lookups.LookupInstance getCABOPAandDirectToList() {
		return cABOPAandDirectToList;
	}
	public void setCABOPAandDirectToList(ims.domain.lookups.LookupInstance cABOPAandDirectToList) {
		this.cABOPAandDirectToList = cABOPAandDirectToList;
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
		
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedOPAsAndDiagnostic* :");
		if (linkedOPAsAndDiagnostic != null)
			auditStr.append(linkedOPAsAndDiagnostic.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*oPA* :");
		if (oPA != null)
			auditStr.append(oPA.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*oPAAndLinkedDiagostic* :");
		if (oPAAndLinkedDiagostic != null)
			auditStr.append(oPAAndLinkedDiagostic.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*directToList* :");
		if (directToList != null)
			auditStr.append(directToList.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*directToListAndOPA* :");
		if (directToListAndOPA != null)
			auditStr.append(directToListAndOPA.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consultant* :");
		auditStr.append(consultant);
	    auditStr.append("; ");
		auditStr.append("\r\n*sPR* :");
		auditStr.append(sPR);
	    auditStr.append("; ");
		auditStr.append("\r\n*associateSpecialist* :");
		auditStr.append(associateSpecialist);
	    auditStr.append("; ");
		auditStr.append("\r\n*anyDoctorToSee* :");
		auditStr.append(anyDoctorToSee);
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedDiagnostic* :");
		if (linkedDiagnostic != null)
			auditStr.append(linkedDiagnostic.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*otherHCP* :");
		auditStr.append(otherHCP);
	    auditStr.append("; ");
		auditStr.append("\r\n*otherHCPValues* :");
		if (otherHCPValues != null)
		{
		int i13=0;
		for (i13=0; i13<otherHCPValues.size(); i13++)
		{
			if (i13 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)otherHCPValues.get(i13);
			auditStr.append(obj.getText());
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedOPAs* :");
		if (linkedOPAs != null)
			auditStr.append(linkedOPAs.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*defaultActionForManualReferral* :");
		if (defaultActionForManualReferral != null)
			auditStr.append(defaultActionForManualReferral.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*defaultActionForCABReferral* :");
		if (defaultActionForCABReferral != null)
			auditStr.append(defaultActionForCABReferral.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*changeCABOPA* :");
		if (changeCABOPA != null)
			auditStr.append(changeCABOPA.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*changeCABOPAandDirectToList* :");
		if (changeCABOPAandDirectToList != null)
			auditStr.append(changeCABOPAandDirectToList.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cABOPAandDirectToList* :");
		if (cABOPAandDirectToList != null)
			auditStr.append(cABOPAandDirectToList.getText());
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
		
		String keyClassName = "ServiceTriageAction";
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
		if (this.getLinkedOPAsAndDiagnostic() != null)
		{
			sb.append("<linkedOPAsAndDiagnostic>");
			sb.append(this.getLinkedOPAsAndDiagnostic().toXMLString()); 
			sb.append("</linkedOPAsAndDiagnostic>");		
		}
		if (this.getOPA() != null)
		{
			sb.append("<oPA>");
			sb.append(this.getOPA().toXMLString()); 
			sb.append("</oPA>");		
		}
		if (this.getOPAAndLinkedDiagostic() != null)
		{
			sb.append("<oPAAndLinkedDiagostic>");
			sb.append(this.getOPAAndLinkedDiagostic().toXMLString()); 
			sb.append("</oPAAndLinkedDiagostic>");		
		}
		if (this.getDirectToList() != null)
		{
			sb.append("<directToList>");
			sb.append(this.getDirectToList().toXMLString()); 
			sb.append("</directToList>");		
		}
		if (this.getDirectToListAndOPA() != null)
		{
			sb.append("<directToListAndOPA>");
			sb.append(this.getDirectToListAndOPA().toXMLString()); 
			sb.append("</directToListAndOPA>");		
		}
		if (this.isConsultant() != null)
		{
			sb.append("<consultant>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isConsultant().toString()));
			sb.append("</consultant>");		
		}
		if (this.isSPR() != null)
		{
			sb.append("<sPR>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSPR().toString()));
			sb.append("</sPR>");		
		}
		if (this.isAssociateSpecialist() != null)
		{
			sb.append("<associateSpecialist>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAssociateSpecialist().toString()));
			sb.append("</associateSpecialist>");		
		}
		if (this.isAnyDoctorToSee() != null)
		{
			sb.append("<anyDoctorToSee>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAnyDoctorToSee().toString()));
			sb.append("</anyDoctorToSee>");		
		}
		if (this.getLinkedDiagnostic() != null)
		{
			sb.append("<linkedDiagnostic>");
			sb.append(this.getLinkedDiagnostic().toXMLString()); 
			sb.append("</linkedDiagnostic>");		
		}
		if (this.isOtherHCP() != null)
		{
			sb.append("<otherHCP>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isOtherHCP().toString()));
			sb.append("</otherHCP>");		
		}
		if (this.getOtherHCPValues() != null)
		{
			if (this.getOtherHCPValues().size() > 0 )
			{
			sb.append("<otherHCPValues>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getOtherHCPValues())); 
			sb.append("</otherHCPValues>");		
			}
		}
		if (this.getLinkedOPAs() != null)
		{
			sb.append("<linkedOPAs>");
			sb.append(this.getLinkedOPAs().toXMLString()); 
			sb.append("</linkedOPAs>");		
		}
		if (this.getDefaultActionForManualReferral() != null)
		{
			sb.append("<defaultActionForManualReferral>");
			sb.append(this.getDefaultActionForManualReferral().toXMLString()); 
			sb.append("</defaultActionForManualReferral>");		
		}
		if (this.getDefaultActionForCABReferral() != null)
		{
			sb.append("<defaultActionForCABReferral>");
			sb.append(this.getDefaultActionForCABReferral().toXMLString()); 
			sb.append("</defaultActionForCABReferral>");		
		}
		if (this.getChangeCABOPA() != null)
		{
			sb.append("<changeCABOPA>");
			sb.append(this.getChangeCABOPA().toXMLString()); 
			sb.append("</changeCABOPA>");		
		}
		if (this.getChangeCABOPAandDirectToList() != null)
		{
			sb.append("<changeCABOPAandDirectToList>");
			sb.append(this.getChangeCABOPAandDirectToList().toXMLString()); 
			sb.append("</changeCABOPAandDirectToList>");		
		}
		if (this.getCABOPAandDirectToList() != null)
		{
			sb.append("<cABOPAandDirectToList>");
			sb.append(this.getCABOPAandDirectToList().toXMLString()); 
			sb.append("</cABOPAandDirectToList>");		
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
			ServiceTriageAction domainObject = getServiceTriageActionfromXML(itemEl, factory, domMap);

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
			ServiceTriageAction domainObject = getServiceTriageActionfromXML(itemEl, factory, domMap);

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
		
	public static ServiceTriageAction getServiceTriageActionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getServiceTriageActionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ServiceTriageAction getServiceTriageActionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ServiceTriageAction.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ServiceTriageAction.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ServiceTriageAction class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ServiceTriageAction)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ServiceTriageAction.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ServiceTriageAction ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ServiceTriageAction)factory.getImportedDomainObject(ServiceTriageAction.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ServiceTriageAction();
		}
		String keyClassName = "ServiceTriageAction";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ServiceTriageAction)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ServiceTriageAction obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("linkedOPAsAndDiagnostic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLinkedOPAsAndDiagnostic(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("oPA");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOPA(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("oPAAndLinkedDiagostic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOPAAndLinkedDiagostic(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("directToList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDirectToList(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("directToListAndOPA");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDirectToListAndOPA(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consultant");
		if(fldEl != null)
		{	
    		obj.setConsultant(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sPR");
		if(fldEl != null)
		{	
    		obj.setSPR(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("associateSpecialist");
		if(fldEl != null)
		{	
    		obj.setAssociateSpecialist(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anyDoctorToSee");
		if(fldEl != null)
		{	
    		obj.setAnyDoctorToSee(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("linkedDiagnostic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLinkedDiagnostic(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("otherHCP");
		if(fldEl != null)
		{	
    		obj.setOtherHCP(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("otherHCPValues");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOtherHCPValues(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getOtherHCPValues())); 
		}
		fldEl = el.element("linkedOPAs");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLinkedOPAs(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("defaultActionForManualReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDefaultActionForManualReferral(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("defaultActionForCABReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDefaultActionForCABReferral(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("changeCABOPA");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setChangeCABOPA(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("changeCABOPAandDirectToList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setChangeCABOPAandDirectToList(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cABOPAandDirectToList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCABOPAandDirectToList(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "otherHCPValues"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Service = "service";
		public static final String LinkedOPAsAndDiagnostic = "linkedOPAsAndDiagnostic";
		public static final String OPA = "oPA";
		public static final String OPAAndLinkedDiagostic = "oPAAndLinkedDiagostic";
		public static final String DirectToList = "directToList";
		public static final String DirectToListAndOPA = "directToListAndOPA";
		public static final String Consultant = "consultant";
		public static final String SPR = "sPR";
		public static final String AssociateSpecialist = "associateSpecialist";
		public static final String AnyDoctorToSee = "anyDoctorToSee";
		public static final String LinkedDiagnostic = "linkedDiagnostic";
		public static final String OtherHCP = "otherHCP";
		public static final String OtherHCPValues = "otherHCPValues";
		public static final String LinkedOPAs = "linkedOPAs";
		public static final String DefaultActionForManualReferral = "defaultActionForManualReferral";
		public static final String DefaultActionForCABReferral = "defaultActionForCABReferral";
		public static final String ChangeCABOPA = "changeCABOPA";
		public static final String ChangeCABOPAandDirectToList = "changeCABOPAandDirectToList";
		public static final String CABOPAandDirectToList = "cABOPAandDirectToList";
	}
}

