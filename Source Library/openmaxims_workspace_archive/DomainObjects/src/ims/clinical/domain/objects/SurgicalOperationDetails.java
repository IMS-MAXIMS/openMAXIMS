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
 * @author Joan Heelan
 * Generated.
 */


public class SurgicalOperationDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100085;
	private static final long serialVersionUID = 1072100085L;
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
	/** Surgical Operation Note  */
	private ims.clinical.domain.objects.SurgicalOperationNotes surgicalOpNote;
	/** Incision  */
	private String incision;
	/** Findings                         */
	private String findings;
	/** Procedure */
	private String procedure;
	/** Closure                          */
	private String closure;
	/** Prosthesis */
	private String prosthesis;
	/** Drain */
	private String drain;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SurgicalOperationDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SurgicalOperationDetails ()
    {
    	super();
    }
    public SurgicalOperationDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.SurgicalOperationDetails.class;
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

	public ims.clinical.domain.objects.SurgicalOperationNotes getSurgicalOpNote() {
		return surgicalOpNote;
	}
	public void setSurgicalOpNote(ims.clinical.domain.objects.SurgicalOperationNotes surgicalOpNote) {
		this.surgicalOpNote = surgicalOpNote;
	}

	public String getIncision() {
		return incision;
	}
	public void setIncision(String incision) {
		this.incision = incision;
	}

	public String getFindings() {
		return findings;
	}
	public void setFindings(String findings) {
		this.findings = findings;
	}

	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public String getClosure() {
		return closure;
	}
	public void setClosure(String closure) {
		this.closure = closure;
	}

	public String getProsthesis() {
		return prosthesis;
	}
	public void setProsthesis(String prosthesis) {
		this.prosthesis = prosthesis;
	}

	public String getDrain() {
		return drain;
	}
	public void setDrain(String drain) {
		this.drain = drain;
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
		auditStr.append("\r\n*surgicalOpNote* :");
		if (surgicalOpNote != null)
		{
			auditStr.append(toShortClassName(surgicalOpNote));
				
		    auditStr.append(surgicalOpNote.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*incision* :");
		auditStr.append(incision);
	    auditStr.append("; ");
		auditStr.append("\r\n*findings* :");
		auditStr.append(findings);
	    auditStr.append("; ");
		auditStr.append("\r\n*procedure* :");
		auditStr.append(procedure);
	    auditStr.append("; ");
		auditStr.append("\r\n*closure* :");
		auditStr.append(closure);
	    auditStr.append("; ");
		auditStr.append("\r\n*prosthesis* :");
		auditStr.append(prosthesis);
	    auditStr.append("; ");
		auditStr.append("\r\n*drain* :");
		auditStr.append(drain);
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
		
		String keyClassName = "SurgicalOperationDetails";
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
		if (this.getSurgicalOpNote() != null)
		{
			sb.append("<surgicalOpNote>");
			sb.append(this.getSurgicalOpNote().toXMLString(domMap)); 	
			sb.append("</surgicalOpNote>");		
		}
		if (this.getIncision() != null)
		{
			sb.append("<incision>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIncision().toString()));
			sb.append("</incision>");		
		}
		if (this.getFindings() != null)
		{
			sb.append("<findings>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFindings().toString()));
			sb.append("</findings>");		
		}
		if (this.getProcedure() != null)
		{
			sb.append("<procedure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcedure().toString()));
			sb.append("</procedure>");		
		}
		if (this.getClosure() != null)
		{
			sb.append("<closure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClosure().toString()));
			sb.append("</closure>");		
		}
		if (this.getProsthesis() != null)
		{
			sb.append("<prosthesis>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProsthesis().toString()));
			sb.append("</prosthesis>");		
		}
		if (this.getDrain() != null)
		{
			sb.append("<drain>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDrain().toString()));
			sb.append("</drain>");		
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
			SurgicalOperationDetails domainObject = getSurgicalOperationDetailsfromXML(itemEl, factory, domMap);

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
			SurgicalOperationDetails domainObject = getSurgicalOperationDetailsfromXML(itemEl, factory, domMap);

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
		
	public static SurgicalOperationDetails getSurgicalOperationDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSurgicalOperationDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SurgicalOperationDetails getSurgicalOperationDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SurgicalOperationDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SurgicalOperationDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SurgicalOperationDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SurgicalOperationDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SurgicalOperationDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SurgicalOperationDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SurgicalOperationDetails)factory.getImportedDomainObject(SurgicalOperationDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SurgicalOperationDetails();
		}
		String keyClassName = "SurgicalOperationDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SurgicalOperationDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SurgicalOperationDetails obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("surgicalOpNote");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSurgicalOpNote(ims.clinical.domain.objects.SurgicalOperationNotes.getSurgicalOperationNotesfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("incision");
		if(fldEl != null)
		{	
    		obj.setIncision(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("findings");
		if(fldEl != null)
		{	
    		obj.setFindings(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procedure");
		if(fldEl != null)
		{	
    		obj.setProcedure(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("closure");
		if(fldEl != null)
		{	
    		obj.setClosure(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("prosthesis");
		if(fldEl != null)
		{	
    		obj.setProsthesis(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("drain");
		if(fldEl != null)
		{	
    		obj.setDrain(new String(fldEl.getTextTrim()));	
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
		public static final String SurgicalOpNote = "surgicalOpNote";
		public static final String Incision = "incision";
		public static final String Findings = "findings";
		public static final String Procedure = "procedure";
		public static final String Closure = "closure";
		public static final String Prosthesis = "prosthesis";
		public static final String Drain = "drain";
	}
}

