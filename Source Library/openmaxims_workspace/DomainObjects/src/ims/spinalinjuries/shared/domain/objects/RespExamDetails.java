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
package ims.spinalinjuries.shared.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class RespExamDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1024100006;
	private static final long serialVersionUID = 1024100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** General/Sputum Observations
	  * Collection of ims.spinalinjuries.shared.domain.objects.RespObserv.
	  */
	private java.util.Set observations;
	/** Auscultation Findings
	  * Collection of ims.spinalinjuries.shared.domain.objects.RespAuscultation.
	  */
	private java.util.Set auscultation;
	/** Air Entry Through Out Check */
	private Boolean airEntry;
	/** Lung Fields Air Entry
	  * Collection of ims.spinalinjuries.shared.domain.objects.RespLungFields.
	  */
	private java.util.Set lungFields;
	/** Additional Factors */
	private String additionalFactors;
	/** Analysis of Assessment */
	private String analysisofAsses;
	/** Assessment Notes */
	private String assNotes;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public RespExamDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RespExamDetails ()
    {
    	super();
    }
    public RespExamDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.spinalinjuries.shared.domain.objects.RespExamDetails.class;
	}


	public java.util.Set getObservations() {
		if ( null == observations ) {
			observations = new java.util.HashSet();
		}
		return observations;
	}
	public void setObservations(java.util.Set paramValue) {
		this.observations = paramValue;
	}

	public java.util.Set getAuscultation() {
		if ( null == auscultation ) {
			auscultation = new java.util.HashSet();
		}
		return auscultation;
	}
	public void setAuscultation(java.util.Set paramValue) {
		this.auscultation = paramValue;
	}

	public Boolean isAirEntry() {
		return airEntry;
	}
	public void setAirEntry(Boolean airEntry) {
		this.airEntry = airEntry;
	}

	public java.util.Set getLungFields() {
		if ( null == lungFields ) {
			lungFields = new java.util.HashSet();
		}
		return lungFields;
	}
	public void setLungFields(java.util.Set paramValue) {
		this.lungFields = paramValue;
	}

	public String getAdditionalFactors() {
		return additionalFactors;
	}
	public void setAdditionalFactors(String additionalFactors) {
		if ( null != additionalFactors && additionalFactors.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for additionalFactors. Tried to set value: "+
				additionalFactors);
		}
		this.additionalFactors = additionalFactors;
	}

	public String getAnalysisofAsses() {
		return analysisofAsses;
	}
	public void setAnalysisofAsses(String analysisofAsses) {
		if ( null != analysisofAsses && analysisofAsses.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for analysisofAsses. Tried to set value: "+
				analysisofAsses);
		}
		this.analysisofAsses = analysisofAsses;
	}

	public String getAssNotes() {
		return assNotes;
	}
	public void setAssNotes(String assNotes) {
		if ( null != assNotes && assNotes.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for assNotes. Tried to set value: "+
				assNotes);
		}
		this.assNotes = assNotes;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
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
		
		auditStr.append("\r\n*observations* :");
		if (observations != null)
		{
			java.util.Iterator it1 = observations.iterator();
			int i1=0;
			while (it1.hasNext())
			{
				if (i1 > 0)
					auditStr.append(",");
				ims.spinalinjuries.shared.domain.objects.RespObserv obj = (ims.spinalinjuries.shared.domain.objects.RespObserv)it1.next();
		if (obj != null)
		{
		   if (i1 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i1++;
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*auscultation* :");
		if (auscultation != null)
		{
			java.util.Iterator it2 = auscultation.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.spinalinjuries.shared.domain.objects.RespAuscultation obj = (ims.spinalinjuries.shared.domain.objects.RespAuscultation)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*airEntry* :");
		auditStr.append(airEntry);
	    auditStr.append("; ");
		auditStr.append("\r\n*lungFields* :");
		if (lungFields != null)
		{
			java.util.Iterator it4 = lungFields.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.spinalinjuries.shared.domain.objects.RespLungFields obj = (ims.spinalinjuries.shared.domain.objects.RespLungFields)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*additionalFactors* :");
		auditStr.append(additionalFactors);
	    auditStr.append("; ");
		auditStr.append("\r\n*analysisofAsses* :");
		auditStr.append(analysisofAsses);
	    auditStr.append("; ");
		auditStr.append("\r\n*assNotes* :");
		auditStr.append(assNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
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
		
		String keyClassName = "RespExamDetails";
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
		if (this.getObservations() != null)
		{
			if (this.getObservations().size() > 0 )
			{
			sb.append("<observations>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getObservations(), domMap));
			sb.append("</observations>");		
			}
		}
		if (this.getAuscultation() != null)
		{
			if (this.getAuscultation().size() > 0 )
			{
			sb.append("<auscultation>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAuscultation(), domMap));
			sb.append("</auscultation>");		
			}
		}
		if (this.isAirEntry() != null)
		{
			sb.append("<airEntry>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAirEntry().toString()));
			sb.append("</airEntry>");		
		}
		if (this.getLungFields() != null)
		{
			if (this.getLungFields().size() > 0 )
			{
			sb.append("<lungFields>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLungFields(), domMap));
			sb.append("</lungFields>");		
			}
		}
		if (this.getAdditionalFactors() != null)
		{
			sb.append("<additionalFactors>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdditionalFactors().toString()));
			sb.append("</additionalFactors>");		
		}
		if (this.getAnalysisofAsses() != null)
		{
			sb.append("<analysisofAsses>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnalysisofAsses().toString()));
			sb.append("</analysisofAsses>");		
		}
		if (this.getAssNotes() != null)
		{
			sb.append("<assNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAssNotes().toString()));
			sb.append("</assNotes>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
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
			RespExamDetails domainObject = getRespExamDetailsfromXML(itemEl, factory, domMap);

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
			RespExamDetails domainObject = getRespExamDetailsfromXML(itemEl, factory, domMap);

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
		
	public static RespExamDetails getRespExamDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRespExamDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RespExamDetails getRespExamDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RespExamDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RespExamDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RespExamDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RespExamDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RespExamDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RespExamDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RespExamDetails)factory.getImportedDomainObject(RespExamDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RespExamDetails();
		}
		String keyClassName = "RespExamDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RespExamDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RespExamDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("observations");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setObservations(ims.spinalinjuries.shared.domain.objects.RespObserv.fromSetXMLString(fldEl, factory, obj.getObservations(), domMap));
		}
		fldEl = el.element("auscultation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAuscultation(ims.spinalinjuries.shared.domain.objects.RespAuscultation.fromSetXMLString(fldEl, factory, obj.getAuscultation(), domMap));
		}
		fldEl = el.element("airEntry");
		if(fldEl != null)
		{	
    		obj.setAirEntry(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lungFields");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setLungFields(ims.spinalinjuries.shared.domain.objects.RespLungFields.fromSetXMLString(fldEl, factory, obj.getLungFields(), domMap));
		}
		fldEl = el.element("additionalFactors");
		if(fldEl != null)
		{	
    		obj.setAdditionalFactors(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("analysisofAsses");
		if(fldEl != null)
		{	
    		obj.setAnalysisofAsses(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assNotes");
		if(fldEl != null)
		{	
    		obj.setAssNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "observations"
		, "auscultation"
		, "lungFields"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Observations = "observations";
		public static final String Auscultation = "auscultation";
		public static final String AirEntry = "airEntry";
		public static final String LungFields = "lungFields";
		public static final String AdditionalFactors = "additionalFactors";
		public static final String AnalysisofAsses = "analysisofAsses";
		public static final String AssNotes = "assNotes";
		public static final String ClinicalContact = "clinicalContact";
	}
}

