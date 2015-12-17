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
package ims.pci.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ClientBirthDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1091100001;
	private static final long serialVersionUID = 1091100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Client */
	private ims.core.patient.domain.objects.Patient client;
	/** Place Of Birth - Maternity Hospital */
	private ims.domain.lookups.LookupInstance placeOfBirth;
	/** Time of Birth */
	private String timeOfBirth;
	/** Weight At Birth in grammes */
	private Integer weightAtBirth;
	/** Date Notified */
	private java.util.Date dateNotified;
	/** Duration Of Pregnancy in weeks */
	private Integer durationOfPregnancy;
	/** Delivery Method */
	private ims.domain.lookups.LookupInstance deliveryMethod;
	/** Episiotomy */
	private ims.domain.lookups.LookupInstance episiotomy;
	/** Epidural */
	private ims.domain.lookups.LookupInstance epidural;
	/** Order Of Birth Order */
	private Integer orderOfBirthOrder;
	/** Order Of Birth Nr */
	private Integer orderOfBirthNr;
	/** Apgar1 */
	private Integer apgar1;
	/** Apgar5 */
	private Integer apgar5;
	/** Apgar10 */
	private Integer apgar10;
	/** Previous Pregnancies No of Stillborn */
	private Integer stillborn;
	/** Previous Pregnancies  No of Live */
	private Integer live;
	/** Previous Pregnancies No of Miscarriages */
	private Integer miscarriages;
	/** Marital Status At Birth */
	private ims.domain.lookups.LookupInstance maritalStatusAtBirth;
	/** PKU Test */
	private ims.domain.lookups.LookupInstance pKUTest;
	/** Still Born Indicator */
	private Boolean stillBornIndicator;
	/** BreastFeeding */
	private ims.domain.lookups.LookupInstance breastFeeding;
	/** BreastFeeding */
	private ims.domain.lookups.LookupInstance breastFeedingAtDischarge;
	/** BreastFeeding At 3 months */
	private ims.domain.lookups.LookupInstance breastFeedingAt3months;
	/** Breast Feeding At PHN 1st Visit */
	private ims.domain.lookups.LookupInstance breastFeedingAtPHN;
	/** Client Specific Notes */
	private String clientNotes;
	/** Link to the Client ID in the old CCCS system to facilitate data take on later */
	private String clientIDOfMother;
	/** Date and Time of Discharge */
	private java.util.Date dischargeDateTime;
	/** Date and Time of First PHN Visit */
	private java.util.Date firstPHNVisitDateTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClientBirthDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClientBirthDetails ()
    {
    	super();
    }
    public ClientBirthDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pci.domain.objects.ClientBirthDetails.class;
	}


	public ims.core.patient.domain.objects.Patient getClient() {
		return client;
	}
	public void setClient(ims.core.patient.domain.objects.Patient client) {
		this.client = client;
	}

	public ims.domain.lookups.LookupInstance getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(ims.domain.lookups.LookupInstance placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getTimeOfBirth() {
		return timeOfBirth;
	}
	public void setTimeOfBirth(String timeOfBirth) {
		if ( null != timeOfBirth && timeOfBirth.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for timeOfBirth. Tried to set value: "+
				timeOfBirth);
		}
		this.timeOfBirth = timeOfBirth;
	}

	public Integer getWeightAtBirth() {
		return weightAtBirth;
	}
	public void setWeightAtBirth(Integer weightAtBirth) {
		this.weightAtBirth = weightAtBirth;
	}

	public java.util.Date getDateNotified() {
		return dateNotified;
	}
	public void setDateNotified(java.util.Date dateNotified) {
		this.dateNotified = dateNotified;
	}

	public Integer getDurationOfPregnancy() {
		return durationOfPregnancy;
	}
	public void setDurationOfPregnancy(Integer durationOfPregnancy) {
		this.durationOfPregnancy = durationOfPregnancy;
	}

	public ims.domain.lookups.LookupInstance getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(ims.domain.lookups.LookupInstance deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public ims.domain.lookups.LookupInstance getEpisiotomy() {
		return episiotomy;
	}
	public void setEpisiotomy(ims.domain.lookups.LookupInstance episiotomy) {
		this.episiotomy = episiotomy;
	}

	public ims.domain.lookups.LookupInstance getEpidural() {
		return epidural;
	}
	public void setEpidural(ims.domain.lookups.LookupInstance epidural) {
		this.epidural = epidural;
	}

	public Integer getOrderOfBirthOrder() {
		return orderOfBirthOrder;
	}
	public void setOrderOfBirthOrder(Integer orderOfBirthOrder) {
		this.orderOfBirthOrder = orderOfBirthOrder;
	}

	public Integer getOrderOfBirthNr() {
		return orderOfBirthNr;
	}
	public void setOrderOfBirthNr(Integer orderOfBirthNr) {
		this.orderOfBirthNr = orderOfBirthNr;
	}

	public Integer getApgar1() {
		return apgar1;
	}
	public void setApgar1(Integer apgar1) {
		this.apgar1 = apgar1;
	}

	public Integer getApgar5() {
		return apgar5;
	}
	public void setApgar5(Integer apgar5) {
		this.apgar5 = apgar5;
	}

	public Integer getApgar10() {
		return apgar10;
	}
	public void setApgar10(Integer apgar10) {
		this.apgar10 = apgar10;
	}

	public Integer getStillborn() {
		return stillborn;
	}
	public void setStillborn(Integer stillborn) {
		this.stillborn = stillborn;
	}

	public Integer getLive() {
		return live;
	}
	public void setLive(Integer live) {
		this.live = live;
	}

	public Integer getMiscarriages() {
		return miscarriages;
	}
	public void setMiscarriages(Integer miscarriages) {
		this.miscarriages = miscarriages;
	}

	public ims.domain.lookups.LookupInstance getMaritalStatusAtBirth() {
		return maritalStatusAtBirth;
	}
	public void setMaritalStatusAtBirth(ims.domain.lookups.LookupInstance maritalStatusAtBirth) {
		this.maritalStatusAtBirth = maritalStatusAtBirth;
	}

	public ims.domain.lookups.LookupInstance getPKUTest() {
		return pKUTest;
	}
	public void setPKUTest(ims.domain.lookups.LookupInstance pKUTest) {
		this.pKUTest = pKUTest;
	}

	public Boolean isStillBornIndicator() {
		return stillBornIndicator;
	}
	public void setStillBornIndicator(Boolean stillBornIndicator) {
		this.stillBornIndicator = stillBornIndicator;
	}

	public ims.domain.lookups.LookupInstance getBreastFeeding() {
		return breastFeeding;
	}
	public void setBreastFeeding(ims.domain.lookups.LookupInstance breastFeeding) {
		this.breastFeeding = breastFeeding;
	}

	public ims.domain.lookups.LookupInstance getBreastFeedingAtDischarge() {
		return breastFeedingAtDischarge;
	}
	public void setBreastFeedingAtDischarge(ims.domain.lookups.LookupInstance breastFeedingAtDischarge) {
		this.breastFeedingAtDischarge = breastFeedingAtDischarge;
	}

	public ims.domain.lookups.LookupInstance getBreastFeedingAt3months() {
		return breastFeedingAt3months;
	}
	public void setBreastFeedingAt3months(ims.domain.lookups.LookupInstance breastFeedingAt3months) {
		this.breastFeedingAt3months = breastFeedingAt3months;
	}

	public ims.domain.lookups.LookupInstance getBreastFeedingAtPHN() {
		return breastFeedingAtPHN;
	}
	public void setBreastFeedingAtPHN(ims.domain.lookups.LookupInstance breastFeedingAtPHN) {
		this.breastFeedingAtPHN = breastFeedingAtPHN;
	}

	public String getClientNotes() {
		return clientNotes;
	}
	public void setClientNotes(String clientNotes) {
		if ( null != clientNotes && clientNotes.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for clientNotes. Tried to set value: "+
				clientNotes);
		}
		this.clientNotes = clientNotes;
	}

	public String getClientIDOfMother() {
		return clientIDOfMother;
	}
	public void setClientIDOfMother(String clientIDOfMother) {
		if ( null != clientIDOfMother && clientIDOfMother.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for clientIDOfMother. Tried to set value: "+
				clientIDOfMother);
		}
		this.clientIDOfMother = clientIDOfMother;
	}

	public java.util.Date getDischargeDateTime() {
		return dischargeDateTime;
	}
	public void setDischargeDateTime(java.util.Date dischargeDateTime) {
		this.dischargeDateTime = dischargeDateTime;
	}

	public java.util.Date getFirstPHNVisitDateTime() {
		return firstPHNVisitDateTime;
	}
	public void setFirstPHNVisitDateTime(java.util.Date firstPHNVisitDateTime) {
		this.firstPHNVisitDateTime = firstPHNVisitDateTime;
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
		
		auditStr.append("\r\n*client* :");
		if (client != null)
		{
			auditStr.append(toShortClassName(client));
				
		    auditStr.append(client.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*placeOfBirth* :");
		if (placeOfBirth != null)
			auditStr.append(placeOfBirth.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*timeOfBirth* :");
		auditStr.append(timeOfBirth);
	    auditStr.append("; ");
		auditStr.append("\r\n*weightAtBirth* :");
		auditStr.append(weightAtBirth);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateNotified* :");
		auditStr.append(dateNotified);
	    auditStr.append("; ");
		auditStr.append("\r\n*durationOfPregnancy* :");
		auditStr.append(durationOfPregnancy);
	    auditStr.append("; ");
		auditStr.append("\r\n*deliveryMethod* :");
		if (deliveryMethod != null)
			auditStr.append(deliveryMethod.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*episiotomy* :");
		if (episiotomy != null)
			auditStr.append(episiotomy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*epidural* :");
		if (epidural != null)
			auditStr.append(epidural.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*orderOfBirthOrder* :");
		auditStr.append(orderOfBirthOrder);
	    auditStr.append("; ");
		auditStr.append("\r\n*orderOfBirthNr* :");
		auditStr.append(orderOfBirthNr);
	    auditStr.append("; ");
		auditStr.append("\r\n*apgar1* :");
		auditStr.append(apgar1);
	    auditStr.append("; ");
		auditStr.append("\r\n*apgar5* :");
		auditStr.append(apgar5);
	    auditStr.append("; ");
		auditStr.append("\r\n*apgar10* :");
		auditStr.append(apgar10);
	    auditStr.append("; ");
		auditStr.append("\r\n*stillborn* :");
		auditStr.append(stillborn);
	    auditStr.append("; ");
		auditStr.append("\r\n*live* :");
		auditStr.append(live);
	    auditStr.append("; ");
		auditStr.append("\r\n*miscarriages* :");
		auditStr.append(miscarriages);
	    auditStr.append("; ");
		auditStr.append("\r\n*maritalStatusAtBirth* :");
		if (maritalStatusAtBirth != null)
			auditStr.append(maritalStatusAtBirth.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pKUTest* :");
		if (pKUTest != null)
			auditStr.append(pKUTest.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*stillBornIndicator* :");
		auditStr.append(stillBornIndicator);
	    auditStr.append("; ");
		auditStr.append("\r\n*breastFeeding* :");
		if (breastFeeding != null)
			auditStr.append(breastFeeding.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*breastFeedingAtDischarge* :");
		if (breastFeedingAtDischarge != null)
			auditStr.append(breastFeedingAtDischarge.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*breastFeedingAt3months* :");
		if (breastFeedingAt3months != null)
			auditStr.append(breastFeedingAt3months.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*breastFeedingAtPHN* :");
		if (breastFeedingAtPHN != null)
			auditStr.append(breastFeedingAtPHN.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*clientNotes* :");
		auditStr.append(clientNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*clientIDOfMother* :");
		auditStr.append(clientIDOfMother);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDateTime* :");
		auditStr.append(dischargeDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstPHNVisitDateTime* :");
		auditStr.append(firstPHNVisitDateTime);
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
		
		String keyClassName = "ClientBirthDetails";
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
		if (this.getClient() != null)
		{
			sb.append("<client>");
			sb.append(this.getClient().toXMLString(domMap)); 	
			sb.append("</client>");		
		}
		if (this.getPlaceOfBirth() != null)
		{
			sb.append("<placeOfBirth>");
			sb.append(this.getPlaceOfBirth().toXMLString()); 
			sb.append("</placeOfBirth>");		
		}
		if (this.getTimeOfBirth() != null)
		{
			sb.append("<timeOfBirth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeOfBirth().toString()));
			sb.append("</timeOfBirth>");		
		}
		if (this.getWeightAtBirth() != null)
		{
			sb.append("<weightAtBirth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWeightAtBirth().toString()));
			sb.append("</weightAtBirth>");		
		}
		if (this.getDateNotified() != null)
		{
			sb.append("<dateNotified>");
			sb.append(new ims.framework.utils.DateTime(this.getDateNotified()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateNotified>");		
		}
		if (this.getDurationOfPregnancy() != null)
		{
			sb.append("<durationOfPregnancy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDurationOfPregnancy().toString()));
			sb.append("</durationOfPregnancy>");		
		}
		if (this.getDeliveryMethod() != null)
		{
			sb.append("<deliveryMethod>");
			sb.append(this.getDeliveryMethod().toXMLString()); 
			sb.append("</deliveryMethod>");		
		}
		if (this.getEpisiotomy() != null)
		{
			sb.append("<episiotomy>");
			sb.append(this.getEpisiotomy().toXMLString()); 
			sb.append("</episiotomy>");		
		}
		if (this.getEpidural() != null)
		{
			sb.append("<epidural>");
			sb.append(this.getEpidural().toXMLString()); 
			sb.append("</epidural>");		
		}
		if (this.getOrderOfBirthOrder() != null)
		{
			sb.append("<orderOfBirthOrder>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOrderOfBirthOrder().toString()));
			sb.append("</orderOfBirthOrder>");		
		}
		if (this.getOrderOfBirthNr() != null)
		{
			sb.append("<orderOfBirthNr>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOrderOfBirthNr().toString()));
			sb.append("</orderOfBirthNr>");		
		}
		if (this.getApgar1() != null)
		{
			sb.append("<apgar1>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApgar1().toString()));
			sb.append("</apgar1>");		
		}
		if (this.getApgar5() != null)
		{
			sb.append("<apgar5>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApgar5().toString()));
			sb.append("</apgar5>");		
		}
		if (this.getApgar10() != null)
		{
			sb.append("<apgar10>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApgar10().toString()));
			sb.append("</apgar10>");		
		}
		if (this.getStillborn() != null)
		{
			sb.append("<stillborn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStillborn().toString()));
			sb.append("</stillborn>");		
		}
		if (this.getLive() != null)
		{
			sb.append("<live>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLive().toString()));
			sb.append("</live>");		
		}
		if (this.getMiscarriages() != null)
		{
			sb.append("<miscarriages>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMiscarriages().toString()));
			sb.append("</miscarriages>");		
		}
		if (this.getMaritalStatusAtBirth() != null)
		{
			sb.append("<maritalStatusAtBirth>");
			sb.append(this.getMaritalStatusAtBirth().toXMLString()); 
			sb.append("</maritalStatusAtBirth>");		
		}
		if (this.getPKUTest() != null)
		{
			sb.append("<pKUTest>");
			sb.append(this.getPKUTest().toXMLString()); 
			sb.append("</pKUTest>");		
		}
		if (this.isStillBornIndicator() != null)
		{
			sb.append("<stillBornIndicator>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isStillBornIndicator().toString()));
			sb.append("</stillBornIndicator>");		
		}
		if (this.getBreastFeeding() != null)
		{
			sb.append("<breastFeeding>");
			sb.append(this.getBreastFeeding().toXMLString()); 
			sb.append("</breastFeeding>");		
		}
		if (this.getBreastFeedingAtDischarge() != null)
		{
			sb.append("<breastFeedingAtDischarge>");
			sb.append(this.getBreastFeedingAtDischarge().toXMLString()); 
			sb.append("</breastFeedingAtDischarge>");		
		}
		if (this.getBreastFeedingAt3months() != null)
		{
			sb.append("<breastFeedingAt3months>");
			sb.append(this.getBreastFeedingAt3months().toXMLString()); 
			sb.append("</breastFeedingAt3months>");		
		}
		if (this.getBreastFeedingAtPHN() != null)
		{
			sb.append("<breastFeedingAtPHN>");
			sb.append(this.getBreastFeedingAtPHN().toXMLString()); 
			sb.append("</breastFeedingAtPHN>");		
		}
		if (this.getClientNotes() != null)
		{
			sb.append("<clientNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClientNotes().toString()));
			sb.append("</clientNotes>");		
		}
		if (this.getClientIDOfMother() != null)
		{
			sb.append("<clientIDOfMother>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClientIDOfMother().toString()));
			sb.append("</clientIDOfMother>");		
		}
		if (this.getDischargeDateTime() != null)
		{
			sb.append("<dischargeDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDateTime>");		
		}
		if (this.getFirstPHNVisitDateTime() != null)
		{
			sb.append("<firstPHNVisitDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getFirstPHNVisitDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</firstPHNVisitDateTime>");		
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
			ClientBirthDetails domainObject = getClientBirthDetailsfromXML(itemEl, factory, domMap);

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
			ClientBirthDetails domainObject = getClientBirthDetailsfromXML(itemEl, factory, domMap);

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
		
	public static ClientBirthDetails getClientBirthDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClientBirthDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClientBirthDetails getClientBirthDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClientBirthDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClientBirthDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClientBirthDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClientBirthDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClientBirthDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClientBirthDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClientBirthDetails)factory.getImportedDomainObject(ClientBirthDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClientBirthDetails();
		}
		String keyClassName = "ClientBirthDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClientBirthDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClientBirthDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("client");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("placeOfBirth");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPlaceOfBirth(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("timeOfBirth");
		if(fldEl != null)
		{	
    		obj.setTimeOfBirth(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("weightAtBirth");
		if(fldEl != null)
		{	
    		obj.setWeightAtBirth(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateNotified");
		if(fldEl != null)
		{	
    		obj.setDateNotified(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("durationOfPregnancy");
		if(fldEl != null)
		{	
    		obj.setDurationOfPregnancy(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("deliveryMethod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDeliveryMethod(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("episiotomy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEpisiotomy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("epidural");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEpidural(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("orderOfBirthOrder");
		if(fldEl != null)
		{	
    		obj.setOrderOfBirthOrder(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("orderOfBirthNr");
		if(fldEl != null)
		{	
    		obj.setOrderOfBirthNr(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("apgar1");
		if(fldEl != null)
		{	
    		obj.setApgar1(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("apgar5");
		if(fldEl != null)
		{	
    		obj.setApgar5(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("apgar10");
		if(fldEl != null)
		{	
    		obj.setApgar10(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("stillborn");
		if(fldEl != null)
		{	
    		obj.setStillborn(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("live");
		if(fldEl != null)
		{	
    		obj.setLive(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("miscarriages");
		if(fldEl != null)
		{	
    		obj.setMiscarriages(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("maritalStatusAtBirth");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMaritalStatusAtBirth(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pKUTest");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPKUTest(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("stillBornIndicator");
		if(fldEl != null)
		{	
    		obj.setStillBornIndicator(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("breastFeeding");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBreastFeeding(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("breastFeedingAtDischarge");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBreastFeedingAtDischarge(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("breastFeedingAt3months");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBreastFeedingAt3months(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("breastFeedingAtPHN");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBreastFeedingAtPHN(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("clientNotes");
		if(fldEl != null)
		{	
    		obj.setClientNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clientIDOfMother");
		if(fldEl != null)
		{	
    		obj.setClientIDOfMother(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeDateTime");
		if(fldEl != null)
		{	
    		obj.setDischargeDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("firstPHNVisitDateTime");
		if(fldEl != null)
		{	
    		obj.setFirstPHNVisitDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String Client = "client";
		public static final String PlaceOfBirth = "placeOfBirth";
		public static final String TimeOfBirth = "timeOfBirth";
		public static final String WeightAtBirth = "weightAtBirth";
		public static final String DateNotified = "dateNotified";
		public static final String DurationOfPregnancy = "durationOfPregnancy";
		public static final String DeliveryMethod = "deliveryMethod";
		public static final String Episiotomy = "episiotomy";
		public static final String Epidural = "epidural";
		public static final String OrderOfBirthOrder = "orderOfBirthOrder";
		public static final String OrderOfBirthNr = "orderOfBirthNr";
		public static final String Apgar1 = "apgar1";
		public static final String Apgar5 = "apgar5";
		public static final String Apgar10 = "apgar10";
		public static final String Stillborn = "stillborn";
		public static final String Live = "live";
		public static final String Miscarriages = "miscarriages";
		public static final String MaritalStatusAtBirth = "maritalStatusAtBirth";
		public static final String PKUTest = "pKUTest";
		public static final String StillBornIndicator = "stillBornIndicator";
		public static final String BreastFeeding = "breastFeeding";
		public static final String BreastFeedingAtDischarge = "breastFeedingAtDischarge";
		public static final String BreastFeedingAt3months = "breastFeedingAt3months";
		public static final String BreastFeedingAtPHN = "breastFeedingAtPHN";
		public static final String ClientNotes = "clientNotes";
		public static final String ClientIDOfMother = "clientIDOfMother";
		public static final String DischargeDateTime = "dischargeDateTime";
		public static final String FirstPHNVisitDateTime = "firstPHNVisitDateTime";
	}
}

