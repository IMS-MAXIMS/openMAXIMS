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
package ims.clinical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class PatientHomeSituation extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100065;
	private static final long serialVersionUID = 1072100065L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Lives With */
	private ims.domain.lookups.LookupInstance livesWith;
	/** Lives With Details */
	private String livesWithDetails;
	/** Lives With: Fit To Care For Patient? */
	private ims.domain.lookups.LookupInstance fitToCareForPatient;
	/** Lives With: Fit To Take Patient Home? */
	private ims.domain.lookups.LookupInstance fitToTakeHome;
	/** Accom Type */
	private ims.domain.lookups.LookupInstance accomType;
	/** Accom Type Other */
	private String accomTypeOther;
	/** Ownership */
	private ims.domain.lookups.LookupInstance ownership;
	/** Supervised By */
	private ims.domain.lookups.LookupInstance supervisedBy;
	/** Supervise Name */
	private String superviseName;
	/** Supervise Address */
	private String superviseAddress;
	/** Supervise Phone Number */
	private String supervisePhoneNo;
	/** Floor Level */
	private ims.domain.lookups.LookupInstance floorLevel;
	/** Lift */
	private ims.domain.lookups.LookupInstance lift;
	/** Stairs */
	private ims.domain.lookups.LookupInstance stairs;
	/** Stairs / Lift */
	private String stairsLift;
	/** Rails */
	private ims.domain.lookups.LookupInstance rails;
	/** Rail Side */
	private ims.domain.lookups.LookupInstance railSide;
	/** Bathroom */
	private String bathroom;
	/** Bathroom Location */
	private ims.domain.lookups.LookupInstance bathroomLocation;
	/** Toilet */
	private String toilet;
	/** Toilet Location */
	private ims.domain.lookups.LookupInstance toiletLocation;
	/** Shower */
	private String shower;
	/** Shower Location */
	private ims.domain.lookups.LookupInstance showerLocation;
	/** House Keys */
	private String houseKeys;
	/** Spare Set */
	private String spareSet;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientHomeSituation (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientHomeSituation ()
    {
    	super();
    }
    public PatientHomeSituation (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.PatientHomeSituation.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.domain.lookups.LookupInstance getLivesWith() {
		return livesWith;
	}
	public void setLivesWith(ims.domain.lookups.LookupInstance livesWith) {
		this.livesWith = livesWith;
	}

	public String getLivesWithDetails() {
		return livesWithDetails;
	}
	public void setLivesWithDetails(String livesWithDetails) {
		this.livesWithDetails = livesWithDetails;
	}

	public ims.domain.lookups.LookupInstance getFitToCareForPatient() {
		return fitToCareForPatient;
	}
	public void setFitToCareForPatient(ims.domain.lookups.LookupInstance fitToCareForPatient) {
		this.fitToCareForPatient = fitToCareForPatient;
	}

	public ims.domain.lookups.LookupInstance getFitToTakeHome() {
		return fitToTakeHome;
	}
	public void setFitToTakeHome(ims.domain.lookups.LookupInstance fitToTakeHome) {
		this.fitToTakeHome = fitToTakeHome;
	}

	public ims.domain.lookups.LookupInstance getAccomType() {
		return accomType;
	}
	public void setAccomType(ims.domain.lookups.LookupInstance accomType) {
		this.accomType = accomType;
	}

	public String getAccomTypeOther() {
		return accomTypeOther;
	}
	public void setAccomTypeOther(String accomTypeOther) {
		this.accomTypeOther = accomTypeOther;
	}

	public ims.domain.lookups.LookupInstance getOwnership() {
		return ownership;
	}
	public void setOwnership(ims.domain.lookups.LookupInstance ownership) {
		this.ownership = ownership;
	}

	public ims.domain.lookups.LookupInstance getSupervisedBy() {
		return supervisedBy;
	}
	public void setSupervisedBy(ims.domain.lookups.LookupInstance supervisedBy) {
		this.supervisedBy = supervisedBy;
	}

	public String getSuperviseName() {
		return superviseName;
	}
	public void setSuperviseName(String superviseName) {
		this.superviseName = superviseName;
	}

	public String getSuperviseAddress() {
		return superviseAddress;
	}
	public void setSuperviseAddress(String superviseAddress) {
		this.superviseAddress = superviseAddress;
	}

	public String getSupervisePhoneNo() {
		return supervisePhoneNo;
	}
	public void setSupervisePhoneNo(String supervisePhoneNo) {
		this.supervisePhoneNo = supervisePhoneNo;
	}

	public ims.domain.lookups.LookupInstance getFloorLevel() {
		return floorLevel;
	}
	public void setFloorLevel(ims.domain.lookups.LookupInstance floorLevel) {
		this.floorLevel = floorLevel;
	}

	public ims.domain.lookups.LookupInstance getLift() {
		return lift;
	}
	public void setLift(ims.domain.lookups.LookupInstance lift) {
		this.lift = lift;
	}

	public ims.domain.lookups.LookupInstance getStairs() {
		return stairs;
	}
	public void setStairs(ims.domain.lookups.LookupInstance stairs) {
		this.stairs = stairs;
	}

	public String getStairsLift() {
		return stairsLift;
	}
	public void setStairsLift(String stairsLift) {
		this.stairsLift = stairsLift;
	}

	public ims.domain.lookups.LookupInstance getRails() {
		return rails;
	}
	public void setRails(ims.domain.lookups.LookupInstance rails) {
		this.rails = rails;
	}

	public ims.domain.lookups.LookupInstance getRailSide() {
		return railSide;
	}
	public void setRailSide(ims.domain.lookups.LookupInstance railSide) {
		this.railSide = railSide;
	}

	public String getBathroom() {
		return bathroom;
	}
	public void setBathroom(String bathroom) {
		this.bathroom = bathroom;
	}

	public ims.domain.lookups.LookupInstance getBathroomLocation() {
		return bathroomLocation;
	}
	public void setBathroomLocation(ims.domain.lookups.LookupInstance bathroomLocation) {
		this.bathroomLocation = bathroomLocation;
	}

	public String getToilet() {
		return toilet;
	}
	public void setToilet(String toilet) {
		this.toilet = toilet;
	}

	public ims.domain.lookups.LookupInstance getToiletLocation() {
		return toiletLocation;
	}
	public void setToiletLocation(ims.domain.lookups.LookupInstance toiletLocation) {
		this.toiletLocation = toiletLocation;
	}

	public String getShower() {
		return shower;
	}
	public void setShower(String shower) {
		this.shower = shower;
	}

	public ims.domain.lookups.LookupInstance getShowerLocation() {
		return showerLocation;
	}
	public void setShowerLocation(ims.domain.lookups.LookupInstance showerLocation) {
		this.showerLocation = showerLocation;
	}

	public String getHouseKeys() {
		return houseKeys;
	}
	public void setHouseKeys(String houseKeys) {
		this.houseKeys = houseKeys;
	}

	public String getSpareSet() {
		return spareSet;
	}
	public void setSpareSet(String spareSet) {
		this.spareSet = spareSet;
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
		
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*livesWith* :");
		if (livesWith != null)
			auditStr.append(livesWith.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*livesWithDetails* :");
		auditStr.append(livesWithDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*fitToCareForPatient* :");
		if (fitToCareForPatient != null)
			auditStr.append(fitToCareForPatient.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*fitToTakeHome* :");
		if (fitToTakeHome != null)
			auditStr.append(fitToTakeHome.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*accomType* :");
		if (accomType != null)
			auditStr.append(accomType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*accomTypeOther* :");
		auditStr.append(accomTypeOther);
	    auditStr.append("; ");
		auditStr.append("\r\n*ownership* :");
		if (ownership != null)
			auditStr.append(ownership.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*supervisedBy* :");
		if (supervisedBy != null)
			auditStr.append(supervisedBy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*superviseName* :");
		auditStr.append(superviseName);
	    auditStr.append("; ");
		auditStr.append("\r\n*superviseAddress* :");
		auditStr.append(superviseAddress);
	    auditStr.append("; ");
		auditStr.append("\r\n*supervisePhoneNo* :");
		auditStr.append(supervisePhoneNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*floorLevel* :");
		if (floorLevel != null)
			auditStr.append(floorLevel.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*lift* :");
		if (lift != null)
			auditStr.append(lift.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*stairs* :");
		if (stairs != null)
			auditStr.append(stairs.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*stairsLift* :");
		auditStr.append(stairsLift);
	    auditStr.append("; ");
		auditStr.append("\r\n*rails* :");
		if (rails != null)
			auditStr.append(rails.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*railSide* :");
		if (railSide != null)
			auditStr.append(railSide.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*bathroom* :");
		auditStr.append(bathroom);
	    auditStr.append("; ");
		auditStr.append("\r\n*bathroomLocation* :");
		if (bathroomLocation != null)
			auditStr.append(bathroomLocation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*toilet* :");
		auditStr.append(toilet);
	    auditStr.append("; ");
		auditStr.append("\r\n*toiletLocation* :");
		if (toiletLocation != null)
			auditStr.append(toiletLocation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*shower* :");
		auditStr.append(shower);
	    auditStr.append("; ");
		auditStr.append("\r\n*showerLocation* :");
		if (showerLocation != null)
			auditStr.append(showerLocation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*houseKeys* :");
		auditStr.append(houseKeys);
	    auditStr.append("; ");
		auditStr.append("\r\n*spareSet* :");
		auditStr.append(spareSet);
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
		
		String keyClassName = "PatientHomeSituation";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getLivesWith() != null)
		{
			sb.append("<livesWith>");
			sb.append(this.getLivesWith().toXMLString()); 
			sb.append("</livesWith>");		
		}
		if (this.getLivesWithDetails() != null)
		{
			sb.append("<livesWithDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLivesWithDetails().toString()));
			sb.append("</livesWithDetails>");		
		}
		if (this.getFitToCareForPatient() != null)
		{
			sb.append("<fitToCareForPatient>");
			sb.append(this.getFitToCareForPatient().toXMLString()); 
			sb.append("</fitToCareForPatient>");		
		}
		if (this.getFitToTakeHome() != null)
		{
			sb.append("<fitToTakeHome>");
			sb.append(this.getFitToTakeHome().toXMLString()); 
			sb.append("</fitToTakeHome>");		
		}
		if (this.getAccomType() != null)
		{
			sb.append("<accomType>");
			sb.append(this.getAccomType().toXMLString()); 
			sb.append("</accomType>");		
		}
		if (this.getAccomTypeOther() != null)
		{
			sb.append("<accomTypeOther>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAccomTypeOther().toString()));
			sb.append("</accomTypeOther>");		
		}
		if (this.getOwnership() != null)
		{
			sb.append("<ownership>");
			sb.append(this.getOwnership().toXMLString()); 
			sb.append("</ownership>");		
		}
		if (this.getSupervisedBy() != null)
		{
			sb.append("<supervisedBy>");
			sb.append(this.getSupervisedBy().toXMLString()); 
			sb.append("</supervisedBy>");		
		}
		if (this.getSuperviseName() != null)
		{
			sb.append("<superviseName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSuperviseName().toString()));
			sb.append("</superviseName>");		
		}
		if (this.getSuperviseAddress() != null)
		{
			sb.append("<superviseAddress>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSuperviseAddress().toString()));
			sb.append("</superviseAddress>");		
		}
		if (this.getSupervisePhoneNo() != null)
		{
			sb.append("<supervisePhoneNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSupervisePhoneNo().toString()));
			sb.append("</supervisePhoneNo>");		
		}
		if (this.getFloorLevel() != null)
		{
			sb.append("<floorLevel>");
			sb.append(this.getFloorLevel().toXMLString()); 
			sb.append("</floorLevel>");		
		}
		if (this.getLift() != null)
		{
			sb.append("<lift>");
			sb.append(this.getLift().toXMLString()); 
			sb.append("</lift>");		
		}
		if (this.getStairs() != null)
		{
			sb.append("<stairs>");
			sb.append(this.getStairs().toXMLString()); 
			sb.append("</stairs>");		
		}
		if (this.getStairsLift() != null)
		{
			sb.append("<stairsLift>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStairsLift().toString()));
			sb.append("</stairsLift>");		
		}
		if (this.getRails() != null)
		{
			sb.append("<rails>");
			sb.append(this.getRails().toXMLString()); 
			sb.append("</rails>");		
		}
		if (this.getRailSide() != null)
		{
			sb.append("<railSide>");
			sb.append(this.getRailSide().toXMLString()); 
			sb.append("</railSide>");		
		}
		if (this.getBathroom() != null)
		{
			sb.append("<bathroom>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBathroom().toString()));
			sb.append("</bathroom>");		
		}
		if (this.getBathroomLocation() != null)
		{
			sb.append("<bathroomLocation>");
			sb.append(this.getBathroomLocation().toXMLString()); 
			sb.append("</bathroomLocation>");		
		}
		if (this.getToilet() != null)
		{
			sb.append("<toilet>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getToilet().toString()));
			sb.append("</toilet>");		
		}
		if (this.getToiletLocation() != null)
		{
			sb.append("<toiletLocation>");
			sb.append(this.getToiletLocation().toXMLString()); 
			sb.append("</toiletLocation>");		
		}
		if (this.getShower() != null)
		{
			sb.append("<shower>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getShower().toString()));
			sb.append("</shower>");		
		}
		if (this.getShowerLocation() != null)
		{
			sb.append("<showerLocation>");
			sb.append(this.getShowerLocation().toXMLString()); 
			sb.append("</showerLocation>");		
		}
		if (this.getHouseKeys() != null)
		{
			sb.append("<houseKeys>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHouseKeys().toString()));
			sb.append("</houseKeys>");		
		}
		if (this.getSpareSet() != null)
		{
			sb.append("<spareSet>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpareSet().toString()));
			sb.append("</spareSet>");		
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
			PatientHomeSituation domainObject = getPatientHomeSituationfromXML(itemEl, factory, domMap);

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
			PatientHomeSituation domainObject = getPatientHomeSituationfromXML(itemEl, factory, domMap);

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
		
	public static PatientHomeSituation getPatientHomeSituationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientHomeSituationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientHomeSituation getPatientHomeSituationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientHomeSituation.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientHomeSituation.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientHomeSituation class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientHomeSituation)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientHomeSituation.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientHomeSituation ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientHomeSituation)factory.getImportedDomainObject(PatientHomeSituation.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientHomeSituation();
		}
		String keyClassName = "PatientHomeSituation";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientHomeSituation)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientHomeSituation obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("livesWith");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLivesWith(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("livesWithDetails");
		if(fldEl != null)
		{	
    		obj.setLivesWithDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("fitToCareForPatient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFitToCareForPatient(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("fitToTakeHome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFitToTakeHome(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("accomType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAccomType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("accomTypeOther");
		if(fldEl != null)
		{	
    		obj.setAccomTypeOther(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ownership");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOwnership(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("supervisedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSupervisedBy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("superviseName");
		if(fldEl != null)
		{	
    		obj.setSuperviseName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("superviseAddress");
		if(fldEl != null)
		{	
    		obj.setSuperviseAddress(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("supervisePhoneNo");
		if(fldEl != null)
		{	
    		obj.setSupervisePhoneNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("floorLevel");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFloorLevel(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("lift");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLift(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("stairs");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStairs(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("stairsLift");
		if(fldEl != null)
		{	
    		obj.setStairsLift(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRails(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("railSide");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRailSide(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("bathroom");
		if(fldEl != null)
		{	
    		obj.setBathroom(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bathroomLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBathroomLocation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("toilet");
		if(fldEl != null)
		{	
    		obj.setToilet(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("toiletLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setToiletLocation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("shower");
		if(fldEl != null)
		{	
    		obj.setShower(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("showerLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setShowerLocation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("houseKeys");
		if(fldEl != null)
		{	
    		obj.setHouseKeys(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("spareSet");
		if(fldEl != null)
		{	
    		obj.setSpareSet(new String(fldEl.getTextTrim()));	
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
		public static final String AuthoringInformation = "authoringInformation";
		public static final String CareContext = "careContext";
		public static final String ClinicalContact = "clinicalContact";
		public static final String LivesWith = "livesWith";
		public static final String LivesWithDetails = "livesWithDetails";
		public static final String FitToCareForPatient = "fitToCareForPatient";
		public static final String FitToTakeHome = "fitToTakeHome";
		public static final String AccomType = "accomType";
		public static final String AccomTypeOther = "accomTypeOther";
		public static final String Ownership = "ownership";
		public static final String SupervisedBy = "supervisedBy";
		public static final String SuperviseName = "superviseName";
		public static final String SuperviseAddress = "superviseAddress";
		public static final String SupervisePhoneNo = "supervisePhoneNo";
		public static final String FloorLevel = "floorLevel";
		public static final String Lift = "lift";
		public static final String Stairs = "stairs";
		public static final String StairsLift = "stairsLift";
		public static final String Rails = "rails";
		public static final String RailSide = "railSide";
		public static final String Bathroom = "bathroom";
		public static final String BathroomLocation = "bathroomLocation";
		public static final String Toilet = "toilet";
		public static final String ToiletLocation = "toiletLocation";
		public static final String Shower = "shower";
		public static final String ShowerLocation = "showerLocation";
		public static final String HouseKeys = "houseKeys";
		public static final String SpareSet = "spareSet";
	}
}

