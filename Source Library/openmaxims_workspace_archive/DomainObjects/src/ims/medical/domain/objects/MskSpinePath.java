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
package ims.medical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class MskSpinePath extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1023100008;
	private static final long serialVersionUID = 1023100008L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Mode of Injury */
	private ims.domain.lookups.LookupInstance modeOfInjury;
	/** Cause of Injury */
	private ims.domain.lookups.LookupInstance typeOfInjury;
	/** Mechanism */
	private ims.domain.lookups.LookupInstance mechanismOfInjury;
	/** C1 - S5 */
	private ims.core.clinical.domain.objects.VertebralLevels pathSite;
	/** Flag to Indicate this lesion is Primary pathology */
	private Boolean isPrimaryPathology;
	/** Flag to indicate Pathology is Problem */
	private Boolean isProblem;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** isActive */
	private Boolean isActive;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Authoring HCP - editable */
	private ims.core.resource.people.domain.objects.Hcp authoringHCP;
	/** Authoring Date Time - editable  */
	private java.util.Date authoringDateTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public MskSpinePath (Integer id, int ver)
    {
    	super(id, ver);
    }
    public MskSpinePath ()
    {
    	super();
    }
    public MskSpinePath (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.medical.domain.objects.MskSpinePath.class;
	}


	public ims.domain.lookups.LookupInstance getModeOfInjury() {
		return modeOfInjury;
	}
	public void setModeOfInjury(ims.domain.lookups.LookupInstance modeOfInjury) {
		this.modeOfInjury = modeOfInjury;
	}

	public ims.domain.lookups.LookupInstance getTypeOfInjury() {
		return typeOfInjury;
	}
	public void setTypeOfInjury(ims.domain.lookups.LookupInstance typeOfInjury) {
		this.typeOfInjury = typeOfInjury;
	}

	public ims.domain.lookups.LookupInstance getMechanismOfInjury() {
		return mechanismOfInjury;
	}
	public void setMechanismOfInjury(ims.domain.lookups.LookupInstance mechanismOfInjury) {
		this.mechanismOfInjury = mechanismOfInjury;
	}

	public ims.core.clinical.domain.objects.VertebralLevels getPathSite() {
		return pathSite;
	}
	public void setPathSite(ims.core.clinical.domain.objects.VertebralLevels pathSite) {
		this.pathSite = pathSite;
	}

	public Boolean isIsPrimaryPathology() {
		return isPrimaryPathology;
	}
	public void setIsPrimaryPathology(Boolean isPrimaryPathology) {
		this.isPrimaryPathology = isPrimaryPathology;
	}

	public Boolean isIsProblem() {
		return isProblem;
	}
	public void setIsProblem(Boolean isProblem) {
		this.isProblem = isProblem;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringHCP() {
		return authoringHCP;
	}
	public void setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp authoringHCP) {
		this.authoringHCP = authoringHCP;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
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
		
		auditStr.append("\r\n*modeOfInjury* :");
		if (modeOfInjury != null)
			auditStr.append(modeOfInjury.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*typeOfInjury* :");
		if (typeOfInjury != null)
			auditStr.append(typeOfInjury.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mechanismOfInjury* :");
		if (mechanismOfInjury != null)
			auditStr.append(mechanismOfInjury.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pathSite* :");
		if (pathSite != null)
		{
			auditStr.append(toShortClassName(pathSite));
				
		    auditStr.append(pathSite.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isPrimaryPathology* :");
		auditStr.append(isPrimaryPathology);
	    auditStr.append("; ");
		auditStr.append("\r\n*isProblem* :");
		auditStr.append(isProblem);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringHCP* :");
		if (authoringHCP != null)
		{
			auditStr.append(toShortClassName(authoringHCP));
				
		    auditStr.append(authoringHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
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
		
		String keyClassName = "MskSpinePath";
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
		if (this.getModeOfInjury() != null)
		{
			sb.append("<modeOfInjury>");
			sb.append(this.getModeOfInjury().toXMLString()); 
			sb.append("</modeOfInjury>");		
		}
		if (this.getTypeOfInjury() != null)
		{
			sb.append("<typeOfInjury>");
			sb.append(this.getTypeOfInjury().toXMLString()); 
			sb.append("</typeOfInjury>");		
		}
		if (this.getMechanismOfInjury() != null)
		{
			sb.append("<mechanismOfInjury>");
			sb.append(this.getMechanismOfInjury().toXMLString()); 
			sb.append("</mechanismOfInjury>");		
		}
		if (this.getPathSite() != null)
		{
			sb.append("<pathSite>");
			sb.append(this.getPathSite().toXMLString(domMap)); 	
			sb.append("</pathSite>");		
		}
		if (this.isIsPrimaryPathology() != null)
		{
			sb.append("<isPrimaryPathology>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPrimaryPathology().toString()));
			sb.append("</isPrimaryPathology>");		
		}
		if (this.isIsProblem() != null)
		{
			sb.append("<isProblem>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsProblem().toString()));
			sb.append("</isProblem>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringHCP() != null)
		{
			sb.append("<authoringHCP>");
			sb.append(this.getAuthoringHCP().toXMLString(domMap)); 	
			sb.append("</authoringHCP>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
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
			MskSpinePath domainObject = getMskSpinePathfromXML(itemEl, factory, domMap);

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
			MskSpinePath domainObject = getMskSpinePathfromXML(itemEl, factory, domMap);

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
		
	public static MskSpinePath getMskSpinePathfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMskSpinePathfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MskSpinePath getMskSpinePathfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MskSpinePath.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MskSpinePath.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MskSpinePath class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MskSpinePath)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MskSpinePath.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MskSpinePath ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (MskSpinePath)factory.getImportedDomainObject(MskSpinePath.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new MskSpinePath();
		}
		String keyClassName = "MskSpinePath";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (MskSpinePath)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MskSpinePath obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("modeOfInjury");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setModeOfInjury(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("typeOfInjury");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTypeOfInjury(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mechanismOfInjury");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMechanismOfInjury(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pathSite");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathSite(ims.core.clinical.domain.objects.VertebralLevels.getVertebralLevelsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isPrimaryPathology");
		if(fldEl != null)
		{	
    		obj.setIsPrimaryPathology(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isProblem");
		if(fldEl != null)
		{	
    		obj.setIsProblem(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String ModeOfInjury = "modeOfInjury";
		public static final String TypeOfInjury = "typeOfInjury";
		public static final String MechanismOfInjury = "mechanismOfInjury";
		public static final String PathSite = "pathSite";
		public static final String IsPrimaryPathology = "isPrimaryPathology";
		public static final String IsProblem = "isProblem";
		public static final String ClinicalContact = "clinicalContact";
		public static final String IsActive = "isActive";
		public static final String CareContext = "careContext";
		public static final String AuthoringHCP = "authoringHCP";
		public static final String AuthoringDateTime = "authoringDateTime";
	}
}

