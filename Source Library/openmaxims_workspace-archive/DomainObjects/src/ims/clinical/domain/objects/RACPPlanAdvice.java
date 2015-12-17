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
package ims.clinical.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class RACPPlanAdvice extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100077;
	private static final long serialVersionUID = 1072100077L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Primary Plan of Action */
	private ims.domain.lookups.LookupInstance primaryPlan;
	/** Overall Impression */
	private ims.domain.lookups.LookupInstance overallImpression;
	/** Other Details */
	private String otherDetails;
	/** Secondary Plans of Action
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List secondaryPlans;
	/** Advice Given to Patient
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List adviceGivenPatient;
	/** Advice Given to GP
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List adviceGivenToGP;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public RACPPlanAdvice (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RACPPlanAdvice ()
    {
    	super();
    }
    public RACPPlanAdvice (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.RACPPlanAdvice.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.domain.lookups.LookupInstance getPrimaryPlan() {
		return primaryPlan;
	}
	public void setPrimaryPlan(ims.domain.lookups.LookupInstance primaryPlan) {
		this.primaryPlan = primaryPlan;
	}

	public ims.domain.lookups.LookupInstance getOverallImpression() {
		return overallImpression;
	}
	public void setOverallImpression(ims.domain.lookups.LookupInstance overallImpression) {
		this.overallImpression = overallImpression;
	}

	public String getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(String otherDetails) {
		if ( null != otherDetails && otherDetails.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherDetails. Tried to set value: "+
				otherDetails);
		}
		this.otherDetails = otherDetails;
	}

	public java.util.List getSecondaryPlans() {
		if ( null == secondaryPlans ) {
			secondaryPlans = new java.util.ArrayList();
		}
		return secondaryPlans;
	}
	public void setSecondaryPlans(java.util.List paramValue) {
		this.secondaryPlans = paramValue;
	}

	public java.util.List getAdviceGivenPatient() {
		if ( null == adviceGivenPatient ) {
			adviceGivenPatient = new java.util.ArrayList();
		}
		return adviceGivenPatient;
	}
	public void setAdviceGivenPatient(java.util.List paramValue) {
		this.adviceGivenPatient = paramValue;
	}

	public java.util.List getAdviceGivenToGP() {
		if ( null == adviceGivenToGP ) {
			adviceGivenToGP = new java.util.ArrayList();
		}
		return adviceGivenToGP;
	}
	public void setAdviceGivenToGP(java.util.List paramValue) {
		this.adviceGivenToGP = paramValue;
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
		auditStr.append("\r\n*primaryPlan* :");
		if (primaryPlan != null)
			auditStr.append(primaryPlan.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*overallImpression* :");
		if (overallImpression != null)
			auditStr.append(overallImpression.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*otherDetails* :");
		auditStr.append(otherDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*secondaryPlans* :");
		if (secondaryPlans != null)
		{
			java.util.Iterator it5 = secondaryPlans.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it5.next();
			auditStr.append(obj.getText());
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*adviceGivenPatient* :");
		if (adviceGivenPatient != null)
		{
			java.util.Iterator it6 = adviceGivenPatient.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it6.next();
			auditStr.append(obj.getText());
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*adviceGivenToGP* :");
		if (adviceGivenToGP != null)
		{
			java.util.Iterator it7 = adviceGivenToGP.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it7.next();
			auditStr.append(obj.getText());
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
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
		
		String keyClassName = "RACPPlanAdvice";
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
		if (this.getPrimaryPlan() != null)
		{
			sb.append("<primaryPlan>");
			sb.append(this.getPrimaryPlan().toXMLString()); 
			sb.append("</primaryPlan>");		
		}
		if (this.getOverallImpression() != null)
		{
			sb.append("<overallImpression>");
			sb.append(this.getOverallImpression().toXMLString()); 
			sb.append("</overallImpression>");		
		}
		if (this.getOtherDetails() != null)
		{
			sb.append("<otherDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherDetails().toString()));
			sb.append("</otherDetails>");		
		}
		if (this.getSecondaryPlans() != null)
		{
			if (this.getSecondaryPlans().size() > 0 )
			{
			sb.append("<secondaryPlans>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getSecondaryPlans())); 
			sb.append("</secondaryPlans>");		
			}
		}
		if (this.getAdviceGivenPatient() != null)
		{
			if (this.getAdviceGivenPatient().size() > 0 )
			{
			sb.append("<adviceGivenPatient>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getAdviceGivenPatient())); 
			sb.append("</adviceGivenPatient>");		
			}
		}
		if (this.getAdviceGivenToGP() != null)
		{
			if (this.getAdviceGivenToGP().size() > 0 )
			{
			sb.append("<adviceGivenToGP>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getAdviceGivenToGP())); 
			sb.append("</adviceGivenToGP>");		
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
			RACPPlanAdvice domainObject = getRACPPlanAdvicefromXML(itemEl, factory, domMap);

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
			RACPPlanAdvice domainObject = getRACPPlanAdvicefromXML(itemEl, factory, domMap);

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
		
	public static RACPPlanAdvice getRACPPlanAdvicefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRACPPlanAdvicefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RACPPlanAdvice getRACPPlanAdvicefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RACPPlanAdvice.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RACPPlanAdvice.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RACPPlanAdvice class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RACPPlanAdvice)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RACPPlanAdvice.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RACPPlanAdvice ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RACPPlanAdvice)factory.getImportedDomainObject(RACPPlanAdvice.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RACPPlanAdvice();
		}
		String keyClassName = "RACPPlanAdvice";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RACPPlanAdvice)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RACPPlanAdvice obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("primaryPlan");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrimaryPlan(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("overallImpression");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOverallImpression(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("otherDetails");
		if(fldEl != null)
		{	
    		obj.setOtherDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("secondaryPlans");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSecondaryPlans(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getSecondaryPlans())); 
		}
		fldEl = el.element("adviceGivenPatient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAdviceGivenPatient(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getAdviceGivenPatient())); 
		}
		fldEl = el.element("adviceGivenToGP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAdviceGivenToGP(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getAdviceGivenToGP())); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "secondaryPlans"
		, "adviceGivenPatient"
		, "adviceGivenToGP"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String PrimaryPlan = "primaryPlan";
		public static final String OverallImpression = "overallImpression";
		public static final String OtherDetails = "otherDetails";
		public static final String SecondaryPlans = "secondaryPlans";
		public static final String AdviceGivenPatient = "adviceGivenPatient";
		public static final String AdviceGivenToGP = "adviceGivenToGP";
	}
}

