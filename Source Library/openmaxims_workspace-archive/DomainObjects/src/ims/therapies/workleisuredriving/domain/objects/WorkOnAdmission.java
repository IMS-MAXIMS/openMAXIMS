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
package ims.therapies.workleisuredriving.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class WorkOnAdmission extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100078;
	private static final long serialVersionUID = 1019100078L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Authoring DateTime */
	private java.util.Date authoringDateTime;
	/** Authoring CP */
	private ims.core.resource.people.domain.objects.Hcp authoringCP;
	/** Present Career */
	private String presentCareer;
	/** Past Qualifications */
	private String pastQualifications;
	/** Employer Name */
	private String employerName;
	/** Employer Address */
	private String employerAddress;
	/** Employer Phone */
	private String employerPhone;
	/** Benefit Advice */
	private String benefitAdvice;
	/** Work Site Assessment */
	private ims.domain.lookups.LookupInstance workSiteAssessment;
	/** Work Site Assess Comment */
	private String workSiteAssessComment;
	/** Disability Employment Advisers  */
	private ims.domain.lookups.LookupInstance referDEA;
	/** What does this comment relate to? */
	private String dEAComment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WorkOnAdmission (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WorkOnAdmission ()
    {
    	super();
    }
    public WorkOnAdmission (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.workleisuredriving.domain.objects.WorkOnAdmission.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringCP() {
		return authoringCP;
	}
	public void setAuthoringCP(ims.core.resource.people.domain.objects.Hcp authoringCP) {
		this.authoringCP = authoringCP;
	}

	public String getPresentCareer() {
		return presentCareer;
	}
	public void setPresentCareer(String presentCareer) {
		if ( null != presentCareer && presentCareer.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for presentCareer. Tried to set value: "+
				presentCareer);
		}
		this.presentCareer = presentCareer;
	}

	public String getPastQualifications() {
		return pastQualifications;
	}
	public void setPastQualifications(String pastQualifications) {
		if ( null != pastQualifications && pastQualifications.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pastQualifications. Tried to set value: "+
				pastQualifications);
		}
		this.pastQualifications = pastQualifications;
	}

	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		if ( null != employerName && employerName.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for employerName. Tried to set value: "+
				employerName);
		}
		this.employerName = employerName;
	}

	public String getEmployerAddress() {
		return employerAddress;
	}
	public void setEmployerAddress(String employerAddress) {
		if ( null != employerAddress && employerAddress.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for employerAddress. Tried to set value: "+
				employerAddress);
		}
		this.employerAddress = employerAddress;
	}

	public String getEmployerPhone() {
		return employerPhone;
	}
	public void setEmployerPhone(String employerPhone) {
		if ( null != employerPhone && employerPhone.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for employerPhone. Tried to set value: "+
				employerPhone);
		}
		this.employerPhone = employerPhone;
	}

	public String getBenefitAdvice() {
		return benefitAdvice;
	}
	public void setBenefitAdvice(String benefitAdvice) {
		if ( null != benefitAdvice && benefitAdvice.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for benefitAdvice. Tried to set value: "+
				benefitAdvice);
		}
		this.benefitAdvice = benefitAdvice;
	}

	public ims.domain.lookups.LookupInstance getWorkSiteAssessment() {
		return workSiteAssessment;
	}
	public void setWorkSiteAssessment(ims.domain.lookups.LookupInstance workSiteAssessment) {
		this.workSiteAssessment = workSiteAssessment;
	}

	public String getWorkSiteAssessComment() {
		return workSiteAssessComment;
	}
	public void setWorkSiteAssessComment(String workSiteAssessComment) {
		if ( null != workSiteAssessComment && workSiteAssessComment.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for workSiteAssessComment. Tried to set value: "+
				workSiteAssessComment);
		}
		this.workSiteAssessComment = workSiteAssessComment;
	}

	public ims.domain.lookups.LookupInstance getReferDEA() {
		return referDEA;
	}
	public void setReferDEA(ims.domain.lookups.LookupInstance referDEA) {
		this.referDEA = referDEA;
	}

	public String getDEAComment() {
		return dEAComment;
	}
	public void setDEAComment(String dEAComment) {
		if ( null != dEAComment && dEAComment.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for dEAComment. Tried to set value: "+
				dEAComment);
		}
		this.dEAComment = dEAComment;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringCP* :");
		if (authoringCP != null)
		{
			auditStr.append(toShortClassName(authoringCP));
				
		    auditStr.append(authoringCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*presentCareer* :");
		auditStr.append(presentCareer);
	    auditStr.append("; ");
		auditStr.append("\r\n*pastQualifications* :");
		auditStr.append(pastQualifications);
	    auditStr.append("; ");
		auditStr.append("\r\n*employerName* :");
		auditStr.append(employerName);
	    auditStr.append("; ");
		auditStr.append("\r\n*employerAddress* :");
		auditStr.append(employerAddress);
	    auditStr.append("; ");
		auditStr.append("\r\n*employerPhone* :");
		auditStr.append(employerPhone);
	    auditStr.append("; ");
		auditStr.append("\r\n*benefitAdvice* :");
		auditStr.append(benefitAdvice);
	    auditStr.append("; ");
		auditStr.append("\r\n*workSiteAssessment* :");
		if (workSiteAssessment != null)
			auditStr.append(workSiteAssessment.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*workSiteAssessComment* :");
		auditStr.append(workSiteAssessComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*referDEA* :");
		if (referDEA != null)
			auditStr.append(referDEA.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dEAComment* :");
		auditStr.append(dEAComment);
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
		
		String keyClassName = "WorkOnAdmission";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getAuthoringCP() != null)
		{
			sb.append("<authoringCP>");
			sb.append(this.getAuthoringCP().toXMLString(domMap)); 	
			sb.append("</authoringCP>");		
		}
		if (this.getPresentCareer() != null)
		{
			sb.append("<presentCareer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPresentCareer().toString()));
			sb.append("</presentCareer>");		
		}
		if (this.getPastQualifications() != null)
		{
			sb.append("<pastQualifications>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPastQualifications().toString()));
			sb.append("</pastQualifications>");		
		}
		if (this.getEmployerName() != null)
		{
			sb.append("<employerName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEmployerName().toString()));
			sb.append("</employerName>");		
		}
		if (this.getEmployerAddress() != null)
		{
			sb.append("<employerAddress>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEmployerAddress().toString()));
			sb.append("</employerAddress>");		
		}
		if (this.getEmployerPhone() != null)
		{
			sb.append("<employerPhone>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEmployerPhone().toString()));
			sb.append("</employerPhone>");		
		}
		if (this.getBenefitAdvice() != null)
		{
			sb.append("<benefitAdvice>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBenefitAdvice().toString()));
			sb.append("</benefitAdvice>");		
		}
		if (this.getWorkSiteAssessment() != null)
		{
			sb.append("<workSiteAssessment>");
			sb.append(this.getWorkSiteAssessment().toXMLString()); 
			sb.append("</workSiteAssessment>");		
		}
		if (this.getWorkSiteAssessComment() != null)
		{
			sb.append("<workSiteAssessComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWorkSiteAssessComment().toString()));
			sb.append("</workSiteAssessComment>");		
		}
		if (this.getReferDEA() != null)
		{
			sb.append("<referDEA>");
			sb.append(this.getReferDEA().toXMLString()); 
			sb.append("</referDEA>");		
		}
		if (this.getDEAComment() != null)
		{
			sb.append("<dEAComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDEAComment().toString()));
			sb.append("</dEAComment>");		
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
			WorkOnAdmission domainObject = getWorkOnAdmissionfromXML(itemEl, factory, domMap);

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
			WorkOnAdmission domainObject = getWorkOnAdmissionfromXML(itemEl, factory, domMap);

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
		
	public static WorkOnAdmission getWorkOnAdmissionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWorkOnAdmissionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WorkOnAdmission getWorkOnAdmissionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WorkOnAdmission.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WorkOnAdmission.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WorkOnAdmission class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WorkOnAdmission)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WorkOnAdmission.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WorkOnAdmission ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WorkOnAdmission)factory.getImportedDomainObject(WorkOnAdmission.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WorkOnAdmission();
		}
		String keyClassName = "WorkOnAdmission";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WorkOnAdmission)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WorkOnAdmission obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("authoringCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("presentCareer");
		if(fldEl != null)
		{	
    		obj.setPresentCareer(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pastQualifications");
		if(fldEl != null)
		{	
    		obj.setPastQualifications(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("employerName");
		if(fldEl != null)
		{	
    		obj.setEmployerName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("employerAddress");
		if(fldEl != null)
		{	
    		obj.setEmployerAddress(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("employerPhone");
		if(fldEl != null)
		{	
    		obj.setEmployerPhone(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("benefitAdvice");
		if(fldEl != null)
		{	
    		obj.setBenefitAdvice(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("workSiteAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWorkSiteAssessment(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("workSiteAssessComment");
		if(fldEl != null)
		{	
    		obj.setWorkSiteAssessComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referDEA");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferDEA(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dEAComment");
		if(fldEl != null)
		{	
    		obj.setDEAComment(new String(fldEl.getTextTrim()));	
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
		public static final String CareContext = "careContext";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String AuthoringCP = "authoringCP";
		public static final String PresentCareer = "presentCareer";
		public static final String PastQualifications = "pastQualifications";
		public static final String EmployerName = "employerName";
		public static final String EmployerAddress = "employerAddress";
		public static final String EmployerPhone = "employerPhone";
		public static final String BenefitAdvice = "benefitAdvice";
		public static final String WorkSiteAssessment = "workSiteAssessment";
		public static final String WorkSiteAssessComment = "workSiteAssessComment";
		public static final String ReferDEA = "referDEA";
		public static final String DEAComment = "dEAComment";
	}
}

