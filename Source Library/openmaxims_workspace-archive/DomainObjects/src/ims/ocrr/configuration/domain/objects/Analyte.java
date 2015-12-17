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
package ims.ocrr.configuration.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class Analyte extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1061100009;
	private static final long serialVersionUID = 1061100009L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** analyteExtCode */
	private String analyteExtCode;
	/** analyteExtText */
	private String analyteExtText;
	/** Computer System handling messaging */
	private ims.core.admin.domain.objects.ProviderSystem providerSystem;
	/** Lab location */
	private ims.core.resource.place.domain.objects.LocationService locationService;
	/** Lab Discipline */
	private ims.core.clinical.domain.objects.Service service;
	/** Dataset Type */
	private ims.core.charting.domain.objects.DatasetType datasetType;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Analyte (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Analyte ()
    {
    	super();
    }
    public Analyte (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.configuration.domain.objects.Analyte.class;
	}


	public String getAnalyteExtCode() {
		return analyteExtCode;
	}
	public void setAnalyteExtCode(String analyteExtCode) {
		if ( null != analyteExtCode && analyteExtCode.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for analyteExtCode. Tried to set value: "+
				analyteExtCode);
		}
		this.analyteExtCode = analyteExtCode;
	}

	public String getAnalyteExtText() {
		return analyteExtText;
	}
	public void setAnalyteExtText(String analyteExtText) {
		if ( null != analyteExtText && analyteExtText.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for analyteExtText. Tried to set value: "+
				analyteExtText);
		}
		this.analyteExtText = analyteExtText;
	}

	public ims.core.admin.domain.objects.ProviderSystem getProviderSystem() {
		return providerSystem;
	}
	public void setProviderSystem(ims.core.admin.domain.objects.ProviderSystem providerSystem) {
		this.providerSystem = providerSystem;
	}

	public ims.core.resource.place.domain.objects.LocationService getLocationService() {
		return locationService;
	}
	public void setLocationService(ims.core.resource.place.domain.objects.LocationService locationService) {
		this.locationService = locationService;
	}

	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
	}

	public ims.core.charting.domain.objects.DatasetType getDatasetType() {
		return datasetType;
	}
	public void setDatasetType(ims.core.charting.domain.objects.DatasetType datasetType) {
		this.datasetType = datasetType;
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
		if ( "Configuration".equals("Configuration") )
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
		
		auditStr.append("\r\n*analyteExtCode* :");
		auditStr.append(analyteExtCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*analyteExtText* :");
		auditStr.append(analyteExtText);
	    auditStr.append("; ");
		auditStr.append("\r\n*providerSystem* :");
		if (providerSystem != null)
		{
			auditStr.append(toShortClassName(providerSystem));
				
		    auditStr.append(providerSystem.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*locationService* :");
		if (locationService != null)
		{
			auditStr.append(toShortClassName(locationService));
				
		    auditStr.append(locationService.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*datasetType* :");
		if (datasetType != null)
		{
			auditStr.append(toShortClassName(datasetType));
				
		    auditStr.append(datasetType.getId());
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
		
		String keyClassName = "Analyte";
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
		if (this.getAnalyteExtCode() != null)
		{
			sb.append("<analyteExtCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnalyteExtCode().toString()));
			sb.append("</analyteExtCode>");		
		}
		if (this.getAnalyteExtText() != null)
		{
			sb.append("<analyteExtText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAnalyteExtText().toString()));
			sb.append("</analyteExtText>");		
		}
		if (this.getProviderSystem() != null)
		{
			sb.append("<providerSystem>");
			sb.append(this.getProviderSystem().toXMLString(domMap)); 	
			sb.append("</providerSystem>");		
		}
		if (this.getLocationService() != null)
		{
			sb.append("<locationService>");
			sb.append(this.getLocationService().toXMLString(domMap)); 	
			sb.append("</locationService>");		
		}
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
		}
		if (this.getDatasetType() != null)
		{
			sb.append("<datasetType>");
			sb.append(this.getDatasetType().toXMLString(domMap)); 	
			sb.append("</datasetType>");		
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
			Analyte domainObject = getAnalytefromXML(itemEl, factory, domMap);

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
			Analyte domainObject = getAnalytefromXML(itemEl, factory, domMap);

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
		
	public static Analyte getAnalytefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAnalytefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Analyte getAnalytefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Analyte.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Analyte.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Analyte class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Analyte)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Analyte.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Analyte ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Analyte)factory.getImportedDomainObject(Analyte.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Analyte();
		}
		String keyClassName = "Analyte";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Analyte)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Analyte obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("analyteExtCode");
		if(fldEl != null)
		{	
    		obj.setAnalyteExtCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("analyteExtText");
		if(fldEl != null)
		{	
    		obj.setAnalyteExtText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("providerSystem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProviderSystem(ims.core.admin.domain.objects.ProviderSystem.getProviderSystemfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("locationService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocationService(ims.core.resource.place.domain.objects.LocationService.getLocationServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("datasetType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDatasetType(ims.core.charting.domain.objects.DatasetType.getDatasetTypefromXML(fldEl, factory, domMap)); 
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
		public static final String AnalyteExtCode = "analyteExtCode";
		public static final String AnalyteExtText = "analyteExtText";
		public static final String ProviderSystem = "providerSystem";
		public static final String LocationService = "locationService";
		public static final String Service = "service";
		public static final String DatasetType = "datasetType";
	}
}

