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
package ims.dto_move.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class SiteAssess extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1105100044;
	private static final long serialVersionUID = 1105100044L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient Identifier - dto value */
	private Integer pkey;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Link to BO or Int? */
	private ims.core.admin.domain.objects.EpisodeOfCare episode;
	/** Assessment Name */
	private String assessName;
	/** Assessment Specialty */
	private String assessSpecialty;
	/** Creation Date */
	private java.util.Date creationDate;
	/** Creation Time */
	private String creationTime;
	/** Assessment Data Items
	  * Collection of ims.dto_move.domain.objects.SiteAssessItems.
	  */
	private java.util.List assessDataItems;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SiteAssess (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SiteAssess ()
    {
    	super();
    }
    public SiteAssess (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.SiteAssess.class;
	}


	public Integer getPkey() {
		return pkey;
	}
	public void setPkey(Integer pkey) {
		this.pkey = pkey;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisode() {
		return episode;
	}
	public void setEpisode(ims.core.admin.domain.objects.EpisodeOfCare episode) {
		this.episode = episode;
	}

	public String getAssessName() {
		return assessName;
	}
	public void setAssessName(String assessName) {
		if ( null != assessName && assessName.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for assessName. Tried to set value: "+
				assessName);
		}
		this.assessName = assessName;
	}

	public String getAssessSpecialty() {
		return assessSpecialty;
	}
	public void setAssessSpecialty(String assessSpecialty) {
		if ( null != assessSpecialty && assessSpecialty.length() > 70 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for assessSpecialty. Tried to set value: "+
				assessSpecialty);
		}
		this.assessSpecialty = assessSpecialty;
	}

	public java.util.Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public java.util.List getAssessDataItems() {
		if ( null == assessDataItems ) {
			assessDataItems = new java.util.ArrayList();
		}
		return assessDataItems;
	}
	public void setAssessDataItems(java.util.List paramValue) {
		this.assessDataItems = paramValue;
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
		
		auditStr.append("\r\n*pkey* :");
		auditStr.append(pkey);
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episode* :");
		if (episode != null)
		{
			auditStr.append(toShortClassName(episode));
				
		    auditStr.append(episode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessName* :");
		auditStr.append(assessName);
	    auditStr.append("; ");
		auditStr.append("\r\n*assessSpecialty* :");
		auditStr.append(assessSpecialty);
	    auditStr.append("; ");
		auditStr.append("\r\n*creationDate* :");
		auditStr.append(creationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*creationTime* :");
		auditStr.append(creationTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*assessDataItems* :");
		if (assessDataItems != null)
		{
		int i8=0;
		for (i8=0; i8<assessDataItems.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.SiteAssessItems obj = (ims.dto_move.domain.objects.SiteAssessItems)assessDataItems.get(i8);
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
		
		String keyClassName = "SiteAssess";
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
		if (this.getPkey() != null)
		{
			sb.append("<pkey>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPkey().toString()));
			sb.append("</pkey>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getEpisode() != null)
		{
			sb.append("<episode>");
			sb.append(this.getEpisode().toXMLString(domMap)); 	
			sb.append("</episode>");		
		}
		if (this.getAssessName() != null)
		{
			sb.append("<assessName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAssessName().toString()));
			sb.append("</assessName>");		
		}
		if (this.getAssessSpecialty() != null)
		{
			sb.append("<assessSpecialty>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAssessSpecialty().toString()));
			sb.append("</assessSpecialty>");		
		}
		if (this.getCreationDate() != null)
		{
			sb.append("<creationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCreationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</creationDate>");		
		}
		if (this.getCreationTime() != null)
		{
			sb.append("<creationTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCreationTime().toString()));
			sb.append("</creationTime>");		
		}
		if (this.getAssessDataItems() != null)
		{
			if (this.getAssessDataItems().size() > 0 )
			{
			sb.append("<assessDataItems>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssessDataItems(), domMap));
			sb.append("</assessDataItems>");		
			}
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
			SiteAssess domainObject = getSiteAssessfromXML(itemEl, factory, domMap);

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
			SiteAssess domainObject = getSiteAssessfromXML(itemEl, factory, domMap);

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
		
	public static SiteAssess getSiteAssessfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSiteAssessfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SiteAssess getSiteAssessfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SiteAssess.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SiteAssess.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SiteAssess class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SiteAssess)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SiteAssess.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SiteAssess ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SiteAssess)factory.getImportedDomainObject(SiteAssess.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SiteAssess();
		}
		String keyClassName = "SiteAssess";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SiteAssess)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SiteAssess obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("pkey");
		if(fldEl != null)
		{	
    		obj.setPkey(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisode(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assessName");
		if(fldEl != null)
		{	
    		obj.setAssessName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assessSpecialty");
		if(fldEl != null)
		{	
    		obj.setAssessSpecialty(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("creationDate");
		if(fldEl != null)
		{	
    		obj.setCreationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("creationTime");
		if(fldEl != null)
		{	
    		obj.setCreationTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assessDataItems");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAssessDataItems(ims.dto_move.domain.objects.SiteAssessItems.fromListXMLString(fldEl, factory, obj.getAssessDataItems(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "assessDataItems"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Pkey = "pkey";
		public static final String Patient = "patient";
		public static final String Episode = "episode";
		public static final String AssessName = "assessName";
		public static final String AssessSpecialty = "assessSpecialty";
		public static final String CreationDate = "creationDate";
		public static final String CreationTime = "creationTime";
		public static final String AssessDataItems = "assessDataItems";
	}
}

