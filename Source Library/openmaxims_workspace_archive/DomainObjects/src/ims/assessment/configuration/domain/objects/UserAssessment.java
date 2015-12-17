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


public class UserAssessment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100043;
	private static final long serialVersionUID = 1003100043L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name */
	private String name;
	/** Description */
	private String description;
	/** QuestionGroups
	  * Collection of ims.assessment.configuration.domain.objects.AssessmentQuestionGroup.
	  */
	private java.util.List questionGroups;
	/** AssessmentType */
	private ims.domain.lookups.LookupInstance assessmentType;
	/** ScoringMethod */
	private ims.domain.lookups.LookupInstance scoringMethod;
	/** ActiveStatus */
	private ims.domain.lookups.LookupInstance activeStatus;
	/** isFlatView */
	private Boolean isFlatView;
	/** Category */
	private ims.domain.lookups.LookupInstance category;
	/** isMultipleGroup */
	private Boolean isMultipleGroup;
	/** GroupQuestionWidth */
	private Integer groupQuestionWidth;
	/** isMultiRole */
	private Boolean isMultiRole;
	/** AssessmentRoles
	  * Collection of ims.assessment.configuration.domain.objects.AssessmentRole.
	  */
	private java.util.Set assessmentRoles;
	/** TaxonomyMap
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List taxonomyMap;
	/** HelpURL */
	private String helpURL;
	/** The Header Text for the assessment */
	private String headerText;
	/** The Footer Text for the assessment */
	private String footerText;
	/** The maximum height the header can take */
	private Integer maxHeaderHeight;
	/** The maximum height the header can take */
	private Integer maxFooterHeight;
	/** The report associated with this assessment */
	private ims.core.admin.domain.objects.TemplateBo associatedReport;
	/** Assessment Specialties
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List assessmentSpecialties;
	/** Can Copy the answers from the Last assessment */
	private Boolean canCopyLast;
	/** Can only Copy Last Assessment From Context specified */
	private ims.domain.lookups.LookupInstance copyLastFromContext;
	/** Store Printed Assessment */
	private Boolean storePrintedAssessment;
	/** Services
	  * Collection of ims.core.clinical.domain.objects.Service.
	  */
	private java.util.List services;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public UserAssessment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public UserAssessment ()
    {
    	super();
    }
    public UserAssessment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.assessment.configuration.domain.objects.UserAssessment.class;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public java.util.List getQuestionGroups() {
		if ( null == questionGroups ) {
			questionGroups = new java.util.ArrayList();
		}
		return questionGroups;
	}
	public void setQuestionGroups(java.util.List paramValue) {
		this.questionGroups = paramValue;
	}

	public ims.domain.lookups.LookupInstance getAssessmentType() {
		return assessmentType;
	}
	public void setAssessmentType(ims.domain.lookups.LookupInstance assessmentType) {
		this.assessmentType = assessmentType;
	}

	public ims.domain.lookups.LookupInstance getScoringMethod() {
		return scoringMethod;
	}
	public void setScoringMethod(ims.domain.lookups.LookupInstance scoringMethod) {
		this.scoringMethod = scoringMethod;
	}

	public ims.domain.lookups.LookupInstance getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(ims.domain.lookups.LookupInstance activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Boolean isIsFlatView() {
		return isFlatView;
	}
	public void setIsFlatView(Boolean isFlatView) {
		this.isFlatView = isFlatView;
	}

	public ims.domain.lookups.LookupInstance getCategory() {
		return category;
	}
	public void setCategory(ims.domain.lookups.LookupInstance category) {
		this.category = category;
	}

	public Boolean isIsMultipleGroup() {
		return isMultipleGroup;
	}
	public void setIsMultipleGroup(Boolean isMultipleGroup) {
		this.isMultipleGroup = isMultipleGroup;
	}

	public Integer getGroupQuestionWidth() {
		return groupQuestionWidth;
	}
	public void setGroupQuestionWidth(Integer groupQuestionWidth) {
		this.groupQuestionWidth = groupQuestionWidth;
	}

	public Boolean isIsMultiRole() {
		return isMultiRole;
	}
	public void setIsMultiRole(Boolean isMultiRole) {
		this.isMultiRole = isMultiRole;
	}

	public java.util.Set getAssessmentRoles() {
		if ( null == assessmentRoles ) {
			assessmentRoles = new java.util.HashSet();
		}
		return assessmentRoles;
	}
	public void setAssessmentRoles(java.util.Set paramValue) {
		this.assessmentRoles = paramValue;
	}

	public java.util.List getTaxonomyMap() {
		if ( null == taxonomyMap ) {
			taxonomyMap = new java.util.ArrayList();
		}
		return taxonomyMap;
	}
	public void setTaxonomyMap(java.util.List paramValue) {
		this.taxonomyMap = paramValue;
	}

	public String getHelpURL() {
		return helpURL;
	}
	public void setHelpURL(String helpURL) {
		if ( null != helpURL && helpURL.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for helpURL. Tried to set value: "+
				helpURL);
		}
		this.helpURL = helpURL;
	}

	public String getHeaderText() {
		return headerText;
	}
	public void setHeaderText(String headerText) {
		this.headerText = headerText;
	}

	public String getFooterText() {
		return footerText;
	}
	public void setFooterText(String footerText) {
		this.footerText = footerText;
	}

	public Integer getMaxHeaderHeight() {
		return maxHeaderHeight;
	}
	public void setMaxHeaderHeight(Integer maxHeaderHeight) {
		this.maxHeaderHeight = maxHeaderHeight;
	}

	public Integer getMaxFooterHeight() {
		return maxFooterHeight;
	}
	public void setMaxFooterHeight(Integer maxFooterHeight) {
		this.maxFooterHeight = maxFooterHeight;
	}

	public ims.core.admin.domain.objects.TemplateBo getAssociatedReport() {
		return associatedReport;
	}
	public void setAssociatedReport(ims.core.admin.domain.objects.TemplateBo associatedReport) {
		this.associatedReport = associatedReport;
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

	public Boolean isCanCopyLast() {
		return canCopyLast;
	}
	public void setCanCopyLast(Boolean canCopyLast) {
		this.canCopyLast = canCopyLast;
	}

	public ims.domain.lookups.LookupInstance getCopyLastFromContext() {
		return copyLastFromContext;
	}
	public void setCopyLastFromContext(ims.domain.lookups.LookupInstance copyLastFromContext) {
		this.copyLastFromContext = copyLastFromContext;
	}

	public Boolean isStorePrintedAssessment() {
		return storePrintedAssessment;
	}
	public void setStorePrintedAssessment(Boolean storePrintedAssessment) {
		this.storePrintedAssessment = storePrintedAssessment;
	}

	public java.util.List getServices() {
		if ( null == services ) {
			services = new java.util.ArrayList();
		}
		return services;
	}
	public void setServices(java.util.List paramValue) {
		this.services = paramValue;
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
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*questionGroups* :");
		if (questionGroups != null)
		{
		int i3=0;
		for (i3=0; i3<questionGroups.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.assessment.configuration.domain.objects.AssessmentQuestionGroup obj = (ims.assessment.configuration.domain.objects.AssessmentQuestionGroup)questionGroups.get(i3);
		    if (obj != null)
			{
				if (i3 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentType* :");
		if (assessmentType != null)
			auditStr.append(assessmentType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*scoringMethod* :");
		if (scoringMethod != null)
			auditStr.append(scoringMethod.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activeStatus* :");
		if (activeStatus != null)
			auditStr.append(activeStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isFlatView* :");
		auditStr.append(isFlatView);
	    auditStr.append("; ");
		auditStr.append("\r\n*category* :");
		if (category != null)
			auditStr.append(category.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isMultipleGroup* :");
		auditStr.append(isMultipleGroup);
	    auditStr.append("; ");
		auditStr.append("\r\n*groupQuestionWidth* :");
		auditStr.append(groupQuestionWidth);
	    auditStr.append("; ");
		auditStr.append("\r\n*isMultiRole* :");
		auditStr.append(isMultiRole);
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentRoles* :");
		if (assessmentRoles != null)
		{
			java.util.Iterator it12 = assessmentRoles.iterator();
			int i12=0;
			while (it12.hasNext())
			{
				if (i12 > 0)
					auditStr.append(",");
				ims.assessment.configuration.domain.objects.AssessmentRole obj = (ims.assessment.configuration.domain.objects.AssessmentRole)it12.next();
		if (obj != null)
		{
		   if (i12 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i12++;
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyMap* :");
		if (taxonomyMap != null)
		{
		int i13=0;
		for (i13=0; i13<taxonomyMap.size(); i13++)
		{
			if (i13 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)taxonomyMap.get(i13);
		    if (obj != null)
			{
				if (i13 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*helpURL* :");
		auditStr.append(helpURL);
	    auditStr.append("; ");
		auditStr.append("\r\n*headerText* :");
		auditStr.append(headerText);
	    auditStr.append("; ");
		auditStr.append("\r\n*footerText* :");
		auditStr.append(footerText);
	    auditStr.append("; ");
		auditStr.append("\r\n*maxHeaderHeight* :");
		auditStr.append(maxHeaderHeight);
	    auditStr.append("; ");
		auditStr.append("\r\n*maxFooterHeight* :");
		auditStr.append(maxFooterHeight);
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedReport* :");
		if (associatedReport != null)
		{
			auditStr.append(toShortClassName(associatedReport));
				
		    auditStr.append(associatedReport.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentSpecialties* :");
		if (assessmentSpecialties != null)
		{
			java.util.Iterator it20 = assessmentSpecialties.iterator();
			int i20=0;
			while (it20.hasNext())
			{
				if (i20 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it20.next();
			auditStr.append(obj.getText());
			i20++;
		}
		if (i20 > 0)
			auditStr.append("] " + i20);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*canCopyLast* :");
		auditStr.append(canCopyLast);
	    auditStr.append("; ");
		auditStr.append("\r\n*copyLastFromContext* :");
		if (copyLastFromContext != null)
			auditStr.append(copyLastFromContext.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*storePrintedAssessment* :");
		auditStr.append(storePrintedAssessment);
	    auditStr.append("; ");
		auditStr.append("\r\n*services* :");
		if (services != null)
		{
		int i24=0;
		for (i24=0; i24<services.size(); i24++)
		{
			if (i24 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.Service obj = (ims.core.clinical.domain.objects.Service)services.get(i24);
		    if (obj != null)
			{
				if (i24 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i24 > 0)
			auditStr.append("] " + i24);
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
		
		String keyClassName = "UserAssessment";
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
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getQuestionGroups() != null)
		{
			if (this.getQuestionGroups().size() > 0 )
			{
			sb.append("<questionGroups>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getQuestionGroups(), domMap));
			sb.append("</questionGroups>");		
			}
		}
		if (this.getAssessmentType() != null)
		{
			sb.append("<assessmentType>");
			sb.append(this.getAssessmentType().toXMLString()); 
			sb.append("</assessmentType>");		
		}
		if (this.getScoringMethod() != null)
		{
			sb.append("<scoringMethod>");
			sb.append(this.getScoringMethod().toXMLString()); 
			sb.append("</scoringMethod>");		
		}
		if (this.getActiveStatus() != null)
		{
			sb.append("<activeStatus>");
			sb.append(this.getActiveStatus().toXMLString()); 
			sb.append("</activeStatus>");		
		}
		if (this.isIsFlatView() != null)
		{
			sb.append("<isFlatView>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsFlatView().toString()));
			sb.append("</isFlatView>");		
		}
		if (this.getCategory() != null)
		{
			sb.append("<category>");
			sb.append(this.getCategory().toXMLString()); 
			sb.append("</category>");		
		}
		if (this.isIsMultipleGroup() != null)
		{
			sb.append("<isMultipleGroup>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMultipleGroup().toString()));
			sb.append("</isMultipleGroup>");		
		}
		if (this.getGroupQuestionWidth() != null)
		{
			sb.append("<groupQuestionWidth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGroupQuestionWidth().toString()));
			sb.append("</groupQuestionWidth>");		
		}
		if (this.isIsMultiRole() != null)
		{
			sb.append("<isMultiRole>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMultiRole().toString()));
			sb.append("</isMultiRole>");		
		}
		if (this.getAssessmentRoles() != null)
		{
			if (this.getAssessmentRoles().size() > 0 )
			{
			sb.append("<assessmentRoles>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssessmentRoles(), domMap));
			sb.append("</assessmentRoles>");		
			}
		}
		if (this.getTaxonomyMap() != null)
		{
			if (this.getTaxonomyMap().size() > 0 )
			{
			sb.append("<taxonomyMap>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTaxonomyMap(), domMap));
			sb.append("</taxonomyMap>");		
			}
		}
		if (this.getHelpURL() != null)
		{
			sb.append("<helpURL>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHelpURL().toString()));
			sb.append("</helpURL>");		
		}
		if (this.getHeaderText() != null)
		{
			sb.append("<headerText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHeaderText().toString()));
			sb.append("</headerText>");		
		}
		if (this.getFooterText() != null)
		{
			sb.append("<footerText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFooterText().toString()));
			sb.append("</footerText>");		
		}
		if (this.getMaxHeaderHeight() != null)
		{
			sb.append("<maxHeaderHeight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaxHeaderHeight().toString()));
			sb.append("</maxHeaderHeight>");		
		}
		if (this.getMaxFooterHeight() != null)
		{
			sb.append("<maxFooterHeight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaxFooterHeight().toString()));
			sb.append("</maxFooterHeight>");		
		}
		if (this.getAssociatedReport() != null)
		{
			sb.append("<associatedReport>");
			sb.append(this.getAssociatedReport().toXMLString(domMap)); 	
			sb.append("</associatedReport>");		
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
		if (this.isCanCopyLast() != null)
		{
			sb.append("<canCopyLast>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCanCopyLast().toString()));
			sb.append("</canCopyLast>");		
		}
		if (this.getCopyLastFromContext() != null)
		{
			sb.append("<copyLastFromContext>");
			sb.append(this.getCopyLastFromContext().toXMLString()); 
			sb.append("</copyLastFromContext>");		
		}
		if (this.isStorePrintedAssessment() != null)
		{
			sb.append("<storePrintedAssessment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isStorePrintedAssessment().toString()));
			sb.append("</storePrintedAssessment>");		
		}
		if (this.getServices() != null)
		{
			if (this.getServices().size() > 0 )
			{
			sb.append("<services>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getServices(), domMap));
			sb.append("</services>");		
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
			UserAssessment domainObject = getUserAssessmentfromXML(itemEl, factory, domMap);

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
			UserAssessment domainObject = getUserAssessmentfromXML(itemEl, factory, domMap);

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
		
	public static UserAssessment getUserAssessmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getUserAssessmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static UserAssessment getUserAssessmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!UserAssessment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!UserAssessment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the UserAssessment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (UserAssessment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(UserAssessment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		UserAssessment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (UserAssessment)factory.getImportedDomainObject(UserAssessment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new UserAssessment();
		}
		String keyClassName = "UserAssessment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (UserAssessment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, UserAssessment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("questionGroups");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setQuestionGroups(ims.assessment.configuration.domain.objects.AssessmentQuestionGroup.fromListXMLString(fldEl, factory, obj.getQuestionGroups(), domMap));
		}
		fldEl = el.element("assessmentType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAssessmentType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("scoringMethod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setScoringMethod(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activeStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActiveStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isFlatView");
		if(fldEl != null)
		{	
    		obj.setIsFlatView(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("category");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isMultipleGroup");
		if(fldEl != null)
		{	
    		obj.setIsMultipleGroup(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("groupQuestionWidth");
		if(fldEl != null)
		{	
    		obj.setGroupQuestionWidth(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isMultiRole");
		if(fldEl != null)
		{	
    		obj.setIsMultiRole(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assessmentRoles");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAssessmentRoles(ims.assessment.configuration.domain.objects.AssessmentRole.fromSetXMLString(fldEl, factory, obj.getAssessmentRoles(), domMap));
		}
		fldEl = el.element("taxonomyMap");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTaxonomyMap(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getTaxonomyMap(), domMap));
		}
		fldEl = el.element("helpURL");
		if(fldEl != null)
		{	
    		obj.setHelpURL(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("headerText");
		if(fldEl != null)
		{	
    		obj.setHeaderText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("footerText");
		if(fldEl != null)
		{	
    		obj.setFooterText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("maxHeaderHeight");
		if(fldEl != null)
		{	
    		obj.setMaxHeaderHeight(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("maxFooterHeight");
		if(fldEl != null)
		{	
    		obj.setMaxFooterHeight(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("associatedReport");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssociatedReport(ims.core.admin.domain.objects.TemplateBo.getTemplateBofromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assessmentSpecialties");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAssessmentSpecialties(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getAssessmentSpecialties())); 
		}
		fldEl = el.element("canCopyLast");
		if(fldEl != null)
		{	
    		obj.setCanCopyLast(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("copyLastFromContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCopyLastFromContext(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("storePrintedAssessment");
		if(fldEl != null)
		{	
    		obj.setStorePrintedAssessment(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("services");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setServices(ims.core.clinical.domain.objects.Service.fromListXMLString(fldEl, factory, obj.getServices(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "questionGroups"
		, "assessmentRoles"
		, "taxonomyMap"
		, "assessmentSpecialties"
		, "services"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String QuestionGroups = "questionGroups";
		public static final String AssessmentType = "assessmentType";
		public static final String ScoringMethod = "scoringMethod";
		public static final String ActiveStatus = "activeStatus";
		public static final String IsFlatView = "isFlatView";
		public static final String Category = "category";
		public static final String IsMultipleGroup = "isMultipleGroup";
		public static final String GroupQuestionWidth = "groupQuestionWidth";
		public static final String IsMultiRole = "isMultiRole";
		public static final String AssessmentRoles = "assessmentRoles";
		public static final String TaxonomyMap = "taxonomyMap";
		public static final String HelpURL = "helpURL";
		public static final String HeaderText = "headerText";
		public static final String FooterText = "footerText";
		public static final String MaxHeaderHeight = "maxHeaderHeight";
		public static final String MaxFooterHeight = "maxFooterHeight";
		public static final String AssociatedReport = "associatedReport";
		public static final String AssessmentSpecialties = "assessmentSpecialties";
		public static final String CanCopyLast = "canCopyLast";
		public static final String CopyLastFromContext = "copyLastFromContext";
		public static final String StorePrintedAssessment = "storePrintedAssessment";
		public static final String Services = "services";
	}
}

