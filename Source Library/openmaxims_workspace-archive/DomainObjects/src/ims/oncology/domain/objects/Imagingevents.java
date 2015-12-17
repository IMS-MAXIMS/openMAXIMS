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
 * @author Kevin O'Carroll
 * Generated.
 */


public class Imagingevents extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100001;
	private static final long serialVersionUID = 1074100001L;
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
	/** HospitalSiteOfImage */
	private ims.core.resource.place.domain.objects.LocSite hospitalSiteOfImage;
	/** ImagingEvent */
	private ims.core.clinical.domain.objects.CancerImagingEvent imagingEvent;
	/** ImageDate */
	private java.util.Date imageDate;
	/** AnatomicalSite */
	private ims.domain.lookups.LookupInstance anatomicalSite;
	/** ReportDate */
	private java.util.Date reportDate;
	/** Requested Date */
	private java.util.Date requestedDate;
	/** LesionSize */
	private Integer lesionSize;
	/** ImagingEventDescription */
	private String imagingEventDescription;
	/** InvestigationResult */
	private ims.domain.lookups.LookupInstance investigationResult;
	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Imagingevents (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Imagingevents ()
    {
    	super();
    }
    public Imagingevents (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.Imagingevents.class;
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

	public ims.core.resource.place.domain.objects.LocSite getHospitalSiteOfImage() {
		return hospitalSiteOfImage;
	}
	public void setHospitalSiteOfImage(ims.core.resource.place.domain.objects.LocSite hospitalSiteOfImage) {
		this.hospitalSiteOfImage = hospitalSiteOfImage;
	}

	public ims.core.clinical.domain.objects.CancerImagingEvent getImagingEvent() {
		return imagingEvent;
	}
	public void setImagingEvent(ims.core.clinical.domain.objects.CancerImagingEvent imagingEvent) {
		this.imagingEvent = imagingEvent;
	}

	public java.util.Date getImageDate() {
		return imageDate;
	}
	public void setImageDate(java.util.Date imageDate) {
		this.imageDate = imageDate;
	}

	public ims.domain.lookups.LookupInstance getAnatomicalSite() {
		return anatomicalSite;
	}
	public void setAnatomicalSite(ims.domain.lookups.LookupInstance anatomicalSite) {
		this.anatomicalSite = anatomicalSite;
	}

	public java.util.Date getReportDate() {
		return reportDate;
	}
	public void setReportDate(java.util.Date reportDate) {
		this.reportDate = reportDate;
	}

	public java.util.Date getRequestedDate() {
		return requestedDate;
	}
	public void setRequestedDate(java.util.Date requestedDate) {
		this.requestedDate = requestedDate;
	}

	public Integer getLesionSize() {
		return lesionSize;
	}
	public void setLesionSize(Integer lesionSize) {
		this.lesionSize = lesionSize;
	}

	public String getImagingEventDescription() {
		return imagingEventDescription;
	}
	public void setImagingEventDescription(String imagingEventDescription) {
		if ( null != imagingEventDescription && imagingEventDescription.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for imagingEventDescription. Tried to set value: "+
				imagingEventDescription);
		}
		this.imagingEventDescription = imagingEventDescription;
	}

	public ims.domain.lookups.LookupInstance getInvestigationResult() {
		return investigationResult;
	}
	public void setInvestigationResult(ims.domain.lookups.LookupInstance investigationResult) {
		this.investigationResult = investigationResult;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
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
		auditStr.append("\r\n*hospitalSiteOfImage* :");
		if (hospitalSiteOfImage != null)
		{
			auditStr.append(toShortClassName(hospitalSiteOfImage));
				
		    auditStr.append(hospitalSiteOfImage.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*imagingEvent* :");
		if (imagingEvent != null)
		{
			auditStr.append(toShortClassName(imagingEvent));
				
		    auditStr.append(imagingEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*imageDate* :");
		auditStr.append(imageDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*anatomicalSite* :");
		if (anatomicalSite != null)
			auditStr.append(anatomicalSite.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reportDate* :");
		auditStr.append(reportDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*requestedDate* :");
		auditStr.append(requestedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*lesionSize* :");
		auditStr.append(lesionSize);
	    auditStr.append("; ");
		auditStr.append("\r\n*imagingEventDescription* :");
		auditStr.append(imagingEventDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*investigationResult* :");
		if (investigationResult != null)
			auditStr.append(investigationResult.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
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
		
		String keyClassName = "Imagingevents";
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
		if (this.getHospitalSiteOfImage() != null)
		{
			sb.append("<hospitalSiteOfImage>");
			sb.append(this.getHospitalSiteOfImage().toXMLString(domMap)); 	
			sb.append("</hospitalSiteOfImage>");		
		}
		if (this.getImagingEvent() != null)
		{
			sb.append("<imagingEvent>");
			sb.append(this.getImagingEvent().toXMLString(domMap)); 	
			sb.append("</imagingEvent>");		
		}
		if (this.getImageDate() != null)
		{
			sb.append("<imageDate>");
			sb.append(new ims.framework.utils.DateTime(this.getImageDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</imageDate>");		
		}
		if (this.getAnatomicalSite() != null)
		{
			sb.append("<anatomicalSite>");
			sb.append(this.getAnatomicalSite().toXMLString()); 
			sb.append("</anatomicalSite>");		
		}
		if (this.getReportDate() != null)
		{
			sb.append("<reportDate>");
			sb.append(new ims.framework.utils.DateTime(this.getReportDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</reportDate>");		
		}
		if (this.getRequestedDate() != null)
		{
			sb.append("<requestedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRequestedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</requestedDate>");		
		}
		if (this.getLesionSize() != null)
		{
			sb.append("<lesionSize>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLesionSize().toString()));
			sb.append("</lesionSize>");		
		}
		if (this.getImagingEventDescription() != null)
		{
			sb.append("<imagingEventDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getImagingEventDescription().toString()));
			sb.append("</imagingEventDescription>");		
		}
		if (this.getInvestigationResult() != null)
		{
			sb.append("<investigationResult>");
			sb.append(this.getInvestigationResult().toXMLString()); 
			sb.append("</investigationResult>");		
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
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
			Imagingevents domainObject = getImagingeventsfromXML(itemEl, factory, domMap);

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
			Imagingevents domainObject = getImagingeventsfromXML(itemEl, factory, domMap);

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
		
	public static Imagingevents getImagingeventsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getImagingeventsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Imagingevents getImagingeventsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Imagingevents.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Imagingevents.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Imagingevents class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Imagingevents)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Imagingevents.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Imagingevents ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Imagingevents)factory.getImportedDomainObject(Imagingevents.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Imagingevents();
		}
		String keyClassName = "Imagingevents";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Imagingevents)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Imagingevents obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("hospitalSiteOfImage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHospitalSiteOfImage(ims.core.resource.place.domain.objects.LocSite.getLocSitefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("imagingEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setImagingEvent(ims.core.clinical.domain.objects.CancerImagingEvent.getCancerImagingEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("imageDate");
		if(fldEl != null)
		{	
    		obj.setImageDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("anatomicalSite");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnatomicalSite(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reportDate");
		if(fldEl != null)
		{	
    		obj.setReportDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("requestedDate");
		if(fldEl != null)
		{	
    		obj.setRequestedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("lesionSize");
		if(fldEl != null)
		{	
    		obj.setLesionSize(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("imagingEventDescription");
		if(fldEl != null)
		{	
    		obj.setImagingEventDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("investigationResult");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInvestigationResult(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
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
		public static final String HospitalSiteOfImage = "hospitalSiteOfImage";
		public static final String ImagingEvent = "imagingEvent";
		public static final String ImageDate = "imageDate";
		public static final String AnatomicalSite = "anatomicalSite";
		public static final String ReportDate = "reportDate";
		public static final String RequestedDate = "requestedDate";
		public static final String LesionSize = "lesionSize";
		public static final String ImagingEventDescription = "imagingEventDescription";
		public static final String InvestigationResult = "investigationResult";
		public static final String EpisodeOfCare = "episodeOfCare";
	}
}

