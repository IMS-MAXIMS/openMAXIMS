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
package ims.edischarge.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class RTLSummary extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100021;
	private static final long serialVersionUID = 1099100021L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** isMedsRequiredOrNotRequired */
	private Boolean isMedsRequiredOrNotRequired;
	/** wasJACReceived */
	private Boolean wasJACReceived;
	/** wereCoMorbiditiesEntered */
	private Boolean wereCoMorbiditiesEntered;
	/** wereComplicationsEntered */
	private Boolean wereComplicationsEntered;
	/** wasPreviewSignedOff */
	private Boolean wasPreviewSignedOff;
	/** wereDiagnosisDetailsEntered */
	private Boolean wereDiagnosisDetailsEntered;
	/** wasPrintPressed */
	private Boolean wasPrintPressed;
	/** wasRTLCompleted */
	private Boolean wasRTLCompleted;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public RTLSummary (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RTLSummary ()
    {
    	super();
    }
    public RTLSummary (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.RTLSummary.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public Boolean isIsMedsRequiredOrNotRequired() {
		return isMedsRequiredOrNotRequired;
	}
	public void setIsMedsRequiredOrNotRequired(Boolean isMedsRequiredOrNotRequired) {
		this.isMedsRequiredOrNotRequired = isMedsRequiredOrNotRequired;
	}

	public Boolean isWasJACReceived() {
		return wasJACReceived;
	}
	public void setWasJACReceived(Boolean wasJACReceived) {
		this.wasJACReceived = wasJACReceived;
	}

	public Boolean isWereCoMorbiditiesEntered() {
		return wereCoMorbiditiesEntered;
	}
	public void setWereCoMorbiditiesEntered(Boolean wereCoMorbiditiesEntered) {
		this.wereCoMorbiditiesEntered = wereCoMorbiditiesEntered;
	}

	public Boolean isWereComplicationsEntered() {
		return wereComplicationsEntered;
	}
	public void setWereComplicationsEntered(Boolean wereComplicationsEntered) {
		this.wereComplicationsEntered = wereComplicationsEntered;
	}

	public Boolean isWasPreviewSignedOff() {
		return wasPreviewSignedOff;
	}
	public void setWasPreviewSignedOff(Boolean wasPreviewSignedOff) {
		this.wasPreviewSignedOff = wasPreviewSignedOff;
	}

	public Boolean isWereDiagnosisDetailsEntered() {
		return wereDiagnosisDetailsEntered;
	}
	public void setWereDiagnosisDetailsEntered(Boolean wereDiagnosisDetailsEntered) {
		this.wereDiagnosisDetailsEntered = wereDiagnosisDetailsEntered;
	}

	public Boolean isWasPrintPressed() {
		return wasPrintPressed;
	}
	public void setWasPrintPressed(Boolean wasPrintPressed) {
		this.wasPrintPressed = wasPrintPressed;
	}

	public Boolean isWasRTLCompleted() {
		return wasRTLCompleted;
	}
	public void setWasRTLCompleted(Boolean wasRTLCompleted) {
		this.wasRTLCompleted = wasRTLCompleted;
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
		auditStr.append("\r\n*isMedsRequiredOrNotRequired* :");
		auditStr.append(isMedsRequiredOrNotRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasJACReceived* :");
		auditStr.append(wasJACReceived);
	    auditStr.append("; ");
		auditStr.append("\r\n*wereCoMorbiditiesEntered* :");
		auditStr.append(wereCoMorbiditiesEntered);
	    auditStr.append("; ");
		auditStr.append("\r\n*wereComplicationsEntered* :");
		auditStr.append(wereComplicationsEntered);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasPreviewSignedOff* :");
		auditStr.append(wasPreviewSignedOff);
	    auditStr.append("; ");
		auditStr.append("\r\n*wereDiagnosisDetailsEntered* :");
		auditStr.append(wereDiagnosisDetailsEntered);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasPrintPressed* :");
		auditStr.append(wasPrintPressed);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasRTLCompleted* :");
		auditStr.append(wasRTLCompleted);
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
		
		String keyClassName = "RTLSummary";
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
		if (this.isIsMedsRequiredOrNotRequired() != null)
		{
			sb.append("<isMedsRequiredOrNotRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMedsRequiredOrNotRequired().toString()));
			sb.append("</isMedsRequiredOrNotRequired>");		
		}
		if (this.isWasJACReceived() != null)
		{
			sb.append("<wasJACReceived>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasJACReceived().toString()));
			sb.append("</wasJACReceived>");		
		}
		if (this.isWereCoMorbiditiesEntered() != null)
		{
			sb.append("<wereCoMorbiditiesEntered>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWereCoMorbiditiesEntered().toString()));
			sb.append("</wereCoMorbiditiesEntered>");		
		}
		if (this.isWereComplicationsEntered() != null)
		{
			sb.append("<wereComplicationsEntered>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWereComplicationsEntered().toString()));
			sb.append("</wereComplicationsEntered>");		
		}
		if (this.isWasPreviewSignedOff() != null)
		{
			sb.append("<wasPreviewSignedOff>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasPreviewSignedOff().toString()));
			sb.append("</wasPreviewSignedOff>");		
		}
		if (this.isWereDiagnosisDetailsEntered() != null)
		{
			sb.append("<wereDiagnosisDetailsEntered>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWereDiagnosisDetailsEntered().toString()));
			sb.append("</wereDiagnosisDetailsEntered>");		
		}
		if (this.isWasPrintPressed() != null)
		{
			sb.append("<wasPrintPressed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasPrintPressed().toString()));
			sb.append("</wasPrintPressed>");		
		}
		if (this.isWasRTLCompleted() != null)
		{
			sb.append("<wasRTLCompleted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasRTLCompleted().toString()));
			sb.append("</wasRTLCompleted>");		
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
			RTLSummary domainObject = getRTLSummaryfromXML(itemEl, factory, domMap);

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
			RTLSummary domainObject = getRTLSummaryfromXML(itemEl, factory, domMap);

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
		
	public static RTLSummary getRTLSummaryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRTLSummaryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RTLSummary getRTLSummaryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RTLSummary.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RTLSummary.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RTLSummary class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RTLSummary)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RTLSummary.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RTLSummary ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RTLSummary)factory.getImportedDomainObject(RTLSummary.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RTLSummary();
		}
		String keyClassName = "RTLSummary";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RTLSummary)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RTLSummary obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isMedsRequiredOrNotRequired");
		if(fldEl != null)
		{	
    		obj.setIsMedsRequiredOrNotRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasJACReceived");
		if(fldEl != null)
		{	
    		obj.setWasJACReceived(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wereCoMorbiditiesEntered");
		if(fldEl != null)
		{	
    		obj.setWereCoMorbiditiesEntered(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wereComplicationsEntered");
		if(fldEl != null)
		{	
    		obj.setWereComplicationsEntered(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasPreviewSignedOff");
		if(fldEl != null)
		{	
    		obj.setWasPreviewSignedOff(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wereDiagnosisDetailsEntered");
		if(fldEl != null)
		{	
    		obj.setWereDiagnosisDetailsEntered(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasPrintPressed");
		if(fldEl != null)
		{	
    		obj.setWasPrintPressed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasRTLCompleted");
		if(fldEl != null)
		{	
    		obj.setWasRTLCompleted(new Boolean(fldEl.getTextTrim()));	
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
		public static final String CareContext = "careContext";
		public static final String IsMedsRequiredOrNotRequired = "isMedsRequiredOrNotRequired";
		public static final String WasJACReceived = "wasJACReceived";
		public static final String WereCoMorbiditiesEntered = "wereCoMorbiditiesEntered";
		public static final String WereComplicationsEntered = "wereComplicationsEntered";
		public static final String WasPreviewSignedOff = "wasPreviewSignedOff";
		public static final String WereDiagnosisDetailsEntered = "wereDiagnosisDetailsEntered";
		public static final String WasPrintPressed = "wasPrintPressed";
		public static final String WasRTLCompleted = "wasRTLCompleted";
	}
}

