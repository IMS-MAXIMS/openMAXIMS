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
package ims.oncology.configuration.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class TumourGroup extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100009;
	private static final long serialVersionUID = 1074100009L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** GroupName */
	private String groupName;
	/** GroupDescription */
	private String groupDescription;
	/** Sites
	  * Collection of ims.oncology.configuration.domain.objects.TumourSite.
	  */
	private java.util.List sites;
	/** TNMValues
	  * Collection of ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.
	  */
	private java.util.List tNMValues;
	/** Histologies
	  * Collection of ims.oncology.configuration.domain.objects.TumourGroupHistology.
	  */
	private java.util.List histologies;
	/** hasTNM */
	private Boolean hasTNM;
	/** TnmRequiresDiff */
	private Boolean tnmRequiresDiff;
	/** TnmRequiresOver45 */
	private Boolean tnmRequiresOver45;
	/** TnmRequiresHisto */
	private Boolean tnmRequiresHisto;
	/** TnmRequiresSMarkers */
	private Boolean tnmRequiresSMarkers;
	/** hasOtherClassifications */
	private Boolean hasOtherClassifications;
	/** OtherClassifications
	  * Collection of ims.oncology.configuration.domain.objects.TumourGroupClassification.
	  */
	private java.util.Set otherClassifications;
	/** TaxonomyMap
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List taxonomyMap;
	/** isActive */
	private Boolean isActive;
	/** Histopathologic Grades
	  * Collection of ims.oncology.configuration.domain.objects.TumourGroupHistopathologicGrade.
	  */
	private java.util.Set histopathologicGrades;
	/** AssociatedSpecialties
	  * Collection of ims.oncology.configuration.domain.objects.TumourGroupSpecialty.
	  */
	private java.util.Set associatedSpecialties;
	/** SerumMarkers
	  * Collection of ims.oncology.configuration.domain.objects.TumourSerumMarker.
	  */
	private java.util.Set serumMarkers;
	/** Version */
	private ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion tNMVersion;
	/** Assessment */
	private ims.assessment.configuration.domain.objects.UserAssessment assessment;
	/** is Prognostic Grouping relevant for this tumour group */
	private Boolean isPrognosticGroupingRelevant;
	/** Prognostic Grouping Config */
	private ims.oncology.configuration.domain.objects.PrognosticGroupingConfig prognosticGroupingConfig;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TumourGroup (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TumourGroup ()
    {
    	super();
    }
    public TumourGroup (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.configuration.domain.objects.TumourGroup.class;
	}


	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		if ( null != groupName && groupName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for groupName. Tried to set value: "+
				groupName);
		}
		this.groupName = groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}
	public void setGroupDescription(String groupDescription) {
		if ( null != groupDescription && groupDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for groupDescription. Tried to set value: "+
				groupDescription);
		}
		this.groupDescription = groupDescription;
	}

	public java.util.List getSites() {
		if ( null == sites ) {
			sites = new java.util.ArrayList();
		}
		return sites;
	}
	public void setSites(java.util.List paramValue) {
		this.sites = paramValue;
	}

	public java.util.List getTNMValues() {
		if ( null == tNMValues ) {
			tNMValues = new java.util.ArrayList();
		}
		return tNMValues;
	}
	public void setTNMValues(java.util.List paramValue) {
		this.tNMValues = paramValue;
	}

	public java.util.List getHistologies() {
		if ( null == histologies ) {
			histologies = new java.util.ArrayList();
		}
		return histologies;
	}
	public void setHistologies(java.util.List paramValue) {
		this.histologies = paramValue;
	}

	public Boolean isHasTNM() {
		return hasTNM;
	}
	public void setHasTNM(Boolean hasTNM) {
		this.hasTNM = hasTNM;
	}

	public Boolean isTnmRequiresDiff() {
		return tnmRequiresDiff;
	}
	public void setTnmRequiresDiff(Boolean tnmRequiresDiff) {
		this.tnmRequiresDiff = tnmRequiresDiff;
	}

	public Boolean isTnmRequiresOver45() {
		return tnmRequiresOver45;
	}
	public void setTnmRequiresOver45(Boolean tnmRequiresOver45) {
		this.tnmRequiresOver45 = tnmRequiresOver45;
	}

	public Boolean isTnmRequiresHisto() {
		return tnmRequiresHisto;
	}
	public void setTnmRequiresHisto(Boolean tnmRequiresHisto) {
		this.tnmRequiresHisto = tnmRequiresHisto;
	}

	public Boolean isTnmRequiresSMarkers() {
		return tnmRequiresSMarkers;
	}
	public void setTnmRequiresSMarkers(Boolean tnmRequiresSMarkers) {
		this.tnmRequiresSMarkers = tnmRequiresSMarkers;
	}

	public Boolean isHasOtherClassifications() {
		return hasOtherClassifications;
	}
	public void setHasOtherClassifications(Boolean hasOtherClassifications) {
		this.hasOtherClassifications = hasOtherClassifications;
	}

	public java.util.Set getOtherClassifications() {
		if ( null == otherClassifications ) {
			otherClassifications = new java.util.HashSet();
		}
		return otherClassifications;
	}
	public void setOtherClassifications(java.util.Set paramValue) {
		this.otherClassifications = paramValue;
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

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public java.util.Set getHistopathologicGrades() {
		if ( null == histopathologicGrades ) {
			histopathologicGrades = new java.util.HashSet();
		}
		return histopathologicGrades;
	}
	public void setHistopathologicGrades(java.util.Set paramValue) {
		this.histopathologicGrades = paramValue;
	}

	public java.util.Set getAssociatedSpecialties() {
		if ( null == associatedSpecialties ) {
			associatedSpecialties = new java.util.HashSet();
		}
		return associatedSpecialties;
	}
	public void setAssociatedSpecialties(java.util.Set paramValue) {
		this.associatedSpecialties = paramValue;
	}

	public java.util.Set getSerumMarkers() {
		if ( null == serumMarkers ) {
			serumMarkers = new java.util.HashSet();
		}
		return serumMarkers;
	}
	public void setSerumMarkers(java.util.Set paramValue) {
		this.serumMarkers = paramValue;
	}

	public ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion getTNMVersion() {
		return tNMVersion;
	}
	public void setTNMVersion(ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion tNMVersion) {
		this.tNMVersion = tNMVersion;
	}

	public ims.assessment.configuration.domain.objects.UserAssessment getAssessment() {
		return assessment;
	}
	public void setAssessment(ims.assessment.configuration.domain.objects.UserAssessment assessment) {
		this.assessment = assessment;
	}

	public Boolean isIsPrognosticGroupingRelevant() {
		return isPrognosticGroupingRelevant;
	}
	public void setIsPrognosticGroupingRelevant(Boolean isPrognosticGroupingRelevant) {
		this.isPrognosticGroupingRelevant = isPrognosticGroupingRelevant;
	}

	public ims.oncology.configuration.domain.objects.PrognosticGroupingConfig getPrognosticGroupingConfig() {
		return prognosticGroupingConfig;
	}
	public void setPrognosticGroupingConfig(ims.oncology.configuration.domain.objects.PrognosticGroupingConfig prognosticGroupingConfig) {
		this.prognosticGroupingConfig = prognosticGroupingConfig;
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
		
		auditStr.append("\r\n*groupName* :");
		auditStr.append(groupName);
	    auditStr.append("; ");
		auditStr.append("\r\n*groupDescription* :");
		auditStr.append(groupDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*sites* :");
		if (sites != null)
		{
		int i3=0;
		for (i3=0; i3<sites.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.oncology.configuration.domain.objects.TumourSite obj = (ims.oncology.configuration.domain.objects.TumourSite)sites.get(i3);
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
		auditStr.append("\r\n*tNMValues* :");
		if (tNMValues != null)
		{
		int i4=0;
		for (i4=0; i4<tNMValues.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue obj = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)tNMValues.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*histologies* :");
		if (histologies != null)
		{
		int i5=0;
		for (i5=0; i5<histologies.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.oncology.configuration.domain.objects.TumourGroupHistology obj = (ims.oncology.configuration.domain.objects.TumourGroupHistology)histologies.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasTNM* :");
		auditStr.append(hasTNM);
	    auditStr.append("; ");
		auditStr.append("\r\n*tnmRequiresDiff* :");
		auditStr.append(tnmRequiresDiff);
	    auditStr.append("; ");
		auditStr.append("\r\n*tnmRequiresOver45* :");
		auditStr.append(tnmRequiresOver45);
	    auditStr.append("; ");
		auditStr.append("\r\n*tnmRequiresHisto* :");
		auditStr.append(tnmRequiresHisto);
	    auditStr.append("; ");
		auditStr.append("\r\n*tnmRequiresSMarkers* :");
		auditStr.append(tnmRequiresSMarkers);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasOtherClassifications* :");
		auditStr.append(hasOtherClassifications);
	    auditStr.append("; ");
		auditStr.append("\r\n*otherClassifications* :");
		if (otherClassifications != null)
		{
			java.util.Iterator it12 = otherClassifications.iterator();
			int i12=0;
			while (it12.hasNext())
			{
				if (i12 > 0)
					auditStr.append(",");
				ims.oncology.configuration.domain.objects.TumourGroupClassification obj = (ims.oncology.configuration.domain.objects.TumourGroupClassification)it12.next();
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
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*histopathologicGrades* :");
		if (histopathologicGrades != null)
		{
			java.util.Iterator it15 = histopathologicGrades.iterator();
			int i15=0;
			while (it15.hasNext())
			{
				if (i15 > 0)
					auditStr.append(",");
				ims.oncology.configuration.domain.objects.TumourGroupHistopathologicGrade obj = (ims.oncology.configuration.domain.objects.TumourGroupHistopathologicGrade)it15.next();
		if (obj != null)
		{
		   if (i15 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i15++;
		}
		if (i15 > 0)
			auditStr.append("] " + i15);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedSpecialties* :");
		if (associatedSpecialties != null)
		{
			java.util.Iterator it16 = associatedSpecialties.iterator();
			int i16=0;
			while (it16.hasNext())
			{
				if (i16 > 0)
					auditStr.append(",");
				ims.oncology.configuration.domain.objects.TumourGroupSpecialty obj = (ims.oncology.configuration.domain.objects.TumourGroupSpecialty)it16.next();
		if (obj != null)
		{
		   if (i16 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i16++;
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*serumMarkers* :");
		if (serumMarkers != null)
		{
			java.util.Iterator it17 = serumMarkers.iterator();
			int i17=0;
			while (it17.hasNext())
			{
				if (i17 > 0)
					auditStr.append(",");
				ims.oncology.configuration.domain.objects.TumourSerumMarker obj = (ims.oncology.configuration.domain.objects.TumourSerumMarker)it17.next();
		if (obj != null)
		{
		   if (i17 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i17++;
		}
		if (i17 > 0)
			auditStr.append("] " + i17);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tNMVersion* :");
		if (tNMVersion != null)
		{
			auditStr.append(toShortClassName(tNMVersion));
				
		    auditStr.append(tNMVersion.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessment* :");
		if (assessment != null)
		{
			auditStr.append(toShortClassName(assessment));
				
		    auditStr.append(assessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isPrognosticGroupingRelevant* :");
		auditStr.append(isPrognosticGroupingRelevant);
	    auditStr.append("; ");
		auditStr.append("\r\n*prognosticGroupingConfig* :");
		if (prognosticGroupingConfig != null)
		{
			auditStr.append(toShortClassName(prognosticGroupingConfig));
				
		    auditStr.append(prognosticGroupingConfig.getId());
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
		
		String keyClassName = "TumourGroup";
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
		if (this.getGroupName() != null)
		{
			sb.append("<groupName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGroupName().toString()));
			sb.append("</groupName>");		
		}
		if (this.getGroupDescription() != null)
		{
			sb.append("<groupDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGroupDescription().toString()));
			sb.append("</groupDescription>");		
		}
		if (this.getSites() != null)
		{
			if (this.getSites().size() > 0 )
			{
			sb.append("<sites>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSites(), domMap));
			sb.append("</sites>");		
			}
		}
		if (this.getTNMValues() != null)
		{
			if (this.getTNMValues().size() > 0 )
			{
			sb.append("<tNMValues>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTNMValues(), domMap));
			sb.append("</tNMValues>");		
			}
		}
		if (this.getHistologies() != null)
		{
			if (this.getHistologies().size() > 0 )
			{
			sb.append("<histologies>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getHistologies(), domMap));
			sb.append("</histologies>");		
			}
		}
		if (this.isHasTNM() != null)
		{
			sb.append("<hasTNM>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasTNM().toString()));
			sb.append("</hasTNM>");		
		}
		if (this.isTnmRequiresDiff() != null)
		{
			sb.append("<tnmRequiresDiff>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTnmRequiresDiff().toString()));
			sb.append("</tnmRequiresDiff>");		
		}
		if (this.isTnmRequiresOver45() != null)
		{
			sb.append("<tnmRequiresOver45>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTnmRequiresOver45().toString()));
			sb.append("</tnmRequiresOver45>");		
		}
		if (this.isTnmRequiresHisto() != null)
		{
			sb.append("<tnmRequiresHisto>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTnmRequiresHisto().toString()));
			sb.append("</tnmRequiresHisto>");		
		}
		if (this.isTnmRequiresSMarkers() != null)
		{
			sb.append("<tnmRequiresSMarkers>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTnmRequiresSMarkers().toString()));
			sb.append("</tnmRequiresSMarkers>");		
		}
		if (this.isHasOtherClassifications() != null)
		{
			sb.append("<hasOtherClassifications>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasOtherClassifications().toString()));
			sb.append("</hasOtherClassifications>");		
		}
		if (this.getOtherClassifications() != null)
		{
			if (this.getOtherClassifications().size() > 0 )
			{
			sb.append("<otherClassifications>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOtherClassifications(), domMap));
			sb.append("</otherClassifications>");		
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
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getHistopathologicGrades() != null)
		{
			if (this.getHistopathologicGrades().size() > 0 )
			{
			sb.append("<histopathologicGrades>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getHistopathologicGrades(), domMap));
			sb.append("</histopathologicGrades>");		
			}
		}
		if (this.getAssociatedSpecialties() != null)
		{
			if (this.getAssociatedSpecialties().size() > 0 )
			{
			sb.append("<associatedSpecialties>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssociatedSpecialties(), domMap));
			sb.append("</associatedSpecialties>");		
			}
		}
		if (this.getSerumMarkers() != null)
		{
			if (this.getSerumMarkers().size() > 0 )
			{
			sb.append("<serumMarkers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSerumMarkers(), domMap));
			sb.append("</serumMarkers>");		
			}
		}
		if (this.getTNMVersion() != null)
		{
			sb.append("<tNMVersion>");
			sb.append(this.getTNMVersion().toXMLString(domMap)); 	
			sb.append("</tNMVersion>");		
		}
		if (this.getAssessment() != null)
		{
			sb.append("<assessment>");
			sb.append(this.getAssessment().toXMLString(domMap)); 	
			sb.append("</assessment>");		
		}
		if (this.isIsPrognosticGroupingRelevant() != null)
		{
			sb.append("<isPrognosticGroupingRelevant>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPrognosticGroupingRelevant().toString()));
			sb.append("</isPrognosticGroupingRelevant>");		
		}
		if (this.getPrognosticGroupingConfig() != null)
		{
			sb.append("<prognosticGroupingConfig>");
			sb.append(this.getPrognosticGroupingConfig().toXMLString(domMap)); 	
			sb.append("</prognosticGroupingConfig>");		
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
			TumourGroup domainObject = getTumourGroupfromXML(itemEl, factory, domMap);

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
			TumourGroup domainObject = getTumourGroupfromXML(itemEl, factory, domMap);

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
		
	public static TumourGroup getTumourGroupfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTumourGroupfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TumourGroup getTumourGroupfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TumourGroup.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TumourGroup.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TumourGroup class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TumourGroup)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TumourGroup.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TumourGroup ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TumourGroup)factory.getImportedDomainObject(TumourGroup.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TumourGroup();
		}
		String keyClassName = "TumourGroup";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TumourGroup)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TumourGroup obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("groupName");
		if(fldEl != null)
		{	
    		obj.setGroupName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("groupDescription");
		if(fldEl != null)
		{	
    		obj.setGroupDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sites");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSites(ims.oncology.configuration.domain.objects.TumourSite.fromListXMLString(fldEl, factory, obj.getSites(), domMap));
		}
		fldEl = el.element("tNMValues");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTNMValues(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.fromListXMLString(fldEl, factory, obj.getTNMValues(), domMap));
		}
		fldEl = el.element("histologies");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setHistologies(ims.oncology.configuration.domain.objects.TumourGroupHistology.fromListXMLString(fldEl, factory, obj.getHistologies(), domMap));
		}
		fldEl = el.element("hasTNM");
		if(fldEl != null)
		{	
    		obj.setHasTNM(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tnmRequiresDiff");
		if(fldEl != null)
		{	
    		obj.setTnmRequiresDiff(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tnmRequiresOver45");
		if(fldEl != null)
		{	
    		obj.setTnmRequiresOver45(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tnmRequiresHisto");
		if(fldEl != null)
		{	
    		obj.setTnmRequiresHisto(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tnmRequiresSMarkers");
		if(fldEl != null)
		{	
    		obj.setTnmRequiresSMarkers(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasOtherClassifications");
		if(fldEl != null)
		{	
    		obj.setHasOtherClassifications(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("otherClassifications");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setOtherClassifications(ims.oncology.configuration.domain.objects.TumourGroupClassification.fromSetXMLString(fldEl, factory, obj.getOtherClassifications(), domMap));
		}
		fldEl = el.element("taxonomyMap");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTaxonomyMap(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getTaxonomyMap(), domMap));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("histopathologicGrades");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setHistopathologicGrades(ims.oncology.configuration.domain.objects.TumourGroupHistopathologicGrade.fromSetXMLString(fldEl, factory, obj.getHistopathologicGrades(), domMap));
		}
		fldEl = el.element("associatedSpecialties");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAssociatedSpecialties(ims.oncology.configuration.domain.objects.TumourGroupSpecialty.fromSetXMLString(fldEl, factory, obj.getAssociatedSpecialties(), domMap));
		}
		fldEl = el.element("serumMarkers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSerumMarkers(ims.oncology.configuration.domain.objects.TumourSerumMarker.fromSetXMLString(fldEl, factory, obj.getSerumMarkers(), domMap));
		}
		fldEl = el.element("tNMVersion");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTNMVersion(ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion.getTNMStagingClassificationVersionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssessment(ims.assessment.configuration.domain.objects.UserAssessment.getUserAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isPrognosticGroupingRelevant");
		if(fldEl != null)
		{	
    		obj.setIsPrognosticGroupingRelevant(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("prognosticGroupingConfig");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrognosticGroupingConfig(ims.oncology.configuration.domain.objects.PrognosticGroupingConfig.getPrognosticGroupingConfigfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "sites"
		, "tNMValues"
		, "histologies"
		, "otherClassifications"
		, "taxonomyMap"
		, "histopathologicGrades"
		, "associatedSpecialties"
		, "serumMarkers"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String GroupName = "groupName";
		public static final String GroupDescription = "groupDescription";
		public static final String Sites = "sites";
		public static final String TNMValues = "tNMValues";
		public static final String Histologies = "histologies";
		public static final String HasTNM = "hasTNM";
		public static final String TnmRequiresDiff = "tnmRequiresDiff";
		public static final String TnmRequiresOver45 = "tnmRequiresOver45";
		public static final String TnmRequiresHisto = "tnmRequiresHisto";
		public static final String TnmRequiresSMarkers = "tnmRequiresSMarkers";
		public static final String HasOtherClassifications = "hasOtherClassifications";
		public static final String OtherClassifications = "otherClassifications";
		public static final String TaxonomyMap = "taxonomyMap";
		public static final String IsActive = "isActive";
		public static final String HistopathologicGrades = "histopathologicGrades";
		public static final String AssociatedSpecialties = "associatedSpecialties";
		public static final String SerumMarkers = "serumMarkers";
		public static final String TNMVersion = "tNMVersion";
		public static final String Assessment = "assessment";
		public static final String IsPrognosticGroupingRelevant = "isPrognosticGroupingRelevant";
		public static final String PrognosticGroupingConfig = "prognosticGroupingConfig";
	}
}

