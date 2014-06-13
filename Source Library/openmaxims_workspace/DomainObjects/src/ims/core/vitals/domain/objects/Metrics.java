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
package ims.core.vitals.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class Metrics extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1022100011;
	private static final long serialVersionUID = 1022100011L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Height Value - cms */
	private java.lang.Float heightValue;
	/** Measured = True, Estimated = False */
	private Boolean heightEstimatedMeasured;
	/** Weight Value - kgs */
	private java.lang.Float weightValue;
	/** Measured = True, Estimated = False */
	private Boolean weightEstimatedMeasured;
	/** Calculated field */
	private java.lang.Float bMI;
	/** Calculated field */
	private java.lang.Float surfaceArea;
	/** Neck Size */
	private java.lang.Float neckSize;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Authoring Date/Time/HCP */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Metrics (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Metrics ()
    {
    	super();
    }
    public Metrics (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.vitals.domain.objects.Metrics.class;
	}


	public java.lang.Float getHeightValue() {
		return heightValue;
	}
	public void setHeightValue(java.lang.Float heightValue) {
		this.heightValue = heightValue;
	}

	public Boolean isHeightEstimatedMeasured() {
		return heightEstimatedMeasured;
	}
	public void setHeightEstimatedMeasured(Boolean heightEstimatedMeasured) {
		this.heightEstimatedMeasured = heightEstimatedMeasured;
	}

	public java.lang.Float getWeightValue() {
		return weightValue;
	}
	public void setWeightValue(java.lang.Float weightValue) {
		this.weightValue = weightValue;
	}

	public Boolean isWeightEstimatedMeasured() {
		return weightEstimatedMeasured;
	}
	public void setWeightEstimatedMeasured(Boolean weightEstimatedMeasured) {
		this.weightEstimatedMeasured = weightEstimatedMeasured;
	}

	public java.lang.Float getBMI() {
		return bMI;
	}
	public void setBMI(java.lang.Float bMI) {
		this.bMI = bMI;
	}

	public java.lang.Float getSurfaceArea() {
		return surfaceArea;
	}
	public void setSurfaceArea(java.lang.Float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public java.lang.Float getNeckSize() {
		return neckSize;
	}
	public void setNeckSize(java.lang.Float neckSize) {
		this.neckSize = neckSize;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
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
		
		auditStr.append("\r\n*heightValue* :");
		auditStr.append(heightValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*heightEstimatedMeasured* :");
		auditStr.append(heightEstimatedMeasured);
	    auditStr.append("; ");
		auditStr.append("\r\n*weightValue* :");
		auditStr.append(weightValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*weightEstimatedMeasured* :");
		auditStr.append(weightEstimatedMeasured);
	    auditStr.append("; ");
		auditStr.append("\r\n*bMI* :");
		auditStr.append(bMI);
	    auditStr.append("; ");
		auditStr.append("\r\n*surfaceArea* :");
		auditStr.append(surfaceArea);
	    auditStr.append("; ");
		auditStr.append("\r\n*neckSize* :");
		auditStr.append(neckSize);
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
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
		
		String keyClassName = "Metrics";
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
		if (this.getHeightValue() != null)
		{
			sb.append("<heightValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHeightValue().toString()));
			sb.append("</heightValue>");		
		}
		if (this.isHeightEstimatedMeasured() != null)
		{
			sb.append("<heightEstimatedMeasured>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHeightEstimatedMeasured().toString()));
			sb.append("</heightEstimatedMeasured>");		
		}
		if (this.getWeightValue() != null)
		{
			sb.append("<weightValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWeightValue().toString()));
			sb.append("</weightValue>");		
		}
		if (this.isWeightEstimatedMeasured() != null)
		{
			sb.append("<weightEstimatedMeasured>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWeightEstimatedMeasured().toString()));
			sb.append("</weightEstimatedMeasured>");		
		}
		if (this.getBMI() != null)
		{
			sb.append("<bMI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBMI().toString()));
			sb.append("</bMI>");		
		}
		if (this.getSurfaceArea() != null)
		{
			sb.append("<surfaceArea>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSurfaceArea().toString()));
			sb.append("</surfaceArea>");		
		}
		if (this.getNeckSize() != null)
		{
			sb.append("<neckSize>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNeckSize().toString()));
			sb.append("</neckSize>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
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
			Metrics domainObject = getMetricsfromXML(itemEl, factory, domMap);

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
			Metrics domainObject = getMetricsfromXML(itemEl, factory, domMap);

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
		
	public static Metrics getMetricsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMetricsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Metrics getMetricsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Metrics.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Metrics.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Metrics class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Metrics)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Metrics.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Metrics ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Metrics)factory.getImportedDomainObject(Metrics.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Metrics();
		}
		String keyClassName = "Metrics";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Metrics)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Metrics obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("heightValue");
		if(fldEl != null)
		{	
    		obj.setHeightValue(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("heightEstimatedMeasured");
		if(fldEl != null)
		{	
    		obj.setHeightEstimatedMeasured(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("weightValue");
		if(fldEl != null)
		{	
    		obj.setWeightValue(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("weightEstimatedMeasured");
		if(fldEl != null)
		{	
    		obj.setWeightEstimatedMeasured(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bMI");
		if(fldEl != null)
		{	
    		obj.setBMI(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("surfaceArea");
		if(fldEl != null)
		{	
    		obj.setSurfaceArea(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("neckSize");
		if(fldEl != null)
		{	
    		obj.setNeckSize(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
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
		public static final String HeightValue = "heightValue";
		public static final String HeightEstimatedMeasured = "heightEstimatedMeasured";
		public static final String WeightValue = "weightValue";
		public static final String WeightEstimatedMeasured = "weightEstimatedMeasured";
		public static final String BMI = "bMI";
		public static final String SurfaceArea = "surfaceArea";
		public static final String NeckSize = "neckSize";
		public static final String Patient = "patient";
		public static final String AuthoringInformation = "authoringInformation";
	}
}

