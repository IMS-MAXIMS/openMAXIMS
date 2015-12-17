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
package ims.core.admin.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class TIIG extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100025;
	private static final long serialVersionUID = 1086100025L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Emergency Episode */
	private ims.core.admin.domain.objects.EpisodeOfCare episode;
	/** Emergency Attendance */
	private ims.core.admin.domain.objects.CareContext attendance;
	/** Had Patient Consumed Alcohol Three Hours Prior To Incident */
	private ims.domain.lookups.LookupInstance hadPatientConsumedAlcohol;
	/** Assault Weapon */
	private ims.domain.lookups.LookupInstance assaultWeapon;
	/** Assault Location */
	private ims.domain.lookups.LookupInstance assaultLocation;
	/** Relationship To Attacker */
	private ims.domain.lookups.LookupInstance relationshipToAttacker;
	/** Intend To Inform Police */
	private ims.domain.lookups.LookupInstance intendToInformPolice;
	/** Consumed Or Purchased Alcohol From */
	private ims.domain.lookups.LookupInstance consumedOrPurchasedAlcoholFrom;
	/** Number Of Attackers */
	private ims.domain.lookups.LookupInstance numberOfAttackers;
	/** Gender of Attacker */
	private ims.domain.lookups.LookupInstance genderofAttacker;
	/** Previously Assaulted By Attacker */
	private ims.domain.lookups.LookupInstance previouslyAssulatedByAttacker;
	/** Assault Location Details */
	private String assaultLocationDetails;
	/** Relationship To Attacker Details */
	private String relationshipToAttackerDetails;
	/** Assault Weapon Details */
	private String assaultWeaponDetails;
	/** Last Drink Location Details */
	private String lastDrinkLocationDetails;
	/** Attacker Had onsumed Alcohol */
	private ims.domain.lookups.LookupInstance attackerHadConsumedAlcohol;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TIIG (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TIIG ()
    {
    	super();
    }
    public TIIG (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.TIIG.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisode() {
		return episode;
	}
	public void setEpisode(ims.core.admin.domain.objects.EpisodeOfCare episode) {
		this.episode = episode;
	}

	public ims.core.admin.domain.objects.CareContext getAttendance() {
		return attendance;
	}
	public void setAttendance(ims.core.admin.domain.objects.CareContext attendance) {
		this.attendance = attendance;
	}

	public ims.domain.lookups.LookupInstance getHadPatientConsumedAlcohol() {
		return hadPatientConsumedAlcohol;
	}
	public void setHadPatientConsumedAlcohol(ims.domain.lookups.LookupInstance hadPatientConsumedAlcohol) {
		this.hadPatientConsumedAlcohol = hadPatientConsumedAlcohol;
	}

	public ims.domain.lookups.LookupInstance getAssaultWeapon() {
		return assaultWeapon;
	}
	public void setAssaultWeapon(ims.domain.lookups.LookupInstance assaultWeapon) {
		this.assaultWeapon = assaultWeapon;
	}

	public ims.domain.lookups.LookupInstance getAssaultLocation() {
		return assaultLocation;
	}
	public void setAssaultLocation(ims.domain.lookups.LookupInstance assaultLocation) {
		this.assaultLocation = assaultLocation;
	}

	public ims.domain.lookups.LookupInstance getRelationshipToAttacker() {
		return relationshipToAttacker;
	}
	public void setRelationshipToAttacker(ims.domain.lookups.LookupInstance relationshipToAttacker) {
		this.relationshipToAttacker = relationshipToAttacker;
	}

	public ims.domain.lookups.LookupInstance getIntendToInformPolice() {
		return intendToInformPolice;
	}
	public void setIntendToInformPolice(ims.domain.lookups.LookupInstance intendToInformPolice) {
		this.intendToInformPolice = intendToInformPolice;
	}

	public ims.domain.lookups.LookupInstance getConsumedOrPurchasedAlcoholFrom() {
		return consumedOrPurchasedAlcoholFrom;
	}
	public void setConsumedOrPurchasedAlcoholFrom(ims.domain.lookups.LookupInstance consumedOrPurchasedAlcoholFrom) {
		this.consumedOrPurchasedAlcoholFrom = consumedOrPurchasedAlcoholFrom;
	}

	public ims.domain.lookups.LookupInstance getNumberOfAttackers() {
		return numberOfAttackers;
	}
	public void setNumberOfAttackers(ims.domain.lookups.LookupInstance numberOfAttackers) {
		this.numberOfAttackers = numberOfAttackers;
	}

	public ims.domain.lookups.LookupInstance getGenderofAttacker() {
		return genderofAttacker;
	}
	public void setGenderofAttacker(ims.domain.lookups.LookupInstance genderofAttacker) {
		this.genderofAttacker = genderofAttacker;
	}

	public ims.domain.lookups.LookupInstance getPreviouslyAssulatedByAttacker() {
		return previouslyAssulatedByAttacker;
	}
	public void setPreviouslyAssulatedByAttacker(ims.domain.lookups.LookupInstance previouslyAssulatedByAttacker) {
		this.previouslyAssulatedByAttacker = previouslyAssulatedByAttacker;
	}

	public String getAssaultLocationDetails() {
		return assaultLocationDetails;
	}
	public void setAssaultLocationDetails(String assaultLocationDetails) {
		if ( null != assaultLocationDetails && assaultLocationDetails.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for assaultLocationDetails. Tried to set value: "+
				assaultLocationDetails);
		}
		this.assaultLocationDetails = assaultLocationDetails;
	}

	public String getRelationshipToAttackerDetails() {
		return relationshipToAttackerDetails;
	}
	public void setRelationshipToAttackerDetails(String relationshipToAttackerDetails) {
		if ( null != relationshipToAttackerDetails && relationshipToAttackerDetails.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for relationshipToAttackerDetails. Tried to set value: "+
				relationshipToAttackerDetails);
		}
		this.relationshipToAttackerDetails = relationshipToAttackerDetails;
	}

	public String getAssaultWeaponDetails() {
		return assaultWeaponDetails;
	}
	public void setAssaultWeaponDetails(String assaultWeaponDetails) {
		if ( null != assaultWeaponDetails && assaultWeaponDetails.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for assaultWeaponDetails. Tried to set value: "+
				assaultWeaponDetails);
		}
		this.assaultWeaponDetails = assaultWeaponDetails;
	}

	public String getLastDrinkLocationDetails() {
		return lastDrinkLocationDetails;
	}
	public void setLastDrinkLocationDetails(String lastDrinkLocationDetails) {
		if ( null != lastDrinkLocationDetails && lastDrinkLocationDetails.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for lastDrinkLocationDetails. Tried to set value: "+
				lastDrinkLocationDetails);
		}
		this.lastDrinkLocationDetails = lastDrinkLocationDetails;
	}

	public ims.domain.lookups.LookupInstance getAttackerHadConsumedAlcohol() {
		return attackerHadConsumedAlcohol;
	}
	public void setAttackerHadConsumedAlcohol(ims.domain.lookups.LookupInstance attackerHadConsumedAlcohol) {
		this.attackerHadConsumedAlcohol = attackerHadConsumedAlcohol;
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
		
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episode* :");
		if (episode != null)
		{
			auditStr.append(toShortClassName(episode));
				
		    auditStr.append(episode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*attendance* :");
		if (attendance != null)
		{
			auditStr.append(toShortClassName(attendance));
				
		    auditStr.append(attendance.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hadPatientConsumedAlcohol* :");
		if (hadPatientConsumedAlcohol != null)
			auditStr.append(hadPatientConsumedAlcohol.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*assaultWeapon* :");
		if (assaultWeapon != null)
			auditStr.append(assaultWeapon.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*assaultLocation* :");
		if (assaultLocation != null)
			auditStr.append(assaultLocation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*relationshipToAttacker* :");
		if (relationshipToAttacker != null)
			auditStr.append(relationshipToAttacker.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*intendToInformPolice* :");
		if (intendToInformPolice != null)
			auditStr.append(intendToInformPolice.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consumedOrPurchasedAlcoholFrom* :");
		if (consumedOrPurchasedAlcoholFrom != null)
			auditStr.append(consumedOrPurchasedAlcoholFrom.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*numberOfAttackers* :");
		if (numberOfAttackers != null)
			auditStr.append(numberOfAttackers.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*genderofAttacker* :");
		if (genderofAttacker != null)
			auditStr.append(genderofAttacker.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*previouslyAssulatedByAttacker* :");
		if (previouslyAssulatedByAttacker != null)
			auditStr.append(previouslyAssulatedByAttacker.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*assaultLocationDetails* :");
		auditStr.append(assaultLocationDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*relationshipToAttackerDetails* :");
		auditStr.append(relationshipToAttackerDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*assaultWeaponDetails* :");
		auditStr.append(assaultWeaponDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastDrinkLocationDetails* :");
		auditStr.append(lastDrinkLocationDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*attackerHadConsumedAlcohol* :");
		if (attackerHadConsumedAlcohol != null)
			auditStr.append(attackerHadConsumedAlcohol.getText());
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
		
		String keyClassName = "TIIG";
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
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getEpisode() != null)
		{
			sb.append("<episode>");
			sb.append(this.getEpisode().toXMLString(domMap)); 	
			sb.append("</episode>");		
		}
		if (this.getAttendance() != null)
		{
			sb.append("<attendance>");
			sb.append(this.getAttendance().toXMLString(domMap)); 	
			sb.append("</attendance>");		
		}
		if (this.getHadPatientConsumedAlcohol() != null)
		{
			sb.append("<hadPatientConsumedAlcohol>");
			sb.append(this.getHadPatientConsumedAlcohol().toXMLString()); 
			sb.append("</hadPatientConsumedAlcohol>");		
		}
		if (this.getAssaultWeapon() != null)
		{
			sb.append("<assaultWeapon>");
			sb.append(this.getAssaultWeapon().toXMLString()); 
			sb.append("</assaultWeapon>");		
		}
		if (this.getAssaultLocation() != null)
		{
			sb.append("<assaultLocation>");
			sb.append(this.getAssaultLocation().toXMLString()); 
			sb.append("</assaultLocation>");		
		}
		if (this.getRelationshipToAttacker() != null)
		{
			sb.append("<relationshipToAttacker>");
			sb.append(this.getRelationshipToAttacker().toXMLString()); 
			sb.append("</relationshipToAttacker>");		
		}
		if (this.getIntendToInformPolice() != null)
		{
			sb.append("<intendToInformPolice>");
			sb.append(this.getIntendToInformPolice().toXMLString()); 
			sb.append("</intendToInformPolice>");		
		}
		if (this.getConsumedOrPurchasedAlcoholFrom() != null)
		{
			sb.append("<consumedOrPurchasedAlcoholFrom>");
			sb.append(this.getConsumedOrPurchasedAlcoholFrom().toXMLString()); 
			sb.append("</consumedOrPurchasedAlcoholFrom>");		
		}
		if (this.getNumberOfAttackers() != null)
		{
			sb.append("<numberOfAttackers>");
			sb.append(this.getNumberOfAttackers().toXMLString()); 
			sb.append("</numberOfAttackers>");		
		}
		if (this.getGenderofAttacker() != null)
		{
			sb.append("<genderofAttacker>");
			sb.append(this.getGenderofAttacker().toXMLString()); 
			sb.append("</genderofAttacker>");		
		}
		if (this.getPreviouslyAssulatedByAttacker() != null)
		{
			sb.append("<previouslyAssulatedByAttacker>");
			sb.append(this.getPreviouslyAssulatedByAttacker().toXMLString()); 
			sb.append("</previouslyAssulatedByAttacker>");		
		}
		if (this.getAssaultLocationDetails() != null)
		{
			sb.append("<assaultLocationDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAssaultLocationDetails().toString()));
			sb.append("</assaultLocationDetails>");		
		}
		if (this.getRelationshipToAttackerDetails() != null)
		{
			sb.append("<relationshipToAttackerDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRelationshipToAttackerDetails().toString()));
			sb.append("</relationshipToAttackerDetails>");		
		}
		if (this.getAssaultWeaponDetails() != null)
		{
			sb.append("<assaultWeaponDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAssaultWeaponDetails().toString()));
			sb.append("</assaultWeaponDetails>");		
		}
		if (this.getLastDrinkLocationDetails() != null)
		{
			sb.append("<lastDrinkLocationDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLastDrinkLocationDetails().toString()));
			sb.append("</lastDrinkLocationDetails>");		
		}
		if (this.getAttackerHadConsumedAlcohol() != null)
		{
			sb.append("<attackerHadConsumedAlcohol>");
			sb.append(this.getAttackerHadConsumedAlcohol().toXMLString()); 
			sb.append("</attackerHadConsumedAlcohol>");		
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
			TIIG domainObject = getTIIGfromXML(itemEl, factory, domMap);

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
			TIIG domainObject = getTIIGfromXML(itemEl, factory, domMap);

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
		
	public static TIIG getTIIGfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTIIGfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TIIG getTIIGfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TIIG.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TIIG.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TIIG class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TIIG)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TIIG.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TIIG ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TIIG)factory.getImportedDomainObject(TIIG.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TIIG();
		}
		String keyClassName = "TIIG";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TIIG)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TIIG obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisode(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("attendance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAttendance(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hadPatientConsumedAlcohol");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHadPatientConsumedAlcohol(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("assaultWeapon");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAssaultWeapon(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("assaultLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAssaultLocation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("relationshipToAttacker");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRelationshipToAttacker(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("intendToInformPolice");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIntendToInformPolice(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consumedOrPurchasedAlcoholFrom");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConsumedOrPurchasedAlcoholFrom(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("numberOfAttackers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNumberOfAttackers(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("genderofAttacker");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGenderofAttacker(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("previouslyAssulatedByAttacker");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreviouslyAssulatedByAttacker(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("assaultLocationDetails");
		if(fldEl != null)
		{	
    		obj.setAssaultLocationDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("relationshipToAttackerDetails");
		if(fldEl != null)
		{	
    		obj.setRelationshipToAttackerDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("assaultWeaponDetails");
		if(fldEl != null)
		{	
    		obj.setAssaultWeaponDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lastDrinkLocationDetails");
		if(fldEl != null)
		{	
    		obj.setLastDrinkLocationDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("attackerHadConsumedAlcohol");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAttackerHadConsumedAlcohol(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String Patient = "patient";
		public static final String Episode = "episode";
		public static final String Attendance = "attendance";
		public static final String HadPatientConsumedAlcohol = "hadPatientConsumedAlcohol";
		public static final String AssaultWeapon = "assaultWeapon";
		public static final String AssaultLocation = "assaultLocation";
		public static final String RelationshipToAttacker = "relationshipToAttacker";
		public static final String IntendToInformPolice = "intendToInformPolice";
		public static final String ConsumedOrPurchasedAlcoholFrom = "consumedOrPurchasedAlcoholFrom";
		public static final String NumberOfAttackers = "numberOfAttackers";
		public static final String GenderofAttacker = "genderofAttacker";
		public static final String PreviouslyAssulatedByAttacker = "previouslyAssulatedByAttacker";
		public static final String AssaultLocationDetails = "assaultLocationDetails";
		public static final String RelationshipToAttackerDetails = "relationshipToAttackerDetails";
		public static final String AssaultWeaponDetails = "assaultWeaponDetails";
		public static final String LastDrinkLocationDetails = "lastDrinkLocationDetails";
		public static final String AttackerHadConsumedAlcohol = "attackerHadConsumedAlcohol";
	}
}

