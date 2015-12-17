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
package ims.assessment.instantiation.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class PatientGraphicAssessmentFinding extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100051;
	private static final long serialVersionUID = 1003100051L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** GraphicFinding */
	private ims.assessment.configuration.domain.objects.DrawingGraphicFinding graphicFinding;
	/** AreaDrawn */
	private String areaDrawn;
	/** Area selected and configured from the body chart */
	private String areaName;
	/** Area Details */
	private String areaDetails;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** isCopied */
	private Boolean isCopied;
	/** Stage
	  * Collection of ims.assessment.instantiation.domain.objects.PatientGraphicalAssessmentStage.
	  */
	private java.util.Set stage;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientGraphicAssessmentFinding (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientGraphicAssessmentFinding ()
    {
    	super();
    }
    public PatientGraphicAssessmentFinding (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.assessment.instantiation.domain.objects.PatientGraphicAssessmentFinding.class;
	}


	public ims.assessment.configuration.domain.objects.DrawingGraphicFinding getGraphicFinding() {
		return graphicFinding;
	}
	public void setGraphicFinding(ims.assessment.configuration.domain.objects.DrawingGraphicFinding graphicFinding) {
		this.graphicFinding = graphicFinding;
	}

	public String getAreaDrawn() {
		return areaDrawn;
	}
	public void setAreaDrawn(String areaDrawn) {
		this.areaDrawn = areaDrawn;
	}

	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		if ( null != areaName && areaName.length() > 70 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for areaName. Tried to set value: "+
				areaName);
		}
		this.areaName = areaName;
	}

	public String getAreaDetails() {
		return areaDetails;
	}
	public void setAreaDetails(String areaDetails) {
		if ( null != areaDetails && areaDetails.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for areaDetails. Tried to set value: "+
				areaDetails);
		}
		this.areaDetails = areaDetails;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public Boolean isIsCopied() {
		return isCopied;
	}
	public void setIsCopied(Boolean isCopied) {
		this.isCopied = isCopied;
	}

	public java.util.Set getStage() {
		if ( null == stage ) {
			stage = new java.util.HashSet();
		}
		return stage;
	}
	public void setStage(java.util.Set paramValue) {
		this.stage = paramValue;
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
		
		auditStr.append("\r\n*graphicFinding* :");
		if (graphicFinding != null)
		{
			auditStr.append(toShortClassName(graphicFinding));
				
		    auditStr.append(graphicFinding.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*areaDrawn* :");
		auditStr.append(areaDrawn);
	    auditStr.append("; ");
		auditStr.append("\r\n*areaName* :");
		auditStr.append(areaName);
	    auditStr.append("; ");
		auditStr.append("\r\n*areaDetails* :");
		auditStr.append(areaDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isCopied* :");
		auditStr.append(isCopied);
	    auditStr.append("; ");
		auditStr.append("\r\n*stage* :");
		if (stage != null)
		{
			java.util.Iterator it7 = stage.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.assessment.instantiation.domain.objects.PatientGraphicalAssessmentStage obj = (ims.assessment.instantiation.domain.objects.PatientGraphicalAssessmentStage)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
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
		
		String keyClassName = "PatientGraphicAssessmentFinding";
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
		if (this.getGraphicFinding() != null)
		{
			sb.append("<graphicFinding>");
			sb.append(this.getGraphicFinding().toXMLString(domMap)); 	
			sb.append("</graphicFinding>");		
		}
		if (this.getAreaDrawn() != null)
		{
			sb.append("<areaDrawn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAreaDrawn().toString()));
			sb.append("</areaDrawn>");		
		}
		if (this.getAreaName() != null)
		{
			sb.append("<areaName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAreaName().toString()));
			sb.append("</areaName>");		
		}
		if (this.getAreaDetails() != null)
		{
			sb.append("<areaDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAreaDetails().toString()));
			sb.append("</areaDetails>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.isIsCopied() != null)
		{
			sb.append("<isCopied>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCopied().toString()));
			sb.append("</isCopied>");		
		}
		if (this.getStage() != null)
		{
			if (this.getStage().size() > 0 )
			{
			sb.append("<stage>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStage(), domMap));
			sb.append("</stage>");		
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
			PatientGraphicAssessmentFinding domainObject = getPatientGraphicAssessmentFindingfromXML(itemEl, factory, domMap);

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
			PatientGraphicAssessmentFinding domainObject = getPatientGraphicAssessmentFindingfromXML(itemEl, factory, domMap);

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
		
	public static PatientGraphicAssessmentFinding getPatientGraphicAssessmentFindingfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientGraphicAssessmentFindingfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientGraphicAssessmentFinding getPatientGraphicAssessmentFindingfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientGraphicAssessmentFinding.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientGraphicAssessmentFinding.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientGraphicAssessmentFinding class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientGraphicAssessmentFinding)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientGraphicAssessmentFinding.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientGraphicAssessmentFinding ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientGraphicAssessmentFinding)factory.getImportedDomainObject(PatientGraphicAssessmentFinding.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientGraphicAssessmentFinding();
		}
		String keyClassName = "PatientGraphicAssessmentFinding";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientGraphicAssessmentFinding)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientGraphicAssessmentFinding obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("graphicFinding");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGraphicFinding(ims.assessment.configuration.domain.objects.DrawingGraphicFinding.getDrawingGraphicFindingfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("areaDrawn");
		if(fldEl != null)
		{	
    		obj.setAreaDrawn(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("areaName");
		if(fldEl != null)
		{	
    		obj.setAreaName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("areaDetails");
		if(fldEl != null)
		{	
    		obj.setAreaDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isCopied");
		if(fldEl != null)
		{	
    		obj.setIsCopied(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("stage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStage(ims.assessment.instantiation.domain.objects.PatientGraphicalAssessmentStage.fromSetXMLString(fldEl, factory, obj.getStage(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "stage"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String GraphicFinding = "graphicFinding";
		public static final String AreaDrawn = "areaDrawn";
		public static final String AreaName = "areaName";
		public static final String AreaDetails = "areaDetails";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String IsCopied = "isCopied";
		public static final String Stage = "stage";
	}
}

