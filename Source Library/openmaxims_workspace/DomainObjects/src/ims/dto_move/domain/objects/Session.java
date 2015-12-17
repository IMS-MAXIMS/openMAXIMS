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
package ims.dto_move.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class Session extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1105100022;
	private static final long serialVersionUID = 1105100022L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Profile id */
	private Integer profile_id;
	/** Group id */
	private Integer group_id;
	/** Activity id */
	private Integer activityId;
	/** Session date */
	private java.util.Date session_date;
	/** Session start time */
	private Integer start_time;
	/** Session end time */
	private Integer end_time;
	/** maximum appointments */
	private Integer max_appts;
	/** last appointment interval */
	private Integer lastApptInterval;
	/** remaining number of appointments */
	private Integer remAppts;
	/** Internal Location id */
	private Integer internalLocId;
	/** round attendance time */
	private Integer tci_rounding;
	/** booking time remaining */
	private Integer timeRem;
	/** active Y/N */
	private String active;
	/** session state */
	private Integer state;
	/** Session duration */
	private Integer duration;
	/** Session status reason */
	private Integer reason;
	/** Modified indicator Y/N */
	private String modIndicator;
	/** minimum interval */
	private Integer minInterval;
	/** Session description */
	private String description;
	/** ad hoc sesion */
	private String ad_hoc;
	/** booking rights
	  * Collection of ims.dto_move.domain.objects.SessionUser.
	  */
	private java.util.List booking_rights;
	/** exclusion times
	  * Collection of ims.dto_move.domain.objects.SessionExclusionTime.
	  */
	private java.util.List exclTimes;
	/** session detail
	  * Collection of ims.dto_move.domain.objects.SessionDetail.
	  */
	private java.util.List sessionDetail;
	/** actions
	  * Collection of ims.dto_move.domain.objects.SessionAction.
	  */
	private java.util.List actions;
	/** 
	  * Collection of ims.dto_move.domain.objects.SessionListOwner.
	  */
	private java.util.List listOwner;
    public Session (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Session ()
    {
    	super();
    }
    public Session (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.Session.class;
	}


	public Integer getProfile_id() {
		return profile_id;
	}
	public void setProfile_id(Integer profile_id) {
		this.profile_id = profile_id;
	}

	public Integer getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}

	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public java.util.Date getSession_date() {
		return session_date;
	}
	public void setSession_date(java.util.Date session_date) {
		this.session_date = session_date;
	}

	public Integer getStart_time() {
		return start_time;
	}
	public void setStart_time(Integer start_time) {
		this.start_time = start_time;
	}

	public Integer getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Integer end_time) {
		this.end_time = end_time;
	}

	public Integer getMax_appts() {
		return max_appts;
	}
	public void setMax_appts(Integer max_appts) {
		this.max_appts = max_appts;
	}

	public Integer getLastApptInterval() {
		return lastApptInterval;
	}
	public void setLastApptInterval(Integer lastApptInterval) {
		this.lastApptInterval = lastApptInterval;
	}

	public Integer getRemAppts() {
		return remAppts;
	}
	public void setRemAppts(Integer remAppts) {
		this.remAppts = remAppts;
	}

	public Integer getInternalLocId() {
		return internalLocId;
	}
	public void setInternalLocId(Integer internalLocId) {
		this.internalLocId = internalLocId;
	}

	public Integer getTci_rounding() {
		return tci_rounding;
	}
	public void setTci_rounding(Integer tci_rounding) {
		this.tci_rounding = tci_rounding;
	}

	public Integer getTimeRem() {
		return timeRem;
	}
	public void setTimeRem(Integer timeRem) {
		this.timeRem = timeRem;
	}

	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		if ( null != active && active.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for active. Tried to set value: "+
				active);
		}
		this.active = active;
	}

	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getReason() {
		return reason;
	}
	public void setReason(Integer reason) {
		this.reason = reason;
	}

	public String getModIndicator() {
		return modIndicator;
	}
	public void setModIndicator(String modIndicator) {
		if ( null != modIndicator && modIndicator.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for modIndicator. Tried to set value: "+
				modIndicator);
		}
		this.modIndicator = modIndicator;
	}

	public Integer getMinInterval() {
		return minInterval;
	}
	public void setMinInterval(Integer minInterval) {
		this.minInterval = minInterval;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public String getAd_hoc() {
		return ad_hoc;
	}
	public void setAd_hoc(String ad_hoc) {
		if ( null != ad_hoc && ad_hoc.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for ad_hoc. Tried to set value: "+
				ad_hoc);
		}
		this.ad_hoc = ad_hoc;
	}

	public java.util.List getBooking_rights() {
		if ( null == booking_rights ) {
			booking_rights = new java.util.ArrayList();
		}
		return booking_rights;
	}
	public void setBooking_rights(java.util.List paramValue) {
		this.booking_rights = paramValue;
	}

	public java.util.List getExclTimes() {
		if ( null == exclTimes ) {
			exclTimes = new java.util.ArrayList();
		}
		return exclTimes;
	}
	public void setExclTimes(java.util.List paramValue) {
		this.exclTimes = paramValue;
	}

	public java.util.List getSessionDetail() {
		if ( null == sessionDetail ) {
			sessionDetail = new java.util.ArrayList();
		}
		return sessionDetail;
	}
	public void setSessionDetail(java.util.List paramValue) {
		this.sessionDetail = paramValue;
	}

	public java.util.List getActions() {
		if ( null == actions ) {
			actions = new java.util.ArrayList();
		}
		return actions;
	}
	public void setActions(java.util.List paramValue) {
		this.actions = paramValue;
	}

	public java.util.List getListOwner() {
		if ( null == listOwner ) {
			listOwner = new java.util.ArrayList();
		}
		return listOwner;
	}
	public void setListOwner(java.util.List paramValue) {
		this.listOwner = paramValue;
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
		
		auditStr.append("\r\n*profile_id* :");
		auditStr.append(profile_id);
	    auditStr.append("; ");
		auditStr.append("\r\n*group_id* :");
		auditStr.append(group_id);
	    auditStr.append("; ");
		auditStr.append("\r\n*activityId* :");
		auditStr.append(activityId);
	    auditStr.append("; ");
		auditStr.append("\r\n*session_date* :");
		auditStr.append(session_date);
	    auditStr.append("; ");
		auditStr.append("\r\n*start_time* :");
		auditStr.append(start_time);
	    auditStr.append("; ");
		auditStr.append("\r\n*end_time* :");
		auditStr.append(end_time);
	    auditStr.append("; ");
		auditStr.append("\r\n*max_appts* :");
		auditStr.append(max_appts);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastApptInterval* :");
		auditStr.append(lastApptInterval);
	    auditStr.append("; ");
		auditStr.append("\r\n*remAppts* :");
		auditStr.append(remAppts);
	    auditStr.append("; ");
		auditStr.append("\r\n*internalLocId* :");
		auditStr.append(internalLocId);
	    auditStr.append("; ");
		auditStr.append("\r\n*tci_rounding* :");
		auditStr.append(tci_rounding);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeRem* :");
		auditStr.append(timeRem);
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*state* :");
		auditStr.append(state);
	    auditStr.append("; ");
		auditStr.append("\r\n*duration* :");
		auditStr.append(duration);
	    auditStr.append("; ");
		auditStr.append("\r\n*reason* :");
		auditStr.append(reason);
	    auditStr.append("; ");
		auditStr.append("\r\n*modIndicator* :");
		auditStr.append(modIndicator);
	    auditStr.append("; ");
		auditStr.append("\r\n*minInterval* :");
		auditStr.append(minInterval);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*ad_hoc* :");
		auditStr.append(ad_hoc);
	    auditStr.append("; ");
		auditStr.append("\r\n*booking_rights* :");
		if (booking_rights != null)
		{
		int i21=0;
		for (i21=0; i21<booking_rights.size(); i21++)
		{
			if (i21 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.SessionUser obj = (ims.dto_move.domain.objects.SessionUser)booking_rights.get(i21);
		    if (obj != null)
			{
				if (i21 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i21 > 0)
			auditStr.append("] " + i21);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*exclTimes* :");
		if (exclTimes != null)
		{
		int i22=0;
		for (i22=0; i22<exclTimes.size(); i22++)
		{
			if (i22 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.SessionExclusionTime obj = (ims.dto_move.domain.objects.SessionExclusionTime)exclTimes.get(i22);
		    if (obj != null)
			{
				if (i22 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i22 > 0)
			auditStr.append("] " + i22);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sessionDetail* :");
		if (sessionDetail != null)
		{
		int i23=0;
		for (i23=0; i23<sessionDetail.size(); i23++)
		{
			if (i23 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.SessionDetail obj = (ims.dto_move.domain.objects.SessionDetail)sessionDetail.get(i23);
		    if (obj != null)
			{
				if (i23 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i23 > 0)
			auditStr.append("] " + i23);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*actions* :");
		if (actions != null)
		{
		int i24=0;
		for (i24=0; i24<actions.size(); i24++)
		{
			if (i24 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.SessionAction obj = (ims.dto_move.domain.objects.SessionAction)actions.get(i24);
		    if (obj != null)
			{
				if (i24 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i24 > 0)
			auditStr.append("] " + i24);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*listOwner* :");
		if (listOwner != null)
		{
		int i25=0;
		for (i25=0; i25<listOwner.size(); i25++)
		{
			if (i25 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.SessionListOwner obj = (ims.dto_move.domain.objects.SessionListOwner)listOwner.get(i25);
		    if (obj != null)
			{
				if (i25 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i25 > 0)
			auditStr.append("] " + i25);
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
		
		String keyClassName = "Session";
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
		if (this.getProfile_id() != null)
		{
			sb.append("<profile_id>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProfile_id().toString()));
			sb.append("</profile_id>");		
		}
		if (this.getGroup_id() != null)
		{
			sb.append("<group_id>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGroup_id().toString()));
			sb.append("</group_id>");		
		}
		if (this.getActivityId() != null)
		{
			sb.append("<activityId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActivityId().toString()));
			sb.append("</activityId>");		
		}
		if (this.getSession_date() != null)
		{
			sb.append("<session_date>");
			sb.append(new ims.framework.utils.DateTime(this.getSession_date()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</session_date>");		
		}
		if (this.getStart_time() != null)
		{
			sb.append("<start_time>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStart_time().toString()));
			sb.append("</start_time>");		
		}
		if (this.getEnd_time() != null)
		{
			sb.append("<end_time>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEnd_time().toString()));
			sb.append("</end_time>");		
		}
		if (this.getMax_appts() != null)
		{
			sb.append("<max_appts>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMax_appts().toString()));
			sb.append("</max_appts>");		
		}
		if (this.getLastApptInterval() != null)
		{
			sb.append("<lastApptInterval>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLastApptInterval().toString()));
			sb.append("</lastApptInterval>");		
		}
		if (this.getRemAppts() != null)
		{
			sb.append("<remAppts>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRemAppts().toString()));
			sb.append("</remAppts>");		
		}
		if (this.getInternalLocId() != null)
		{
			sb.append("<internalLocId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInternalLocId().toString()));
			sb.append("</internalLocId>");		
		}
		if (this.getTci_rounding() != null)
		{
			sb.append("<tci_rounding>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTci_rounding().toString()));
			sb.append("</tci_rounding>");		
		}
		if (this.getTimeRem() != null)
		{
			sb.append("<timeRem>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeRem().toString()));
			sb.append("</timeRem>");		
		}
		if (this.getActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActive().toString()));
			sb.append("</active>");		
		}
		if (this.getState() != null)
		{
			sb.append("<state>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getState().toString()));
			sb.append("</state>");		
		}
		if (this.getDuration() != null)
		{
			sb.append("<duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuration().toString()));
			sb.append("</duration>");		
		}
		if (this.getReason() != null)
		{
			sb.append("<reason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReason().toString()));
			sb.append("</reason>");		
		}
		if (this.getModIndicator() != null)
		{
			sb.append("<modIndicator>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getModIndicator().toString()));
			sb.append("</modIndicator>");		
		}
		if (this.getMinInterval() != null)
		{
			sb.append("<minInterval>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMinInterval().toString()));
			sb.append("</minInterval>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getAd_hoc() != null)
		{
			sb.append("<ad_hoc>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAd_hoc().toString()));
			sb.append("</ad_hoc>");		
		}
		if (this.getBooking_rights() != null)
		{
			if (this.getBooking_rights().size() > 0 )
			{
			sb.append("<booking_rights>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getBooking_rights(), domMap));
			sb.append("</booking_rights>");		
			}
		}
		if (this.getExclTimes() != null)
		{
			if (this.getExclTimes().size() > 0 )
			{
			sb.append("<exclTimes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getExclTimes(), domMap));
			sb.append("</exclTimes>");		
			}
		}
		if (this.getSessionDetail() != null)
		{
			if (this.getSessionDetail().size() > 0 )
			{
			sb.append("<sessionDetail>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSessionDetail(), domMap));
			sb.append("</sessionDetail>");		
			}
		}
		if (this.getActions() != null)
		{
			if (this.getActions().size() > 0 )
			{
			sb.append("<actions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActions(), domMap));
			sb.append("</actions>");		
			}
		}
		if (this.getListOwner() != null)
		{
			if (this.getListOwner().size() > 0 )
			{
			sb.append("<listOwner>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getListOwner(), domMap));
			sb.append("</listOwner>");		
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
			Session domainObject = getSessionfromXML(itemEl, factory, domMap);

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
			Session domainObject = getSessionfromXML(itemEl, factory, domMap);

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
		
	public static Session getSessionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSessionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Session getSessionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Session.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Session.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Session class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Session)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Session.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Session ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Session)factory.getImportedDomainObject(Session.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Session();
		}
		String keyClassName = "Session";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Session)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Session obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("profile_id");
		if(fldEl != null)
		{	
    		obj.setProfile_id(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("group_id");
		if(fldEl != null)
		{	
    		obj.setGroup_id(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activityId");
		if(fldEl != null)
		{	
    		obj.setActivityId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("session_date");
		if(fldEl != null)
		{	
    		obj.setSession_date(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("start_time");
		if(fldEl != null)
		{	
    		obj.setStart_time(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("end_time");
		if(fldEl != null)
		{	
    		obj.setEnd_time(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("max_appts");
		if(fldEl != null)
		{	
    		obj.setMax_appts(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lastApptInterval");
		if(fldEl != null)
		{	
    		obj.setLastApptInterval(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("remAppts");
		if(fldEl != null)
		{	
    		obj.setRemAppts(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("internalLocId");
		if(fldEl != null)
		{	
    		obj.setInternalLocId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tci_rounding");
		if(fldEl != null)
		{	
    		obj.setTci_rounding(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("timeRem");
		if(fldEl != null)
		{	
    		obj.setTimeRem(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("state");
		if(fldEl != null)
		{	
    		obj.setState(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("duration");
		if(fldEl != null)
		{	
    		obj.setDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reason");
		if(fldEl != null)
		{	
    		obj.setReason(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("modIndicator");
		if(fldEl != null)
		{	
    		obj.setModIndicator(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("minInterval");
		if(fldEl != null)
		{	
    		obj.setMinInterval(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ad_hoc");
		if(fldEl != null)
		{	
    		obj.setAd_hoc(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("booking_rights");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setBooking_rights(ims.dto_move.domain.objects.SessionUser.fromListXMLString(fldEl, factory, obj.getBooking_rights(), domMap));
		}
		fldEl = el.element("exclTimes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setExclTimes(ims.dto_move.domain.objects.SessionExclusionTime.fromListXMLString(fldEl, factory, obj.getExclTimes(), domMap));
		}
		fldEl = el.element("sessionDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSessionDetail(ims.dto_move.domain.objects.SessionDetail.fromListXMLString(fldEl, factory, obj.getSessionDetail(), domMap));
		}
		fldEl = el.element("actions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setActions(ims.dto_move.domain.objects.SessionAction.fromListXMLString(fldEl, factory, obj.getActions(), domMap));
		}
		fldEl = el.element("listOwner");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setListOwner(ims.dto_move.domain.objects.SessionListOwner.fromListXMLString(fldEl, factory, obj.getListOwner(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "booking_rights"
		, "exclTimes"
		, "sessionDetail"
		, "actions"
		, "listOwner"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Profile_id = "profile_id";
		public static final String Group_id = "group_id";
		public static final String ActivityId = "activityId";
		public static final String Session_date = "session_date";
		public static final String Start_time = "start_time";
		public static final String End_time = "end_time";
		public static final String Max_appts = "max_appts";
		public static final String LastApptInterval = "lastApptInterval";
		public static final String RemAppts = "remAppts";
		public static final String InternalLocId = "internalLocId";
		public static final String Tci_rounding = "tci_rounding";
		public static final String TimeRem = "timeRem";
		public static final String Active = "active";
		public static final String State = "state";
		public static final String Duration = "duration";
		public static final String Reason = "reason";
		public static final String ModIndicator = "modIndicator";
		public static final String MinInterval = "minInterval";
		public static final String Description = "description";
		public static final String Ad_hoc = "ad_hoc";
		public static final String Booking_rights = "booking_rights";
		public static final String ExclTimes = "exclTimes";
		public static final String SessionDetail = "sessionDetail";
		public static final String Actions = "actions";
		public static final String ListOwner = "listOwner";
	}
}

