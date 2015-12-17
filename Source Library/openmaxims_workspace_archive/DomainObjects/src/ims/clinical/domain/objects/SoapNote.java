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
 * @author Kevin O'Carroll
 * Generated.
 */


public class SoapNote extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100036;
	private static final long serialVersionUID = 1072100036L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Subjective Note */
	private String subjectiveNote;
	/** Objective Note */
	private String objectiveNote;
	/** Analysis Note */
	private String analysisNote;
	/** Plan Note */
	private String planNote;
	/** ClinicalNote */
	private ims.core.clinical.domain.objects.ClinicalNotes clinicalNote;
	/** AreaofNeed
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List areaofNeed;
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SoapNote (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SoapNote ()
    {
    	super();
    }
    public SoapNote (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.SoapNote.class;
	}


	public String getSubjectiveNote() {
		return subjectiveNote;
	}
	public void setSubjectiveNote(String subjectiveNote) {
		this.subjectiveNote = subjectiveNote;
	}

	public String getObjectiveNote() {
		return objectiveNote;
	}
	public void setObjectiveNote(String objectiveNote) {
		this.objectiveNote = objectiveNote;
	}

	public String getAnalysisNote() {
		return analysisNote;
	}
	public void setAnalysisNote(String analysisNote) {
		this.analysisNote = analysisNote;
	}

	public String getPlanNote() {
		return planNote;
	}
	public void setPlanNote(String planNote) {
		this.planNote = planNote;
	}

	public ims.core.clinical.domain.objects.ClinicalNotes getClinicalNote() {
		return clinicalNote;
	}
	public void setClinicalNote(ims.core.clinical.domain.objects.ClinicalNotes clinicalNote) {
		this.clinicalNote = clinicalNote;
	}

	public java.util.List getAreaofNeed() {
		if ( null == areaofNeed ) {
			areaofNeed = new java.util.ArrayList();
		}
		return areaofNeed;
	}
	public void setAreaofNeed(java.util.List paramValue) {
		this.areaofNeed = paramValue;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
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
		
		auditStr.append("\r\n*subjectiveNote* :");
		auditStr.append(subjectiveNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*objectiveNote* :");
		auditStr.append(objectiveNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*analysisNote* :");
		auditStr.append(analysisNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*planNote* :");
		auditStr.append(planNote);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalNote* :");
		if (clinicalNote != null)
		{
			auditStr.append(toShortClassName(clinicalNote));
				
		    auditStr.append(clinicalNote.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*areaofNeed* :");
		if (areaofNeed != null)
		{
			java.util.Iterator it6 = areaofNeed.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it6.next();
			auditStr.append(obj.getText());
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
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
		
		String keyClassName = "SoapNote";
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
		if (this.getSubjectiveNote() != null)
		{
			sb.append("<subjectiveNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSubjectiveNote().toString()));
			sb.append("</subjectiveNote>");		
		}
		if (this.getObjectiveNote() != null)
		{
			sb.append("<objectiveNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getObjectiveNote().toString()));
			sb.append("</objectiveNote>");		
		}
		if (this.getAnalysisNote() != null)
		{
			sb.append("<analysisNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnalysisNote().toString()));
			sb.append("</analysisNote>");		
		}
		if (this.getPlanNote() != null)
		{
			sb.append("<planNote>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPlanNote().toString()));
			sb.append("</planNote>");		
		}
		if (this.getClinicalNote() != null)
		{
			sb.append("<clinicalNote>");
			sb.append(this.getClinicalNote().toXMLString(domMap)); 	
			sb.append("</clinicalNote>");		
		}
		if (this.getAreaofNeed() != null)
		{
			if (this.getAreaofNeed().size() > 0 )
			{
			sb.append("<areaofNeed>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getAreaofNeed())); 
			sb.append("</areaofNeed>");		
			}
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
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
			SoapNote domainObject = getSoapNotefromXML(itemEl, factory, domMap);

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
			SoapNote domainObject = getSoapNotefromXML(itemEl, factory, domMap);

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
		
	public static SoapNote getSoapNotefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSoapNotefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SoapNote getSoapNotefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SoapNote.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SoapNote.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SoapNote class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SoapNote)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SoapNote.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SoapNote ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SoapNote)factory.getImportedDomainObject(SoapNote.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SoapNote();
		}
		String keyClassName = "SoapNote";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SoapNote)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SoapNote obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("subjectiveNote");
		if(fldEl != null)
		{	
    		obj.setSubjectiveNote(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("objectiveNote");
		if(fldEl != null)
		{	
    		obj.setObjectiveNote(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("analysisNote");
		if(fldEl != null)
		{	
    		obj.setAnalysisNote(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("planNote");
		if(fldEl != null)
		{	
    		obj.setPlanNote(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalNote");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalNote(ims.core.clinical.domain.objects.ClinicalNotes.getClinicalNotesfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("areaofNeed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAreaofNeed(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getAreaofNeed())); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
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
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "areaofNeed"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String SubjectiveNote = "subjectiveNote";
		public static final String ObjectiveNote = "objectiveNote";
		public static final String AnalysisNote = "analysisNote";
		public static final String PlanNote = "planNote";
		public static final String ClinicalNote = "clinicalNote";
		public static final String AreaofNeed = "areaofNeed";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
	}
}

