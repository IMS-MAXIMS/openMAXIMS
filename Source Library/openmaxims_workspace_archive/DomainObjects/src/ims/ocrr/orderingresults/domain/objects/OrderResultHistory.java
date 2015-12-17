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
package ims.ocrr.orderingresults.domain.objects;

/**
 * History of all OCRR Results
 * @author Barbara Worwood
 * Generated.
 */


public class OrderResultHistory extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100020;
	private static final long serialVersionUID = 1070100020L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Report Date Time */
	private java.util.Date repDateTime;
	/** RepTimeSupplied */
	private Boolean repTimeSupplied;
	/** OrdInvStatus */
	private ims.domain.lookups.LookupInstance ordInvStatus;
	/** Filler Order Number */
	private String fillerOrdNum;
	/** ResultStatus */
	private ims.domain.lookups.LookupInstance resultStatus;
	/** DateTime History Record Created */
	private java.util.Date historyDateTime;
	/** Result Details */
	private ims.ocrr.orderingresults.domain.objects.ResultDetails resultDetail;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OrderResultHistory (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OrderResultHistory ()
    {
    	super();
    }
    public OrderResultHistory (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.OrderResultHistory.class;
	}


	public java.util.Date getRepDateTime() {
		return repDateTime;
	}
	public void setRepDateTime(java.util.Date repDateTime) {
		this.repDateTime = repDateTime;
	}

	public Boolean isRepTimeSupplied() {
		return repTimeSupplied;
	}
	public void setRepTimeSupplied(Boolean repTimeSupplied) {
		this.repTimeSupplied = repTimeSupplied;
	}

	public ims.domain.lookups.LookupInstance getOrdInvStatus() {
		return ordInvStatus;
	}
	public void setOrdInvStatus(ims.domain.lookups.LookupInstance ordInvStatus) {
		this.ordInvStatus = ordInvStatus;
	}

	public String getFillerOrdNum() {
		return fillerOrdNum;
	}
	public void setFillerOrdNum(String fillerOrdNum) {
		if ( null != fillerOrdNum && fillerOrdNum.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for fillerOrdNum. Tried to set value: "+
				fillerOrdNum);
		}
		this.fillerOrdNum = fillerOrdNum;
	}

	public ims.domain.lookups.LookupInstance getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(ims.domain.lookups.LookupInstance resultStatus) {
		this.resultStatus = resultStatus;
	}

	public java.util.Date getHistoryDateTime() {
		return historyDateTime;
	}
	public void setHistoryDateTime(java.util.Date historyDateTime) {
		this.historyDateTime = historyDateTime;
	}

	public ims.ocrr.orderingresults.domain.objects.ResultDetails getResultDetail() {
		return resultDetail;
	}
	public void setResultDetail(ims.ocrr.orderingresults.domain.objects.ResultDetails resultDetail) {
		this.resultDetail = resultDetail;
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
		
		auditStr.append("\r\n*repDateTime* :");
		auditStr.append(repDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*repTimeSupplied* :");
		auditStr.append(repTimeSupplied);
	    auditStr.append("; ");
		auditStr.append("\r\n*ordInvStatus* :");
		if (ordInvStatus != null)
			auditStr.append(ordInvStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*fillerOrdNum* :");
		auditStr.append(fillerOrdNum);
	    auditStr.append("; ");
		auditStr.append("\r\n*resultStatus* :");
		if (resultStatus != null)
			auditStr.append(resultStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*historyDateTime* :");
		auditStr.append(historyDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*resultDetail* :");
		if (resultDetail != null)
		{
			auditStr.append(toShortClassName(resultDetail));
				
		    auditStr.append(resultDetail.getId());
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
		
		String keyClassName = "OrderResultHistory";
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
		if (this.getRepDateTime() != null)
		{
			sb.append("<repDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRepDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</repDateTime>");		
		}
		if (this.isRepTimeSupplied() != null)
		{
			sb.append("<repTimeSupplied>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRepTimeSupplied().toString()));
			sb.append("</repTimeSupplied>");		
		}
		if (this.getOrdInvStatus() != null)
		{
			sb.append("<ordInvStatus>");
			sb.append(this.getOrdInvStatus().toXMLString()); 
			sb.append("</ordInvStatus>");		
		}
		if (this.getFillerOrdNum() != null)
		{
			sb.append("<fillerOrdNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFillerOrdNum().toString()));
			sb.append("</fillerOrdNum>");		
		}
		if (this.getResultStatus() != null)
		{
			sb.append("<resultStatus>");
			sb.append(this.getResultStatus().toXMLString()); 
			sb.append("</resultStatus>");		
		}
		if (this.getHistoryDateTime() != null)
		{
			sb.append("<historyDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getHistoryDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</historyDateTime>");		
		}
		if (this.getResultDetail() != null)
		{
			sb.append("<resultDetail>");
			sb.append(this.getResultDetail().toXMLString(domMap)); 	
			sb.append("</resultDetail>");		
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
			OrderResultHistory domainObject = getOrderResultHistoryfromXML(itemEl, factory, domMap);

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
			OrderResultHistory domainObject = getOrderResultHistoryfromXML(itemEl, factory, domMap);

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
		
	public static OrderResultHistory getOrderResultHistoryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOrderResultHistoryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OrderResultHistory getOrderResultHistoryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OrderResultHistory.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OrderResultHistory.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OrderResultHistory class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OrderResultHistory)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OrderResultHistory.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OrderResultHistory ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OrderResultHistory)factory.getImportedDomainObject(OrderResultHistory.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OrderResultHistory();
		}
		String keyClassName = "OrderResultHistory";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OrderResultHistory)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OrderResultHistory obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("repDateTime");
		if(fldEl != null)
		{	
    		obj.setRepDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("repTimeSupplied");
		if(fldEl != null)
		{	
    		obj.setRepTimeSupplied(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ordInvStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOrdInvStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("fillerOrdNum");
		if(fldEl != null)
		{	
    		obj.setFillerOrdNum(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("resultStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setResultStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("historyDateTime");
		if(fldEl != null)
		{	
    		obj.setHistoryDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("resultDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResultDetail(ims.ocrr.orderingresults.domain.objects.ResultDetails.getResultDetailsfromXML(fldEl, factory, domMap)); 
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
		public static final String RepDateTime = "repDateTime";
		public static final String RepTimeSupplied = "repTimeSupplied";
		public static final String OrdInvStatus = "ordInvStatus";
		public static final String FillerOrdNum = "fillerOrdNum";
		public static final String ResultStatus = "resultStatus";
		public static final String HistoryDateTime = "historyDateTime";
		public static final String ResultDetail = "resultDetail";
	}
}

