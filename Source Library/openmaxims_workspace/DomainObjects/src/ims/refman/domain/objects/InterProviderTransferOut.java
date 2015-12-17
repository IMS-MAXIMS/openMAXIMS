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
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class InterProviderTransferOut extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100086;
	private static final long serialVersionUID = 1096100086L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Cats Referral */
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** Requested Date and Time  */
	private java.util.Date requestedDate;
	/** Referring Clinican */
	private ims.core.resource.people.domain.objects.Hcp referringClinican;
	/** IPT to Organisation */
	private ims.domain.lookups.LookupInstance iPTOrganisation;
	/** IPTService */
	private String iPTService;
	/** IPTClinician */
	private String iPTClinician;
	/** IPTComments */
	private String iPTComments;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public InterProviderTransferOut (Integer id, int ver)
    {
    	super(id, ver);
    }
    public InterProviderTransferOut ()
    {
    	super();
    }
    public InterProviderTransferOut (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.InterProviderTransferOut.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public static java.util.List listInterProviderTransferOutByPatient(ims.domain.ILightweightDomainFactory factory, ims.core.patient.domain.objects.Patient val)
	{
		String hql = "from InterProviderTransferOut c where c.patient = :patient";		
		return factory.find(hql, new String[]{"patient"}, new Object[]{val});		
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public java.util.Date getRequestedDate() {
		return requestedDate;
	}
	public void setRequestedDate(java.util.Date requestedDate) {
		this.requestedDate = requestedDate;
	}

	public ims.core.resource.people.domain.objects.Hcp getReferringClinican() {
		return referringClinican;
	}
	public void setReferringClinican(ims.core.resource.people.domain.objects.Hcp referringClinican) {
		this.referringClinican = referringClinican;
	}

	public ims.domain.lookups.LookupInstance getIPTOrganisation() {
		return iPTOrganisation;
	}
	public void setIPTOrganisation(ims.domain.lookups.LookupInstance iPTOrganisation) {
		this.iPTOrganisation = iPTOrganisation;
	}

	public String getIPTService() {
		return iPTService;
	}
	public void setIPTService(String iPTService) {
		if ( null != iPTService && iPTService.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for iPTService. Tried to set value: "+
				iPTService);
		}
		this.iPTService = iPTService;
	}

	public String getIPTClinician() {
		return iPTClinician;
	}
	public void setIPTClinician(String iPTClinician) {
		if ( null != iPTClinician && iPTClinician.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for iPTClinician. Tried to set value: "+
				iPTClinician);
		}
		this.iPTClinician = iPTClinician;
	}

	public String getIPTComments() {
		return iPTComments;
	}
	public void setIPTComments(String iPTComments) {
		this.iPTComments = iPTComments;
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
		
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*catsReferral* :");
		if (catsReferral != null)
		{
			auditStr.append(toShortClassName(catsReferral));
				
		    auditStr.append(catsReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requestedDate* :");
		auditStr.append(requestedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*referringClinican* :");
		if (referringClinican != null)
		{
			auditStr.append(toShortClassName(referringClinican));
				
		    auditStr.append(referringClinican.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*iPTOrganisation* :");
		if (iPTOrganisation != null)
			auditStr.append(iPTOrganisation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*iPTService* :");
		auditStr.append(iPTService);
	    auditStr.append("; ");
		auditStr.append("\r\n*iPTClinician* :");
		auditStr.append(iPTClinician);
	    auditStr.append("; ");
		auditStr.append("\r\n*iPTComments* :");
		auditStr.append(iPTComments);
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
		
		String keyClassName = "InterProviderTransferOut";
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
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getCatsReferral() != null)
		{
			sb.append("<catsReferral>");
			sb.append(this.getCatsReferral().toXMLString(domMap)); 	
			sb.append("</catsReferral>");		
		}
		if (this.getRequestedDate() != null)
		{
			sb.append("<requestedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRequestedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</requestedDate>");		
		}
		if (this.getReferringClinican() != null)
		{
			sb.append("<referringClinican>");
			sb.append(this.getReferringClinican().toXMLString(domMap)); 	
			sb.append("</referringClinican>");		
		}
		if (this.getIPTOrganisation() != null)
		{
			sb.append("<iPTOrganisation>");
			sb.append(this.getIPTOrganisation().toXMLString()); 
			sb.append("</iPTOrganisation>");		
		}
		if (this.getIPTService() != null)
		{
			sb.append("<iPTService>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIPTService().toString()));
			sb.append("</iPTService>");		
		}
		if (this.getIPTClinician() != null)
		{
			sb.append("<iPTClinician>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIPTClinician().toString()));
			sb.append("</iPTClinician>");		
		}
		if (this.getIPTComments() != null)
		{
			sb.append("<iPTComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIPTComments().toString()));
			sb.append("</iPTComments>");		
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
			InterProviderTransferOut domainObject = getInterProviderTransferOutfromXML(itemEl, factory, domMap);

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
			InterProviderTransferOut domainObject = getInterProviderTransferOutfromXML(itemEl, factory, domMap);

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
		
	public static InterProviderTransferOut getInterProviderTransferOutfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getInterProviderTransferOutfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static InterProviderTransferOut getInterProviderTransferOutfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!InterProviderTransferOut.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!InterProviderTransferOut.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the InterProviderTransferOut class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (InterProviderTransferOut)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(InterProviderTransferOut.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		InterProviderTransferOut ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (InterProviderTransferOut)factory.getImportedDomainObject(InterProviderTransferOut.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new InterProviderTransferOut();
		}
		String keyClassName = "InterProviderTransferOut";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (InterProviderTransferOut)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, InterProviderTransferOut obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requestedDate");
		if(fldEl != null)
		{	
    		obj.setRequestedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("referringClinican");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringClinican(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("iPTOrganisation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIPTOrganisation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("iPTService");
		if(fldEl != null)
		{	
    		obj.setIPTService(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("iPTClinician");
		if(fldEl != null)
		{	
    		obj.setIPTClinician(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("iPTComments");
		if(fldEl != null)
		{	
    		obj.setIPTComments(new String(fldEl.getTextTrim()));	
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
		public static final String Patient = "patient";
		public static final String CatsReferral = "catsReferral";
		public static final String RequestedDate = "requestedDate";
		public static final String ReferringClinican = "referringClinican";
		public static final String IPTOrganisation = "iPTOrganisation";
		public static final String IPTService = "iPTService";
		public static final String IPTClinician = "iPTClinician";
		public static final String IPTComments = "iPTComments";
	}
}

