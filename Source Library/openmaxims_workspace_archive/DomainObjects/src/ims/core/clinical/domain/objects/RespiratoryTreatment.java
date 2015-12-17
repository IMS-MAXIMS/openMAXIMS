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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class RespiratoryTreatment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100101;
	private static final long serialVersionUID = 1019100101L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact sOAPClinicalContact;
	/** Authoring Date Time */
	private java.util.Date authoringDateTime;
	/** Authoring Care Professional */
	private ims.core.resource.people.domain.objects.Hcp authoringCP;
	/** Postural Drainage */
	private ims.domain.lookups.LookupInstance posturalDrainage;
	/** Assisted Cough */
	private ims.domain.lookups.LookupInstance assistedCough;
	/** IPPB */
	private String iPPB;
	/** Contraindications Checked? */
	private ims.domain.lookups.LookupInstance contraindicationChecked;
	/** Assisted Cough */
	private String coughAssist;
	/** Treatments
	  * Collection of ims.core.clinical.domain.objects.RespiratoryTreatmentDetail.
	  */
	private java.util.Set treatments;
	/** Treatment Analysis */
	private String treatmentAnalysis;
	/** Refer to On Call Physio? */
	private ims.domain.lookups.LookupInstance referOnCallPhysio;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public RespiratoryTreatment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RespiratoryTreatment ()
    {
    	super();
    }
    public RespiratoryTreatment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.RespiratoryTreatment.class;
	}


	public ims.core.admin.domain.objects.ClinicalContact getSOAPClinicalContact() {
		return sOAPClinicalContact;
	}
	public void setSOAPClinicalContact(ims.core.admin.domain.objects.ClinicalContact sOAPClinicalContact) {
		this.sOAPClinicalContact = sOAPClinicalContact;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringCP() {
		return authoringCP;
	}
	public void setAuthoringCP(ims.core.resource.people.domain.objects.Hcp authoringCP) {
		this.authoringCP = authoringCP;
	}

	public ims.domain.lookups.LookupInstance getPosturalDrainage() {
		return posturalDrainage;
	}
	public void setPosturalDrainage(ims.domain.lookups.LookupInstance posturalDrainage) {
		this.posturalDrainage = posturalDrainage;
	}

	public ims.domain.lookups.LookupInstance getAssistedCough() {
		return assistedCough;
	}
	public void setAssistedCough(ims.domain.lookups.LookupInstance assistedCough) {
		this.assistedCough = assistedCough;
	}

	public String getIPPB() {
		return iPPB;
	}
	public void setIPPB(String iPPB) {
		if ( null != iPPB && iPPB.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for iPPB. Tried to set value: "+
				iPPB);
		}
		this.iPPB = iPPB;
	}

	public ims.domain.lookups.LookupInstance getContraindicationChecked() {
		return contraindicationChecked;
	}
	public void setContraindicationChecked(ims.domain.lookups.LookupInstance contraindicationChecked) {
		this.contraindicationChecked = contraindicationChecked;
	}

	public String getCoughAssist() {
		return coughAssist;
	}
	public void setCoughAssist(String coughAssist) {
		if ( null != coughAssist && coughAssist.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for coughAssist. Tried to set value: "+
				coughAssist);
		}
		this.coughAssist = coughAssist;
	}

	public java.util.Set getTreatments() {
		if ( null == treatments ) {
			treatments = new java.util.HashSet();
		}
		return treatments;
	}
	public void setTreatments(java.util.Set paramValue) {
		this.treatments = paramValue;
	}

	public String getTreatmentAnalysis() {
		return treatmentAnalysis;
	}
	public void setTreatmentAnalysis(String treatmentAnalysis) {
		if ( null != treatmentAnalysis && treatmentAnalysis.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for treatmentAnalysis. Tried to set value: "+
				treatmentAnalysis);
		}
		this.treatmentAnalysis = treatmentAnalysis;
	}

	public ims.domain.lookups.LookupInstance getReferOnCallPhysio() {
		return referOnCallPhysio;
	}
	public void setReferOnCallPhysio(ims.domain.lookups.LookupInstance referOnCallPhysio) {
		this.referOnCallPhysio = referOnCallPhysio;
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
		
		auditStr.append("\r\n*sOAPClinicalContact* :");
		if (sOAPClinicalContact != null)
		{
			auditStr.append(toShortClassName(sOAPClinicalContact));
				
		    auditStr.append(sOAPClinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringCP* :");
		if (authoringCP != null)
		{
			auditStr.append(toShortClassName(authoringCP));
				
		    auditStr.append(authoringCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*posturalDrainage* :");
		if (posturalDrainage != null)
			auditStr.append(posturalDrainage.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*assistedCough* :");
		if (assistedCough != null)
			auditStr.append(assistedCough.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*iPPB* :");
		auditStr.append(iPPB);
	    auditStr.append("; ");
		auditStr.append("\r\n*contraindicationChecked* :");
		if (contraindicationChecked != null)
			auditStr.append(contraindicationChecked.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*coughAssist* :");
		auditStr.append(coughAssist);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatments* :");
		if (treatments != null)
		{
			java.util.Iterator it9 = treatments.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.RespiratoryTreatmentDetail obj = (ims.core.clinical.domain.objects.RespiratoryTreatmentDetail)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentAnalysis* :");
		auditStr.append(treatmentAnalysis);
	    auditStr.append("; ");
		auditStr.append("\r\n*referOnCallPhysio* :");
		if (referOnCallPhysio != null)
			auditStr.append(referOnCallPhysio.getText());
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
		
		String keyClassName = "RespiratoryTreatment";
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
		if (this.getSOAPClinicalContact() != null)
		{
			sb.append("<sOAPClinicalContact>");
			sb.append(this.getSOAPClinicalContact().toXMLString(domMap)); 	
			sb.append("</sOAPClinicalContact>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getAuthoringCP() != null)
		{
			sb.append("<authoringCP>");
			sb.append(this.getAuthoringCP().toXMLString(domMap)); 	
			sb.append("</authoringCP>");		
		}
		if (this.getPosturalDrainage() != null)
		{
			sb.append("<posturalDrainage>");
			sb.append(this.getPosturalDrainage().toXMLString()); 
			sb.append("</posturalDrainage>");		
		}
		if (this.getAssistedCough() != null)
		{
			sb.append("<assistedCough>");
			sb.append(this.getAssistedCough().toXMLString()); 
			sb.append("</assistedCough>");		
		}
		if (this.getIPPB() != null)
		{
			sb.append("<iPPB>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIPPB().toString()));
			sb.append("</iPPB>");		
		}
		if (this.getContraindicationChecked() != null)
		{
			sb.append("<contraindicationChecked>");
			sb.append(this.getContraindicationChecked().toXMLString()); 
			sb.append("</contraindicationChecked>");		
		}
		if (this.getCoughAssist() != null)
		{
			sb.append("<coughAssist>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCoughAssist().toString()));
			sb.append("</coughAssist>");		
		}
		if (this.getTreatments() != null)
		{
			if (this.getTreatments().size() > 0 )
			{
			sb.append("<treatments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTreatments(), domMap));
			sb.append("</treatments>");		
			}
		}
		if (this.getTreatmentAnalysis() != null)
		{
			sb.append("<treatmentAnalysis>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTreatmentAnalysis().toString()));
			sb.append("</treatmentAnalysis>");		
		}
		if (this.getReferOnCallPhysio() != null)
		{
			sb.append("<referOnCallPhysio>");
			sb.append(this.getReferOnCallPhysio().toXMLString()); 
			sb.append("</referOnCallPhysio>");		
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
			RespiratoryTreatment domainObject = getRespiratoryTreatmentfromXML(itemEl, factory, domMap);

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
			RespiratoryTreatment domainObject = getRespiratoryTreatmentfromXML(itemEl, factory, domMap);

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
		
	public static RespiratoryTreatment getRespiratoryTreatmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRespiratoryTreatmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RespiratoryTreatment getRespiratoryTreatmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RespiratoryTreatment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RespiratoryTreatment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RespiratoryTreatment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RespiratoryTreatment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RespiratoryTreatment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RespiratoryTreatment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RespiratoryTreatment)factory.getImportedDomainObject(RespiratoryTreatment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RespiratoryTreatment();
		}
		String keyClassName = "RespiratoryTreatment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RespiratoryTreatment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RespiratoryTreatment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("sOAPClinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSOAPClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("authoringCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("posturalDrainage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPosturalDrainage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("assistedCough");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAssistedCough(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("iPPB");
		if(fldEl != null)
		{	
    		obj.setIPPB(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contraindicationChecked");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setContraindicationChecked(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("coughAssist");
		if(fldEl != null)
		{	
    		obj.setCoughAssist(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("treatments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTreatments(ims.core.clinical.domain.objects.RespiratoryTreatmentDetail.fromSetXMLString(fldEl, factory, obj.getTreatments(), domMap));
		}
		fldEl = el.element("treatmentAnalysis");
		if(fldEl != null)
		{	
    		obj.setTreatmentAnalysis(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referOnCallPhysio");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferOnCallPhysio(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "treatments"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String SOAPClinicalContact = "sOAPClinicalContact";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String AuthoringCP = "authoringCP";
		public static final String PosturalDrainage = "posturalDrainage";
		public static final String AssistedCough = "assistedCough";
		public static final String IPPB = "iPPB";
		public static final String ContraindicationChecked = "contraindicationChecked";
		public static final String CoughAssist = "coughAssist";
		public static final String Treatments = "treatments";
		public static final String TreatmentAnalysis = "treatmentAnalysis";
		public static final String ReferOnCallPhysio = "referOnCallPhysio";
	}
}

