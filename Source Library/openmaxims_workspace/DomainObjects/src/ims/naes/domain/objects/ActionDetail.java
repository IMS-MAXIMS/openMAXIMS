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
package ims.naes.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ActionDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1097100002;
	private static final long serialVersionUID = 1097100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Action */
	private ims.domain.lookups.LookupInstance action;
	/** StartDate */
	private java.util.Date startDate;
	/** Current Status */
	private ims.naes.domain.objects.ActionDetailStatus currentStatus;
	/** Responsible Technician */
	private ims.core.resource.people.domain.objects.MemberOfStaff responsibleTechnician;
	/** Time Elapsed */
	private Integer timeElapsed;
	/** Comment */
	private String comment;
	/** Status History
	  * Collection of ims.naes.domain.objects.ActionDetailStatus.
	  */
	private java.util.Set statusHistory;
	/** ActionTemplate */
	private ims.naes.domain.objects.ActionPlanTemplate actionTemplate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ActionDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ActionDetail ()
    {
    	super();
    }
    public ActionDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.naes.domain.objects.ActionDetail.class;
	}


	public ims.domain.lookups.LookupInstance getAction() {
		return action;
	}
	public void setAction(ims.domain.lookups.LookupInstance action) {
		this.action = action;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public ims.naes.domain.objects.ActionDetailStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.naes.domain.objects.ActionDetailStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getResponsibleTechnician() {
		return responsibleTechnician;
	}
	public void setResponsibleTechnician(ims.core.resource.people.domain.objects.MemberOfStaff responsibleTechnician) {
		this.responsibleTechnician = responsibleTechnician;
	}

	public Integer getTimeElapsed() {
		return timeElapsed;
	}
	public void setTimeElapsed(Integer timeElapsed) {
		this.timeElapsed = timeElapsed;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
	}

	public java.util.Set getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.HashSet();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.Set paramValue) {
		this.statusHistory = paramValue;
	}

	public ims.naes.domain.objects.ActionPlanTemplate getActionTemplate() {
		return actionTemplate;
	}
	public void setActionTemplate(ims.naes.domain.objects.ActionPlanTemplate actionTemplate) {
		this.actionTemplate = actionTemplate;
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
		
		auditStr.append("\r\n*action* :");
		if (action != null)
			auditStr.append(action.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
		{
			auditStr.append(toShortClassName(currentStatus));
				
		    auditStr.append(currentStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleTechnician* :");
		if (responsibleTechnician != null)
		{
			auditStr.append(toShortClassName(responsibleTechnician));
				
		    auditStr.append(responsibleTechnician.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*timeElapsed* :");
		auditStr.append(timeElapsed);
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*statusHistory* :");
		if (statusHistory != null)
		{
			java.util.Iterator it7 = statusHistory.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.naes.domain.objects.ActionDetailStatus obj = (ims.naes.domain.objects.ActionDetailStatus)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*actionTemplate* :");
		if (actionTemplate != null)
		{
			auditStr.append(toShortClassName(actionTemplate));
				
		    auditStr.append(actionTemplate.getId());
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
		
		String keyClassName = "ActionDetail";
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
		if (this.getAction() != null)
		{
			sb.append("<action>");
			sb.append(this.getAction().toXMLString()); 
			sb.append("</action>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString(domMap)); 	
			sb.append("</currentStatus>");		
		}
		if (this.getResponsibleTechnician() != null)
		{
			sb.append("<responsibleTechnician>");
			sb.append(this.getResponsibleTechnician().toXMLString(domMap)); 	
			sb.append("</responsibleTechnician>");		
		}
		if (this.getTimeElapsed() != null)
		{
			sb.append("<timeElapsed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeElapsed().toString()));
			sb.append("</timeElapsed>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.getStatusHistory() != null)
		{
			if (this.getStatusHistory().size() > 0 )
			{
			sb.append("<statusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStatusHistory(), domMap));
			sb.append("</statusHistory>");		
			}
		}
		if (this.getActionTemplate() != null)
		{
			sb.append("<actionTemplate>");
			sb.append(this.getActionTemplate().toXMLString(domMap)); 	
			sb.append("</actionTemplate>");		
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
			ActionDetail domainObject = getActionDetailfromXML(itemEl, factory, domMap);

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
			ActionDetail domainObject = getActionDetailfromXML(itemEl, factory, domMap);

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
		
	public static ActionDetail getActionDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getActionDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ActionDetail getActionDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ActionDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ActionDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ActionDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ActionDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ActionDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ActionDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ActionDetail)factory.getImportedDomainObject(ActionDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ActionDetail();
		}
		String keyClassName = "ActionDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ActionDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ActionDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("action");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAction(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.naes.domain.objects.ActionDetailStatus.getActionDetailStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("responsibleTechnician");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleTechnician(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("timeElapsed");
		if(fldEl != null)
		{	
    		obj.setTimeElapsed(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStatusHistory(ims.naes.domain.objects.ActionDetailStatus.fromSetXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("actionTemplate");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActionTemplate(ims.naes.domain.objects.ActionPlanTemplate.getActionPlanTemplatefromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "statusHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Action = "action";
		public static final String StartDate = "startDate";
		public static final String CurrentStatus = "currentStatus";
		public static final String ResponsibleTechnician = "responsibleTechnician";
		public static final String TimeElapsed = "timeElapsed";
		public static final String Comment = "comment";
		public static final String StatusHistory = "statusHistory";
		public static final String ActionTemplate = "actionTemplate";
	}
}

