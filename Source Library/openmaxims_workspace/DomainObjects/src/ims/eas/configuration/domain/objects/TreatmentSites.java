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
package ims.eas.configuration.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class TreatmentSites extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1114100000;
	private static final long serialVersionUID = 1114100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** The Actual Treatment Site lookup this configuration is for */
	private ims.domain.lookups.LookupInstance treatmentSite;
	/** Current Status of this record */
	private ims.domain.lookups.LookupInstance status;
	/** Is Laterality relevant for this TS */
	private Boolean laterality;
	/** A collection of ScanLimit lookup instances used by this TreatmentSite
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List scanLimits;
	/** Default Value for Scan Limit Selection */
	private ims.domain.lookups.LookupInstance defaultScanLimit;
	/** The GraphicAssessment Associated with this Configuration */
	private ims.assessment.configuration.domain.objects.GraphicAssessment assessment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TreatmentSites (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TreatmentSites ()
    {
    	super();
    }
    public TreatmentSites (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.eas.configuration.domain.objects.TreatmentSites.class;
	}


	public ims.domain.lookups.LookupInstance getTreatmentSite() {
		return treatmentSite;
	}
	public void setTreatmentSite(ims.domain.lookups.LookupInstance treatmentSite) {
		this.treatmentSite = treatmentSite;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public Boolean isLaterality() {
		return laterality;
	}
	public void setLaterality(Boolean laterality) {
		this.laterality = laterality;
	}

	public java.util.List getScanLimits() {
		if ( null == scanLimits ) {
			scanLimits = new java.util.ArrayList();
		}
		return scanLimits;
	}
	public void setScanLimits(java.util.List paramValue) {
		this.scanLimits = paramValue;
	}

	public ims.domain.lookups.LookupInstance getDefaultScanLimit() {
		return defaultScanLimit;
	}
	public void setDefaultScanLimit(ims.domain.lookups.LookupInstance defaultScanLimit) {
		this.defaultScanLimit = defaultScanLimit;
	}

	public ims.assessment.configuration.domain.objects.GraphicAssessment getAssessment() {
		return assessment;
	}
	public void setAssessment(ims.assessment.configuration.domain.objects.GraphicAssessment assessment) {
		this.assessment = assessment;
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
		
		auditStr.append("\r\n*treatmentSite* :");
		if (treatmentSite != null)
			auditStr.append(treatmentSite.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*laterality* :");
		auditStr.append(laterality);
	    auditStr.append("; ");
		auditStr.append("\r\n*scanLimits* :");
		if (scanLimits != null)
		{
		int i4=0;
		for (i4=0; i4<scanLimits.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)scanLimits.get(i4);
			auditStr.append(obj.getText());
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*defaultScanLimit* :");
		if (defaultScanLimit != null)
			auditStr.append(defaultScanLimit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*assessment* :");
		if (assessment != null)
		{
			auditStr.append(toShortClassName(assessment));
				
		    auditStr.append(assessment.getId());
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
		
		String keyClassName = "TreatmentSites";
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
		if (this.getTreatmentSite() != null)
		{
			sb.append("<treatmentSite>");
			sb.append(this.getTreatmentSite().toXMLString()); 
			sb.append("</treatmentSite>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.isLaterality() != null)
		{
			sb.append("<laterality>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isLaterality().toString()));
			sb.append("</laterality>");		
		}
		if (this.getScanLimits() != null)
		{
			if (this.getScanLimits().size() > 0 )
			{
			sb.append("<scanLimits>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getScanLimits())); 
			sb.append("</scanLimits>");		
			}
		}
		if (this.getDefaultScanLimit() != null)
		{
			sb.append("<defaultScanLimit>");
			sb.append(this.getDefaultScanLimit().toXMLString()); 
			sb.append("</defaultScanLimit>");		
		}
		if (this.getAssessment() != null)
		{
			sb.append("<assessment>");
			sb.append(this.getAssessment().toXMLString(domMap)); 	
			sb.append("</assessment>");		
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
			TreatmentSites domainObject = getTreatmentSitesfromXML(itemEl, factory, domMap);

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
			TreatmentSites domainObject = getTreatmentSitesfromXML(itemEl, factory, domMap);

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
		
	public static TreatmentSites getTreatmentSitesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTreatmentSitesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TreatmentSites getTreatmentSitesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TreatmentSites.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TreatmentSites.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TreatmentSites class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TreatmentSites)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TreatmentSites.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TreatmentSites ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TreatmentSites)factory.getImportedDomainObject(TreatmentSites.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TreatmentSites();
		}
		String keyClassName = "TreatmentSites";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TreatmentSites)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TreatmentSites obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("treatmentSite");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatmentSite(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("laterality");
		if(fldEl != null)
		{	
    		obj.setLaterality(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("scanLimits");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setScanLimits(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getScanLimits())); 
		}
		fldEl = el.element("defaultScanLimit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDefaultScanLimit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("assessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssessment(ims.assessment.configuration.domain.objects.GraphicAssessment.getGraphicAssessmentfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "scanLimits"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TreatmentSite = "treatmentSite";
		public static final String Status = "status";
		public static final String Laterality = "laterality";
		public static final String ScanLimits = "scanLimits";
		public static final String DefaultScanLimit = "defaultScanLimit";
		public static final String Assessment = "assessment";
	}
}

