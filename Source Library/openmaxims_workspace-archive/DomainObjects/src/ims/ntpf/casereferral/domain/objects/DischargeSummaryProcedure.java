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
package ims.ntpf.casereferral.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class DischargeSummaryProcedure extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1035100006;
	private static final long serialVersionUID = 1035100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** Procedure Context */
	private ims.domain.lookups.LookupInstance procedureContext;
	/** Price */
	private java.lang.Float price;
	/** Specialty */
	private ims.core.resource.place.domain.objects.LocationService locationService;
	/** Procedure */
	private ims.core.clinical.domain.objects.Procedure procedure;
	/** ActivityContextPricing */
	private ims.core.clinical.domain.objects.ActivityContextPricingDetails activityContextPricing;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DischargeSummaryProcedure (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DischargeSummaryProcedure ()
    {
    	super();
    }
    public DischargeSummaryProcedure (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ntpf.casereferral.domain.objects.DischargeSummaryProcedure.class;
	}


	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.domain.lookups.LookupInstance getProcedureContext() {
		return procedureContext;
	}
	public void setProcedureContext(ims.domain.lookups.LookupInstance procedureContext) {
		this.procedureContext = procedureContext;
	}

	public java.lang.Float getPrice() {
		return price;
	}
	public void setPrice(java.lang.Float price) {
		this.price = price;
	}

	public ims.core.resource.place.domain.objects.LocationService getLocationService() {
		return locationService;
	}
	public void setLocationService(ims.core.resource.place.domain.objects.LocationService locationService) {
		this.locationService = locationService;
	}

	public ims.core.clinical.domain.objects.Procedure getProcedure() {
		return procedure;
	}
	public void setProcedure(ims.core.clinical.domain.objects.Procedure procedure) {
		this.procedure = procedure;
	}

	public ims.core.clinical.domain.objects.ActivityContextPricingDetails getActivityContextPricing() {
		return activityContextPricing;
	}
	public void setActivityContextPricing(ims.core.clinical.domain.objects.ActivityContextPricingDetails activityContextPricing) {
		this.activityContextPricing = activityContextPricing;
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
		
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureContext* :");
		if (procedureContext != null)
			auditStr.append(procedureContext.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*price* :");
		auditStr.append(price);
	    auditStr.append("; ");
		auditStr.append("\r\n*locationService* :");
		if (locationService != null)
		{
			auditStr.append(toShortClassName(locationService));
				
		    auditStr.append(locationService.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedure* :");
		if (procedure != null)
		{
			auditStr.append(toShortClassName(procedure));
				
		    auditStr.append(procedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*activityContextPricing* :");
		if (activityContextPricing != null)
		{
			auditStr.append(toShortClassName(activityContextPricing));
				
		    auditStr.append(activityContextPricing.getId());
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
		
		String keyClassName = "DischargeSummaryProcedure";
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
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getProcedureContext() != null)
		{
			sb.append("<procedureContext>");
			sb.append(this.getProcedureContext().toXMLString()); 
			sb.append("</procedureContext>");		
		}
		if (this.getPrice() != null)
		{
			sb.append("<price>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPrice().toString()));
			sb.append("</price>");		
		}
		if (this.getLocationService() != null)
		{
			sb.append("<locationService>");
			sb.append(this.getLocationService().toXMLString(domMap)); 	
			sb.append("</locationService>");		
		}
		if (this.getProcedure() != null)
		{
			sb.append("<procedure>");
			sb.append(this.getProcedure().toXMLString(domMap)); 	
			sb.append("</procedure>");		
		}
		if (this.getActivityContextPricing() != null)
		{
			sb.append("<activityContextPricing>");
			sb.append(this.getActivityContextPricing().toXMLString(domMap)); 	
			sb.append("</activityContextPricing>");		
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
			DischargeSummaryProcedure domainObject = getDischargeSummaryProcedurefromXML(itemEl, factory, domMap);

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
			DischargeSummaryProcedure domainObject = getDischargeSummaryProcedurefromXML(itemEl, factory, domMap);

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
		
	public static DischargeSummaryProcedure getDischargeSummaryProcedurefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDischargeSummaryProcedurefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DischargeSummaryProcedure getDischargeSummaryProcedurefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DischargeSummaryProcedure.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DischargeSummaryProcedure.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DischargeSummaryProcedure class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DischargeSummaryProcedure)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DischargeSummaryProcedure.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DischargeSummaryProcedure ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DischargeSummaryProcedure)factory.getImportedDomainObject(DischargeSummaryProcedure.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DischargeSummaryProcedure();
		}
		String keyClassName = "DischargeSummaryProcedure";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DischargeSummaryProcedure)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DischargeSummaryProcedure obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("procedureContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcedureContext(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("price");
		if(fldEl != null)
		{	
    		obj.setPrice(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("locationService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocationService(ims.core.resource.place.domain.objects.LocationService.getLocationServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedure(ims.core.clinical.domain.objects.Procedure.getProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("activityContextPricing");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActivityContextPricing(ims.core.clinical.domain.objects.ActivityContextPricingDetails.getActivityContextPricingDetailsfromXML(fldEl, factory, domMap)); 
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
		public static final String Status = "status";
		public static final String ProcedureContext = "procedureContext";
		public static final String Price = "price";
		public static final String LocationService = "locationService";
		public static final String Procedure = "procedure";
		public static final String ActivityContextPricing = "activityContextPricing";
	}
}

