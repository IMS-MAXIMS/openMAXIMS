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


public class PainAssessmentFindings extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1016100002;
	private static final long serialVersionUID = 1016100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** To indicate the selected image form the body chart */
	private ims.domain.lookups.LookupInstance painHypersensitivity;
	/** Site selected and configured from the body chart */
	private String siteName;
	/** Contains the XML of the drawing image */
	private String siteImage;
	/** Pain - Site Details */
	private String siteDetails;
	/** Pain Type */
	private ims.domain.lookups.LookupInstance type;
	/** Pain Severity */
	private ims.domain.lookups.LookupInstance severity;
	/** Pain Onset */
	private ims.domain.lookups.LookupInstance onset;
	/** Pain Progression */
	private ims.domain.lookups.LookupInstance progression;
	/** Pain Depth */
	private ims.domain.lookups.LookupInstance depth;
	/** Pain Assessment Review
	  * Collection of ims.nursing.assessmenttools.domain.objects.PainAssessmentReview.
	  */
	private java.util.Set painAssessmentReview;
	/** Discontinue Assessment */
	private Boolean isDiscontinuedAssess;
	/** Flag to indicate to user if a finding has been copied from a previous assessment */
	private Boolean isContinuedAssessment;
    public PainAssessmentFindings (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PainAssessmentFindings ()
    {
    	super();
    }
    public PainAssessmentFindings (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessmenttools.domain.objects.PainAssessmentFindings.class;
	}


	public ims.domain.lookups.LookupInstance getPainHypersensitivity() {
		return painHypersensitivity;
	}
	public void setPainHypersensitivity(ims.domain.lookups.LookupInstance painHypersensitivity) {
		this.painHypersensitivity = painHypersensitivity;
	}

	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getSiteImage() {
		return siteImage;
	}
	public void setSiteImage(String siteImage) {
		this.siteImage = siteImage;
	}

	public String getSiteDetails() {
		return siteDetails;
	}
	public void setSiteDetails(String siteDetails) {
		this.siteDetails = siteDetails;
	}

	public ims.domain.lookups.LookupInstance getType() {
		return type;
	}
	public void setType(ims.domain.lookups.LookupInstance type) {
		this.type = type;
	}

	public ims.domain.lookups.LookupInstance getSeverity() {
		return severity;
	}
	public void setSeverity(ims.domain.lookups.LookupInstance severity) {
		this.severity = severity;
	}

	public ims.domain.lookups.LookupInstance getOnset() {
		return onset;
	}
	public void setOnset(ims.domain.lookups.LookupInstance onset) {
		this.onset = onset;
	}

	public ims.domain.lookups.LookupInstance getProgression() {
		return progression;
	}
	public void setProgression(ims.domain.lookups.LookupInstance progression) {
		this.progression = progression;
	}

	public ims.domain.lookups.LookupInstance getDepth() {
		return depth;
	}
	public void setDepth(ims.domain.lookups.LookupInstance depth) {
		this.depth = depth;
	}

	public java.util.Set getPainAssessmentReview() {
		if ( null == painAssessmentReview ) {
			painAssessmentReview = new java.util.HashSet();
		}
		return painAssessmentReview;
	}
	public void setPainAssessmentReview(java.util.Set paramValue) {
		this.painAssessmentReview = paramValue;
	}

	public Boolean isIsDiscontinuedAssess() {
		return isDiscontinuedAssess;
	}
	public void setIsDiscontinuedAssess(Boolean isDiscontinuedAssess) {
		this.isDiscontinuedAssess = isDiscontinuedAssess;
	}

	public Boolean isIsContinuedAssessment() {
		return isContinuedAssessment;
	}
	public void setIsContinuedAssessment(Boolean isContinuedAssessment) {
		this.isContinuedAssessment = isContinuedAssessment;
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
		
		auditStr.append("\r\n*painHypersensitivity* :");
		if (painHypersensitivity != null)
			auditStr.append(painHypersensitivity.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*siteName* :");
		auditStr.append(siteName);
	    auditStr.append("; ");
		auditStr.append("\r\n*siteImage* :");
		auditStr.append(siteImage);
	    auditStr.append("; ");
		auditStr.append("\r\n*siteDetails* :");
		auditStr.append(siteDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*type* :");
		if (type != null)
			auditStr.append(type.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*severity* :");
		if (severity != null)
			auditStr.append(severity.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*onset* :");
		if (onset != null)
			auditStr.append(onset.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*progression* :");
		if (progression != null)
			auditStr.append(progression.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*depth* :");
		if (depth != null)
			auditStr.append(depth.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*painAssessmentReview* :");
		if (painAssessmentReview != null)
		{
			java.util.Iterator it10 = painAssessmentReview.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.nursing.assessmenttools.domain.objects.PainAssessmentReview obj = (ims.nursing.assessmenttools.domain.objects.PainAssessmentReview)it10.next();
		if (obj != null)
		{
		   if (i10 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isDiscontinuedAssess* :");
		auditStr.append(isDiscontinuedAssess);
	    auditStr.append("; ");
		auditStr.append("\r\n*isContinuedAssessment* :");
		auditStr.append(isContinuedAssessment);
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
		
		String keyClassName = "PainAssessmentFindings";
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
		if (this.getPainHypersensitivity() != null)
		{
			sb.append("<painHypersensitivity>");
			sb.append(this.getPainHypersensitivity().toXMLString()); 
			sb.append("</painHypersensitivity>");		
		}
		if (this.getSiteName() != null)
		{
			sb.append("<siteName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSiteName().toString()));
			sb.append("</siteName>");		
		}
		if (this.getSiteImage() != null)
		{
			sb.append("<siteImage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSiteImage().toString()));
			sb.append("</siteImage>");		
		}
		if (this.getSiteDetails() != null)
		{
			sb.append("<siteDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSiteDetails().toString()));
			sb.append("</siteDetails>");		
		}
		if (this.getType() != null)
		{
			sb.append("<type>");
			sb.append(this.getType().toXMLString()); 
			sb.append("</type>");		
		}
		if (this.getSeverity() != null)
		{
			sb.append("<severity>");
			sb.append(this.getSeverity().toXMLString()); 
			sb.append("</severity>");		
		}
		if (this.getOnset() != null)
		{
			sb.append("<onset>");
			sb.append(this.getOnset().toXMLString()); 
			sb.append("</onset>");		
		}
		if (this.getProgression() != null)
		{
			sb.append("<progression>");
			sb.append(this.getProgression().toXMLString()); 
			sb.append("</progression>");		
		}
		if (this.getDepth() != null)
		{
			sb.append("<depth>");
			sb.append(this.getDepth().toXMLString()); 
			sb.append("</depth>");		
		}
		if (this.getPainAssessmentReview() != null)
		{
			if (this.getPainAssessmentReview().size() > 0 )
			{
			sb.append("<painAssessmentReview>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPainAssessmentReview(), domMap));
			sb.append("</painAssessmentReview>");		
			}
		}
		if (this.isIsDiscontinuedAssess() != null)
		{
			sb.append("<isDiscontinuedAssess>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDiscontinuedAssess().toString()));
			sb.append("</isDiscontinuedAssess>");		
		}
		if (this.isIsContinuedAssessment() != null)
		{
			sb.append("<isContinuedAssessment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsContinuedAssessment().toString()));
			sb.append("</isContinuedAssessment>");		
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
			PainAssessmentFindings domainObject = getPainAssessmentFindingsfromXML(itemEl, factory, domMap);

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
			PainAssessmentFindings domainObject = getPainAssessmentFindingsfromXML(itemEl, factory, domMap);

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
		
	public static PainAssessmentFindings getPainAssessmentFindingsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPainAssessmentFindingsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PainAssessmentFindings getPainAssessmentFindingsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PainAssessmentFindings.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PainAssessmentFindings.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PainAssessmentFindings class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PainAssessmentFindings)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PainAssessmentFindings.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PainAssessmentFindings ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PainAssessmentFindings)factory.getImportedDomainObject(PainAssessmentFindings.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PainAssessmentFindings();
		}
		String keyClassName = "PainAssessmentFindings";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PainAssessmentFindings)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PainAssessmentFindings obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("painHypersensitivity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPainHypersensitivity(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("siteName");
		if(fldEl != null)
		{	
    		obj.setSiteName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("siteImage");
		if(fldEl != null)
		{	
    		obj.setSiteImage(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("siteDetails");
		if(fldEl != null)
		{	
    		obj.setSiteDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("type");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("severity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSeverity(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("onset");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOnset(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("progression");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProgression(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("depth");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDepth(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("painAssessmentReview");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPainAssessmentReview(ims.nursing.assessmenttools.domain.objects.PainAssessmentReview.fromSetXMLString(fldEl, factory, obj.getPainAssessmentReview(), domMap));
		}
		fldEl = el.element("isDiscontinuedAssess");
		if(fldEl != null)
		{	
    		obj.setIsDiscontinuedAssess(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isContinuedAssessment");
		if(fldEl != null)
		{	
    		obj.setIsContinuedAssessment(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "painAssessmentReview"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PainHypersensitivity = "painHypersensitivity";
		public static final String SiteName = "siteName";
		public static final String SiteImage = "siteImage";
		public static final String SiteDetails = "siteDetails";
		public static final String Type = "type";
		public static final String Severity = "severity";
		public static final String Onset = "onset";
		public static final String Progression = "progression";
		public static final String Depth = "depth";
		public static final String PainAssessmentReview = "painAssessmentReview";
		public static final String IsDiscontinuedAssess = "isDiscontinuedAssess";
		public static final String IsContinuedAssessment = "isContinuedAssessment";
	}
}

