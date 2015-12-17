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
package ims.nursing.assessmenttools.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class MRSAAssessment extends ims.core.clinical.domain.objects.AssessmentTool implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1016100011;
	private static final long serialVersionUID = 1016100011L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Date of Screening */
	private java.util.Date dateScreening;
	/** Sites And Results
	  * Collection of ims.nursing.assessmenttools.domain.objects.MRSASitesResults.
	  */
	private java.util.Set sitesAndResults;
	/** Treatment */
	private ims.nursing.assessmenttools.domain.objects.MRSATreatment treatment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public MRSAAssessment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public MRSAAssessment ()
    {
    	super();
    }
    public MRSAAssessment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessmenttools.domain.objects.MRSAAssessment.class;
	}


	public java.util.Date getDateScreening() {
		return dateScreening;
	}
	public void setDateScreening(java.util.Date dateScreening) {
		this.dateScreening = dateScreening;
	}

	public java.util.Set getSitesAndResults() {
		if ( null == sitesAndResults ) {
			sitesAndResults = new java.util.HashSet();
		}
		return sitesAndResults;
	}
	public void setSitesAndResults(java.util.Set paramValue) {
		this.sitesAndResults = paramValue;
	}

	public ims.nursing.assessmenttools.domain.objects.MRSATreatment getTreatment() {
		return treatment;
	}
	public void setTreatment(ims.nursing.assessmenttools.domain.objects.MRSATreatment treatment) {
		this.treatment = treatment;
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
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*dateScreening* :");
		auditStr.append(dateScreening);
	    auditStr.append("; ");
		auditStr.append("\r\n*sitesAndResults* :");
		if (sitesAndResults != null)
		{
			java.util.Iterator it2 = sitesAndResults.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.nursing.assessmenttools.domain.objects.MRSASitesResults obj = (ims.nursing.assessmenttools.domain.objects.MRSASitesResults)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatment* :");
		if (treatment != null)
		{
			auditStr.append(toShortClassName(treatment));
				
		    auditStr.append(treatment.getId());
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
		
		String keyClassName = "MRSAAssessment";
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
		sb.append(super.fieldsToXMLString(domMap));
		if (this.getDateScreening() != null)
		{
			sb.append("<dateScreening>");
			sb.append(new ims.framework.utils.DateTime(this.getDateScreening()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateScreening>");		
		}
		if (this.getSitesAndResults() != null)
		{
			if (this.getSitesAndResults().size() > 0 )
			{
			sb.append("<sitesAndResults>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSitesAndResults(), domMap));
			sb.append("</sitesAndResults>");		
			}
		}
		if (this.getTreatment() != null)
		{
			sb.append("<treatment>");
			sb.append(this.getTreatment().toXMLString(domMap)); 	
			sb.append("</treatment>");		
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
			MRSAAssessment domainObject = getMRSAAssessmentfromXML(itemEl, factory, domMap);

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
			MRSAAssessment domainObject = getMRSAAssessmentfromXML(itemEl, factory, domMap);

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
		
	public static MRSAAssessment getMRSAAssessmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMRSAAssessmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MRSAAssessment getMRSAAssessmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MRSAAssessment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MRSAAssessment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MRSAAssessment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MRSAAssessment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MRSAAssessment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MRSAAssessment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (MRSAAssessment)factory.getImportedDomainObject(MRSAAssessment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new MRSAAssessment();
		}
		String keyClassName = "MRSAAssessment";
		Class clz = ret.getClass().getSuperclass();
		while (!clz.equals(ims.domain.DomainObject.class))
		{
			int dotIndex = clz.getName().lastIndexOf(".") + 1;
			keyClassName = clz.getName().substring(dotIndex); 
			clz = clz.getSuperclass();
		}

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (MRSAAssessment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MRSAAssessment obj, java.util.HashMap domMap) throws Exception
	{
		ims.core.clinical.domain.objects.AssessmentTool.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("dateScreening");
		if(fldEl != null)
		{	
    		obj.setDateScreening(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("sitesAndResults");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSitesAndResults(ims.nursing.assessmenttools.domain.objects.MRSASitesResults.fromSetXMLString(fldEl, factory, obj.getSitesAndResults(), domMap));
		}
		fldEl = el.element("treatment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatment(ims.nursing.assessmenttools.domain.objects.MRSATreatment.getMRSATreatmentfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "sitesAndResults"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String DateScreening = "dateScreening";
		public static final String SitesAndResults = "sitesAndResults";
		public static final String Treatment = "treatment";
	}
}

