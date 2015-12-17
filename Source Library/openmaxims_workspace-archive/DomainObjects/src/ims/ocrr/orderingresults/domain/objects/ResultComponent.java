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
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class ResultComponent extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100008;
	private static final long serialVersionUID = 1070100008L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Analyte */
	private ims.ocrr.configuration.domain.objects.Analyte analyte;
	/** Result Value Type */
	private ims.domain.lookups.LookupInstance resValType;
	/** Formatted Text */
	private String formattedText;
	/** Result Value */
	private String resultVal;
	/** Unit Of Measure */
	private ims.domain.lookups.LookupInstance unitOfMeasure;
	/** RefRange */
	private String refRange;
	/** NormalcyStatus */
	private ims.domain.lookups.LookupInstance normalcyStatus;
	/** isAbnormal Flag */
	private Boolean isAbnormal;
	/** ObsDateTime */
	private java.util.Date obsDateTime;
	/** ObsTimeSupplied */
	private Boolean obsTimeSupplied;
	/** Result Component Status */
	private ims.domain.lookups.LookupInstance resultStatus;
	/** Result Component Comments
	  * Collection of ims.ocrr.orderingresults.domain.objects.ResultComment.
	  */
	private java.util.List resultComponentComments;
	/** DisplayFlag */
	private ims.domain.lookups.LookupInstance displayFlag;
	/** If the ResValType is ED (or RP) then we can used this to determine the format */
	private ims.domain.lookups.LookupInstance eDSubType;
	/** Source Code */
	private ims.domain.lookups.LookupInstance specimenSource;
	/** Result Specimen Source */
	private ims.domain.lookups.LookupInstance resultSpecimenType;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ResultComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ResultComponent ()
    {
    	super();
    }
    public ResultComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.ResultComponent.class;
	}


	public ims.ocrr.configuration.domain.objects.Analyte getAnalyte() {
		return analyte;
	}
	public void setAnalyte(ims.ocrr.configuration.domain.objects.Analyte analyte) {
		this.analyte = analyte;
	}

	public ims.domain.lookups.LookupInstance getResValType() {
		return resValType;
	}
	public void setResValType(ims.domain.lookups.LookupInstance resValType) {
		this.resValType = resValType;
	}

	public String getFormattedText() {
		return formattedText;
	}
	public void setFormattedText(String formattedText) {
		this.formattedText = formattedText;
	}

	public String getResultVal() {
		return resultVal;
	}
	public void setResultVal(String resultVal) {
		if ( null != resultVal && resultVal.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for resultVal. Tried to set value: "+
				resultVal);
		}
		this.resultVal = resultVal;
	}

	public ims.domain.lookups.LookupInstance getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(ims.domain.lookups.LookupInstance unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public String getRefRange() {
		return refRange;
	}
	public void setRefRange(String refRange) {
		if ( null != refRange && refRange.length() > 60 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for refRange. Tried to set value: "+
				refRange);
		}
		this.refRange = refRange;
	}

	public ims.domain.lookups.LookupInstance getNormalcyStatus() {
		return normalcyStatus;
	}
	public void setNormalcyStatus(ims.domain.lookups.LookupInstance normalcyStatus) {
		this.normalcyStatus = normalcyStatus;
	}

	public Boolean isIsAbnormal() {
		return isAbnormal;
	}
	public void setIsAbnormal(Boolean isAbnormal) {
		this.isAbnormal = isAbnormal;
	}

	public java.util.Date getObsDateTime() {
		return obsDateTime;
	}
	public void setObsDateTime(java.util.Date obsDateTime) {
		this.obsDateTime = obsDateTime;
	}

	public Boolean isObsTimeSupplied() {
		return obsTimeSupplied;
	}
	public void setObsTimeSupplied(Boolean obsTimeSupplied) {
		this.obsTimeSupplied = obsTimeSupplied;
	}

	public ims.domain.lookups.LookupInstance getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(ims.domain.lookups.LookupInstance resultStatus) {
		this.resultStatus = resultStatus;
	}

	public java.util.List getResultComponentComments() {
		if ( null == resultComponentComments ) {
			resultComponentComments = new java.util.ArrayList();
		}
		return resultComponentComments;
	}
	public void setResultComponentComments(java.util.List paramValue) {
		this.resultComponentComments = paramValue;
	}

	public ims.domain.lookups.LookupInstance getDisplayFlag() {
		return displayFlag;
	}
	public void setDisplayFlag(ims.domain.lookups.LookupInstance displayFlag) {
		this.displayFlag = displayFlag;
	}

	public ims.domain.lookups.LookupInstance getEDSubType() {
		return eDSubType;
	}
	public void setEDSubType(ims.domain.lookups.LookupInstance eDSubType) {
		this.eDSubType = eDSubType;
	}

	public ims.domain.lookups.LookupInstance getSpecimenSource() {
		return specimenSource;
	}
	public void setSpecimenSource(ims.domain.lookups.LookupInstance specimenSource) {
		this.specimenSource = specimenSource;
	}

	public ims.domain.lookups.LookupInstance getResultSpecimenType() {
		return resultSpecimenType;
	}
	public void setResultSpecimenType(ims.domain.lookups.LookupInstance resultSpecimenType) {
		this.resultSpecimenType = resultSpecimenType;
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
		
		auditStr.append("\r\n*analyte* :");
		if (analyte != null)
		{
			auditStr.append(toShortClassName(analyte));
				
		    auditStr.append(analyte.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*resValType* :");
		if (resValType != null)
			auditStr.append(resValType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*formattedText* :");
		auditStr.append(formattedText);
	    auditStr.append("; ");
		auditStr.append("\r\n*resultVal* :");
		auditStr.append(resultVal);
	    auditStr.append("; ");
		auditStr.append("\r\n*unitOfMeasure* :");
		if (unitOfMeasure != null)
			auditStr.append(unitOfMeasure.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*refRange* :");
		auditStr.append(refRange);
	    auditStr.append("; ");
		auditStr.append("\r\n*normalcyStatus* :");
		if (normalcyStatus != null)
			auditStr.append(normalcyStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isAbnormal* :");
		auditStr.append(isAbnormal);
	    auditStr.append("; ");
		auditStr.append("\r\n*obsDateTime* :");
		auditStr.append(obsDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*obsTimeSupplied* :");
		auditStr.append(obsTimeSupplied);
	    auditStr.append("; ");
		auditStr.append("\r\n*resultStatus* :");
		if (resultStatus != null)
			auditStr.append(resultStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*resultComponentComments* :");
		if (resultComponentComments != null)
		{
		int i12=0;
		for (i12=0; i12<resultComponentComments.size(); i12++)
		{
			if (i12 > 0)
				auditStr.append(",");
			ims.ocrr.orderingresults.domain.objects.ResultComment obj = (ims.ocrr.orderingresults.domain.objects.ResultComment)resultComponentComments.get(i12);
		    if (obj != null)
			{
				if (i12 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*displayFlag* :");
		if (displayFlag != null)
			auditStr.append(displayFlag.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*eDSubType* :");
		if (eDSubType != null)
			auditStr.append(eDSubType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specimenSource* :");
		if (specimenSource != null)
			auditStr.append(specimenSource.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*resultSpecimenType* :");
		if (resultSpecimenType != null)
			auditStr.append(resultSpecimenType.getText());
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
		
		String keyClassName = "ResultComponent";
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
		if (this.getAnalyte() != null)
		{
			sb.append("<analyte>");
			sb.append(this.getAnalyte().toXMLString(domMap)); 	
			sb.append("</analyte>");		
		}
		if (this.getResValType() != null)
		{
			sb.append("<resValType>");
			sb.append(this.getResValType().toXMLString()); 
			sb.append("</resValType>");		
		}
		if (this.getFormattedText() != null)
		{
			sb.append("<formattedText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFormattedText().toString()));
			sb.append("</formattedText>");		
		}
		if (this.getResultVal() != null)
		{
			sb.append("<resultVal>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getResultVal().toString()));
			sb.append("</resultVal>");		
		}
		if (this.getUnitOfMeasure() != null)
		{
			sb.append("<unitOfMeasure>");
			sb.append(this.getUnitOfMeasure().toXMLString()); 
			sb.append("</unitOfMeasure>");		
		}
		if (this.getRefRange() != null)
		{
			sb.append("<refRange>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRefRange().toString()));
			sb.append("</refRange>");		
		}
		if (this.getNormalcyStatus() != null)
		{
			sb.append("<normalcyStatus>");
			sb.append(this.getNormalcyStatus().toXMLString()); 
			sb.append("</normalcyStatus>");		
		}
		if (this.isIsAbnormal() != null)
		{
			sb.append("<isAbnormal>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsAbnormal().toString()));
			sb.append("</isAbnormal>");		
		}
		if (this.getObsDateTime() != null)
		{
			sb.append("<obsDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getObsDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</obsDateTime>");		
		}
		if (this.isObsTimeSupplied() != null)
		{
			sb.append("<obsTimeSupplied>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isObsTimeSupplied().toString()));
			sb.append("</obsTimeSupplied>");		
		}
		if (this.getResultStatus() != null)
		{
			sb.append("<resultStatus>");
			sb.append(this.getResultStatus().toXMLString()); 
			sb.append("</resultStatus>");		
		}
		if (this.getResultComponentComments() != null)
		{
			if (this.getResultComponentComments().size() > 0 )
			{
			sb.append("<resultComponentComments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getResultComponentComments(), domMap));
			sb.append("</resultComponentComments>");		
			}
		}
		if (this.getDisplayFlag() != null)
		{
			sb.append("<displayFlag>");
			sb.append(this.getDisplayFlag().toXMLString()); 
			sb.append("</displayFlag>");		
		}
		if (this.getEDSubType() != null)
		{
			sb.append("<eDSubType>");
			sb.append(this.getEDSubType().toXMLString()); 
			sb.append("</eDSubType>");		
		}
		if (this.getSpecimenSource() != null)
		{
			sb.append("<specimenSource>");
			sb.append(this.getSpecimenSource().toXMLString()); 
			sb.append("</specimenSource>");		
		}
		if (this.getResultSpecimenType() != null)
		{
			sb.append("<resultSpecimenType>");
			sb.append(this.getResultSpecimenType().toXMLString()); 	
			sb.append(this.getResultSpecimenType().toXMLString()); 
			sb.append("</resultSpecimenType>");		
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
			ResultComponent domainObject = getResultComponentfromXML(itemEl, factory, domMap);

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
			ResultComponent domainObject = getResultComponentfromXML(itemEl, factory, domMap);

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
		
	public static ResultComponent getResultComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getResultComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ResultComponent getResultComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ResultComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ResultComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ResultComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ResultComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ResultComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ResultComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ResultComponent)factory.getImportedDomainObject(ResultComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ResultComponent();
		}
		String keyClassName = "ResultComponent";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ResultComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ResultComponent obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("analyte");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAnalyte(ims.ocrr.configuration.domain.objects.Analyte.getAnalytefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("resValType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setResValType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("formattedText");
		if(fldEl != null)
		{	
    		obj.setFormattedText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("resultVal");
		if(fldEl != null)
		{	
    		obj.setResultVal(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("unitOfMeasure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUnitOfMeasure(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("refRange");
		if(fldEl != null)
		{	
    		obj.setRefRange(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("normalcyStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNormalcyStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isAbnormal");
		if(fldEl != null)
		{	
    		obj.setIsAbnormal(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("obsDateTime");
		if(fldEl != null)
		{	
    		obj.setObsDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("obsTimeSupplied");
		if(fldEl != null)
		{	
    		obj.setObsTimeSupplied(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("resultStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setResultStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("resultComponentComments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setResultComponentComments(ims.ocrr.orderingresults.domain.objects.ResultComment.fromListXMLString(fldEl, factory, obj.getResultComponentComments(), domMap));
		}
		fldEl = el.element("displayFlag");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDisplayFlag(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("eDSubType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEDSubType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specimenSource");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecimenSource(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("resultSpecimenType");
		if(fldEl != null)
		{	
    		obj.setResultSpecimenType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "resultComponentComments"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Analyte = "analyte";
		public static final String ResValType = "resValType";
		public static final String FormattedText = "formattedText";
		public static final String ResultVal = "resultVal";
		public static final String UnitOfMeasure = "unitOfMeasure";
		public static final String RefRange = "refRange";
		public static final String NormalcyStatus = "normalcyStatus";
		public static final String IsAbnormal = "isAbnormal";
		public static final String ObsDateTime = "obsDateTime";
		public static final String ObsTimeSupplied = "obsTimeSupplied";
		public static final String ResultStatus = "resultStatus";
		public static final String ResultComponentComments = "resultComponentComments";
		public static final String DisplayFlag = "displayFlag";
		public static final String EDSubType = "eDSubType";
		public static final String SpecimenSource = "specimenSource";
		public static final String ResultSpecimenType = "resultSpecimenType";
	}
}

