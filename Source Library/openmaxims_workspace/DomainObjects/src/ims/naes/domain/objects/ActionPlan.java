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


public class ActionPlan extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1097100001;
	private static final long serialVersionUID = 1097100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Date Commenced */
	private java.util.Date dateCommenced;
	/** Order Number */
	private String orderNumber;
	/** Date Completed */
	private java.util.Date dateCompleted;
	/** Comment */
	private String comment;
	/** Recall */
	private ims.domain.lookups.LookupInstance recall;
	/** Recall In */
	private Integer recallIn;
	/** Recall Period */
	private ims.domain.lookups.LookupInstance recallPeriod;
	/** Actions
	  * Collection of ims.naes.domain.objects.ActionDetail.
	  */
	private java.util.List actions;
	private String ncpComment;
	/** NAES Referral */
	private ims.naes.domain.objects.NAESReferral nAESReferral;
	/** Sclera */
	private String sclera;
	/** QuarterYear */
	private Integer quarterYear;
	/** FinalCure */
	private String finalCure;
	/** BatchNumber */
	private String batchNumber;
	/** 6 Month Open Period End Date */
	private java.util.Date _6MonthOpenPeriod;
	/** Actions Added Within 6 Month Period */
	private Boolean actionsAddedWithin6MonthPeriod;
	/** If Quarter is changed this will be added to
	  * Collection of ims.naes.domain.objects.ActionPlanQuarter.
	  */
	private java.util.Set quarterHistory;
	private ims.naes.domain.objects.EyesInOrderNumber eyesInOrderNumber;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ActionPlan (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ActionPlan ()
    {
    	super();
    }
    public ActionPlan (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.naes.domain.objects.ActionPlan.class;
	}


	public java.util.Date getDateCommenced() {
		return dateCommenced;
	}
	public void setDateCommenced(java.util.Date dateCommenced) {
		this.dateCommenced = dateCommenced;
	}

	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		if ( null != orderNumber && orderNumber.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for orderNumber. Tried to set value: "+
				orderNumber);
		}
		this.orderNumber = orderNumber;
	}

	public java.util.Date getDateCompleted() {
		return dateCompleted;
	}
	public void setDateCompleted(java.util.Date dateCompleted) {
		this.dateCompleted = dateCompleted;
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

	public ims.domain.lookups.LookupInstance getRecall() {
		return recall;
	}
	public void setRecall(ims.domain.lookups.LookupInstance recall) {
		this.recall = recall;
	}

	public Integer getRecallIn() {
		return recallIn;
	}
	public void setRecallIn(Integer recallIn) {
		this.recallIn = recallIn;
	}

	public ims.domain.lookups.LookupInstance getRecallPeriod() {
		return recallPeriod;
	}
	public void setRecallPeriod(ims.domain.lookups.LookupInstance recallPeriod) {
		this.recallPeriod = recallPeriod;
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

	public String getNcpComment() {
		return ncpComment;
	}
	public void setNcpComment(String ncpComment) {
		if ( null != ncpComment && ncpComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for ncpComment. Tried to set value: "+
				ncpComment);
		}
		this.ncpComment = ncpComment;
	}

	public ims.naes.domain.objects.NAESReferral getNAESReferral() {
		return nAESReferral;
	}
	public void setNAESReferral(ims.naes.domain.objects.NAESReferral nAESReferral) {
		this.nAESReferral = nAESReferral;
	}

	public String getSclera() {
		return sclera;
	}
	public void setSclera(String sclera) {
		if ( null != sclera && sclera.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for sclera. Tried to set value: "+
				sclera);
		}
		this.sclera = sclera;
	}

	public Integer getQuarterYear() {
		return quarterYear;
	}
	public void setQuarterYear(Integer quarterYear) {
		this.quarterYear = quarterYear;
	}

	public String getFinalCure() {
		return finalCure;
	}
	public void setFinalCure(String finalCure) {
		if ( null != finalCure && finalCure.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for finalCure. Tried to set value: "+
				finalCure);
		}
		this.finalCure = finalCure;
	}

	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		if ( null != batchNumber && batchNumber.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for batchNumber. Tried to set value: "+
				batchNumber);
		}
		this.batchNumber = batchNumber;
	}

	public java.util.Date get_6MonthOpenPeriod() {
		return _6MonthOpenPeriod;
	}
	public void set_6MonthOpenPeriod(java.util.Date _6MonthOpenPeriod) {
		this._6MonthOpenPeriod = _6MonthOpenPeriod;
	}

	public Boolean isActionsAddedWithin6MonthPeriod() {
		return actionsAddedWithin6MonthPeriod;
	}
	public void setActionsAddedWithin6MonthPeriod(Boolean actionsAddedWithin6MonthPeriod) {
		this.actionsAddedWithin6MonthPeriod = actionsAddedWithin6MonthPeriod;
	}

	public java.util.Set getQuarterHistory() {
		if ( null == quarterHistory ) {
			quarterHistory = new java.util.HashSet();
		}
		return quarterHistory;
	}
	public void setQuarterHistory(java.util.Set paramValue) {
		this.quarterHistory = paramValue;
	}

	public ims.naes.domain.objects.EyesInOrderNumber getEyesInOrderNumber() {
		return eyesInOrderNumber;
	}
	public void setEyesInOrderNumber(ims.naes.domain.objects.EyesInOrderNumber eyesInOrderNumber) {
		this.eyesInOrderNumber = eyesInOrderNumber;
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
		
		auditStr.append("\r\n*dateCommenced* :");
		auditStr.append(dateCommenced);
	    auditStr.append("; ");
		auditStr.append("\r\n*orderNumber* :");
		auditStr.append(orderNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateCompleted* :");
		auditStr.append(dateCompleted);
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*recall* :");
		if (recall != null)
			auditStr.append(recall.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*recallIn* :");
		auditStr.append(recallIn);
	    auditStr.append("; ");
		auditStr.append("\r\n*recallPeriod* :");
		if (recallPeriod != null)
			auditStr.append(recallPeriod.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*actions* :");
		if (actions != null)
		{
		int i8=0;
		for (i8=0; i8<actions.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.naes.domain.objects.ActionDetail obj = (ims.naes.domain.objects.ActionDetail)actions.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ncpComment* :");
		auditStr.append(ncpComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*nAESReferral* :");
		if (nAESReferral != null)
		{
			auditStr.append(toShortClassName(nAESReferral));
				
		    auditStr.append(nAESReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sclera* :");
		auditStr.append(sclera);
	    auditStr.append("; ");
		auditStr.append("\r\n*quarterYear* :");
		auditStr.append(quarterYear);
	    auditStr.append("; ");
		auditStr.append("\r\n*finalCure* :");
		auditStr.append(finalCure);
	    auditStr.append("; ");
		auditStr.append("\r\n*batchNumber* :");
		auditStr.append(batchNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*_6MonthOpenPeriod* :");
		auditStr.append(_6MonthOpenPeriod);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionsAddedWithin6MonthPeriod* :");
		auditStr.append(actionsAddedWithin6MonthPeriod);
	    auditStr.append("; ");
		auditStr.append("\r\n*quarterHistory* :");
		if (quarterHistory != null)
		{
			java.util.Iterator it17 = quarterHistory.iterator();
			int i17=0;
			while (it17.hasNext())
			{
				if (i17 > 0)
					auditStr.append(",");
				ims.naes.domain.objects.ActionPlanQuarter obj = (ims.naes.domain.objects.ActionPlanQuarter)it17.next();
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
		auditStr.append("\r\n*eyesInOrderNumber* :");
		if (eyesInOrderNumber != null)
		{
			auditStr.append(toShortClassName(eyesInOrderNumber));
				
		    auditStr.append(eyesInOrderNumber.getId());
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
		
		String keyClassName = "ActionPlan";
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
		if (this.getDateCommenced() != null)
		{
			sb.append("<dateCommenced>");
			sb.append(new ims.framework.utils.DateTime(this.getDateCommenced()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateCommenced>");		
		}
		if (this.getOrderNumber() != null)
		{
			sb.append("<orderNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOrderNumber().toString()));
			sb.append("</orderNumber>");		
		}
		if (this.getDateCompleted() != null)
		{
			sb.append("<dateCompleted>");
			sb.append(new ims.framework.utils.DateTime(this.getDateCompleted()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateCompleted>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.getRecall() != null)
		{
			sb.append("<recall>");
			sb.append(this.getRecall().toXMLString()); 
			sb.append("</recall>");		
		}
		if (this.getRecallIn() != null)
		{
			sb.append("<recallIn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecallIn().toString()));
			sb.append("</recallIn>");		
		}
		if (this.getRecallPeriod() != null)
		{
			sb.append("<recallPeriod>");
			sb.append(this.getRecallPeriod().toXMLString()); 
			sb.append("</recallPeriod>");		
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
		if (this.getNcpComment() != null)
		{
			sb.append("<ncpComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNcpComment().toString()));
			sb.append("</ncpComment>");		
		}
		if (this.getNAESReferral() != null)
		{
			sb.append("<nAESReferral>");
			sb.append(this.getNAESReferral().toXMLString(domMap)); 	
			sb.append("</nAESReferral>");		
		}
		if (this.getSclera() != null)
		{
			sb.append("<sclera>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSclera().toString()));
			sb.append("</sclera>");		
		}
		if (this.getQuarterYear() != null)
		{
			sb.append("<quarterYear>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getQuarterYear().toString()));
			sb.append("</quarterYear>");		
		}
		if (this.getFinalCure() != null)
		{
			sb.append("<finalCure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFinalCure().toString()));
			sb.append("</finalCure>");		
		}
		if (this.getBatchNumber() != null)
		{
			sb.append("<batchNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBatchNumber().toString()));
			sb.append("</batchNumber>");		
		}
		if (this.get_6MonthOpenPeriod() != null)
		{
			sb.append("<_6MonthOpenPeriod>");
			sb.append(new ims.framework.utils.DateTime(this.get_6MonthOpenPeriod()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</_6MonthOpenPeriod>");		
		}
		if (this.isActionsAddedWithin6MonthPeriod() != null)
		{
			sb.append("<actionsAddedWithin6MonthPeriod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActionsAddedWithin6MonthPeriod().toString()));
			sb.append("</actionsAddedWithin6MonthPeriod>");		
		}
		if (this.getQuarterHistory() != null)
		{
			if (this.getQuarterHistory().size() > 0 )
			{
			sb.append("<quarterHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getQuarterHistory(), domMap));
			sb.append("</quarterHistory>");		
			}
		}
		if (this.getEyesInOrderNumber() != null)
		{
			sb.append("<eyesInOrderNumber>");
			sb.append(this.getEyesInOrderNumber().toXMLString(domMap)); 	
			sb.append("</eyesInOrderNumber>");		
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
			ActionPlan domainObject = getActionPlanfromXML(itemEl, factory, domMap);

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
			ActionPlan domainObject = getActionPlanfromXML(itemEl, factory, domMap);

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
		
	public static ActionPlan getActionPlanfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getActionPlanfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ActionPlan getActionPlanfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ActionPlan.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ActionPlan.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ActionPlan class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ActionPlan)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ActionPlan.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ActionPlan ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ActionPlan)factory.getImportedDomainObject(ActionPlan.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ActionPlan();
		}
		String keyClassName = "ActionPlan";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ActionPlan)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ActionPlan obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dateCommenced");
		if(fldEl != null)
		{	
    		obj.setDateCommenced(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("orderNumber");
		if(fldEl != null)
		{	
    		obj.setOrderNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateCompleted");
		if(fldEl != null)
		{	
    		obj.setDateCompleted(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recall");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRecall(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("recallIn");
		if(fldEl != null)
		{	
    		obj.setRecallIn(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recallPeriod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRecallPeriod(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("actions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setActions(ims.naes.domain.objects.ActionDetail.fromListXMLString(fldEl, factory, obj.getActions(), domMap));
		}
		fldEl = el.element("ncpComment");
		if(fldEl != null)
		{	
    		obj.setNcpComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nAESReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNAESReferral(ims.naes.domain.objects.NAESReferral.getNAESReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sclera");
		if(fldEl != null)
		{	
    		obj.setSclera(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("quarterYear");
		if(fldEl != null)
		{	
    		obj.setQuarterYear(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("finalCure");
		if(fldEl != null)
		{	
    		obj.setFinalCure(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("batchNumber");
		if(fldEl != null)
		{	
    		obj.setBatchNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("_6MonthOpenPeriod");
		if(fldEl != null)
		{	
    		obj.set_6MonthOpenPeriod(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("actionsAddedWithin6MonthPeriod");
		if(fldEl != null)
		{	
    		obj.setActionsAddedWithin6MonthPeriod(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("quarterHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setQuarterHistory(ims.naes.domain.objects.ActionPlanQuarter.fromSetXMLString(fldEl, factory, obj.getQuarterHistory(), domMap));
		}
		fldEl = el.element("eyesInOrderNumber");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEyesInOrderNumber(ims.naes.domain.objects.EyesInOrderNumber.getEyesInOrderNumberfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "actions"
		, "quarterHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String DateCommenced = "dateCommenced";
		public static final String OrderNumber = "orderNumber";
		public static final String DateCompleted = "dateCompleted";
		public static final String Comment = "comment";
		public static final String Recall = "recall";
		public static final String RecallIn = "recallIn";
		public static final String RecallPeriod = "recallPeriod";
		public static final String Actions = "actions";
		public static final String NcpComment = "ncpComment";
		public static final String NAESReferral = "nAESReferral";
		public static final String Sclera = "sclera";
		public static final String QuarterYear = "quarterYear";
		public static final String FinalCure = "finalCure";
		public static final String BatchNumber = "batchNumber";
		public static final String _6MonthOpenPeriod = "_6MonthOpenPeriod";
		public static final String ActionsAddedWithin6MonthPeriod = "actionsAddedWithin6MonthPeriod";
		public static final String QuarterHistory = "quarterHistory";
		public static final String EyesInOrderNumber = "eyesInOrderNumber";
	}
}

