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
package ims.therapies.treatment.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class SplintDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100041;
	private static final long serialVersionUID = 1019100041L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** SOAP Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Authoring Care Professional */
	private ims.core.resource.people.domain.objects.Hcp authoringCP;
	/** Authoring DateTime */
	private java.util.Date authoringDateTime;
	/** Start Date */
	private java.util.Date startDate;
	/** Area */
	private ims.domain.lookups.LookupInstance area;
	/** Splint Category */
	private ims.domain.lookups.LookupInstance splintCategory;
	/** Material */
	private ims.domain.lookups.LookupInstance material;
	/** Product */
	private ims.domain.lookups.LookupInstance product;
	/** Laterality */
	private ims.domain.lookups.LookupInstance laterality;
	/** Splint Type */
	private ims.domain.lookups.LookupInstance splintType;
	/** Splint Base */
	private ims.domain.lookups.LookupInstance splintBase;
	/** Splint Size */
	private ims.domain.lookups.LookupInstance splintSize;
	/** Splint Regime
	  * Collection of ims.therapies.treatment.domain.objects.SplintsWearRegime.
	  */
	private java.util.Set splintRegime;
	/** Splint Instructions
	  * Collection of ims.therapies.treatment.domain.objects.SplintsInstructionDetails.
	  */
	private java.util.Set splintInstructions;
	/** Splint Additional Features
	  * Collection of ims.therapies.treatment.domain.objects.SplintsAdditionalFeatures.
	  */
	private java.util.Set splintAdditionalFeatures;
	/** Consent Given */
	private ims.core.generic.domain.objects.ConsentGiven consentGiven;
	/** End Date */
	private java.util.Date endDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SplintDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SplintDetails ()
    {
    	super();
    }
    public SplintDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.treatment.domain.objects.SplintDetails.class;
	}


	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringCP() {
		return authoringCP;
	}
	public void setAuthoringCP(ims.core.resource.people.domain.objects.Hcp authoringCP) {
		this.authoringCP = authoringCP;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public ims.domain.lookups.LookupInstance getArea() {
		return area;
	}
	public void setArea(ims.domain.lookups.LookupInstance area) {
		this.area = area;
	}

	public ims.domain.lookups.LookupInstance getSplintCategory() {
		return splintCategory;
	}
	public void setSplintCategory(ims.domain.lookups.LookupInstance splintCategory) {
		this.splintCategory = splintCategory;
	}

	public ims.domain.lookups.LookupInstance getMaterial() {
		return material;
	}
	public void setMaterial(ims.domain.lookups.LookupInstance material) {
		this.material = material;
	}

	public ims.domain.lookups.LookupInstance getProduct() {
		return product;
	}
	public void setProduct(ims.domain.lookups.LookupInstance product) {
		this.product = product;
	}

	public ims.domain.lookups.LookupInstance getLaterality() {
		return laterality;
	}
	public void setLaterality(ims.domain.lookups.LookupInstance laterality) {
		this.laterality = laterality;
	}

	public ims.domain.lookups.LookupInstance getSplintType() {
		return splintType;
	}
	public void setSplintType(ims.domain.lookups.LookupInstance splintType) {
		this.splintType = splintType;
	}

	public ims.domain.lookups.LookupInstance getSplintBase() {
		return splintBase;
	}
	public void setSplintBase(ims.domain.lookups.LookupInstance splintBase) {
		this.splintBase = splintBase;
	}

	public ims.domain.lookups.LookupInstance getSplintSize() {
		return splintSize;
	}
	public void setSplintSize(ims.domain.lookups.LookupInstance splintSize) {
		this.splintSize = splintSize;
	}

	public java.util.Set getSplintRegime() {
		if ( null == splintRegime ) {
			splintRegime = new java.util.HashSet();
		}
		return splintRegime;
	}
	public void setSplintRegime(java.util.Set paramValue) {
		this.splintRegime = paramValue;
	}

	public java.util.Set getSplintInstructions() {
		if ( null == splintInstructions ) {
			splintInstructions = new java.util.HashSet();
		}
		return splintInstructions;
	}
	public void setSplintInstructions(java.util.Set paramValue) {
		this.splintInstructions = paramValue;
	}

	public java.util.Set getSplintAdditionalFeatures() {
		if ( null == splintAdditionalFeatures ) {
			splintAdditionalFeatures = new java.util.HashSet();
		}
		return splintAdditionalFeatures;
	}
	public void setSplintAdditionalFeatures(java.util.Set paramValue) {
		this.splintAdditionalFeatures = paramValue;
	}

	public ims.core.generic.domain.objects.ConsentGiven getConsentGiven() {
		return consentGiven;
	}
	public void setConsentGiven(ims.core.generic.domain.objects.ConsentGiven consentGiven) {
		this.consentGiven = consentGiven;
	}

	public java.util.Date getEndDate() {
		return endDate;
	}
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
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
		
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringCP* :");
		if (authoringCP != null)
		{
			auditStr.append(toShortClassName(authoringCP));
				
		    auditStr.append(authoringCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*area* :");
		if (area != null)
			auditStr.append(area.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*splintCategory* :");
		if (splintCategory != null)
			auditStr.append(splintCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*material* :");
		if (material != null)
			auditStr.append(material.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*product* :");
		if (product != null)
			auditStr.append(product.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*laterality* :");
		if (laterality != null)
			auditStr.append(laterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*splintType* :");
		if (splintType != null)
			auditStr.append(splintType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*splintBase* :");
		if (splintBase != null)
			auditStr.append(splintBase.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*splintSize* :");
		if (splintSize != null)
			auditStr.append(splintSize.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*splintRegime* :");
		if (splintRegime != null)
		{
			java.util.Iterator it13 = splintRegime.iterator();
			int i13=0;
			while (it13.hasNext())
			{
				if (i13 > 0)
					auditStr.append(",");
				ims.therapies.treatment.domain.objects.SplintsWearRegime obj = (ims.therapies.treatment.domain.objects.SplintsWearRegime)it13.next();
		if (obj != null)
		{
		   if (i13 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i13++;
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*splintInstructions* :");
		if (splintInstructions != null)
		{
			java.util.Iterator it14 = splintInstructions.iterator();
			int i14=0;
			while (it14.hasNext())
			{
				if (i14 > 0)
					auditStr.append(",");
				ims.therapies.treatment.domain.objects.SplintsInstructionDetails obj = (ims.therapies.treatment.domain.objects.SplintsInstructionDetails)it14.next();
		if (obj != null)
		{
		   if (i14 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i14++;
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*splintAdditionalFeatures* :");
		if (splintAdditionalFeatures != null)
		{
			java.util.Iterator it15 = splintAdditionalFeatures.iterator();
			int i15=0;
			while (it15.hasNext())
			{
				if (i15 > 0)
					auditStr.append(",");
				ims.therapies.treatment.domain.objects.SplintsAdditionalFeatures obj = (ims.therapies.treatment.domain.objects.SplintsAdditionalFeatures)it15.next();
		if (obj != null)
		{
		   if (i15 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i15++;
		}
		if (i15 > 0)
			auditStr.append("] " + i15);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*consentGiven* :");
		if (consentGiven != null)
		{
			auditStr.append(toShortClassName(consentGiven));
				
		    auditStr.append(consentGiven.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*endDate* :");
		auditStr.append(endDate);
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
		
		String keyClassName = "SplintDetails";
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
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getAuthoringCP() != null)
		{
			sb.append("<authoringCP>");
			sb.append(this.getAuthoringCP().toXMLString(domMap)); 	
			sb.append("</authoringCP>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getArea() != null)
		{
			sb.append("<area>");
			sb.append(this.getArea().toXMLString()); 
			sb.append("</area>");		
		}
		if (this.getSplintCategory() != null)
		{
			sb.append("<splintCategory>");
			sb.append(this.getSplintCategory().toXMLString()); 
			sb.append("</splintCategory>");		
		}
		if (this.getMaterial() != null)
		{
			sb.append("<material>");
			sb.append(this.getMaterial().toXMLString()); 
			sb.append("</material>");		
		}
		if (this.getProduct() != null)
		{
			sb.append("<product>");
			sb.append(this.getProduct().toXMLString()); 
			sb.append("</product>");		
		}
		if (this.getLaterality() != null)
		{
			sb.append("<laterality>");
			sb.append(this.getLaterality().toXMLString()); 
			sb.append("</laterality>");		
		}
		if (this.getSplintType() != null)
		{
			sb.append("<splintType>");
			sb.append(this.getSplintType().toXMLString()); 
			sb.append("</splintType>");		
		}
		if (this.getSplintBase() != null)
		{
			sb.append("<splintBase>");
			sb.append(this.getSplintBase().toXMLString()); 
			sb.append("</splintBase>");		
		}
		if (this.getSplintSize() != null)
		{
			sb.append("<splintSize>");
			sb.append(this.getSplintSize().toXMLString()); 
			sb.append("</splintSize>");		
		}
		if (this.getSplintRegime() != null)
		{
			if (this.getSplintRegime().size() > 0 )
			{
			sb.append("<splintRegime>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSplintRegime(), domMap));
			sb.append("</splintRegime>");		
			}
		}
		if (this.getSplintInstructions() != null)
		{
			if (this.getSplintInstructions().size() > 0 )
			{
			sb.append("<splintInstructions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSplintInstructions(), domMap));
			sb.append("</splintInstructions>");		
			}
		}
		if (this.getSplintAdditionalFeatures() != null)
		{
			if (this.getSplintAdditionalFeatures().size() > 0 )
			{
			sb.append("<splintAdditionalFeatures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSplintAdditionalFeatures(), domMap));
			sb.append("</splintAdditionalFeatures>");		
			}
		}
		if (this.getConsentGiven() != null)
		{
			sb.append("<consentGiven>");
			sb.append(this.getConsentGiven().toXMLString(domMap)); 	
			sb.append("</consentGiven>");		
		}
		if (this.getEndDate() != null)
		{
			sb.append("<endDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDate>");		
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
			SplintDetails domainObject = getSplintDetailsfromXML(itemEl, factory, domMap);

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
			SplintDetails domainObject = getSplintDetailsfromXML(itemEl, factory, domMap);

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
		
	public static SplintDetails getSplintDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSplintDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SplintDetails getSplintDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SplintDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SplintDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SplintDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SplintDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SplintDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SplintDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SplintDetails)factory.getImportedDomainObject(SplintDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SplintDetails();
		}
		String keyClassName = "SplintDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SplintDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SplintDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("area");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setArea(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("splintCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSplintCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("material");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMaterial(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("product");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProduct(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("laterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("splintType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSplintType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("splintBase");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSplintBase(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("splintSize");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSplintSize(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("splintRegime");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSplintRegime(ims.therapies.treatment.domain.objects.SplintsWearRegime.fromSetXMLString(fldEl, factory, obj.getSplintRegime(), domMap));
		}
		fldEl = el.element("splintInstructions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSplintInstructions(ims.therapies.treatment.domain.objects.SplintsInstructionDetails.fromSetXMLString(fldEl, factory, obj.getSplintInstructions(), domMap));
		}
		fldEl = el.element("splintAdditionalFeatures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSplintAdditionalFeatures(ims.therapies.treatment.domain.objects.SplintsAdditionalFeatures.fromSetXMLString(fldEl, factory, obj.getSplintAdditionalFeatures(), domMap));
		}
		fldEl = el.element("consentGiven");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConsentGiven(ims.core.generic.domain.objects.ConsentGiven.getConsentGivenfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("endDate");
		if(fldEl != null)
		{	
    		obj.setEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "splintRegime"
		, "splintInstructions"
		, "splintAdditionalFeatures"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String AuthoringCP = "authoringCP";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String StartDate = "startDate";
		public static final String Area = "area";
		public static final String SplintCategory = "splintCategory";
		public static final String Material = "material";
		public static final String Product = "product";
		public static final String Laterality = "laterality";
		public static final String SplintType = "splintType";
		public static final String SplintBase = "splintBase";
		public static final String SplintSize = "splintSize";
		public static final String SplintRegime = "splintRegime";
		public static final String SplintInstructions = "splintInstructions";
		public static final String SplintAdditionalFeatures = "splintAdditionalFeatures";
		public static final String ConsentGiven = "consentGiven";
		public static final String EndDate = "endDate";
	}
}

