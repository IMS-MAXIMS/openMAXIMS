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
package ims.core.patient.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class PDSAdvancedSearchRequest extends ims.core.patient.domain.objects.PDSAsyncRequest implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1001100016;
	private static final long serialVersionUID = 1001100016L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Search Status */
	private ims.domain.lookups.LookupInstance searchStatus;
	/** SearchType */
	private ims.domain.lookups.LookupInstance searchType;
	/** HistoricDataFlag */
	private ims.domain.lookups.LookupInstance historicDataFlag;
	/** IgnoreHistoryIndicator */
	private ims.domain.lookups.LookupInstance ignoreHistoryIndicator;
	/** NHSNumber New Format */
	private String nHSNumber;
	/** Surname */
	private String surname;
	/** Forename */
	private String forename;
	/** Gender */
	private ims.domain.lookups.LookupInstance gender;
	/** From DateOfBirth */
	private java.util.Date fromDateOfBirth;
	/** ToDateOfBirth */
	private java.util.Date toDateOfBirth;
	/** FromDateOfDeath */
	private java.util.Date fromDateOfDeath;
	/** ToDateOfDeath */
	private java.util.Date toDateOfDeath;
	/** SearchResult
	  * Collection of ims.core.patient.domain.objects.PDSAdvancedSearchResult.
	  */
	private java.util.List searchResult;
	/** patient address */
	private ims.core.generic.domain.objects.Address address;
	/** Primary Care Data - practice code */
	private String gpPracticeCode;
	private String postcode;
	/** MiddleName / 2nd Forename */
	private String middleName;
	/** DOB Range Unit */
	private ims.domain.lookups.LookupInstance dOBRangeUnit;
	/** DOD Range Unit */
	private ims.domain.lookups.LookupInstance dODRangeUnit;
	/** DOB Range Value */
	private Integer dOBRangeValue;
	/** DOD Range Value */
	private Integer dODRangeValue;
	/** Indicate a partial DOB search */
	private ims.domain.lookups.LookupInstance dOBPartialSearchBy;
	/** Indicate a partial DOD search */
	private ims.domain.lookups.LookupInstance dODPartialSearchBy;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PDSAdvancedSearchRequest (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PDSAdvancedSearchRequest ()
    {
    	super();
    }
    public PDSAdvancedSearchRequest (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.PDSAdvancedSearchRequest.class;
	}


	public ims.domain.lookups.LookupInstance getSearchStatus() {
		return searchStatus;
	}
	public void setSearchStatus(ims.domain.lookups.LookupInstance searchStatus) {
		this.searchStatus = searchStatus;
	}

	public ims.domain.lookups.LookupInstance getSearchType() {
		return searchType;
	}
	public void setSearchType(ims.domain.lookups.LookupInstance searchType) {
		this.searchType = searchType;
	}

	public ims.domain.lookups.LookupInstance getHistoricDataFlag() {
		return historicDataFlag;
	}
	public void setHistoricDataFlag(ims.domain.lookups.LookupInstance historicDataFlag) {
		this.historicDataFlag = historicDataFlag;
	}

	public ims.domain.lookups.LookupInstance getIgnoreHistoryIndicator() {
		return ignoreHistoryIndicator;
	}
	public void setIgnoreHistoryIndicator(ims.domain.lookups.LookupInstance ignoreHistoryIndicator) {
		this.ignoreHistoryIndicator = ignoreHistoryIndicator;
	}

	public String getNHSNumber() {
		return nHSNumber;
	}
	public void setNHSNumber(String nHSNumber) {
		if ( null != nHSNumber && nHSNumber.length() > 12 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nHSNumber. Tried to set value: "+
				nHSNumber);
		}
		this.nHSNumber = nHSNumber;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		if ( null != surname && surname.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for surname. Tried to set value: "+
				surname);
		}
		this.surname = surname;
	}

	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		if ( null != forename && forename.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for forename. Tried to set value: "+
				forename);
		}
		this.forename = forename;
	}

	public ims.domain.lookups.LookupInstance getGender() {
		return gender;
	}
	public void setGender(ims.domain.lookups.LookupInstance gender) {
		this.gender = gender;
	}

	public java.util.Date getFromDateOfBirth() {
		return fromDateOfBirth;
	}
	public void setFromDateOfBirth(java.util.Date fromDateOfBirth) {
		this.fromDateOfBirth = fromDateOfBirth;
	}

	public java.util.Date getToDateOfBirth() {
		return toDateOfBirth;
	}
	public void setToDateOfBirth(java.util.Date toDateOfBirth) {
		this.toDateOfBirth = toDateOfBirth;
	}

	public java.util.Date getFromDateOfDeath() {
		return fromDateOfDeath;
	}
	public void setFromDateOfDeath(java.util.Date fromDateOfDeath) {
		this.fromDateOfDeath = fromDateOfDeath;
	}

	public java.util.Date getToDateOfDeath() {
		return toDateOfDeath;
	}
	public void setToDateOfDeath(java.util.Date toDateOfDeath) {
		this.toDateOfDeath = toDateOfDeath;
	}

	public java.util.List getSearchResult() {
		if ( null == searchResult ) {
			searchResult = new java.util.ArrayList();
		}
		return searchResult;
	}
	public void setSearchResult(java.util.List paramValue) {
		this.searchResult = paramValue;
	}

	public ims.core.generic.domain.objects.Address getAddress() {
		return address;
	}
	public void setAddress(ims.core.generic.domain.objects.Address address) {
		this.address = address;
	}

	public String getGpPracticeCode() {
		return gpPracticeCode;
	}
	public void setGpPracticeCode(String gpPracticeCode) {
		if ( null != gpPracticeCode && gpPracticeCode.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for gpPracticeCode. Tried to set value: "+
				gpPracticeCode);
		}
		this.gpPracticeCode = gpPracticeCode;
	}

	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		if ( null != postcode && postcode.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for postcode. Tried to set value: "+
				postcode);
		}
		this.postcode = postcode;
	}

	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		if ( null != middleName && middleName.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for middleName. Tried to set value: "+
				middleName);
		}
		this.middleName = middleName;
	}

	public ims.domain.lookups.LookupInstance getDOBRangeUnit() {
		return dOBRangeUnit;
	}
	public void setDOBRangeUnit(ims.domain.lookups.LookupInstance dOBRangeUnit) {
		this.dOBRangeUnit = dOBRangeUnit;
	}

	public ims.domain.lookups.LookupInstance getDODRangeUnit() {
		return dODRangeUnit;
	}
	public void setDODRangeUnit(ims.domain.lookups.LookupInstance dODRangeUnit) {
		this.dODRangeUnit = dODRangeUnit;
	}

	public Integer getDOBRangeValue() {
		return dOBRangeValue;
	}
	public void setDOBRangeValue(Integer dOBRangeValue) {
		this.dOBRangeValue = dOBRangeValue;
	}

	public Integer getDODRangeValue() {
		return dODRangeValue;
	}
	public void setDODRangeValue(Integer dODRangeValue) {
		this.dODRangeValue = dODRangeValue;
	}

	public ims.domain.lookups.LookupInstance getDOBPartialSearchBy() {
		return dOBPartialSearchBy;
	}
	public void setDOBPartialSearchBy(ims.domain.lookups.LookupInstance dOBPartialSearchBy) {
		this.dOBPartialSearchBy = dOBPartialSearchBy;
	}

	public ims.domain.lookups.LookupInstance getDODPartialSearchBy() {
		return dODPartialSearchBy;
	}
	public void setDODPartialSearchBy(ims.domain.lookups.LookupInstance dODPartialSearchBy) {
		this.dODPartialSearchBy = dODPartialSearchBy;
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
		auditStr.append("\r\n*searchStatus* :");
		if (searchStatus != null)
			auditStr.append(searchStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*searchType* :");
		if (searchType != null)
			auditStr.append(searchType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*historicDataFlag* :");
		if (historicDataFlag != null)
			auditStr.append(historicDataFlag.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*ignoreHistoryIndicator* :");
		if (ignoreHistoryIndicator != null)
			auditStr.append(ignoreHistoryIndicator.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nHSNumber* :");
		auditStr.append(nHSNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*surname* :");
		auditStr.append(surname);
	    auditStr.append("; ");
		auditStr.append("\r\n*forename* :");
		auditStr.append(forename);
	    auditStr.append("; ");
		auditStr.append("\r\n*gender* :");
		if (gender != null)
			auditStr.append(gender.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*fromDateOfBirth* :");
		auditStr.append(fromDateOfBirth);
	    auditStr.append("; ");
		auditStr.append("\r\n*toDateOfBirth* :");
		auditStr.append(toDateOfBirth);
	    auditStr.append("; ");
		auditStr.append("\r\n*fromDateOfDeath* :");
		auditStr.append(fromDateOfDeath);
	    auditStr.append("; ");
		auditStr.append("\r\n*toDateOfDeath* :");
		auditStr.append(toDateOfDeath);
	    auditStr.append("; ");
		auditStr.append("\r\n*searchResult* :");
		if (searchResult != null)
		{
		int i13=0;
		for (i13=0; i13<searchResult.size(); i13++)
		{
			if (i13 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.PDSAdvancedSearchResult obj = (ims.core.patient.domain.objects.PDSAdvancedSearchResult)searchResult.get(i13);
		    if (obj != null)
			{
				if (i13 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*address* :");
		if (address != null)
		{
			auditStr.append(toShortClassName(address));
				
		    auditStr.append(address.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*gpPracticeCode* :");
		auditStr.append(gpPracticeCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*postcode* :");
		auditStr.append(postcode);
	    auditStr.append("; ");
		auditStr.append("\r\n*middleName* :");
		auditStr.append(middleName);
	    auditStr.append("; ");
		auditStr.append("\r\n*dOBRangeUnit* :");
		if (dOBRangeUnit != null)
			auditStr.append(dOBRangeUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dODRangeUnit* :");
		if (dODRangeUnit != null)
			auditStr.append(dODRangeUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dOBRangeValue* :");
		auditStr.append(dOBRangeValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*dODRangeValue* :");
		auditStr.append(dODRangeValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*dOBPartialSearchBy* :");
		if (dOBPartialSearchBy != null)
			auditStr.append(dOBPartialSearchBy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dODPartialSearchBy* :");
		if (dODPartialSearchBy != null)
			auditStr.append(dODPartialSearchBy.getText());
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
		
		String keyClassName = "PDSAdvancedSearchRequest";
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
		if (this.getSearchStatus() != null)
		{
			sb.append("<searchStatus>");
			sb.append(this.getSearchStatus().toXMLString()); 
			sb.append("</searchStatus>");		
		}
		if (this.getSearchType() != null)
		{
			sb.append("<searchType>");
			sb.append(this.getSearchType().toXMLString()); 
			sb.append("</searchType>");		
		}
		if (this.getHistoricDataFlag() != null)
		{
			sb.append("<historicDataFlag>");
			sb.append(this.getHistoricDataFlag().toXMLString()); 
			sb.append("</historicDataFlag>");		
		}
		if (this.getIgnoreHistoryIndicator() != null)
		{
			sb.append("<ignoreHistoryIndicator>");
			sb.append(this.getIgnoreHistoryIndicator().toXMLString()); 
			sb.append("</ignoreHistoryIndicator>");		
		}
		if (this.getNHSNumber() != null)
		{
			sb.append("<nHSNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNHSNumber().toString()));
			sb.append("</nHSNumber>");		
		}
		if (this.getSurname() != null)
		{
			sb.append("<surname>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSurname().toString()));
			sb.append("</surname>");		
		}
		if (this.getForename() != null)
		{
			sb.append("<forename>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getForename().toString()));
			sb.append("</forename>");		
		}
		if (this.getGender() != null)
		{
			sb.append("<gender>");
			sb.append(this.getGender().toXMLString()); 
			sb.append("</gender>");		
		}
		if (this.getFromDateOfBirth() != null)
		{
			sb.append("<fromDateOfBirth>");
			sb.append(new ims.framework.utils.DateTime(this.getFromDateOfBirth()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</fromDateOfBirth>");		
		}
		if (this.getToDateOfBirth() != null)
		{
			sb.append("<toDateOfBirth>");
			sb.append(new ims.framework.utils.DateTime(this.getToDateOfBirth()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</toDateOfBirth>");		
		}
		if (this.getFromDateOfDeath() != null)
		{
			sb.append("<fromDateOfDeath>");
			sb.append(new ims.framework.utils.DateTime(this.getFromDateOfDeath()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</fromDateOfDeath>");		
		}
		if (this.getToDateOfDeath() != null)
		{
			sb.append("<toDateOfDeath>");
			sb.append(new ims.framework.utils.DateTime(this.getToDateOfDeath()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</toDateOfDeath>");		
		}
		if (this.getSearchResult() != null)
		{
			if (this.getSearchResult().size() > 0 )
			{
			sb.append("<searchResult>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSearchResult(), domMap));
			sb.append("</searchResult>");		
			}
		}
		if (this.getAddress() != null)
		{
			sb.append("<address>");
			sb.append(this.getAddress().toXMLString(domMap)); 	
			sb.append("</address>");		
		}
		if (this.getGpPracticeCode() != null)
		{
			sb.append("<gpPracticeCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGpPracticeCode().toString()));
			sb.append("</gpPracticeCode>");		
		}
		if (this.getPostcode() != null)
		{
			sb.append("<postcode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPostcode().toString()));
			sb.append("</postcode>");		
		}
		if (this.getMiddleName() != null)
		{
			sb.append("<middleName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMiddleName().toString()));
			sb.append("</middleName>");		
		}
		if (this.getDOBRangeUnit() != null)
		{
			sb.append("<dOBRangeUnit>");
			sb.append(this.getDOBRangeUnit().toXMLString()); 
			sb.append("</dOBRangeUnit>");		
		}
		if (this.getDODRangeUnit() != null)
		{
			sb.append("<dODRangeUnit>");
			sb.append(this.getDODRangeUnit().toXMLString()); 
			sb.append("</dODRangeUnit>");		
		}
		if (this.getDOBRangeValue() != null)
		{
			sb.append("<dOBRangeValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDOBRangeValue().toString()));
			sb.append("</dOBRangeValue>");		
		}
		if (this.getDODRangeValue() != null)
		{
			sb.append("<dODRangeValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDODRangeValue().toString()));
			sb.append("</dODRangeValue>");		
		}
		if (this.getDOBPartialSearchBy() != null)
		{
			sb.append("<dOBPartialSearchBy>");
			sb.append(this.getDOBPartialSearchBy().toXMLString()); 
			sb.append("</dOBPartialSearchBy>");		
		}
		if (this.getDODPartialSearchBy() != null)
		{
			sb.append("<dODPartialSearchBy>");
			sb.append(this.getDODPartialSearchBy().toXMLString()); 
			sb.append("</dODPartialSearchBy>");		
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
			PDSAdvancedSearchRequest domainObject = getPDSAdvancedSearchRequestfromXML(itemEl, factory, domMap);

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
			PDSAdvancedSearchRequest domainObject = getPDSAdvancedSearchRequestfromXML(itemEl, factory, domMap);

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
		
	public static PDSAdvancedSearchRequest getPDSAdvancedSearchRequestfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPDSAdvancedSearchRequestfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PDSAdvancedSearchRequest getPDSAdvancedSearchRequestfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PDSAdvancedSearchRequest.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PDSAdvancedSearchRequest.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PDSAdvancedSearchRequest class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PDSAdvancedSearchRequest)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PDSAdvancedSearchRequest.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PDSAdvancedSearchRequest ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PDSAdvancedSearchRequest)factory.getImportedDomainObject(PDSAdvancedSearchRequest.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PDSAdvancedSearchRequest();
		}
		String keyClassName = "PDSAdvancedSearchRequest";
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
			return (PDSAdvancedSearchRequest)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PDSAdvancedSearchRequest obj, java.util.HashMap domMap) throws Exception
	{
		ims.core.patient.domain.objects.PDSAsyncRequest.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("searchStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSearchStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("searchType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSearchType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("historicDataFlag");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHistoricDataFlag(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("ignoreHistoryIndicator");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIgnoreHistoryIndicator(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nHSNumber");
		if(fldEl != null)
		{	
    		obj.setNHSNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("surname");
		if(fldEl != null)
		{	
    		obj.setSurname(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("forename");
		if(fldEl != null)
		{	
    		obj.setForename(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("gender");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGender(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("fromDateOfBirth");
		if(fldEl != null)
		{	
    		obj.setFromDateOfBirth(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("toDateOfBirth");
		if(fldEl != null)
		{	
    		obj.setToDateOfBirth(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("fromDateOfDeath");
		if(fldEl != null)
		{	
    		obj.setFromDateOfDeath(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("toDateOfDeath");
		if(fldEl != null)
		{	
    		obj.setToDateOfDeath(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("searchResult");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSearchResult(ims.core.patient.domain.objects.PDSAdvancedSearchResult.fromListXMLString(fldEl, factory, obj.getSearchResult(), domMap));
		}
		fldEl = el.element("address");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAddress(ims.core.generic.domain.objects.Address.getAddressfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("gpPracticeCode");
		if(fldEl != null)
		{	
    		obj.setGpPracticeCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("postcode");
		if(fldEl != null)
		{	
    		obj.setPostcode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("middleName");
		if(fldEl != null)
		{	
    		obj.setMiddleName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dOBRangeUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDOBRangeUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dODRangeUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDODRangeUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dOBRangeValue");
		if(fldEl != null)
		{	
    		obj.setDOBRangeValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dODRangeValue");
		if(fldEl != null)
		{	
    		obj.setDODRangeValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dOBPartialSearchBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDOBPartialSearchBy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dODPartialSearchBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDODPartialSearchBy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "searchResult"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String SearchStatus = "searchStatus";
		public static final String SearchType = "searchType";
		public static final String HistoricDataFlag = "historicDataFlag";
		public static final String IgnoreHistoryIndicator = "ignoreHistoryIndicator";
		public static final String NHSNumber = "nHSNumber";
		public static final String Surname = "surname";
		public static final String Forename = "forename";
		public static final String Gender = "gender";
		public static final String FromDateOfBirth = "fromDateOfBirth";
		public static final String ToDateOfBirth = "toDateOfBirth";
		public static final String FromDateOfDeath = "fromDateOfDeath";
		public static final String ToDateOfDeath = "toDateOfDeath";
		public static final String SearchResult = "searchResult";
		public static final String Address = "address";
		public static final String GpPracticeCode = "gpPracticeCode";
		public static final String Postcode = "postcode";
		public static final String MiddleName = "middleName";
		public static final String DOBRangeUnit = "dOBRangeUnit";
		public static final String DODRangeUnit = "dODRangeUnit";
		public static final String DOBRangeValue = "dOBRangeValue";
		public static final String DODRangeValue = "dODRangeValue";
		public static final String DOBPartialSearchBy = "dOBPartialSearchBy";
		public static final String DODPartialSearchBy = "dODPartialSearchBy";
	}
}

