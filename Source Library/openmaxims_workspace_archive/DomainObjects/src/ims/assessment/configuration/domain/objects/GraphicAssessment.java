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
package ims.assessment.configuration.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class GraphicAssessment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1028100006;
	private static final long serialVersionUID = 1028100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name */
	private String name;
	/** Images
	  * Collection of ims.core.configuration.domain.objects.DrawingGraphicImage.
	  */
	private java.util.Set images;
	/** FindingsAndQuestions
	  * Collection of ims.assessment.configuration.domain.objects.GraphicAssessmentFinding.
	  */
	private java.util.Set findingsAndQuestions;
	/** ActiveStatus */
	private ims.domain.lookups.LookupInstance activeStatus;
	/** AssociatedQuestions
	  * Collection of ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion.
	  */
	private java.util.Set associatedQuestions;
	/** AssessmentType */
	private ims.domain.lookups.LookupInstance assessmentType;
	/** AssessmentStage
	  * Collection of ims.assessment.configuration.domain.objects.GraphicAssessmentStage.
	  */
	private java.util.List assessmentStage;
	/** HelpUrl */
	private String helpUrl;
	/** Assessment Specialties
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List assessmentSpecialties;
	/** Associated Report For Printing */
	private ims.core.admin.domain.objects.TemplateBo associatedReportForPrinting;
	/** Store Printed Report as a Patient Document */
	private Boolean storePrintedReport;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public GraphicAssessment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public GraphicAssessment ()
    {
    	super();
    }
    public GraphicAssessment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.assessment.configuration.domain.objects.GraphicAssessment.class;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public java.util.Set getImages() {
		if ( null == images ) {
			images = new java.util.HashSet();
		}
		return images;
	}
	public void setImages(java.util.Set paramValue) {
		this.images = paramValue;
	}

	public java.util.Set getFindingsAndQuestions() {
		if ( null == findingsAndQuestions ) {
			findingsAndQuestions = new java.util.HashSet();
		}
		return findingsAndQuestions;
	}
	public void setFindingsAndQuestions(java.util.Set paramValue) {
		this.findingsAndQuestions = paramValue;
	}

	public ims.domain.lookups.LookupInstance getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(ims.domain.lookups.LookupInstance activeStatus) {
		this.activeStatus = activeStatus;
	}

	public java.util.Set getAssociatedQuestions() {
		if ( null == associatedQuestions ) {
			associatedQuestions = new java.util.HashSet();
		}
		return associatedQuestions;
	}
	public void setAssociatedQuestions(java.util.Set paramValue) {
		this.associatedQuestions = paramValue;
	}

	public ims.domain.lookups.LookupInstance getAssessmentType() {
		return assessmentType;
	}
	public void setAssessmentType(ims.domain.lookups.LookupInstance assessmentType) {
		this.assessmentType = assessmentType;
	}

	public java.util.List getAssessmentStage() {
		if ( null == assessmentStage ) {
			assessmentStage = new java.util.ArrayList();
		}
		return assessmentStage;
	}
	public void setAssessmentStage(java.util.List paramValue) {
		this.assessmentStage = paramValue;
	}

	public String getHelpUrl() {
		return helpUrl;
	}
	public void setHelpUrl(String helpUrl) {
		if ( null != helpUrl && helpUrl.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for helpUrl. Tried to set value: "+
				helpUrl);
		}
		this.helpUrl = helpUrl;
	}

	public java.util.List getAssessmentSpecialties() {
		if ( null == assessmentSpecialties ) {
			assessmentSpecialties = new java.util.ArrayList();
		}
		return assessmentSpecialties;
	}
	public void setAssessmentSpecialties(java.util.List paramValue) {
		this.assessmentSpecialties = paramValue;
	}

	public ims.core.admin.domain.objects.TemplateBo getAssociatedReportForPrinting() {
		return associatedReportForPrinting;
	}
	public void setAssociatedReportForPrinting(ims.core.admin.domain.objects.TemplateBo associatedReportForPrinting) {
		this.associatedReportForPrinting = associatedReportForPrinting;
	}

	public Boolean isStorePrintedReport() {
		return storePrintedReport;
	}
	public void setStorePrintedReport(Boolean storePrintedReport) {
		this.storePrintedReport = storePrintedReport;
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*images* :");
		if (images != null)
		{
			java.util.Iterator it2 = images.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.core.configuration.domain.objects.DrawingGraphicImage obj = (ims.core.configuration.domain.objects.DrawingGraphicImage)it2.next();
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
		auditStr.append("\r\n*findingsAndQuestions* :");
		if (findingsAndQuestions != null)
		{
			java.util.Iterator it3 = findingsAndQuestions.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.assessment.configuration.domain.objects.GraphicAssessmentFinding obj = (ims.assessment.configuration.domain.objects.GraphicAssessmentFinding)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*activeStatus* :");
		if (activeStatus != null)
			auditStr.append(activeStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedQuestions* :");
		if (associatedQuestions != null)
		{
			java.util.Iterator it5 = associatedQuestions.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion obj = (ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentType* :");
		if (assessmentType != null)
			auditStr.append(assessmentType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentStage* :");
		if (assessmentStage != null)
		{
		int i7=0;
		for (i7=0; i7<assessmentStage.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.assessment.configuration.domain.objects.GraphicAssessmentStage obj = (ims.assessment.configuration.domain.objects.GraphicAssessmentStage)assessmentStage.get(i7);
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
		auditStr.append("\r\n*helpUrl* :");
		auditStr.append(helpUrl);
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentSpecialties* :");
		if (assessmentSpecialties != null)
		{
			java.util.Iterator it9 = assessmentSpecialties.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it9.next();
			auditStr.append(obj.getText());
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedReportForPrinting* :");
		if (associatedReportForPrinting != null)
		{
			auditStr.append(toShortClassName(associatedReportForPrinting));
				
		    auditStr.append(associatedReportForPrinting.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*storePrintedReport* :");
		auditStr.append(storePrintedReport);
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
		
		String keyClassName = "GraphicAssessment";
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
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getImages() != null)
		{
			if (this.getImages().size() > 0 )
			{
			sb.append("<images>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getImages(), domMap));
			sb.append("</images>");		
			}
		}
		if (this.getFindingsAndQuestions() != null)
		{
			if (this.getFindingsAndQuestions().size() > 0 )
			{
			sb.append("<findingsAndQuestions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFindingsAndQuestions(), domMap));
			sb.append("</findingsAndQuestions>");		
			}
		}
		if (this.getActiveStatus() != null)
		{
			sb.append("<activeStatus>");
			sb.append(this.getActiveStatus().toXMLString()); 
			sb.append("</activeStatus>");		
		}
		if (this.getAssociatedQuestions() != null)
		{
			if (this.getAssociatedQuestions().size() > 0 )
			{
			sb.append("<associatedQuestions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssociatedQuestions(), domMap));
			sb.append("</associatedQuestions>");		
			}
		}
		if (this.getAssessmentType() != null)
		{
			sb.append("<assessmentType>");
			sb.append(this.getAssessmentType().toXMLString()); 
			sb.append("</assessmentType>");		
		}
		if (this.getAssessmentStage() != null)
		{
			if (this.getAssessmentStage().size() > 0 )
			{
			sb.append("<assessmentStage>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssessmentStage(), domMap));
			sb.append("</assessmentStage>");		
			}
		}
		if (this.getHelpUrl() != null)
		{
			sb.append("<helpUrl>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHelpUrl().toString()));
			sb.append("</helpUrl>");		
		}
		if (this.getAssessmentSpecialties() != null)
		{
			if (this.getAssessmentSpecialties().size() > 0 )
			{
			sb.append("<assessmentSpecialties>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getAssessmentSpecialties())); 
			sb.append("</assessmentSpecialties>");		
			}
		}
		if (this.getAssociatedReportForPrinting() != null)
		{
			sb.append("<associatedReportForPrinting>");
			sb.append(this.getAssociatedReportForPrinting().toXMLString(domMap)); 	
			sb.append("</associatedReportForPrinting>");		
		}
		if (this.isStorePrintedReport() != null)
		{
			sb.append("<storePrintedReport>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isStorePrintedReport().toString()));
			sb.append("</storePrintedReport>");		
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
			GraphicAssessment domainObject = getGraphicAssessmentfromXML(itemEl, factory, domMap);

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
			GraphicAssessment domainObject = getGraphicAssessmentfromXML(itemEl, factory, domMap);

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
		
	public static GraphicAssessment getGraphicAssessmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getGraphicAssessmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static GraphicAssessment getGraphicAssessmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!GraphicAssessment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!GraphicAssessment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the GraphicAssessment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (GraphicAssessment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(GraphicAssessment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		GraphicAssessment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (GraphicAssessment)factory.getImportedDomainObject(GraphicAssessment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new GraphicAssessment();
		}
		String keyClassName = "GraphicAssessment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (GraphicAssessment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, GraphicAssessment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("images");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setImages(ims.core.configuration.domain.objects.DrawingGraphicImage.fromSetXMLString(fldEl, factory, obj.getImages(), domMap));
		}
		fldEl = el.element("findingsAndQuestions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setFindingsAndQuestions(ims.assessment.configuration.domain.objects.GraphicAssessmentFinding.fromSetXMLString(fldEl, factory, obj.getFindingsAndQuestions(), domMap));
		}
		fldEl = el.element("activeStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActiveStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("associatedQuestions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAssociatedQuestions(ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion.fromSetXMLString(fldEl, factory, obj.getAssociatedQuestions(), domMap));
		}
		fldEl = el.element("assessmentType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAssessmentType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("assessmentStage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAssessmentStage(ims.assessment.configuration.domain.objects.GraphicAssessmentStage.fromListXMLString(fldEl, factory, obj.getAssessmentStage(), domMap));
		}
		fldEl = el.element("helpUrl");
		if(fldEl != null)
		{	
    		obj.setHelpUrl(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assessmentSpecialties");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAssessmentSpecialties(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getAssessmentSpecialties())); 
		}
		fldEl = el.element("associatedReportForPrinting");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssociatedReportForPrinting(ims.core.admin.domain.objects.TemplateBo.getTemplateBofromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("storePrintedReport");
		if(fldEl != null)
		{	
    		obj.setStorePrintedReport(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "images"
		, "findingsAndQuestions"
		, "associatedQuestions"
		, "assessmentStage"
		, "assessmentSpecialties"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Images = "images";
		public static final String FindingsAndQuestions = "findingsAndQuestions";
		public static final String ActiveStatus = "activeStatus";
		public static final String AssociatedQuestions = "associatedQuestions";
		public static final String AssessmentType = "assessmentType";
		public static final String AssessmentStage = "assessmentStage";
		public static final String HelpUrl = "helpUrl";
		public static final String AssessmentSpecialties = "assessmentSpecialties";
		public static final String AssociatedReportForPrinting = "associatedReportForPrinting";
		public static final String StorePrintedReport = "storePrintedReport";
	}
}

