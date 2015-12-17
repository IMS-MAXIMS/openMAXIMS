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
package ims.RefMan.domain.objects;

/**
 * 
 * @author Cristian Belciug
 * Generated.
 */


public class OutcomeAcceptedDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100078;
	private static final long serialVersionUID = 1096100078L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance actionRequired;
	private ims.RefMan.domain.objects.OPA oPA;
	private String comments;
	private ims.scheduling.domain.objects.FutureAppointmentDetails linkedOPA;
	/** 
	  * Collection of ims.RefMan.domain.objects.LinkedDiagnostic.
	  */
	private java.util.List linkedDiagnostics;
	private ims.RefMan.domain.objects.PatientElectiveList waitingList;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OutcomeAcceptedDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OutcomeAcceptedDetails ()
    {
    	super();
    }
    public OutcomeAcceptedDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.OutcomeAcceptedDetails.class;
	}


	public ims.domain.lookups.LookupInstance getActionRequired() {
		return actionRequired;
	}
	public void setActionRequired(ims.domain.lookups.LookupInstance actionRequired) {
		this.actionRequired = actionRequired;
	}

	public ims.RefMan.domain.objects.OPA getOPA() {
		return oPA;
	}
	public void setOPA(ims.RefMan.domain.objects.OPA oPA) {
		this.oPA = oPA;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public ims.scheduling.domain.objects.FutureAppointmentDetails getLinkedOPA() {
		return linkedOPA;
	}
	public void setLinkedOPA(ims.scheduling.domain.objects.FutureAppointmentDetails linkedOPA) {
		this.linkedOPA = linkedOPA;
	}

	public java.util.List getLinkedDiagnostics() {
		if ( null == linkedDiagnostics ) {
			linkedDiagnostics = new java.util.ArrayList();
		}
		return linkedDiagnostics;
	}
	public void setLinkedDiagnostics(java.util.List paramValue) {
		this.linkedDiagnostics = paramValue;
	}

	public ims.RefMan.domain.objects.PatientElectiveList getWaitingList() {
		return waitingList;
	}
	public void setWaitingList(ims.RefMan.domain.objects.PatientElectiveList waitingList) {
		this.waitingList = waitingList;
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
		
		auditStr.append("\r\n*actionRequired* :");
		if (actionRequired != null)
			auditStr.append(actionRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*oPA* :");
		if (oPA != null)
		{
			auditStr.append(toShortClassName(oPA));
				
		    auditStr.append(oPA.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedOPA* :");
		if (linkedOPA != null)
		{
			auditStr.append(toShortClassName(linkedOPA));
				
		    auditStr.append(linkedOPA.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedDiagnostics* :");
		if (linkedDiagnostics != null)
		{
		int i5=0;
		for (i5=0; i5<linkedDiagnostics.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.LinkedDiagnostic obj = (ims.RefMan.domain.objects.LinkedDiagnostic)linkedDiagnostics.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*waitingList* :");
		if (waitingList != null)
		{
			auditStr.append(toShortClassName(waitingList));
				
		    auditStr.append(waitingList.getId());
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
		
		String keyClassName = "OutcomeAcceptedDetails";
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
		if (this.getActionRequired() != null)
		{
			sb.append("<actionRequired>");
			sb.append(this.getActionRequired().toXMLString()); 
			sb.append("</actionRequired>");		
		}
		if (this.getOPA() != null)
		{
			sb.append("<oPA>");
			sb.append(this.getOPA().toXMLString(domMap)); 	
			sb.append("</oPA>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getLinkedOPA() != null)
		{
			sb.append("<linkedOPA>");
			sb.append(this.getLinkedOPA().toXMLString(domMap)); 	
			sb.append("</linkedOPA>");		
		}
		if (this.getLinkedDiagnostics() != null)
		{
			if (this.getLinkedDiagnostics().size() > 0 )
			{
			sb.append("<linkedDiagnostics>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLinkedDiagnostics(), domMap));
			sb.append("</linkedDiagnostics>");		
			}
		}
		if (this.getWaitingList() != null)
		{
			sb.append("<waitingList>");
			sb.append(this.getWaitingList().toXMLString(domMap)); 	
			sb.append("</waitingList>");		
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
			OutcomeAcceptedDetails domainObject = getOutcomeAcceptedDetailsfromXML(itemEl, factory, domMap);

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
			OutcomeAcceptedDetails domainObject = getOutcomeAcceptedDetailsfromXML(itemEl, factory, domMap);

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
		
	public static OutcomeAcceptedDetails getOutcomeAcceptedDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOutcomeAcceptedDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OutcomeAcceptedDetails getOutcomeAcceptedDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OutcomeAcceptedDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OutcomeAcceptedDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OutcomeAcceptedDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OutcomeAcceptedDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OutcomeAcceptedDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OutcomeAcceptedDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OutcomeAcceptedDetails)factory.getImportedDomainObject(OutcomeAcceptedDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OutcomeAcceptedDetails();
		}
		String keyClassName = "OutcomeAcceptedDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OutcomeAcceptedDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OutcomeAcceptedDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("actionRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActionRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("oPA");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOPA(ims.RefMan.domain.objects.OPA.getOPAfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("linkedOPA");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLinkedOPA(ims.scheduling.domain.objects.FutureAppointmentDetails.getFutureAppointmentDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("linkedDiagnostics");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setLinkedDiagnostics(ims.RefMan.domain.objects.LinkedDiagnostic.fromListXMLString(fldEl, factory, obj.getLinkedDiagnostics(), domMap));
		}
		fldEl = el.element("waitingList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWaitingList(ims.RefMan.domain.objects.PatientElectiveList.getPatientElectiveListfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "linkedDiagnostics"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ActionRequired = "actionRequired";
		public static final String OPA = "oPA";
		public static final String Comments = "comments";
		public static final String LinkedOPA = "linkedOPA";
		public static final String LinkedDiagnostics = "linkedDiagnostics";
		public static final String WaitingList = "waitingList";
	}
}

