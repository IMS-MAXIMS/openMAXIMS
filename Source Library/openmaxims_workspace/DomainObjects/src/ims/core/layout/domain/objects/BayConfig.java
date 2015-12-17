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
package ims.core.layout.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class BayConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1095100004;
	private static final long serialVersionUID = 1095100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Bay */
	private ims.core.resource.place.domain.objects.Location bay;
	/** Floor Bed Space Layout */
	private ims.core.layout.domain.objects.FloorBedSpaceLayout floorBedSpaceLayout;
	/** isActive */
	private Boolean isActive;
	private Boolean male;
	private Boolean female;
	private Boolean pediatric;
	private ims.domain.lookups.LookupInstance dependency;
	private Integer numOfBeds;
	private Integer numOfOccupiedBeds;
	private String openingTime;
	private String closingTime;
	private Boolean weekdaysOnly;
	private ims.domain.lookups.LookupInstance bayStatus;
	/** 
	  * Collection of ims.core.admin.pas.domain.objects.WardBayClosingDetails.
	  */
	private java.util.List closingDetails;
	/** 
	  * Collection of ims.core.admin.pas.domain.objects.WardBayBlockingDetails.
	  */
	private java.util.List blockingDetails;
	/** 
	  * Collection of ims.core.layout.domain.objects.ReopenOutOfHours.
	  */
	private java.util.List reOpenOutOfHours;
	private ims.domain.lookups.LookupInstance temporaryBayGender;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public BayConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public BayConfig ()
    {
    	super();
    }
    public BayConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.layout.domain.objects.BayConfig.class;
	}


	public ims.core.resource.place.domain.objects.Location getBay() {
		return bay;
	}
	public void setBay(ims.core.resource.place.domain.objects.Location bay) {
		this.bay = bay;
	}

	public ims.core.layout.domain.objects.FloorBedSpaceLayout getFloorBedSpaceLayout() {
		return floorBedSpaceLayout;
	}
	public void setFloorBedSpaceLayout(ims.core.layout.domain.objects.FloorBedSpaceLayout floorBedSpaceLayout) {
		this.floorBedSpaceLayout = floorBedSpaceLayout;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean isMale() {
		return male;
	}
	public void setMale(Boolean male) {
		this.male = male;
	}

	public Boolean isFemale() {
		return female;
	}
	public void setFemale(Boolean female) {
		this.female = female;
	}

	public Boolean isPediatric() {
		return pediatric;
	}
	public void setPediatric(Boolean pediatric) {
		this.pediatric = pediatric;
	}

	public ims.domain.lookups.LookupInstance getDependency() {
		return dependency;
	}
	public void setDependency(ims.domain.lookups.LookupInstance dependency) {
		this.dependency = dependency;
	}

	public Integer getNumOfBeds() {
		return numOfBeds;
	}
	public void setNumOfBeds(Integer numOfBeds) {
		this.numOfBeds = numOfBeds;
	}

	public Integer getNumOfOccupiedBeds() {
		return numOfOccupiedBeds;
	}
	public void setNumOfOccupiedBeds(Integer numOfOccupiedBeds) {
		this.numOfOccupiedBeds = numOfOccupiedBeds;
	}

	public String getOpeningTime() {
		return openingTime;
	}
	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public String getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}

	public Boolean isWeekdaysOnly() {
		return weekdaysOnly;
	}
	public void setWeekdaysOnly(Boolean weekdaysOnly) {
		this.weekdaysOnly = weekdaysOnly;
	}

	public ims.domain.lookups.LookupInstance getBayStatus() {
		return bayStatus;
	}
	public void setBayStatus(ims.domain.lookups.LookupInstance bayStatus) {
		this.bayStatus = bayStatus;
	}

	public java.util.List getClosingDetails() {
		if ( null == closingDetails ) {
			closingDetails = new java.util.ArrayList();
		}
		return closingDetails;
	}
	public void setClosingDetails(java.util.List paramValue) {
		this.closingDetails = paramValue;
	}

	public java.util.List getBlockingDetails() {
		if ( null == blockingDetails ) {
			blockingDetails = new java.util.ArrayList();
		}
		return blockingDetails;
	}
	public void setBlockingDetails(java.util.List paramValue) {
		this.blockingDetails = paramValue;
	}

	public java.util.List getReOpenOutOfHours() {
		if ( null == reOpenOutOfHours ) {
			reOpenOutOfHours = new java.util.ArrayList();
		}
		return reOpenOutOfHours;
	}
	public void setReOpenOutOfHours(java.util.List paramValue) {
		this.reOpenOutOfHours = paramValue;
	}

	public ims.domain.lookups.LookupInstance getTemporaryBayGender() {
		return temporaryBayGender;
	}
	public void setTemporaryBayGender(ims.domain.lookups.LookupInstance temporaryBayGender) {
		this.temporaryBayGender = temporaryBayGender;
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
	// method generated based on 'bayconfig_idx1' unique index.
	public static boolean recordExistForBayAndFloorBedSpaceLayout(ims.domain.ILightweightDomainFactory factory,
		 ims.core.resource.place.domain.objects.Location bay
	,
	 ims.core.layout.domain.objects.FloorBedSpaceLayout floorBedSpaceLayout
	)	
	{
		return recordExistForBayAndFloorBedSpaceLayout(factory, bay, floorBedSpaceLayout, null);
	}	

	// method generated based on 'bayconfig_idx1' unique index.
	public static boolean recordExistForBayAndFloorBedSpaceLayout(ims.domain.ILightweightDomainFactory factory,
		 ims.core.resource.place.domain.objects.Location bay
	,
	 ims.core.layout.domain.objects.FloorBedSpaceLayout floorBedSpaceLayout
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from BayConfig c where ");
		hql.append(" c.bay = :bay ");
		names[0] = "bay";
		values[0] = bay;		
		hql.append(" and "); 
		hql.append(" c.floorBedSpaceLayout = :floorBedSpaceLayout ");
		names[1] = "floorBedSpaceLayout";
		values[1] = floorBedSpaceLayout;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'bayconfig_idx1' unique index.
	public static BayConfig getRecordByBayAndFloorBedSpaceLayout(ims.domain.ILightweightDomainFactory factory,
	 ims.core.resource.place.domain.objects.Location bay
	,
	 ims.core.layout.domain.objects.FloorBedSpaceLayout floorBedSpaceLayout
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from BayConfig c where ");
		hql.append(" c.bay = :bay ");
		names[0] = "bay";
		values[0] = bay;		
		hql.append(" and "); 
		hql.append(" c.floorBedSpaceLayout = :floorBedSpaceLayout ");
		names[1] = "floorBedSpaceLayout";
		values[1] = floorBedSpaceLayout;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (BayConfig)l.get(0);
	}

	public static BayConfig getBayConfigFrombayconfig_idx1(ims.domain.ILightweightDomainFactory factory,
	 ims.core.resource.place.domain.objects.Location bay
	,
	 ims.core.layout.domain.objects.FloorBedSpaceLayout floorBedSpaceLayout
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from BayConfig c where ");
		hql.append(" c.bay = :bay ");
		names[0] = "bay";
		values[0] = bay;		
		hql.append(" and "); 
		hql.append(" c.floorBedSpaceLayout = :floorBedSpaceLayout ");
		names[1] = "floorBedSpaceLayout";
		values[1] = floorBedSpaceLayout;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (BayConfig)l.get(0);
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
		
		auditStr.append("\r\n*bay* :");
		if (bay != null)
		{
			auditStr.append(toShortClassName(bay));
				
		    auditStr.append(bay.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*floorBedSpaceLayout* :");
		if (floorBedSpaceLayout != null)
		{
			auditStr.append(toShortClassName(floorBedSpaceLayout));
				
		    auditStr.append(floorBedSpaceLayout.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*male* :");
		auditStr.append(male);
	    auditStr.append("; ");
		auditStr.append("\r\n*female* :");
		auditStr.append(female);
	    auditStr.append("; ");
		auditStr.append("\r\n*pediatric* :");
		auditStr.append(pediatric);
	    auditStr.append("; ");
		auditStr.append("\r\n*dependency* :");
		if (dependency != null)
			auditStr.append(dependency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*numOfBeds* :");
		auditStr.append(numOfBeds);
	    auditStr.append("; ");
		auditStr.append("\r\n*numOfOccupiedBeds* :");
		auditStr.append(numOfOccupiedBeds);
	    auditStr.append("; ");
		auditStr.append("\r\n*openingTime* :");
		auditStr.append(openingTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*closingTime* :");
		auditStr.append(closingTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*weekdaysOnly* :");
		auditStr.append(weekdaysOnly);
	    auditStr.append("; ");
		auditStr.append("\r\n*bayStatus* :");
		if (bayStatus != null)
			auditStr.append(bayStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*closingDetails* :");
		if (closingDetails != null)
		{
		int i14=0;
		for (i14=0; i14<closingDetails.size(); i14++)
		{
			if (i14 > 0)
				auditStr.append(",");
			ims.core.admin.pas.domain.objects.WardBayClosingDetails obj = (ims.core.admin.pas.domain.objects.WardBayClosingDetails)closingDetails.get(i14);
		    if (obj != null)
			{
				if (i14 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*blockingDetails* :");
		if (blockingDetails != null)
		{
		int i15=0;
		for (i15=0; i15<blockingDetails.size(); i15++)
		{
			if (i15 > 0)
				auditStr.append(",");
			ims.core.admin.pas.domain.objects.WardBayBlockingDetails obj = (ims.core.admin.pas.domain.objects.WardBayBlockingDetails)blockingDetails.get(i15);
		    if (obj != null)
			{
				if (i15 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i15 > 0)
			auditStr.append("] " + i15);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reOpenOutOfHours* :");
		if (reOpenOutOfHours != null)
		{
		int i16=0;
		for (i16=0; i16<reOpenOutOfHours.size(); i16++)
		{
			if (i16 > 0)
				auditStr.append(",");
			ims.core.layout.domain.objects.ReopenOutOfHours obj = (ims.core.layout.domain.objects.ReopenOutOfHours)reOpenOutOfHours.get(i16);
		    if (obj != null)
			{
				if (i16 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*temporaryBayGender* :");
		if (temporaryBayGender != null)
			auditStr.append(temporaryBayGender.getText());
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
		
		String keyClassName = "BayConfig";
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
		if (this.getBay() != null)
		{
			sb.append("<bay>");
			sb.append(this.getBay().toXMLString(domMap)); 	
			sb.append("</bay>");		
		}
		if (this.getFloorBedSpaceLayout() != null)
		{
			sb.append("<floorBedSpaceLayout>");
			sb.append(this.getFloorBedSpaceLayout().toXMLString(domMap)); 	
			sb.append("</floorBedSpaceLayout>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.isMale() != null)
		{
			sb.append("<male>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMale().toString()));
			sb.append("</male>");		
		}
		if (this.isFemale() != null)
		{
			sb.append("<female>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isFemale().toString()));
			sb.append("</female>");		
		}
		if (this.isPediatric() != null)
		{
			sb.append("<pediatric>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPediatric().toString()));
			sb.append("</pediatric>");		
		}
		if (this.getDependency() != null)
		{
			sb.append("<dependency>");
			sb.append(this.getDependency().toXMLString()); 
			sb.append("</dependency>");		
		}
		if (this.getNumOfBeds() != null)
		{
			sb.append("<numOfBeds>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumOfBeds().toString()));
			sb.append("</numOfBeds>");		
		}
		if (this.getNumOfOccupiedBeds() != null)
		{
			sb.append("<numOfOccupiedBeds>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumOfOccupiedBeds().toString()));
			sb.append("</numOfOccupiedBeds>");		
		}
		if (this.getOpeningTime() != null)
		{
			sb.append("<openingTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOpeningTime().toString()));
			sb.append("</openingTime>");		
		}
		if (this.getClosingTime() != null)
		{
			sb.append("<closingTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClosingTime().toString()));
			sb.append("</closingTime>");		
		}
		if (this.isWeekdaysOnly() != null)
		{
			sb.append("<weekdaysOnly>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWeekdaysOnly().toString()));
			sb.append("</weekdaysOnly>");		
		}
		if (this.getBayStatus() != null)
		{
			sb.append("<bayStatus>");
			sb.append(this.getBayStatus().toXMLString()); 
			sb.append("</bayStatus>");		
		}
		if (this.getClosingDetails() != null)
		{
			if (this.getClosingDetails().size() > 0 )
			{
			sb.append("<closingDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getClosingDetails(), domMap));
			sb.append("</closingDetails>");		
			}
		}
		if (this.getBlockingDetails() != null)
		{
			if (this.getBlockingDetails().size() > 0 )
			{
			sb.append("<blockingDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getBlockingDetails(), domMap));
			sb.append("</blockingDetails>");		
			}
		}
		if (this.getReOpenOutOfHours() != null)
		{
			if (this.getReOpenOutOfHours().size() > 0 )
			{
			sb.append("<reOpenOutOfHours>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReOpenOutOfHours(), domMap));
			sb.append("</reOpenOutOfHours>");		
			}
		}
		if (this.getTemporaryBayGender() != null)
		{
			sb.append("<temporaryBayGender>");
			sb.append(this.getTemporaryBayGender().toXMLString()); 
			sb.append("</temporaryBayGender>");		
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
			BayConfig domainObject = getBayConfigfromXML(itemEl, factory, domMap);

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
			BayConfig domainObject = getBayConfigfromXML(itemEl, factory, domMap);

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
		
	public static BayConfig getBayConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getBayConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static BayConfig getBayConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!BayConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!BayConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the BayConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (BayConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(BayConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		BayConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (BayConfig)factory.getImportedDomainObject(BayConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new BayConfig();
		}
		String keyClassName = "BayConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (BayConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, BayConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("bay");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBay(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("floorBedSpaceLayout");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFloorBedSpaceLayout(ims.core.layout.domain.objects.FloorBedSpaceLayout.getFloorBedSpaceLayoutfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("male");
		if(fldEl != null)
		{	
    		obj.setMale(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("female");
		if(fldEl != null)
		{	
    		obj.setFemale(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pediatric");
		if(fldEl != null)
		{	
    		obj.setPediatric(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dependency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDependency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("numOfBeds");
		if(fldEl != null)
		{	
    		obj.setNumOfBeds(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("numOfOccupiedBeds");
		if(fldEl != null)
		{	
    		obj.setNumOfOccupiedBeds(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("openingTime");
		if(fldEl != null)
		{	
    		obj.setOpeningTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("closingTime");
		if(fldEl != null)
		{	
    		obj.setClosingTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("weekdaysOnly");
		if(fldEl != null)
		{	
    		obj.setWeekdaysOnly(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bayStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBayStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("closingDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setClosingDetails(ims.core.admin.pas.domain.objects.WardBayClosingDetails.fromListXMLString(fldEl, factory, obj.getClosingDetails(), domMap));
		}
		fldEl = el.element("blockingDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setBlockingDetails(ims.core.admin.pas.domain.objects.WardBayBlockingDetails.fromListXMLString(fldEl, factory, obj.getBlockingDetails(), domMap));
		}
		fldEl = el.element("reOpenOutOfHours");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setReOpenOutOfHours(ims.core.layout.domain.objects.ReopenOutOfHours.fromListXMLString(fldEl, factory, obj.getReOpenOutOfHours(), domMap));
		}
		fldEl = el.element("temporaryBayGender");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTemporaryBayGender(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "closingDetails"
		, "blockingDetails"
		, "reOpenOutOfHours"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Bay = "bay";
		public static final String FloorBedSpaceLayout = "floorBedSpaceLayout";
		public static final String IsActive = "isActive";
		public static final String Male = "male";
		public static final String Female = "female";
		public static final String Pediatric = "pediatric";
		public static final String Dependency = "dependency";
		public static final String NumOfBeds = "numOfBeds";
		public static final String NumOfOccupiedBeds = "numOfOccupiedBeds";
		public static final String OpeningTime = "openingTime";
		public static final String ClosingTime = "closingTime";
		public static final String WeekdaysOnly = "weekdaysOnly";
		public static final String BayStatus = "bayStatus";
		public static final String ClosingDetails = "closingDetails";
		public static final String BlockingDetails = "blockingDetails";
		public static final String ReOpenOutOfHours = "reOpenOutOfHours";
		public static final String TemporaryBayGender = "temporaryBayGender";
	}
}

