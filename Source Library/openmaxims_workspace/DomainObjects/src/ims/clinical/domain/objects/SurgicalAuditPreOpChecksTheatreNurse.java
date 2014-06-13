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
package ims.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class SurgicalAuditPreOpChecksTheatreNurse extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100102;
	private static final long serialVersionUID = 1072100102L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Theatre Name */
	private ims.core.resource.place.domain.objects.Location theatreName;
	/** Comments */
	private String comments;
	/** Operation Type */
	private ims.domain.lookups.LookupInstance operationType;
	/** Accompanying Theatre Nurse */
	private ims.core.resource.people.domain.objects.Nurse accompanyingTheatreNurse;
	/** Accompanying Theatre Nurse is Locum Nurse? */
	private Boolean accompanyingTheatreNurseLocumBool;
	/** Accompanying Theatre Nurse Locum name */
	private String accompanyingTheatreNurseLocumNurse;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SurgicalAuditPreOpChecksTheatreNurse (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SurgicalAuditPreOpChecksTheatreNurse ()
    {
    	super();
    }
    public SurgicalAuditPreOpChecksTheatreNurse (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.SurgicalAuditPreOpChecksTheatreNurse.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.resource.place.domain.objects.Location getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(ims.core.resource.place.domain.objects.Location theatreName) {
		this.theatreName = theatreName;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public ims.domain.lookups.LookupInstance getOperationType() {
		return operationType;
	}
	public void setOperationType(ims.domain.lookups.LookupInstance operationType) {
		this.operationType = operationType;
	}

	public ims.core.resource.people.domain.objects.Nurse getAccompanyingTheatreNurse() {
		return accompanyingTheatreNurse;
	}
	public void setAccompanyingTheatreNurse(ims.core.resource.people.domain.objects.Nurse accompanyingTheatreNurse) {
		this.accompanyingTheatreNurse = accompanyingTheatreNurse;
	}

	public Boolean isAccompanyingTheatreNurseLocumBool() {
		return accompanyingTheatreNurseLocumBool;
	}
	public void setAccompanyingTheatreNurseLocumBool(Boolean accompanyingTheatreNurseLocumBool) {
		this.accompanyingTheatreNurseLocumBool = accompanyingTheatreNurseLocumBool;
	}

	public String getAccompanyingTheatreNurseLocumNurse() {
		return accompanyingTheatreNurseLocumNurse;
	}
	public void setAccompanyingTheatreNurseLocumNurse(String accompanyingTheatreNurseLocumNurse) {
		if ( null != accompanyingTheatreNurseLocumNurse && accompanyingTheatreNurseLocumNurse.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for accompanyingTheatreNurseLocumNurse. Tried to set value: "+
				accompanyingTheatreNurseLocumNurse);
		}
		this.accompanyingTheatreNurseLocumNurse = accompanyingTheatreNurseLocumNurse;
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
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreName* :");
		if (theatreName != null)
		{
			auditStr.append(toShortClassName(theatreName));
				
		    auditStr.append(theatreName.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*operationType* :");
		if (operationType != null)
			auditStr.append(operationType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*accompanyingTheatreNurse* :");
		if (accompanyingTheatreNurse != null)
		{
			auditStr.append(toShortClassName(accompanyingTheatreNurse));
				
		    auditStr.append(accompanyingTheatreNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*accompanyingTheatreNurseLocumBool* :");
		auditStr.append(accompanyingTheatreNurseLocumBool);
	    auditStr.append("; ");
		auditStr.append("\r\n*accompanyingTheatreNurseLocumNurse* :");
		auditStr.append(accompanyingTheatreNurseLocumNurse);
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
		
		String keyClassName = "SurgicalAuditPreOpChecksTheatreNurse";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getTheatreName() != null)
		{
			sb.append("<theatreName>");
			sb.append(this.getTheatreName().toXMLString(domMap)); 	
			sb.append("</theatreName>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getOperationType() != null)
		{
			sb.append("<operationType>");
			sb.append(this.getOperationType().toXMLString()); 
			sb.append("</operationType>");		
		}
		if (this.getAccompanyingTheatreNurse() != null)
		{
			sb.append("<accompanyingTheatreNurse>");
			sb.append(this.getAccompanyingTheatreNurse().toXMLString(domMap)); 	
			sb.append("</accompanyingTheatreNurse>");		
		}
		if (this.isAccompanyingTheatreNurseLocumBool() != null)
		{
			sb.append("<accompanyingTheatreNurseLocumBool>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAccompanyingTheatreNurseLocumBool().toString()));
			sb.append("</accompanyingTheatreNurseLocumBool>");		
		}
		if (this.getAccompanyingTheatreNurseLocumNurse() != null)
		{
			sb.append("<accompanyingTheatreNurseLocumNurse>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAccompanyingTheatreNurseLocumNurse().toString()));
			sb.append("</accompanyingTheatreNurseLocumNurse>");		
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
			SurgicalAuditPreOpChecksTheatreNurse domainObject = getSurgicalAuditPreOpChecksTheatreNursefromXML(itemEl, factory, domMap);

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
			SurgicalAuditPreOpChecksTheatreNurse domainObject = getSurgicalAuditPreOpChecksTheatreNursefromXML(itemEl, factory, domMap);

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
		
	public static SurgicalAuditPreOpChecksTheatreNurse getSurgicalAuditPreOpChecksTheatreNursefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSurgicalAuditPreOpChecksTheatreNursefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SurgicalAuditPreOpChecksTheatreNurse getSurgicalAuditPreOpChecksTheatreNursefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SurgicalAuditPreOpChecksTheatreNurse.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SurgicalAuditPreOpChecksTheatreNurse.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SurgicalAuditPreOpChecksTheatreNurse class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SurgicalAuditPreOpChecksTheatreNurse)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SurgicalAuditPreOpChecksTheatreNurse.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SurgicalAuditPreOpChecksTheatreNurse ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SurgicalAuditPreOpChecksTheatreNurse)factory.getImportedDomainObject(SurgicalAuditPreOpChecksTheatreNurse.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SurgicalAuditPreOpChecksTheatreNurse();
		}
		String keyClassName = "SurgicalAuditPreOpChecksTheatreNurse";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SurgicalAuditPreOpChecksTheatreNurse)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SurgicalAuditPreOpChecksTheatreNurse obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("theatreName");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreName(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("operationType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOperationType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("accompanyingTheatreNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAccompanyingTheatreNurse(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("accompanyingTheatreNurseLocumBool");
		if(fldEl != null)
		{	
    		obj.setAccompanyingTheatreNurseLocumBool(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("accompanyingTheatreNurseLocumNurse");
		if(fldEl != null)
		{	
    		obj.setAccompanyingTheatreNurseLocumNurse(new String(fldEl.getTextTrim()));	
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
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String TheatreName = "theatreName";
		public static final String Comments = "comments";
		public static final String OperationType = "operationType";
		public static final String AccompanyingTheatreNurse = "accompanyingTheatreNurse";
		public static final String AccompanyingTheatreNurseLocumBool = "accompanyingTheatreNurseLocumBool";
		public static final String AccompanyingTheatreNurseLocumNurse = "accompanyingTheatreNurseLocumNurse";
	}
}

