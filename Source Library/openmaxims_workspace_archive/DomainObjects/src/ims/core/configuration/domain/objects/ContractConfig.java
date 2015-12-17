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
package ims.core.configuration.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ContractConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100047;
	private static final long serialVersionUID = 1096100047L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ContractId */
	private String contractId;
	/** Contract Organisation */
	private ims.core.resource.place.domain.objects.Organisation contractOrganisation;
	/** ContractName */
	private String contractName;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** No of days until RTT Breach */
	private Integer daysToRTTBreachDate;
	/** Number of Days To 1st Outpatient Appointment */
	private Integer daysTo1stAppt;
	/** Contract KPI History
	  * Collection of ims.core.configuration.domain.objects.ContractConfigKPIHistory.
	  */
	private java.util.List contractKPIHistory;
	/** is the contract for Diagnostics */
	private ims.domain.lookups.LookupInstance contractType;
	/** Service Locations
	  * Collection of ims.core.configuration.domain.objects.ContractServiceLocationsConfig.
	  */
	private java.util.List serviceLocations;
	/** CCGsForContract
	  * Collection of ims.core.configuration.domain.objects.CCGToContractConfig.
	  */
	private java.util.List cCGsForContract;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ContractConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ContractConfig ()
    {
    	super();
    }
    public ContractConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.ContractConfig.class;
	}


	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		if ( null != contractId && contractId.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for contractId. Tried to set value: "+
				contractId);
		}
		this.contractId = contractId;
	}

	public ims.core.resource.place.domain.objects.Organisation getContractOrganisation() {
		return contractOrganisation;
	}
	public void setContractOrganisation(ims.core.resource.place.domain.objects.Organisation contractOrganisation) {
		this.contractOrganisation = contractOrganisation;
	}

	public String getContractName() {
		return contractName;
	}
	public void setContractName(String contractName) {
		if ( null != contractName && contractName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for contractName. Tried to set value: "+
				contractName);
		}
		this.contractName = contractName;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public Integer getDaysToRTTBreachDate() {
		return daysToRTTBreachDate;
	}
	public void setDaysToRTTBreachDate(Integer daysToRTTBreachDate) {
		this.daysToRTTBreachDate = daysToRTTBreachDate;
	}

	public Integer getDaysTo1stAppt() {
		return daysTo1stAppt;
	}
	public void setDaysTo1stAppt(Integer daysTo1stAppt) {
		this.daysTo1stAppt = daysTo1stAppt;
	}

	public java.util.List getContractKPIHistory() {
		if ( null == contractKPIHistory ) {
			contractKPIHistory = new java.util.ArrayList();
		}
		return contractKPIHistory;
	}
	public void setContractKPIHistory(java.util.List paramValue) {
		this.contractKPIHistory = paramValue;
	}

	public ims.domain.lookups.LookupInstance getContractType() {
		return contractType;
	}
	public void setContractType(ims.domain.lookups.LookupInstance contractType) {
		this.contractType = contractType;
	}

	public java.util.List getServiceLocations() {
		if ( null == serviceLocations ) {
			serviceLocations = new java.util.ArrayList();
		}
		return serviceLocations;
	}
	public void setServiceLocations(java.util.List paramValue) {
		this.serviceLocations = paramValue;
	}

	public java.util.List getCCGsForContract() {
		if ( null == cCGsForContract ) {
			cCGsForContract = new java.util.ArrayList();
		}
		return cCGsForContract;
	}
	public void setCCGsForContract(java.util.List paramValue) {
		this.cCGsForContract = paramValue;
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
		
		auditStr.append("\r\n*contractId* :");
		auditStr.append(contractId);
	    auditStr.append("; ");
		auditStr.append("\r\n*contractOrganisation* :");
		if (contractOrganisation != null)
		{
			auditStr.append(toShortClassName(contractOrganisation));
				
		    auditStr.append(contractOrganisation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*contractName* :");
		auditStr.append(contractName);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*daysToRTTBreachDate* :");
		auditStr.append(daysToRTTBreachDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*daysTo1stAppt* :");
		auditStr.append(daysTo1stAppt);
	    auditStr.append("; ");
		auditStr.append("\r\n*contractKPIHistory* :");
		if (contractKPIHistory != null)
		{
		int i7=0;
		for (i7=0; i7<contractKPIHistory.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.ContractConfigKPIHistory obj = (ims.core.configuration.domain.objects.ContractConfigKPIHistory)contractKPIHistory.get(i7);
		    if (obj != null)
			{
				if (i7 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*contractType* :");
		if (contractType != null)
			auditStr.append(contractType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*serviceLocations* :");
		if (serviceLocations != null)
		{
		int i9=0;
		for (i9=0; i9<serviceLocations.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.ContractServiceLocationsConfig obj = (ims.core.configuration.domain.objects.ContractServiceLocationsConfig)serviceLocations.get(i9);
		    if (obj != null)
			{
				if (i9 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*cCGsForContract* :");
		if (cCGsForContract != null)
		{
		int i10=0;
		for (i10=0; i10<cCGsForContract.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.CCGToContractConfig obj = (ims.core.configuration.domain.objects.CCGToContractConfig)cCGsForContract.get(i10);
		    if (obj != null)
			{
				if (i10 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
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
		
		String keyClassName = "ContractConfig";
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
		if (this.getContractId() != null)
		{
			sb.append("<contractId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getContractId().toString()));
			sb.append("</contractId>");		
		}
		if (this.getContractOrganisation() != null)
		{
			sb.append("<contractOrganisation>");
			sb.append(this.getContractOrganisation().toXMLString(domMap)); 	
			sb.append("</contractOrganisation>");		
		}
		if (this.getContractName() != null)
		{
			sb.append("<contractName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getContractName().toString()));
			sb.append("</contractName>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getDaysToRTTBreachDate() != null)
		{
			sb.append("<daysToRTTBreachDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDaysToRTTBreachDate().toString()));
			sb.append("</daysToRTTBreachDate>");		
		}
		if (this.getDaysTo1stAppt() != null)
		{
			sb.append("<daysTo1stAppt>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDaysTo1stAppt().toString()));
			sb.append("</daysTo1stAppt>");		
		}
		if (this.getContractKPIHistory() != null)
		{
			if (this.getContractKPIHistory().size() > 0 )
			{
			sb.append("<contractKPIHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getContractKPIHistory(), domMap));
			sb.append("</contractKPIHistory>");		
			}
		}
		if (this.getContractType() != null)
		{
			sb.append("<contractType>");
			sb.append(this.getContractType().toXMLString()); 
			sb.append("</contractType>");		
		}
		if (this.getServiceLocations() != null)
		{
			if (this.getServiceLocations().size() > 0 )
			{
			sb.append("<serviceLocations>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getServiceLocations(), domMap));
			sb.append("</serviceLocations>");		
			}
		}
		if (this.getCCGsForContract() != null)
		{
			if (this.getCCGsForContract().size() > 0 )
			{
			sb.append("<cCGsForContract>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCCGsForContract(), domMap));
			sb.append("</cCGsForContract>");		
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
			ContractConfig domainObject = getContractConfigfromXML(itemEl, factory, domMap);

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
			ContractConfig domainObject = getContractConfigfromXML(itemEl, factory, domMap);

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
		
	public static ContractConfig getContractConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getContractConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ContractConfig getContractConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ContractConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ContractConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ContractConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ContractConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ContractConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ContractConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ContractConfig)factory.getImportedDomainObject(ContractConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ContractConfig();
		}
		String keyClassName = "ContractConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ContractConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ContractConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("contractId");
		if(fldEl != null)
		{	
    		obj.setContractId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contractOrganisation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setContractOrganisation(ims.core.resource.place.domain.objects.Organisation.getOrganisationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("contractName");
		if(fldEl != null)
		{	
    		obj.setContractName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("daysToRTTBreachDate");
		if(fldEl != null)
		{	
    		obj.setDaysToRTTBreachDate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("daysTo1stAppt");
		if(fldEl != null)
		{	
    		obj.setDaysTo1stAppt(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contractKPIHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setContractKPIHistory(ims.core.configuration.domain.objects.ContractConfigKPIHistory.fromListXMLString(fldEl, factory, obj.getContractKPIHistory(), domMap));
		}
		fldEl = el.element("contractType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setContractType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("serviceLocations");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setServiceLocations(ims.core.configuration.domain.objects.ContractServiceLocationsConfig.fromListXMLString(fldEl, factory, obj.getServiceLocations(), domMap));
		}
		fldEl = el.element("cCGsForContract");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCCGsForContract(ims.core.configuration.domain.objects.CCGToContractConfig.fromListXMLString(fldEl, factory, obj.getCCGsForContract(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "contractKPIHistory"
		, "serviceLocations"
		, "cCGsForContract"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ContractId = "contractId";
		public static final String ContractOrganisation = "contractOrganisation";
		public static final String ContractName = "contractName";
		public static final String Status = "status";
		public static final String DaysToRTTBreachDate = "daysToRTTBreachDate";
		public static final String DaysTo1stAppt = "daysTo1stAppt";
		public static final String ContractKPIHistory = "contractKPIHistory";
		public static final String ContractType = "contractType";
		public static final String ServiceLocations = "serviceLocations";
		public static final String CCGsForContract = "cCGsForContract";
	}
}

