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
package ims.nursing.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class ObservationForm extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1011100002;
	private static final long serialVersionUID = 1011100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** DateTimeStart */
	private java.util.Date dateTimeStart;
	/** HCPStart */
	private ims.core.resource.people.domain.objects.Hcp hCPStart;
	/** DateTimeStop */
	private java.util.Date dateTimeStop;
	/** HCPStop */
	private ims.core.resource.people.domain.objects.Hcp hCPStop;
	/** FormType */
	private ims.domain.lookups.LookupInstance formType;
	/** Details */
	private String details;
	/** isStopped */
	private Boolean isStopped;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
    public ObservationForm (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ObservationForm ()
    {
    	super();
    }
    public ObservationForm (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.domain.objects.ObservationForm.class;
	}


	public java.util.Date getDateTimeStart() {
		return dateTimeStart;
	}
	public void setDateTimeStart(java.util.Date dateTimeStart) {
		this.dateTimeStart = dateTimeStart;
	}

	public ims.core.resource.people.domain.objects.Hcp getHCPStart() {
		return hCPStart;
	}
	public void setHCPStart(ims.core.resource.people.domain.objects.Hcp hCPStart) {
		this.hCPStart = hCPStart;
	}

	public java.util.Date getDateTimeStop() {
		return dateTimeStop;
	}
	public void setDateTimeStop(java.util.Date dateTimeStop) {
		this.dateTimeStop = dateTimeStop;
	}

	public ims.core.resource.people.domain.objects.Hcp getHCPStop() {
		return hCPStop;
	}
	public void setHCPStop(ims.core.resource.people.domain.objects.Hcp hCPStop) {
		this.hCPStop = hCPStop;
	}

	public ims.domain.lookups.LookupInstance getFormType() {
		return formType;
	}
	public void setFormType(ims.domain.lookups.LookupInstance formType) {
		this.formType = formType;
	}

	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		if ( null != details && details.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for details. Tried to set value: "+
				details);
		}
		this.details = details;
	}

	public Boolean isIsStopped() {
		return isStopped;
	}
	public void setIsStopped(Boolean isStopped) {
		this.isStopped = isStopped;
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
		
		auditStr.append("\r\n*dateTimeStart* :");
		auditStr.append(dateTimeStart);
	    auditStr.append("; ");
		auditStr.append("\r\n*hCPStart* :");
		if (hCPStart != null)
		{
			auditStr.append(toShortClassName(hCPStart));
				
		    auditStr.append(hCPStart.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTimeStop* :");
		auditStr.append(dateTimeStop);
	    auditStr.append("; ");
		auditStr.append("\r\n*hCPStop* :");
		if (hCPStop != null)
		{
			auditStr.append(toShortClassName(hCPStop));
				
		    auditStr.append(hCPStop.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*formType* :");
		if (formType != null)
			auditStr.append(formType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*details* :");
		auditStr.append(details);
	    auditStr.append("; ");
		auditStr.append("\r\n*isStopped* :");
		auditStr.append(isStopped);
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
		
		String keyClassName = "ObservationForm";
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
		if (this.getDateTimeStart() != null)
		{
			sb.append("<dateTimeStart>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeStart()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeStart>");		
		}
		if (this.getHCPStart() != null)
		{
			sb.append("<hCPStart>");
			sb.append(this.getHCPStart().toXMLString(domMap)); 	
			sb.append("</hCPStart>");		
		}
		if (this.getDateTimeStop() != null)
		{
			sb.append("<dateTimeStop>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeStop()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeStop>");		
		}
		if (this.getHCPStop() != null)
		{
			sb.append("<hCPStop>");
			sb.append(this.getHCPStop().toXMLString(domMap)); 	
			sb.append("</hCPStop>");		
		}
		if (this.getFormType() != null)
		{
			sb.append("<formType>");
			sb.append(this.getFormType().toXMLString()); 
			sb.append("</formType>");		
		}
		if (this.getDetails() != null)
		{
			sb.append("<details>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDetails().toString()));
			sb.append("</details>");		
		}
		if (this.isIsStopped() != null)
		{
			sb.append("<isStopped>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsStopped().toString()));
			sb.append("</isStopped>");		
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
			ObservationForm domainObject = getObservationFormfromXML(itemEl, factory, domMap);

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
			ObservationForm domainObject = getObservationFormfromXML(itemEl, factory, domMap);

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
		
	public static ObservationForm getObservationFormfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getObservationFormfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ObservationForm getObservationFormfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ObservationForm.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ObservationForm.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ObservationForm class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ObservationForm)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ObservationForm.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ObservationForm ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ObservationForm)factory.getImportedDomainObject(ObservationForm.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ObservationForm();
		}
		String keyClassName = "ObservationForm";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ObservationForm)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ObservationForm obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dateTimeStart");
		if(fldEl != null)
		{	
    		obj.setDateTimeStart(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("hCPStart");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHCPStart(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateTimeStop");
		if(fldEl != null)
		{	
    		obj.setDateTimeStop(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("hCPStop");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHCPStop(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("formType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFormType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("details");
		if(fldEl != null)
		{	
    		obj.setDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isStopped");
		if(fldEl != null)
		{	
    		obj.setIsStopped(new Boolean(fldEl.getTextTrim()));	
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
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String DateTimeStart = "dateTimeStart";
		public static final String HCPStart = "hCPStart";
		public static final String DateTimeStop = "dateTimeStop";
		public static final String HCPStop = "hCPStop";
		public static final String FormType = "formType";
		public static final String Details = "details";
		public static final String IsStopped = "isStopped";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
	}
}

