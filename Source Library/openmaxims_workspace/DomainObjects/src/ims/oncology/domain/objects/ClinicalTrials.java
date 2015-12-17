//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.oncology.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ClinicalTrials extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100049;
	private static final long serialVersionUID = 1074100049L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInfo */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInfo;
	/** Clinical Trial */
	private ims.domain.lookups.LookupInstance clinicalTrial;
	/** Procedure */
	private ims.core.clinical.domain.objects.Procedure procedure;
	/** Start Date */
	private java.util.Date startDate;
	/** End Date */
	private java.util.Date endDate;
	/** ExternalProcedure */
	private ims.domain.lookups.LookupInstance externalProcedure;
	/** Was a Place Offered On Trial */
	private ims.domain.lookups.LookupInstance placeOfferedOnTrial;
	/** Patient accepted Trial Offer */
	private ims.domain.lookups.LookupInstance acceptedTrialOffer;
	/** Reason For Rejection */
	private String reasonForRejection;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClinicalTrials (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClinicalTrials ()
    {
    	super();
    }
    public ClinicalTrials (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.ClinicalTrials.class;
	}


	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInfo() {
		return authoringInfo;
	}
	public void setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation authoringInfo) {
		this.authoringInfo = authoringInfo;
	}

	public ims.domain.lookups.LookupInstance getClinicalTrial() {
		return clinicalTrial;
	}
	public void setClinicalTrial(ims.domain.lookups.LookupInstance clinicalTrial) {
		this.clinicalTrial = clinicalTrial;
	}

	public ims.core.clinical.domain.objects.Procedure getProcedure() {
		return procedure;
	}
	public void setProcedure(ims.core.clinical.domain.objects.Procedure procedure) {
		this.procedure = procedure;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public java.util.Date getEndDate() {
		return endDate;
	}
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	public ims.domain.lookups.LookupInstance getExternalProcedure() {
		return externalProcedure;
	}
	public void setExternalProcedure(ims.domain.lookups.LookupInstance externalProcedure) {
		this.externalProcedure = externalProcedure;
	}

	public ims.domain.lookups.LookupInstance getPlaceOfferedOnTrial() {
		return placeOfferedOnTrial;
	}
	public void setPlaceOfferedOnTrial(ims.domain.lookups.LookupInstance placeOfferedOnTrial) {
		this.placeOfferedOnTrial = placeOfferedOnTrial;
	}

	public ims.domain.lookups.LookupInstance getAcceptedTrialOffer() {
		return acceptedTrialOffer;
	}
	public void setAcceptedTrialOffer(ims.domain.lookups.LookupInstance acceptedTrialOffer) {
		this.acceptedTrialOffer = acceptedTrialOffer;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}
	public void setReasonForRejection(String reasonForRejection) {
		if ( null != reasonForRejection && reasonForRejection.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonForRejection. Tried to set value: "+
				reasonForRejection);
		}
		this.reasonForRejection = reasonForRejection;
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
		
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInfo* :");
		if (authoringInfo != null)
		{
			auditStr.append(toShortClassName(authoringInfo));
				
		    auditStr.append(authoringInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalTrial* :");
		if (clinicalTrial != null)
			auditStr.append(clinicalTrial.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*procedure* :");
		if (procedure != null)
		{
			auditStr.append(toShortClassName(procedure));
				
		    auditStr.append(procedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDate* :");
		auditStr.append(endDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*externalProcedure* :");
		if (externalProcedure != null)
			auditStr.append(externalProcedure.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*placeOfferedOnTrial* :");
		if (placeOfferedOnTrial != null)
			auditStr.append(placeOfferedOnTrial.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*acceptedTrialOffer* :");
		if (acceptedTrialOffer != null)
			auditStr.append(acceptedTrialOffer.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForRejection* :");
		auditStr.append(reasonForRejection);
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
		
		String keyClassName = "ClinicalTrials";
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
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringInfo() != null)
		{
			sb.append("<authoringInfo>");
			sb.append(this.getAuthoringInfo().toXMLString(domMap)); 	
			sb.append("</authoringInfo>");		
		}
		if (this.getClinicalTrial() != null)
		{
			sb.append("<clinicalTrial>");
			sb.append(this.getClinicalTrial().toXMLString()); 
			sb.append("</clinicalTrial>");		
		}
		if (this.getProcedure() != null)
		{
			sb.append("<procedure>");
			sb.append(this.getProcedure().toXMLString(domMap)); 	
			sb.append("</procedure>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getEndDate() != null)
		{
			sb.append("<endDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDate>");		
		}
		if (this.getExternalProcedure() != null)
		{
			sb.append("<externalProcedure>");
			sb.append(this.getExternalProcedure().toXMLString()); 
			sb.append("</externalProcedure>");		
		}
		if (this.getPlaceOfferedOnTrial() != null)
		{
			sb.append("<placeOfferedOnTrial>");
			sb.append(this.getPlaceOfferedOnTrial().toXMLString()); 
			sb.append("</placeOfferedOnTrial>");		
		}
		if (this.getAcceptedTrialOffer() != null)
		{
			sb.append("<acceptedTrialOffer>");
			sb.append(this.getAcceptedTrialOffer().toXMLString()); 
			sb.append("</acceptedTrialOffer>");		
		}
		if (this.getReasonForRejection() != null)
		{
			sb.append("<reasonForRejection>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForRejection().toString()));
			sb.append("</reasonForRejection>");		
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
			ClinicalTrials domainObject = getClinicalTrialsfromXML(itemEl, factory, domMap);

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
			ClinicalTrials domainObject = getClinicalTrialsfromXML(itemEl, factory, domMap);

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
		
	public static ClinicalTrials getClinicalTrialsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClinicalTrialsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClinicalTrials getClinicalTrialsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClinicalTrials.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClinicalTrials.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClinicalTrials class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClinicalTrials)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClinicalTrials.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClinicalTrials ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClinicalTrials)factory.getImportedDomainObject(ClinicalTrials.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClinicalTrials();
		}
		String keyClassName = "ClinicalTrials";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClinicalTrials)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClinicalTrials obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalTrial");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setClinicalTrial(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("procedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedure(ims.core.clinical.domain.objects.Procedure.getProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDate");
		if(fldEl != null)
		{	
    		obj.setEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("externalProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setExternalProcedure(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("placeOfferedOnTrial");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPlaceOfferedOnTrial(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("acceptedTrialOffer");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAcceptedTrialOffer(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonForRejection");
		if(fldEl != null)
		{	
    		obj.setReasonForRejection(new String(fldEl.getTextTrim()));	
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
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String CareContext = "careContext";
		public static final String AuthoringInfo = "authoringInfo";
		public static final String ClinicalTrial = "clinicalTrial";
		public static final String Procedure = "procedure";
		public static final String StartDate = "startDate";
		public static final String EndDate = "endDate";
		public static final String ExternalProcedure = "externalProcedure";
		public static final String PlaceOfferedOnTrial = "placeOfferedOnTrial";
		public static final String AcceptedTrialOffer = "acceptedTrialOffer";
		public static final String ReasonForRejection = "reasonForRejection";
	}
}

