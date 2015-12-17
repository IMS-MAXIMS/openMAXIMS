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


public class PreTreatmentAction extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1105100042;
	private static final long serialVersionUID = 1105100042L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Action Name */
	private String actionName;
	/** Action Description */
	private String actionDescription;
	/** Is default Action */
	private Boolean isDefault;
	/** Requires Machine */
	private Boolean requiresMachine;
	/** Active Identifier */
	private Boolean activeIdentifier;
	/** Requires Consultant */
	private Boolean requiresConsultant;
	/** is a Dose Calc action */
	private Boolean isDoseCalcAction;
	/** is a Mould Room worklist item */
	private Boolean isMouldRoomWorklistItem;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PreTreatmentAction (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PreTreatmentAction ()
    {
    	super();
    }
    public PreTreatmentAction (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.PreTreatmentAction.class;
	}


	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		if ( null != actionName && actionName.length() > 70 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for actionName. Tried to set value: "+
				actionName);
		}
		this.actionName = actionName;
	}

	public String getActionDescription() {
		return actionDescription;
	}
	public void setActionDescription(String actionDescription) {
		if ( null != actionDescription && actionDescription.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for actionDescription. Tried to set value: "+
				actionDescription);
		}
		this.actionDescription = actionDescription;
	}

	public Boolean isIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Boolean isRequiresMachine() {
		return requiresMachine;
	}
	public void setRequiresMachine(Boolean requiresMachine) {
		this.requiresMachine = requiresMachine;
	}

	public Boolean isActiveIdentifier() {
		return activeIdentifier;
	}
	public void setActiveIdentifier(Boolean activeIdentifier) {
		this.activeIdentifier = activeIdentifier;
	}

	public Boolean isRequiresConsultant() {
		return requiresConsultant;
	}
	public void setRequiresConsultant(Boolean requiresConsultant) {
		this.requiresConsultant = requiresConsultant;
	}

	public Boolean isIsDoseCalcAction() {
		return isDoseCalcAction;
	}
	public void setIsDoseCalcAction(Boolean isDoseCalcAction) {
		this.isDoseCalcAction = isDoseCalcAction;
	}

	public Boolean isIsMouldRoomWorklistItem() {
		return isMouldRoomWorklistItem;
	}
	public void setIsMouldRoomWorklistItem(Boolean isMouldRoomWorklistItem) {
		this.isMouldRoomWorklistItem = isMouldRoomWorklistItem;
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
		
		auditStr.append("\r\n*actionName* :");
		auditStr.append(actionName);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionDescription* :");
		auditStr.append(actionDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*isDefault* :");
		auditStr.append(isDefault);
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresMachine* :");
		auditStr.append(requiresMachine);
	    auditStr.append("; ");
		auditStr.append("\r\n*activeIdentifier* :");
		auditStr.append(activeIdentifier);
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresConsultant* :");
		auditStr.append(requiresConsultant);
	    auditStr.append("; ");
		auditStr.append("\r\n*isDoseCalcAction* :");
		auditStr.append(isDoseCalcAction);
	    auditStr.append("; ");
		auditStr.append("\r\n*isMouldRoomWorklistItem* :");
		auditStr.append(isMouldRoomWorklistItem);
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
		
		String keyClassName = "PreTreatmentAction";
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
		if (this.getActionName() != null)
		{
			sb.append("<actionName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActionName().toString()));
			sb.append("</actionName>");		
		}
		if (this.getActionDescription() != null)
		{
			sb.append("<actionDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActionDescription().toString()));
			sb.append("</actionDescription>");		
		}
		if (this.isIsDefault() != null)
		{
			sb.append("<isDefault>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDefault().toString()));
			sb.append("</isDefault>");		
		}
		if (this.isRequiresMachine() != null)
		{
			sb.append("<requiresMachine>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresMachine().toString()));
			sb.append("</requiresMachine>");		
		}
		if (this.isActiveIdentifier() != null)
		{
			sb.append("<activeIdentifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActiveIdentifier().toString()));
			sb.append("</activeIdentifier>");		
		}
		if (this.isRequiresConsultant() != null)
		{
			sb.append("<requiresConsultant>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresConsultant().toString()));
			sb.append("</requiresConsultant>");		
		}
		if (this.isIsDoseCalcAction() != null)
		{
			sb.append("<isDoseCalcAction>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDoseCalcAction().toString()));
			sb.append("</isDoseCalcAction>");		
		}
		if (this.isIsMouldRoomWorklistItem() != null)
		{
			sb.append("<isMouldRoomWorklistItem>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMouldRoomWorklistItem().toString()));
			sb.append("</isMouldRoomWorklistItem>");		
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
			PreTreatmentAction domainObject = getPreTreatmentActionfromXML(itemEl, factory, domMap);

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
			PreTreatmentAction domainObject = getPreTreatmentActionfromXML(itemEl, factory, domMap);

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
		
	public static PreTreatmentAction getPreTreatmentActionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPreTreatmentActionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PreTreatmentAction getPreTreatmentActionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PreTreatmentAction.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PreTreatmentAction.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PreTreatmentAction class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PreTreatmentAction)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PreTreatmentAction.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PreTreatmentAction ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PreTreatmentAction)factory.getImportedDomainObject(PreTreatmentAction.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PreTreatmentAction();
		}
		String keyClassName = "PreTreatmentAction";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PreTreatmentAction)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PreTreatmentAction obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("actionName");
		if(fldEl != null)
		{	
    		obj.setActionName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actionDescription");
		if(fldEl != null)
		{	
    		obj.setActionDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isDefault");
		if(fldEl != null)
		{	
    		obj.setIsDefault(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requiresMachine");
		if(fldEl != null)
		{	
    		obj.setRequiresMachine(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activeIdentifier");
		if(fldEl != null)
		{	
    		obj.setActiveIdentifier(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requiresConsultant");
		if(fldEl != null)
		{	
    		obj.setRequiresConsultant(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isDoseCalcAction");
		if(fldEl != null)
		{	
    		obj.setIsDoseCalcAction(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isMouldRoomWorklistItem");
		if(fldEl != null)
		{	
    		obj.setIsMouldRoomWorklistItem(new Boolean(fldEl.getTextTrim()));	
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
		public static final String ActionName = "actionName";
		public static final String ActionDescription = "actionDescription";
		public static final String IsDefault = "isDefault";
		public static final String RequiresMachine = "requiresMachine";
		public static final String ActiveIdentifier = "activeIdentifier";
		public static final String RequiresConsultant = "requiresConsultant";
		public static final String IsDoseCalcAction = "isDoseCalcAction";
		public static final String IsMouldRoomWorklistItem = "isMouldRoomWorklistItem";
	}
}

