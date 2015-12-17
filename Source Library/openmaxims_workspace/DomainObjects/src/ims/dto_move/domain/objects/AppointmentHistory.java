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
 * @author Barbara Worwood
 * Generated.
 */


public class AppointmentHistory extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1105100033;
	private static final long serialVersionUID = 1105100033L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private java.util.Date historyDate;
	private Integer historyReason;
	private Integer status;
	private java.util.Date dateReallocated;
	private ims.core.resource.people.domain.objects.MemberOfStaff changedBy;
	private ims.dto_move.domain.objects.Session origSession;
	private ims.dto_move.domain.objects.Session endSession;
	private Integer origSessDetailId;
	private java.util.Date histCreationDate;
	private String firstFlag;
	private Integer apptDetailId;
    public AppointmentHistory (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public AppointmentHistory ()
    {
    	super();
		isComponentClass=true;
    }
    public AppointmentHistory (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.AppointmentHistory.class;
	}


	public java.util.Date getHistoryDate() {
		return historyDate;
	}
	public void setHistoryDate(java.util.Date historyDate) {
		this.historyDate = historyDate;
	}

	public Integer getHistoryReason() {
		return historyReason;
	}
	public void setHistoryReason(Integer historyReason) {
		this.historyReason = historyReason;
	}

	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	public java.util.Date getDateReallocated() {
		return dateReallocated;
	}
	public void setDateReallocated(java.util.Date dateReallocated) {
		this.dateReallocated = dateReallocated;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getChangedBy() {
		return changedBy;
	}
	public void setChangedBy(ims.core.resource.people.domain.objects.MemberOfStaff changedBy) {
		this.changedBy = changedBy;
	}

	public ims.dto_move.domain.objects.Session getOrigSession() {
		return origSession;
	}
	public void setOrigSession(ims.dto_move.domain.objects.Session origSession) {
		this.origSession = origSession;
	}

	public ims.dto_move.domain.objects.Session getEndSession() {
		return endSession;
	}
	public void setEndSession(ims.dto_move.domain.objects.Session endSession) {
		this.endSession = endSession;
	}

	public Integer getOrigSessDetailId() {
		return origSessDetailId;
	}
	public void setOrigSessDetailId(Integer origSessDetailId) {
		this.origSessDetailId = origSessDetailId;
	}

	public java.util.Date getHistCreationDate() {
		return histCreationDate;
	}
	public void setHistCreationDate(java.util.Date histCreationDate) {
		this.histCreationDate = histCreationDate;
	}

	public String getFirstFlag() {
		return firstFlag;
	}
	public void setFirstFlag(String firstFlag) {
		if ( null != firstFlag && firstFlag.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for firstFlag. Tried to set value: "+
				firstFlag);
		}
		this.firstFlag = firstFlag;
	}

	public Integer getApptDetailId() {
		return apptDetailId;
	}
	public void setApptDetailId(Integer apptDetailId) {
		this.apptDetailId = apptDetailId;
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
		
		auditStr.append("\r\n*historyDate* :");
		auditStr.append(historyDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*historyReason* :");
		auditStr.append(historyReason);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		auditStr.append(status);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateReallocated* :");
		auditStr.append(dateReallocated);
	    auditStr.append("; ");
		auditStr.append("\r\n*changedBy* :");
		if (changedBy != null)
		{
			auditStr.append(toShortClassName(changedBy));
				
		    auditStr.append(changedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*origSession* :");
		if (origSession != null)
		{
			auditStr.append(toShortClassName(origSession));
				
		    auditStr.append(origSession.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*endSession* :");
		if (endSession != null)
		{
			auditStr.append(toShortClassName(endSession));
				
		    auditStr.append(endSession.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*origSessDetailId* :");
		auditStr.append(origSessDetailId);
	    auditStr.append("; ");
		auditStr.append("\r\n*histCreationDate* :");
		auditStr.append(histCreationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstFlag* :");
		auditStr.append(firstFlag);
	    auditStr.append("; ");
		auditStr.append("\r\n*apptDetailId* :");
		auditStr.append(apptDetailId);
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
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getHistoryDate() != null)
		{
			sb.append("<historyDate>");
			sb.append(new ims.framework.utils.DateTime(this.getHistoryDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</historyDate>");		
		}
		if (this.getHistoryReason() != null)
		{
			sb.append("<historyReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHistoryReason().toString()));
			sb.append("</historyReason>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStatus().toString()));
			sb.append("</status>");		
		}
		if (this.getDateReallocated() != null)
		{
			sb.append("<dateReallocated>");
			sb.append(new ims.framework.utils.DateTime(this.getDateReallocated()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateReallocated>");		
		}
		if (this.getChangedBy() != null)
		{
			sb.append("<changedBy>");
			sb.append(this.getChangedBy().toXMLString(domMap)); 	
			sb.append("</changedBy>");		
		}
		if (this.getOrigSession() != null)
		{
			sb.append("<origSession>");
			sb.append(this.getOrigSession().toXMLString(domMap)); 	
			sb.append("</origSession>");		
		}
		if (this.getEndSession() != null)
		{
			sb.append("<endSession>");
			sb.append(this.getEndSession().toXMLString(domMap)); 	
			sb.append("</endSession>");		
		}
		if (this.getOrigSessDetailId() != null)
		{
			sb.append("<origSessDetailId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOrigSessDetailId().toString()));
			sb.append("</origSessDetailId>");		
		}
		if (this.getHistCreationDate() != null)
		{
			sb.append("<histCreationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getHistCreationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</histCreationDate>");		
		}
		if (this.getFirstFlag() != null)
		{
			sb.append("<firstFlag>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFirstFlag().toString()));
			sb.append("</firstFlag>");		
		}
		if (this.getApptDetailId() != null)
		{
			sb.append("<apptDetailId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApptDetailId().toString()));
			sb.append("</apptDetailId>");		
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
			AppointmentHistory domainObject = getAppointmentHistoryfromXML(itemEl, factory, domMap);

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
			AppointmentHistory domainObject = getAppointmentHistoryfromXML(itemEl, factory, domMap);

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
		
	public static AppointmentHistory getAppointmentHistoryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppointmentHistoryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppointmentHistory getAppointmentHistoryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppointmentHistory.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppointmentHistory.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppointmentHistory class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppointmentHistory)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppointmentHistory.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppointmentHistory ret = null;
		if (ret == null)
		{
			ret = new AppointmentHistory();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppointmentHistory obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("historyDate");
		if(fldEl != null)
		{	
    		obj.setHistoryDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("historyReason");
		if(fldEl != null)
		{	
    		obj.setHistoryReason(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{	
    		obj.setStatus(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateReallocated");
		if(fldEl != null)
		{	
    		obj.setDateReallocated(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("changedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setChangedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("origSession");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOrigSession(ims.dto_move.domain.objects.Session.getSessionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("endSession");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEndSession(ims.dto_move.domain.objects.Session.getSessionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("origSessDetailId");
		if(fldEl != null)
		{	
    		obj.setOrigSessDetailId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("histCreationDate");
		if(fldEl != null)
		{	
    		obj.setHistCreationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("firstFlag");
		if(fldEl != null)
		{	
    		obj.setFirstFlag(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("apptDetailId");
		if(fldEl != null)
		{	
    		obj.setApptDetailId(new Integer(fldEl.getTextTrim()));	
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
		public static final String HistoryDate = "historyDate";
		public static final String HistoryReason = "historyReason";
		public static final String Status = "status";
		public static final String DateReallocated = "dateReallocated";
		public static final String ChangedBy = "changedBy";
		public static final String OrigSession = "origSession";
		public static final String EndSession = "endSession";
		public static final String OrigSessDetailId = "origSessDetailId";
		public static final String HistCreationDate = "histCreationDate";
		public static final String FirstFlag = "firstFlag";
		public static final String ApptDetailId = "apptDetailId";
	}
}

