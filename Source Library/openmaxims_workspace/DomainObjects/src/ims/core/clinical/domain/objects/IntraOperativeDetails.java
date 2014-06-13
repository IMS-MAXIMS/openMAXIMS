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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class IntraOperativeDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100082;
	private static final long serialVersionUID = 1072100082L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Skin Preparation used:
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List skinPreparationUsed;
	/** Other Skin Preparation used: */
	private String otherSkinPreparationUsed;
	/** Dressing
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List dressing;
	/** MlsOfWaterIballoon */
	private Integer mlsOfWaterIballoon;
	/** National Joint Registry Completed */
	private ims.domain.lookups.LookupInstance nationalJointRegistryCompleted;
	/** National Joint Registry Completed By */
	private ims.core.resource.people.domain.objects.Nurse nationalJointRegistryCompletedBy;
	/** Diathermy Plate Detail */
	private ims.core.clinical.domain.objects.DiathermyPlateDetail diathermyPlateDetail;
	/** Diathermy Plate Detail for second site */
	private ims.core.clinical.domain.objects.DiathermyPlateDetail diathermyPlateDetailSiteTwo;
	/** Limb Care */
	private ims.core.clinical.domain.objects.LimbCare limbCare;
	/** Drains */
	private ims.core.clinical.domain.objects.Drains drains;
	/** Skin Closure
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List skinClosure;
	/** Local Anasthetic Used
	  * Collection of ims.core.clinical.domain.objects.LocalAnaestheticAdministered.
	  */
	private java.util.List localAnastheticUsed;
	/** PatientPosition */
	private ims.domain.lookups.LookupInstance patientPosition;
	/** TourniquetDetail */
	private ims.core.clinical.domain.objects.TourniquetDetail tourniquetDetail;
	/** Specimen Type */
	private String specimenType;
	/** Histopathology */
	private Boolean histopathology;
	/** Microbiology */
	private Boolean microbiology;
	/** Haematology */
	private Boolean haematology;
	/** Cytology */
	private Boolean cytology;
	/** Catheter Detail */
	private ims.core.clinical.domain.objects.CatheterDetail catheterDetail;
	/** Swab Count */
	private ims.domain.lookups.LookupInstance swabCount;
	/** Needle Count */
	private ims.domain.lookups.LookupInstance needleCount;
	/** Instrument Count */
	private ims.domain.lookups.LookupInstance instrumentCount;
	/** Scrub Nurse */
	private ims.core.resource.people.domain.objects.Nurse scrubNurse;
	/** Circulating Nurse */
	private ims.core.resource.people.domain.objects.Nurse circulatingNurse;
	/** Count Comments */
	private String countComments;
	/** Table Devices
	  * Collection of ims.core.clinical.domain.objects.TableDevice.
	  */
	private java.util.List tableDevices;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public IntraOperativeDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public IntraOperativeDetails ()
    {
    	super();
    }
    public IntraOperativeDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.IntraOperativeDetails.class;
	}


	public java.util.List getSkinPreparationUsed() {
		if ( null == skinPreparationUsed ) {
			skinPreparationUsed = new java.util.ArrayList();
		}
		return skinPreparationUsed;
	}
	public void setSkinPreparationUsed(java.util.List paramValue) {
		this.skinPreparationUsed = paramValue;
	}

	public String getOtherSkinPreparationUsed() {
		return otherSkinPreparationUsed;
	}
	public void setOtherSkinPreparationUsed(String otherSkinPreparationUsed) {
		if ( null != otherSkinPreparationUsed && otherSkinPreparationUsed.length() > 125 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherSkinPreparationUsed. Tried to set value: "+
				otherSkinPreparationUsed);
		}
		this.otherSkinPreparationUsed = otherSkinPreparationUsed;
	}

	public java.util.List getDressing() {
		if ( null == dressing ) {
			dressing = new java.util.ArrayList();
		}
		return dressing;
	}
	public void setDressing(java.util.List paramValue) {
		this.dressing = paramValue;
	}

	public Integer getMlsOfWaterIballoon() {
		return mlsOfWaterIballoon;
	}
	public void setMlsOfWaterIballoon(Integer mlsOfWaterIballoon) {
		this.mlsOfWaterIballoon = mlsOfWaterIballoon;
	}

	public ims.domain.lookups.LookupInstance getNationalJointRegistryCompleted() {
		return nationalJointRegistryCompleted;
	}
	public void setNationalJointRegistryCompleted(ims.domain.lookups.LookupInstance nationalJointRegistryCompleted) {
		this.nationalJointRegistryCompleted = nationalJointRegistryCompleted;
	}

	public ims.core.resource.people.domain.objects.Nurse getNationalJointRegistryCompletedBy() {
		return nationalJointRegistryCompletedBy;
	}
	public void setNationalJointRegistryCompletedBy(ims.core.resource.people.domain.objects.Nurse nationalJointRegistryCompletedBy) {
		this.nationalJointRegistryCompletedBy = nationalJointRegistryCompletedBy;
	}

	public ims.core.clinical.domain.objects.DiathermyPlateDetail getDiathermyPlateDetail() {
		return diathermyPlateDetail;
	}
	public void setDiathermyPlateDetail(ims.core.clinical.domain.objects.DiathermyPlateDetail diathermyPlateDetail) {
		this.diathermyPlateDetail = diathermyPlateDetail;
	}

	public ims.core.clinical.domain.objects.DiathermyPlateDetail getDiathermyPlateDetailSiteTwo() {
		return diathermyPlateDetailSiteTwo;
	}
	public void setDiathermyPlateDetailSiteTwo(ims.core.clinical.domain.objects.DiathermyPlateDetail diathermyPlateDetailSiteTwo) {
		this.diathermyPlateDetailSiteTwo = diathermyPlateDetailSiteTwo;
	}

	public ims.core.clinical.domain.objects.LimbCare getLimbCare() {
		return limbCare;
	}
	public void setLimbCare(ims.core.clinical.domain.objects.LimbCare limbCare) {
		this.limbCare = limbCare;
	}

	public ims.core.clinical.domain.objects.Drains getDrains() {
		return drains;
	}
	public void setDrains(ims.core.clinical.domain.objects.Drains drains) {
		this.drains = drains;
	}

	public java.util.List getSkinClosure() {
		if ( null == skinClosure ) {
			skinClosure = new java.util.ArrayList();
		}
		return skinClosure;
	}
	public void setSkinClosure(java.util.List paramValue) {
		this.skinClosure = paramValue;
	}

	public java.util.List getLocalAnastheticUsed() {
		if ( null == localAnastheticUsed ) {
			localAnastheticUsed = new java.util.ArrayList();
		}
		return localAnastheticUsed;
	}
	public void setLocalAnastheticUsed(java.util.List paramValue) {
		this.localAnastheticUsed = paramValue;
	}

	public ims.domain.lookups.LookupInstance getPatientPosition() {
		return patientPosition;
	}
	public void setPatientPosition(ims.domain.lookups.LookupInstance patientPosition) {
		this.patientPosition = patientPosition;
	}

	public ims.core.clinical.domain.objects.TourniquetDetail getTourniquetDetail() {
		return tourniquetDetail;
	}
	public void setTourniquetDetail(ims.core.clinical.domain.objects.TourniquetDetail tourniquetDetail) {
		this.tourniquetDetail = tourniquetDetail;
	}

	public String getSpecimenType() {
		return specimenType;
	}
	public void setSpecimenType(String specimenType) {
		if ( null != specimenType && specimenType.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for specimenType. Tried to set value: "+
				specimenType);
		}
		this.specimenType = specimenType;
	}

	public Boolean isHistopathology() {
		return histopathology;
	}
	public void setHistopathology(Boolean histopathology) {
		this.histopathology = histopathology;
	}

	public Boolean isMicrobiology() {
		return microbiology;
	}
	public void setMicrobiology(Boolean microbiology) {
		this.microbiology = microbiology;
	}

	public Boolean isHaematology() {
		return haematology;
	}
	public void setHaematology(Boolean haematology) {
		this.haematology = haematology;
	}

	public Boolean isCytology() {
		return cytology;
	}
	public void setCytology(Boolean cytology) {
		this.cytology = cytology;
	}

	public ims.core.clinical.domain.objects.CatheterDetail getCatheterDetail() {
		return catheterDetail;
	}
	public void setCatheterDetail(ims.core.clinical.domain.objects.CatheterDetail catheterDetail) {
		this.catheterDetail = catheterDetail;
	}

	public ims.domain.lookups.LookupInstance getSwabCount() {
		return swabCount;
	}
	public void setSwabCount(ims.domain.lookups.LookupInstance swabCount) {
		this.swabCount = swabCount;
	}

	public ims.domain.lookups.LookupInstance getNeedleCount() {
		return needleCount;
	}
	public void setNeedleCount(ims.domain.lookups.LookupInstance needleCount) {
		this.needleCount = needleCount;
	}

	public ims.domain.lookups.LookupInstance getInstrumentCount() {
		return instrumentCount;
	}
	public void setInstrumentCount(ims.domain.lookups.LookupInstance instrumentCount) {
		this.instrumentCount = instrumentCount;
	}

	public ims.core.resource.people.domain.objects.Nurse getScrubNurse() {
		return scrubNurse;
	}
	public void setScrubNurse(ims.core.resource.people.domain.objects.Nurse scrubNurse) {
		this.scrubNurse = scrubNurse;
	}

	public ims.core.resource.people.domain.objects.Nurse getCirculatingNurse() {
		return circulatingNurse;
	}
	public void setCirculatingNurse(ims.core.resource.people.domain.objects.Nurse circulatingNurse) {
		this.circulatingNurse = circulatingNurse;
	}

	public String getCountComments() {
		return countComments;
	}
	public void setCountComments(String countComments) {
		if ( null != countComments && countComments.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for countComments. Tried to set value: "+
				countComments);
		}
		this.countComments = countComments;
	}

	public java.util.List getTableDevices() {
		if ( null == tableDevices ) {
			tableDevices = new java.util.ArrayList();
		}
		return tableDevices;
	}
	public void setTableDevices(java.util.List paramValue) {
		this.tableDevices = paramValue;
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
		
		auditStr.append("\r\n*skinPreparationUsed* :");
		if (skinPreparationUsed != null)
		{
			java.util.Iterator it1 = skinPreparationUsed.iterator();
			int i1=0;
			while (it1.hasNext())
			{
				if (i1 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it1.next();
			auditStr.append(obj.getText());
			i1++;
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherSkinPreparationUsed* :");
		auditStr.append(otherSkinPreparationUsed);
	    auditStr.append("; ");
		auditStr.append("\r\n*dressing* :");
		if (dressing != null)
		{
			java.util.Iterator it3 = dressing.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it3.next();
			auditStr.append(obj.getText());
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mlsOfWaterIballoon* :");
		auditStr.append(mlsOfWaterIballoon);
	    auditStr.append("; ");
		auditStr.append("\r\n*nationalJointRegistryCompleted* :");
		if (nationalJointRegistryCompleted != null)
			auditStr.append(nationalJointRegistryCompleted.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nationalJointRegistryCompletedBy* :");
		if (nationalJointRegistryCompletedBy != null)
		{
			auditStr.append(toShortClassName(nationalJointRegistryCompletedBy));
				
		    auditStr.append(nationalJointRegistryCompletedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*diathermyPlateDetail* :");
		if (diathermyPlateDetail != null)
		{
			auditStr.append(toShortClassName(diathermyPlateDetail));
				
		    auditStr.append(diathermyPlateDetail.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*diathermyPlateDetailSiteTwo* :");
		if (diathermyPlateDetailSiteTwo != null)
		{
			auditStr.append(toShortClassName(diathermyPlateDetailSiteTwo));
				
		    auditStr.append(diathermyPlateDetailSiteTwo.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*limbCare* :");
		if (limbCare != null)
		{
			auditStr.append(toShortClassName(limbCare));
				
		    auditStr.append(limbCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*drains* :");
		if (drains != null)
		{
			auditStr.append(toShortClassName(drains));
				
		    auditStr.append(drains.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*skinClosure* :");
		if (skinClosure != null)
		{
			java.util.Iterator it11 = skinClosure.iterator();
			int i11=0;
			while (it11.hasNext())
			{
				if (i11 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it11.next();
			auditStr.append(obj.getText());
			i11++;
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*localAnastheticUsed* :");
		if (localAnastheticUsed != null)
		{
		int i12=0;
		for (i12=0; i12<localAnastheticUsed.size(); i12++)
		{
			if (i12 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.LocalAnaestheticAdministered obj = (ims.core.clinical.domain.objects.LocalAnaestheticAdministered)localAnastheticUsed.get(i12);
		    if (obj != null)
			{
				if (i12 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientPosition* :");
		if (patientPosition != null)
			auditStr.append(patientPosition.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*tourniquetDetail* :");
		if (tourniquetDetail != null)
		{
			auditStr.append(toShortClassName(tourniquetDetail));
				
		    auditStr.append(tourniquetDetail.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specimenType* :");
		auditStr.append(specimenType);
	    auditStr.append("; ");
		auditStr.append("\r\n*histopathology* :");
		auditStr.append(histopathology);
	    auditStr.append("; ");
		auditStr.append("\r\n*microbiology* :");
		auditStr.append(microbiology);
	    auditStr.append("; ");
		auditStr.append("\r\n*haematology* :");
		auditStr.append(haematology);
	    auditStr.append("; ");
		auditStr.append("\r\n*cytology* :");
		auditStr.append(cytology);
	    auditStr.append("; ");
		auditStr.append("\r\n*catheterDetail* :");
		if (catheterDetail != null)
		{
			auditStr.append(toShortClassName(catheterDetail));
				
		    auditStr.append(catheterDetail.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*swabCount* :");
		if (swabCount != null)
			auditStr.append(swabCount.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*needleCount* :");
		if (needleCount != null)
			auditStr.append(needleCount.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*instrumentCount* :");
		if (instrumentCount != null)
			auditStr.append(instrumentCount.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*scrubNurse* :");
		if (scrubNurse != null)
		{
			auditStr.append(toShortClassName(scrubNurse));
				
		    auditStr.append(scrubNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*circulatingNurse* :");
		if (circulatingNurse != null)
		{
			auditStr.append(toShortClassName(circulatingNurse));
				
		    auditStr.append(circulatingNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*countComments* :");
		auditStr.append(countComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*tableDevices* :");
		if (tableDevices != null)
		{
		int i27=0;
		for (i27=0; i27<tableDevices.size(); i27++)
		{
			if (i27 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TableDevice obj = (ims.core.clinical.domain.objects.TableDevice)tableDevices.get(i27);
		    if (obj != null)
			{
				if (i27 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i27 > 0)
			auditStr.append("] " + i27);
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
		
		String keyClassName = "IntraOperativeDetails";
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
		if (this.getSkinPreparationUsed() != null)
		{
			if (this.getSkinPreparationUsed().size() > 0 )
			{
			sb.append("<skinPreparationUsed>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getSkinPreparationUsed())); 
			sb.append("</skinPreparationUsed>");		
			}
		}
		if (this.getOtherSkinPreparationUsed() != null)
		{
			sb.append("<otherSkinPreparationUsed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherSkinPreparationUsed().toString()));
			sb.append("</otherSkinPreparationUsed>");		
		}
		if (this.getDressing() != null)
		{
			if (this.getDressing().size() > 0 )
			{
			sb.append("<dressing>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getDressing())); 
			sb.append("</dressing>");		
			}
		}
		if (this.getMlsOfWaterIballoon() != null)
		{
			sb.append("<mlsOfWaterIballoon>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMlsOfWaterIballoon().toString()));
			sb.append("</mlsOfWaterIballoon>");		
		}
		if (this.getNationalJointRegistryCompleted() != null)
		{
			sb.append("<nationalJointRegistryCompleted>");
			sb.append(this.getNationalJointRegistryCompleted().toXMLString()); 
			sb.append("</nationalJointRegistryCompleted>");		
		}
		if (this.getNationalJointRegistryCompletedBy() != null)
		{
			sb.append("<nationalJointRegistryCompletedBy>");
			sb.append(this.getNationalJointRegistryCompletedBy().toXMLString(domMap)); 	
			sb.append("</nationalJointRegistryCompletedBy>");		
		}
		if (this.getDiathermyPlateDetail() != null)
		{
			sb.append("<diathermyPlateDetail>");
			sb.append(this.getDiathermyPlateDetail().toXMLString(domMap)); 	
			sb.append("</diathermyPlateDetail>");		
		}
		if (this.getDiathermyPlateDetailSiteTwo() != null)
		{
			sb.append("<diathermyPlateDetailSiteTwo>");
			sb.append(this.getDiathermyPlateDetailSiteTwo().toXMLString(domMap)); 	
			sb.append("</diathermyPlateDetailSiteTwo>");		
		}
		if (this.getLimbCare() != null)
		{
			sb.append("<limbCare>");
			sb.append(this.getLimbCare().toXMLString(domMap)); 	
			sb.append("</limbCare>");		
		}
		if (this.getDrains() != null)
		{
			sb.append("<drains>");
			sb.append(this.getDrains().toXMLString(domMap)); 	
			sb.append("</drains>");		
		}
		if (this.getSkinClosure() != null)
		{
			if (this.getSkinClosure().size() > 0 )
			{
			sb.append("<skinClosure>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getSkinClosure())); 
			sb.append("</skinClosure>");		
			}
		}
		if (this.getLocalAnastheticUsed() != null)
		{
			if (this.getLocalAnastheticUsed().size() > 0 )
			{
			sb.append("<localAnastheticUsed>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLocalAnastheticUsed(), domMap));
			sb.append("</localAnastheticUsed>");		
			}
		}
		if (this.getPatientPosition() != null)
		{
			sb.append("<patientPosition>");
			sb.append(this.getPatientPosition().toXMLString()); 
			sb.append("</patientPosition>");		
		}
		if (this.getTourniquetDetail() != null)
		{
			sb.append("<tourniquetDetail>");
			sb.append(this.getTourniquetDetail().toXMLString(domMap)); 	
			sb.append("</tourniquetDetail>");		
		}
		if (this.getSpecimenType() != null)
		{
			sb.append("<specimenType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpecimenType().toString()));
			sb.append("</specimenType>");		
		}
		if (this.isHistopathology() != null)
		{
			sb.append("<histopathology>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHistopathology().toString()));
			sb.append("</histopathology>");		
		}
		if (this.isMicrobiology() != null)
		{
			sb.append("<microbiology>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMicrobiology().toString()));
			sb.append("</microbiology>");		
		}
		if (this.isHaematology() != null)
		{
			sb.append("<haematology>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHaematology().toString()));
			sb.append("</haematology>");		
		}
		if (this.isCytology() != null)
		{
			sb.append("<cytology>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCytology().toString()));
			sb.append("</cytology>");		
		}
		if (this.getCatheterDetail() != null)
		{
			sb.append("<catheterDetail>");
			sb.append(this.getCatheterDetail().toXMLString(domMap)); 	
			sb.append("</catheterDetail>");		
		}
		if (this.getSwabCount() != null)
		{
			sb.append("<swabCount>");
			sb.append(this.getSwabCount().toXMLString()); 
			sb.append("</swabCount>");		
		}
		if (this.getNeedleCount() != null)
		{
			sb.append("<needleCount>");
			sb.append(this.getNeedleCount().toXMLString()); 
			sb.append("</needleCount>");		
		}
		if (this.getInstrumentCount() != null)
		{
			sb.append("<instrumentCount>");
			sb.append(this.getInstrumentCount().toXMLString()); 
			sb.append("</instrumentCount>");		
		}
		if (this.getScrubNurse() != null)
		{
			sb.append("<scrubNurse>");
			sb.append(this.getScrubNurse().toXMLString(domMap)); 	
			sb.append("</scrubNurse>");		
		}
		if (this.getCirculatingNurse() != null)
		{
			sb.append("<circulatingNurse>");
			sb.append(this.getCirculatingNurse().toXMLString(domMap)); 	
			sb.append("</circulatingNurse>");		
		}
		if (this.getCountComments() != null)
		{
			sb.append("<countComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCountComments().toString()));
			sb.append("</countComments>");		
		}
		if (this.getTableDevices() != null)
		{
			if (this.getTableDevices().size() > 0 )
			{
			sb.append("<tableDevices>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTableDevices(), domMap));
			sb.append("</tableDevices>");		
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
			IntraOperativeDetails domainObject = getIntraOperativeDetailsfromXML(itemEl, factory, domMap);

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
			IntraOperativeDetails domainObject = getIntraOperativeDetailsfromXML(itemEl, factory, domMap);

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
		
	public static IntraOperativeDetails getIntraOperativeDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getIntraOperativeDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static IntraOperativeDetails getIntraOperativeDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!IntraOperativeDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!IntraOperativeDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the IntraOperativeDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (IntraOperativeDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(IntraOperativeDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		IntraOperativeDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (IntraOperativeDetails)factory.getImportedDomainObject(IntraOperativeDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new IntraOperativeDetails();
		}
		String keyClassName = "IntraOperativeDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (IntraOperativeDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, IntraOperativeDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("skinPreparationUsed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSkinPreparationUsed(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getSkinPreparationUsed())); 
		}
		fldEl = el.element("otherSkinPreparationUsed");
		if(fldEl != null)
		{	
    		obj.setOtherSkinPreparationUsed(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dressing");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setDressing(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getDressing())); 
		}
		fldEl = el.element("mlsOfWaterIballoon");
		if(fldEl != null)
		{	
    		obj.setMlsOfWaterIballoon(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nationalJointRegistryCompleted");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNationalJointRegistryCompleted(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nationalJointRegistryCompletedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNationalJointRegistryCompletedBy(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("diathermyPlateDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiathermyPlateDetail(ims.core.clinical.domain.objects.DiathermyPlateDetail.getDiathermyPlateDetailfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("diathermyPlateDetailSiteTwo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiathermyPlateDetailSiteTwo(ims.core.clinical.domain.objects.DiathermyPlateDetail.getDiathermyPlateDetailfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("limbCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLimbCare(ims.core.clinical.domain.objects.LimbCare.getLimbCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("drains");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDrains(ims.core.clinical.domain.objects.Drains.getDrainsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("skinClosure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSkinClosure(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getSkinClosure())); 
		}
		fldEl = el.element("localAnastheticUsed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setLocalAnastheticUsed(ims.core.clinical.domain.objects.LocalAnaestheticAdministered.fromListXMLString(fldEl, factory, obj.getLocalAnastheticUsed(), domMap));
		}
		fldEl = el.element("patientPosition");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientPosition(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("tourniquetDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTourniquetDetail(ims.core.clinical.domain.objects.TourniquetDetail.getTourniquetDetailfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("specimenType");
		if(fldEl != null)
		{	
    		obj.setSpecimenType(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("histopathology");
		if(fldEl != null)
		{	
    		obj.setHistopathology(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("microbiology");
		if(fldEl != null)
		{	
    		obj.setMicrobiology(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("haematology");
		if(fldEl != null)
		{	
    		obj.setHaematology(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cytology");
		if(fldEl != null)
		{	
    		obj.setCytology(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("catheterDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatheterDetail(ims.core.clinical.domain.objects.CatheterDetail.getCatheterDetailfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("swabCount");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSwabCount(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("needleCount");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNeedleCount(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("instrumentCount");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInstrumentCount(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("scrubNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setScrubNurse(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("circulatingNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCirculatingNurse(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("countComments");
		if(fldEl != null)
		{	
    		obj.setCountComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tableDevices");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTableDevices(ims.core.clinical.domain.objects.TableDevice.fromListXMLString(fldEl, factory, obj.getTableDevices(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "skinPreparationUsed"
		, "dressing"
		, "skinClosure"
		, "localAnastheticUsed"
		, "tableDevices"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String SkinPreparationUsed = "skinPreparationUsed";
		public static final String OtherSkinPreparationUsed = "otherSkinPreparationUsed";
		public static final String Dressing = "dressing";
		public static final String MlsOfWaterIballoon = "mlsOfWaterIballoon";
		public static final String NationalJointRegistryCompleted = "nationalJointRegistryCompleted";
		public static final String NationalJointRegistryCompletedBy = "nationalJointRegistryCompletedBy";
		public static final String DiathermyPlateDetail = "diathermyPlateDetail";
		public static final String DiathermyPlateDetailSiteTwo = "diathermyPlateDetailSiteTwo";
		public static final String LimbCare = "limbCare";
		public static final String Drains = "drains";
		public static final String SkinClosure = "skinClosure";
		public static final String LocalAnastheticUsed = "localAnastheticUsed";
		public static final String PatientPosition = "patientPosition";
		public static final String TourniquetDetail = "tourniquetDetail";
		public static final String SpecimenType = "specimenType";
		public static final String Histopathology = "histopathology";
		public static final String Microbiology = "microbiology";
		public static final String Haematology = "haematology";
		public static final String Cytology = "cytology";
		public static final String CatheterDetail = "catheterDetail";
		public static final String SwabCount = "swabCount";
		public static final String NeedleCount = "needleCount";
		public static final String InstrumentCount = "instrumentCount";
		public static final String ScrubNurse = "scrubNurse";
		public static final String CirculatingNurse = "circulatingNurse";
		public static final String CountComments = "countComments";
		public static final String TableDevices = "tableDevices";
	}
}

