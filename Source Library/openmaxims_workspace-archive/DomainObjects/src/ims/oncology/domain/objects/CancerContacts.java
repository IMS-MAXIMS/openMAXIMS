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
package ims.oncology.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class CancerContacts extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100038;
	private static final long serialVersionUID = 1074100038L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** ContactHCP */
	private ims.core.resource.people.domain.objects.Hcp contactHCP;
	/** HCPDiscipline */
	private ims.domain.lookups.LookupInstance hCPDiscipline;
	/** ContactDateTime */
	private java.util.Date contactDateTime;
	/** UnitsRequired */
	private java.lang.Float unitsRequired;
	/** UnitsGiven */
	private java.lang.Float unitsGiven;
	/** Comment */
	private String comment;
	/** ContactTypes
	  * Collection of ims.oncology.domain.objects.ContactTypesByDisciplineItem.
	  */
	private java.util.List contactTypes;
	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	private ims.core.clinical.domain.objects.AuthoringInformation recordingInfo;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CancerContacts (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CancerContacts ()
    {
    	super();
    }
    public CancerContacts (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.CancerContacts.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.resource.people.domain.objects.Hcp getContactHCP() {
		return contactHCP;
	}
	public void setContactHCP(ims.core.resource.people.domain.objects.Hcp contactHCP) {
		this.contactHCP = contactHCP;
	}

	public ims.domain.lookups.LookupInstance getHCPDiscipline() {
		return hCPDiscipline;
	}
	public void setHCPDiscipline(ims.domain.lookups.LookupInstance hCPDiscipline) {
		this.hCPDiscipline = hCPDiscipline;
	}

	public java.util.Date getContactDateTime() {
		return contactDateTime;
	}
	public void setContactDateTime(java.util.Date contactDateTime) {
		this.contactDateTime = contactDateTime;
	}

	public java.lang.Float getUnitsRequired() {
		return unitsRequired;
	}
	public void setUnitsRequired(java.lang.Float unitsRequired) {
		this.unitsRequired = unitsRequired;
	}

	public java.lang.Float getUnitsGiven() {
		return unitsGiven;
	}
	public void setUnitsGiven(java.lang.Float unitsGiven) {
		this.unitsGiven = unitsGiven;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
	}

	public java.util.List getContactTypes() {
		if ( null == contactTypes ) {
			contactTypes = new java.util.ArrayList();
		}
		return contactTypes;
	}
	public void setContactTypes(java.util.List paramValue) {
		this.contactTypes = paramValue;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getRecordingInfo() {
		return recordingInfo;
	}
	public void setRecordingInfo(ims.core.clinical.domain.objects.AuthoringInformation recordingInfo) {
		this.recordingInfo = recordingInfo;
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
		auditStr.append("\r\n*contactHCP* :");
		if (contactHCP != null)
		{
			auditStr.append(toShortClassName(contactHCP));
				
		    auditStr.append(contactHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hCPDiscipline* :");
		if (hCPDiscipline != null)
			auditStr.append(hCPDiscipline.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*contactDateTime* :");
		auditStr.append(contactDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*unitsRequired* :");
		auditStr.append(unitsRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*unitsGiven* :");
		auditStr.append(unitsGiven);
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*contactTypes* :");
		if (contactTypes != null)
		{
		int i8=0;
		for (i8=0; i8<contactTypes.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.oncology.domain.objects.ContactTypesByDisciplineItem obj = (ims.oncology.domain.objects.ContactTypesByDisciplineItem)contactTypes.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInfo* :");
		if (recordingInfo != null)
		{
			auditStr.append(toShortClassName(recordingInfo));
				
		    auditStr.append(recordingInfo.toString());
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
		
		String keyClassName = "CancerContacts";
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
		if (this.getContactHCP() != null)
		{
			sb.append("<contactHCP>");
			sb.append(this.getContactHCP().toXMLString(domMap)); 	
			sb.append("</contactHCP>");		
		}
		if (this.getHCPDiscipline() != null)
		{
			sb.append("<hCPDiscipline>");
			sb.append(this.getHCPDiscipline().toXMLString()); 
			sb.append("</hCPDiscipline>");		
		}
		if (this.getContactDateTime() != null)
		{
			sb.append("<contactDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getContactDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</contactDateTime>");		
		}
		if (this.getUnitsRequired() != null)
		{
			sb.append("<unitsRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUnitsRequired().toString()));
			sb.append("</unitsRequired>");		
		}
		if (this.getUnitsGiven() != null)
		{
			sb.append("<unitsGiven>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUnitsGiven().toString()));
			sb.append("</unitsGiven>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.getContactTypes() != null)
		{
			if (this.getContactTypes().size() > 0 )
			{
			sb.append("<contactTypes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getContactTypes(), domMap));
			sb.append("</contactTypes>");		
			}
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getRecordingInfo() != null)
		{
			sb.append("<recordingInfo>");
			sb.append(this.getRecordingInfo().toXMLString(domMap)); 	
			sb.append("</recordingInfo>");		
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
			CancerContacts domainObject = getCancerContactsfromXML(itemEl, factory, domMap);

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
			CancerContacts domainObject = getCancerContactsfromXML(itemEl, factory, domMap);

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
		
	public static CancerContacts getCancerContactsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCancerContactsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CancerContacts getCancerContactsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CancerContacts.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CancerContacts.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CancerContacts class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CancerContacts)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CancerContacts.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CancerContacts ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CancerContacts)factory.getImportedDomainObject(CancerContacts.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CancerContacts();
		}
		String keyClassName = "CancerContacts";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CancerContacts)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CancerContacts obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("contactHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setContactHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hCPDiscipline");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHCPDiscipline(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("contactDateTime");
		if(fldEl != null)
		{	
    		obj.setContactDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("unitsRequired");
		if(fldEl != null)
		{	
    		obj.setUnitsRequired(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("unitsGiven");
		if(fldEl != null)
		{	
    		obj.setUnitsGiven(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contactTypes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setContactTypes(ims.oncology.domain.objects.ContactTypesByDisciplineItem.fromListXMLString(fldEl, factory, obj.getContactTypes(), domMap));
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInfo(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "contactTypes"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String ContactHCP = "contactHCP";
		public static final String HCPDiscipline = "hCPDiscipline";
		public static final String ContactDateTime = "contactDateTime";
		public static final String UnitsRequired = "unitsRequired";
		public static final String UnitsGiven = "unitsGiven";
		public static final String Comment = "comment";
		public static final String ContactTypes = "contactTypes";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String RecordingInfo = "recordingInfo";
	}
}

