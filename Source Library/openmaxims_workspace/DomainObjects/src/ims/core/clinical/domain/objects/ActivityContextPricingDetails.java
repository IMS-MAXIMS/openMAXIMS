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
 * @author Kevin O'Carroll
 * Generated.
 */


public class ActivityContextPricingDetails extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1007100004;
	private static final long serialVersionUID = 1007100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Context */
	private ims.domain.lookups.LookupInstance context;
	/** Price */
	private java.lang.Float price;
	private ims.domain.lookups.LookupInstance priceCategory;
	/** Currency */
	private ims.domain.lookups.LookupInstance currency;
	/** NormLengthStay */
	private Integer normLengthStay;
	/** EffectiveFrom */
	private java.util.Date effectiveFrom;
	/** EffectiveTo */
	private java.util.Date effectiveTo;
	/** isActive */
	private Boolean isActive;
	/** TaxonomyMap
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List taxonomyMap;
	/** Is Pre Active */
	private Boolean isPreActive;
	/** Effective To Set Date */
	private java.util.Date effectiveToSet;
	/** Batch creating this pricing context */
	private ims.core.clinical.domain.objects.BatchPricing creatingBatch;
	/** Effective From Set Date */
	private java.util.Date effectiveFromSet;
	/** Active Pricing on which this price is based */
	private ims.core.clinical.domain.objects.ActivityContextPricingDetails activePricing;
    public ActivityContextPricingDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ActivityContextPricingDetails ()
    {
    	super();
    }
    public ActivityContextPricingDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.ActivityContextPricingDetails.class;
	}


	public ims.domain.lookups.LookupInstance getContext() {
		return context;
	}
	public void setContext(ims.domain.lookups.LookupInstance context) {
		this.context = context;
	}

	public java.lang.Float getPrice() {
		return price;
	}
	public void setPrice(java.lang.Float price) {
		this.price = price;
	}

	public ims.domain.lookups.LookupInstance getPriceCategory() {
		return priceCategory;
	}
	public void setPriceCategory(ims.domain.lookups.LookupInstance priceCategory) {
		this.priceCategory = priceCategory;
	}

	public ims.domain.lookups.LookupInstance getCurrency() {
		return currency;
	}
	public void setCurrency(ims.domain.lookups.LookupInstance currency) {
		this.currency = currency;
	}

	public Integer getNormLengthStay() {
		return normLengthStay;
	}
	public void setNormLengthStay(Integer normLengthStay) {
		this.normLengthStay = normLengthStay;
	}

	public java.util.Date getEffectiveFrom() {
		return effectiveFrom;
	}
	public void setEffectiveFrom(java.util.Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public java.util.Date getEffectiveTo() {
		return effectiveTo;
	}
	public void setEffectiveTo(java.util.Date effectiveTo) {
		this.effectiveTo = effectiveTo;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public java.util.List getTaxonomyMap() {
		if ( null == taxonomyMap ) {
			taxonomyMap = new java.util.ArrayList();
		}
		return taxonomyMap;
	}
	public void setTaxonomyMap(java.util.List paramValue) {
		this.taxonomyMap = paramValue;
	}

	public Boolean isIsPreActive() {
		return isPreActive;
	}
	public void setIsPreActive(Boolean isPreActive) {
		this.isPreActive = isPreActive;
	}

	public java.util.Date getEffectiveToSet() {
		return effectiveToSet;
	}
	public void setEffectiveToSet(java.util.Date effectiveToSet) {
		this.effectiveToSet = effectiveToSet;
	}

	public ims.core.clinical.domain.objects.BatchPricing getCreatingBatch() {
		return creatingBatch;
	}
	public void setCreatingBatch(ims.core.clinical.domain.objects.BatchPricing creatingBatch) {
		this.creatingBatch = creatingBatch;
	}

	public java.util.Date getEffectiveFromSet() {
		return effectiveFromSet;
	}
	public void setEffectiveFromSet(java.util.Date effectiveFromSet) {
		this.effectiveFromSet = effectiveFromSet;
	}

	public ims.core.clinical.domain.objects.ActivityContextPricingDetails getActivePricing() {
		return activePricing;
	}
	public void setActivePricing(ims.core.clinical.domain.objects.ActivityContextPricingDetails activePricing) {
		this.activePricing = activePricing;
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
		
		auditStr.append("\r\n*context* :");
		if (context != null)
			auditStr.append(context.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*price* :");
		auditStr.append(price);
	    auditStr.append("; ");
		auditStr.append("\r\n*priceCategory* :");
		if (priceCategory != null)
			auditStr.append(priceCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*currency* :");
		if (currency != null)
			auditStr.append(currency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*normLengthStay* :");
		auditStr.append(normLengthStay);
	    auditStr.append("; ");
		auditStr.append("\r\n*effectiveFrom* :");
		auditStr.append(effectiveFrom);
	    auditStr.append("; ");
		auditStr.append("\r\n*effectiveTo* :");
		auditStr.append(effectiveTo);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyMap* :");
		if (taxonomyMap != null)
		{
		int i9=0;
		for (i9=0; i9<taxonomyMap.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)taxonomyMap.get(i9);
		    if (obj != null)
			{
				if (i9 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isPreActive* :");
		auditStr.append(isPreActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*effectiveToSet* :");
		auditStr.append(effectiveToSet);
	    auditStr.append("; ");
		auditStr.append("\r\n*creatingBatch* :");
		if (creatingBatch != null)
		{
			auditStr.append(toShortClassName(creatingBatch));
				
		    auditStr.append(creatingBatch.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*effectiveFromSet* :");
		auditStr.append(effectiveFromSet);
	    auditStr.append("; ");
		auditStr.append("\r\n*activePricing* :");
		if (activePricing != null)
		{
			auditStr.append(toShortClassName(activePricing));
				
		    auditStr.append(activePricing.getId());
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
		
		String keyClassName = "ActivityContextPricingDetails";
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
		if (this.getContext() != null)
		{
			sb.append("<context>");
			sb.append(this.getContext().toXMLString()); 
			sb.append("</context>");		
		}
		if (this.getPrice() != null)
		{
			sb.append("<price>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPrice().toString()));
			sb.append("</price>");		
		}
		if (this.getPriceCategory() != null)
		{
			sb.append("<priceCategory>");
			sb.append(this.getPriceCategory().toXMLString()); 
			sb.append("</priceCategory>");		
		}
		if (this.getCurrency() != null)
		{
			sb.append("<currency>");
			sb.append(this.getCurrency().toXMLString()); 
			sb.append("</currency>");		
		}
		if (this.getNormLengthStay() != null)
		{
			sb.append("<normLengthStay>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNormLengthStay().toString()));
			sb.append("</normLengthStay>");		
		}
		if (this.getEffectiveFrom() != null)
		{
			sb.append("<effectiveFrom>");
			sb.append(new ims.framework.utils.DateTime(this.getEffectiveFrom()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effectiveFrom>");		
		}
		if (this.getEffectiveTo() != null)
		{
			sb.append("<effectiveTo>");
			sb.append(new ims.framework.utils.DateTime(this.getEffectiveTo()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effectiveTo>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getTaxonomyMap() != null)
		{
			if (this.getTaxonomyMap().size() > 0 )
			{
			sb.append("<taxonomyMap>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTaxonomyMap(), domMap));
			sb.append("</taxonomyMap>");		
			}
		}
		if (this.isIsPreActive() != null)
		{
			sb.append("<isPreActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPreActive().toString()));
			sb.append("</isPreActive>");		
		}
		if (this.getEffectiveToSet() != null)
		{
			sb.append("<effectiveToSet>");
			sb.append(new ims.framework.utils.DateTime(this.getEffectiveToSet()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effectiveToSet>");		
		}
		if (this.getCreatingBatch() != null)
		{
			sb.append("<creatingBatch>");
			sb.append(this.getCreatingBatch().toXMLString(domMap)); 	
			sb.append("</creatingBatch>");		
		}
		if (this.getEffectiveFromSet() != null)
		{
			sb.append("<effectiveFromSet>");
			sb.append(new ims.framework.utils.DateTime(this.getEffectiveFromSet()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effectiveFromSet>");		
		}
		if (this.getActivePricing() != null)
		{
			sb.append("<activePricing>");
			sb.append(this.getActivePricing().toXMLString(domMap)); 	
			sb.append("</activePricing>");		
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
			ActivityContextPricingDetails domainObject = getActivityContextPricingDetailsfromXML(itemEl, factory, domMap);

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
			ActivityContextPricingDetails domainObject = getActivityContextPricingDetailsfromXML(itemEl, factory, domMap);

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
		
	public static ActivityContextPricingDetails getActivityContextPricingDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getActivityContextPricingDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ActivityContextPricingDetails getActivityContextPricingDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ActivityContextPricingDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ActivityContextPricingDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ActivityContextPricingDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ActivityContextPricingDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ActivityContextPricingDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ActivityContextPricingDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ActivityContextPricingDetails)factory.getImportedDomainObject(ActivityContextPricingDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ActivityContextPricingDetails();
		}
		String keyClassName = "ActivityContextPricingDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ActivityContextPricingDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ActivityContextPricingDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("context");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setContext(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("price");
		if(fldEl != null)
		{	
    		obj.setPrice(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priceCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPriceCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("currency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCurrency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("normLengthStay");
		if(fldEl != null)
		{	
    		obj.setNormLengthStay(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("effectiveFrom");
		if(fldEl != null)
		{	
    		obj.setEffectiveFrom(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("effectiveTo");
		if(fldEl != null)
		{	
    		obj.setEffectiveTo(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("taxonomyMap");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTaxonomyMap(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getTaxonomyMap(), domMap));
		}
		fldEl = el.element("isPreActive");
		if(fldEl != null)
		{	
    		obj.setIsPreActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("effectiveToSet");
		if(fldEl != null)
		{	
    		obj.setEffectiveToSet(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("creatingBatch");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCreatingBatch(ims.core.clinical.domain.objects.BatchPricing.getBatchPricingfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("effectiveFromSet");
		if(fldEl != null)
		{	
    		obj.setEffectiveFromSet(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("activePricing");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActivePricing(ims.core.clinical.domain.objects.ActivityContextPricingDetails.getActivityContextPricingDetailsfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "taxonomyMap"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Context = "context";
		public static final String Price = "price";
		public static final String PriceCategory = "priceCategory";
		public static final String Currency = "currency";
		public static final String NormLengthStay = "normLengthStay";
		public static final String EffectiveFrom = "effectiveFrom";
		public static final String EffectiveTo = "effectiveTo";
		public static final String IsActive = "isActive";
		public static final String TaxonomyMap = "taxonomyMap";
		public static final String IsPreActive = "isPreActive";
		public static final String EffectiveToSet = "effectiveToSet";
		public static final String CreatingBatch = "creatingBatch";
		public static final String EffectiveFromSet = "effectiveFromSet";
		public static final String ActivePricing = "activePricing";
	}
}

