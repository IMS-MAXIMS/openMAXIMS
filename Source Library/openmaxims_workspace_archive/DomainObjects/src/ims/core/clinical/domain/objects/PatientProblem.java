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
package ims.core.clinical.domain.objects;

/**
 * Description of Problems Identified at Time of Medical Admission.
 * @author Kevin O'Carroll
 * Generated.
 */


public class PatientProblem extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1023100001;
	private static final long serialVersionUID = 1023100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Problem */
	private ims.clinical.configuration.domain.objects.ClinicalProblem problem;
	/** Actual Problem */
	private String patientProblem;
	/** isPresentingProblem */
	private Boolean isPresentingProblem;
	/** ProblemNote */
	private String problemNote;
	/** Onset */
	private Integer onset;
	/** Source */
	private ims.domain.lookups.LookupInstance source;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** ProblemContext - Spinal Injury Specific */
	private String problemContext;
	/** Active Flag - Spinal Injury Specific */
	private Boolean isActive;
	/** is Resolved */
	private Boolean isResolved;
	/** Date Resolved */
	private java.util.Date dateResolved;
	/** ResolvedHCP */
	private ims.core.resource.people.domain.objects.Hcp resolvedHCP;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** Primary For CareSpells
	  * Collection of ims.core.clinical.domain.objects.CsPrimaryProblem.
	  */
	private java.util.Set primaryForCareSpells;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Specialty required for Minor Injuries */
	private ims.domain.lookups.LookupInstance specialty;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientProblem (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientProblem ()
    {
    	super();
    }
    public PatientProblem (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientProblem.class;
	}


	public ims.clinical.configuration.domain.objects.ClinicalProblem getProblem() {
		return problem;
	}
	public void setProblem(ims.clinical.configuration.domain.objects.ClinicalProblem problem) {
		this.problem = problem;
	}

	public String getPatientProblem() {
		return patientProblem;
	}
	public void setPatientProblem(String patientProblem) {
		if ( null != patientProblem && patientProblem.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for patientProblem. Tried to set value: "+
				patientProblem);
		}
		this.patientProblem = patientProblem;
	}

	public Boolean isIsPresentingProblem() {
		return isPresentingProblem;
	}
	public void setIsPresentingProblem(Boolean isPresentingProblem) {
		this.isPresentingProblem = isPresentingProblem;
	}

	public String getProblemNote() {
		return problemNote;
	}
	public void setProblemNote(String problemNote) {
		if ( null != problemNote && problemNote.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for problemNote. Tried to set value: "+
				problemNote);
		}
		this.problemNote = problemNote;
	}

	public Integer getOnset() {
		return onset;
	}
	public void setOnset(Integer onset) {
		this.onset = onset;
	}

	public ims.domain.lookups.LookupInstance getSource() {
		return source;
	}
	public void setSource(ims.domain.lookups.LookupInstance source) {
		this.source = source;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public String getProblemContext() {
		return problemContext;
	}
	public void setProblemContext(String problemContext) {
		if ( null != problemContext && problemContext.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for problemContext. Tried to set value: "+
				problemContext);
		}
		this.problemContext = problemContext;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean isIsResolved() {
		return isResolved;
	}
	public void setIsResolved(Boolean isResolved) {
		this.isResolved = isResolved;
	}

	public java.util.Date getDateResolved() {
		return dateResolved;
	}
	public void setDateResolved(java.util.Date dateResolved) {
		this.dateResolved = dateResolved;
	}

	public ims.core.resource.people.domain.objects.Hcp getResolvedHCP() {
		return resolvedHCP;
	}
	public void setResolvedHCP(ims.core.resource.people.domain.objects.Hcp resolvedHCP) {
		this.resolvedHCP = resolvedHCP;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public java.util.Set getPrimaryForCareSpells() {
		if ( null == primaryForCareSpells ) {
			primaryForCareSpells = new java.util.HashSet();
		}
		return primaryForCareSpells;
	}
	public void setPrimaryForCareSpells(java.util.Set paramValue) {
		this.primaryForCareSpells = paramValue;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
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
		
		auditStr.append("\r\n*problem* :");
		if (problem != null)
		{
			auditStr.append(toShortClassName(problem));
				
		    auditStr.append(problem.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientProblem* :");
		auditStr.append(patientProblem);
	    auditStr.append("; ");
		auditStr.append("\r\n*isPresentingProblem* :");
		auditStr.append(isPresentingProblem);
	    auditStr.append("; ");
		auditStr.append("\r\n*problemNote* :");
		auditStr.append(problemNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*onset* :");
		auditStr.append(onset);
	    auditStr.append("; ");
		auditStr.append("\r\n*source* :");
		if (source != null)
			auditStr.append(source.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*problemContext* :");
		auditStr.append(problemContext);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*isResolved* :");
		auditStr.append(isResolved);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateResolved* :");
		auditStr.append(dateResolved);
	    auditStr.append("; ");
		auditStr.append("\r\n*resolvedHCP* :");
		if (resolvedHCP != null)
		{
			auditStr.append(toShortClassName(resolvedHCP));
				
		    auditStr.append(resolvedHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryForCareSpells* :");
		if (primaryForCareSpells != null)
		{
			java.util.Iterator it15 = primaryForCareSpells.iterator();
			int i15=0;
			while (it15.hasNext())
			{
				if (i15 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.CsPrimaryProblem obj = (ims.core.clinical.domain.objects.CsPrimaryProblem)it15.next();
		if (obj != null)
		{
		   if (i15 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i15++;
		}
		if (i15 > 0)
			auditStr.append("] " + i15);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
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
		
		String keyClassName = "PatientProblem";
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
		if (this.getProblem() != null)
		{
			sb.append("<problem>");
			sb.append(this.getProblem().toXMLString(domMap)); 	
			sb.append("</problem>");		
		}
		if (this.getPatientProblem() != null)
		{
			sb.append("<patientProblem>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatientProblem().toString()));
			sb.append("</patientProblem>");		
		}
		if (this.isIsPresentingProblem() != null)
		{
			sb.append("<isPresentingProblem>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPresentingProblem().toString()));
			sb.append("</isPresentingProblem>");		
		}
		if (this.getProblemNote() != null)
		{
			sb.append("<problemNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProblemNote().toString()));
			sb.append("</problemNote>");		
		}
		if (this.getOnset() != null)
		{
			sb.append("<onset>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOnset().toString()));
			sb.append("</onset>");		
		}
		if (this.getSource() != null)
		{
			sb.append("<source>");
			sb.append(this.getSource().toXMLString()); 
			sb.append("</source>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getProblemContext() != null)
		{
			sb.append("<problemContext>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProblemContext().toString()));
			sb.append("</problemContext>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.isIsResolved() != null)
		{
			sb.append("<isResolved>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsResolved().toString()));
			sb.append("</isResolved>");		
		}
		if (this.getDateResolved() != null)
		{
			sb.append("<dateResolved>");
			sb.append(new ims.framework.utils.DateTime(this.getDateResolved()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateResolved>");		
		}
		if (this.getResolvedHCP() != null)
		{
			sb.append("<resolvedHCP>");
			sb.append(this.getResolvedHCP().toXMLString(domMap)); 	
			sb.append("</resolvedHCP>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getPrimaryForCareSpells() != null)
		{
			if (this.getPrimaryForCareSpells().size() > 0 )
			{
			sb.append("<primaryForCareSpells>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPrimaryForCareSpells(), domMap));
			sb.append("</primaryForCareSpells>");		
			}
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
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
			PatientProblem domainObject = getPatientProblemfromXML(itemEl, factory, domMap);

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
			PatientProblem domainObject = getPatientProblemfromXML(itemEl, factory, domMap);

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
		
	public static PatientProblem getPatientProblemfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientProblemfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientProblem getPatientProblemfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientProblem.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientProblem.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientProblem class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientProblem)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientProblem.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientProblem ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientProblem)factory.getImportedDomainObject(PatientProblem.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientProblem();
		}
		String keyClassName = "PatientProblem";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientProblem)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientProblem obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("problem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProblem(ims.clinical.configuration.domain.objects.ClinicalProblem.getClinicalProblemfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientProblem");
		if(fldEl != null)
		{	
    		obj.setPatientProblem(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isPresentingProblem");
		if(fldEl != null)
		{	
    		obj.setIsPresentingProblem(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("problemNote");
		if(fldEl != null)
		{	
    		obj.setProblemNote(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("onset");
		if(fldEl != null)
		{	
    		obj.setOnset(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("source");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSource(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("problemContext");
		if(fldEl != null)
		{	
    		obj.setProblemContext(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isResolved");
		if(fldEl != null)
		{	
    		obj.setIsResolved(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateResolved");
		if(fldEl != null)
		{	
    		obj.setDateResolved(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("resolvedHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResolvedHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("primaryForCareSpells");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPrimaryForCareSpells(ims.core.clinical.domain.objects.CsPrimaryProblem.fromSetXMLString(fldEl, factory, obj.getPrimaryForCareSpells(), domMap));
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "primaryForCareSpells"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Problem = "problem";
		public static final String PatientProblem = "patientProblem";
		public static final String IsPresentingProblem = "isPresentingProblem";
		public static final String ProblemNote = "problemNote";
		public static final String Onset = "onset";
		public static final String Source = "source";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String ProblemContext = "problemContext";
		public static final String IsActive = "isActive";
		public static final String IsResolved = "isResolved";
		public static final String DateResolved = "dateResolved";
		public static final String ResolvedHCP = "resolvedHCP";
		public static final String Status = "status";
		public static final String PrimaryForCareSpells = "primaryForCareSpells";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String Specialty = "specialty";
	}
}

