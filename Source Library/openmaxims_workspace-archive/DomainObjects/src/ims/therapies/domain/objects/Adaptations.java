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
package ims.therapies.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class Adaptations extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100098;
	private static final long serialVersionUID = 1019100098L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Item Category -Hierarchical  lookup with below */
	private ims.domain.lookups.LookupInstance itemCategory;
	/** Item Type - Hierarchical  lookup */
	private ims.domain.lookups.LookupInstance itemType;
	/** Supplier */
	private ims.domain.lookups.LookupInstance supplier;
	/** Date Required */
	private java.util.Date dateRequired;
	/** Date Supplied */
	private java.util.Date dateSupplied;
	/** Supplied For */
	private ims.domain.lookups.LookupInstance suppliedFor;
	/** Loan */
	private ims.domain.lookups.LookupInstance loan;
	/** Funded By */
	private ims.domain.lookups.LookupInstance fundedBy;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Adaptations (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Adaptations ()
    {
    	super();
    }
    public Adaptations (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.domain.objects.Adaptations.class;
	}


	public ims.domain.lookups.LookupInstance getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(ims.domain.lookups.LookupInstance itemCategory) {
		this.itemCategory = itemCategory;
	}

	public ims.domain.lookups.LookupInstance getItemType() {
		return itemType;
	}
	public void setItemType(ims.domain.lookups.LookupInstance itemType) {
		this.itemType = itemType;
	}

	public ims.domain.lookups.LookupInstance getSupplier() {
		return supplier;
	}
	public void setSupplier(ims.domain.lookups.LookupInstance supplier) {
		this.supplier = supplier;
	}

	public java.util.Date getDateRequired() {
		return dateRequired;
	}
	public void setDateRequired(java.util.Date dateRequired) {
		this.dateRequired = dateRequired;
	}

	public java.util.Date getDateSupplied() {
		return dateSupplied;
	}
	public void setDateSupplied(java.util.Date dateSupplied) {
		this.dateSupplied = dateSupplied;
	}

	public ims.domain.lookups.LookupInstance getSuppliedFor() {
		return suppliedFor;
	}
	public void setSuppliedFor(ims.domain.lookups.LookupInstance suppliedFor) {
		this.suppliedFor = suppliedFor;
	}

	public ims.domain.lookups.LookupInstance getLoan() {
		return loan;
	}
	public void setLoan(ims.domain.lookups.LookupInstance loan) {
		this.loan = loan;
	}

	public ims.domain.lookups.LookupInstance getFundedBy() {
		return fundedBy;
	}
	public void setFundedBy(ims.domain.lookups.LookupInstance fundedBy) {
		this.fundedBy = fundedBy;
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
		
		auditStr.append("\r\n*itemCategory* :");
		if (itemCategory != null)
			auditStr.append(itemCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*itemType* :");
		if (itemType != null)
			auditStr.append(itemType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*supplier* :");
		if (supplier != null)
			auditStr.append(supplier.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateRequired* :");
		auditStr.append(dateRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateSupplied* :");
		auditStr.append(dateSupplied);
	    auditStr.append("; ");
		auditStr.append("\r\n*suppliedFor* :");
		if (suppliedFor != null)
			auditStr.append(suppliedFor.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*loan* :");
		if (loan != null)
			auditStr.append(loan.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*fundedBy* :");
		if (fundedBy != null)
			auditStr.append(fundedBy.getText());
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
		
		String keyClassName = "Adaptations";
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
		if (this.getItemCategory() != null)
		{
			sb.append("<itemCategory>");
			sb.append(this.getItemCategory().toXMLString()); 
			sb.append("</itemCategory>");		
		}
		if (this.getItemType() != null)
		{
			sb.append("<itemType>");
			sb.append(this.getItemType().toXMLString()); 
			sb.append("</itemType>");		
		}
		if (this.getSupplier() != null)
		{
			sb.append("<supplier>");
			sb.append(this.getSupplier().toXMLString()); 
			sb.append("</supplier>");		
		}
		if (this.getDateRequired() != null)
		{
			sb.append("<dateRequired>");
			sb.append(new ims.framework.utils.DateTime(this.getDateRequired()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateRequired>");		
		}
		if (this.getDateSupplied() != null)
		{
			sb.append("<dateSupplied>");
			sb.append(new ims.framework.utils.DateTime(this.getDateSupplied()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateSupplied>");		
		}
		if (this.getSuppliedFor() != null)
		{
			sb.append("<suppliedFor>");
			sb.append(this.getSuppliedFor().toXMLString()); 
			sb.append("</suppliedFor>");		
		}
		if (this.getLoan() != null)
		{
			sb.append("<loan>");
			sb.append(this.getLoan().toXMLString()); 
			sb.append("</loan>");		
		}
		if (this.getFundedBy() != null)
		{
			sb.append("<fundedBy>");
			sb.append(this.getFundedBy().toXMLString()); 
			sb.append("</fundedBy>");		
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
			Adaptations domainObject = getAdaptationsfromXML(itemEl, factory, domMap);

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
			Adaptations domainObject = getAdaptationsfromXML(itemEl, factory, domMap);

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
		
	public static Adaptations getAdaptationsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAdaptationsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Adaptations getAdaptationsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Adaptations.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Adaptations.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Adaptations class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Adaptations)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Adaptations.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Adaptations ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Adaptations)factory.getImportedDomainObject(Adaptations.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Adaptations();
		}
		String keyClassName = "Adaptations";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Adaptations)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Adaptations obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("itemCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setItemCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("itemType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setItemType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("supplier");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSupplier(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateRequired");
		if(fldEl != null)
		{	
    		obj.setDateRequired(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateSupplied");
		if(fldEl != null)
		{	
    		obj.setDateSupplied(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("suppliedFor");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSuppliedFor(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("loan");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLoan(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("fundedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFundedBy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String ItemCategory = "itemCategory";
		public static final String ItemType = "itemType";
		public static final String Supplier = "supplier";
		public static final String DateRequired = "dateRequired";
		public static final String DateSupplied = "dateSupplied";
		public static final String SuppliedFor = "suppliedFor";
		public static final String Loan = "loan";
		public static final String FundedBy = "fundedBy";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
	}
}

