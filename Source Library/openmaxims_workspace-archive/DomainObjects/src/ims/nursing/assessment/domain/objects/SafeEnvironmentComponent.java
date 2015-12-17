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
package ims.nursing.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class SafeEnvironmentComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1015100009;
	private static final long serialVersionUID = 1015100009L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Is patient able to maintain own safety? */
	private ims.domain.lookups.LookupInstance maintainOwnSafety;
	/** Does the patient have a head injury? */
	private ims.domain.lookups.LookupInstance haveAHeadInjury;
	/** Is the patient at risk of autonomic dysreflexia? */
	private ims.domain.lookups.LookupInstance riskOfAutonomicDysreflexia;
	private String notes;
	/** 
	  * Collection of ims.nursing.assessment.domain.objects.SafetyLevel.
	  */
	private java.util.Set safetyLevel;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SafeEnvironmentComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SafeEnvironmentComponent ()
    {
    	super();
    }
    public SafeEnvironmentComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.assessment.domain.objects.SafeEnvironmentComponent.class;
	}


	public ims.domain.lookups.LookupInstance getMaintainOwnSafety() {
		return maintainOwnSafety;
	}
	public void setMaintainOwnSafety(ims.domain.lookups.LookupInstance maintainOwnSafety) {
		this.maintainOwnSafety = maintainOwnSafety;
	}

	public ims.domain.lookups.LookupInstance getHaveAHeadInjury() {
		return haveAHeadInjury;
	}
	public void setHaveAHeadInjury(ims.domain.lookups.LookupInstance haveAHeadInjury) {
		this.haveAHeadInjury = haveAHeadInjury;
	}

	public ims.domain.lookups.LookupInstance getRiskOfAutonomicDysreflexia() {
		return riskOfAutonomicDysreflexia;
	}
	public void setRiskOfAutonomicDysreflexia(ims.domain.lookups.LookupInstance riskOfAutonomicDysreflexia) {
		this.riskOfAutonomicDysreflexia = riskOfAutonomicDysreflexia;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
	}

	public java.util.Set getSafetyLevel() {
		if ( null == safetyLevel ) {
			safetyLevel = new java.util.HashSet();
		}
		return safetyLevel;
	}
	public void setSafetyLevel(java.util.Set paramValue) {
		this.safetyLevel = paramValue;
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
		auditStr.append("\r\n*maintainOwnSafety* :");
		if (maintainOwnSafety != null)
			auditStr.append(maintainOwnSafety.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*haveAHeadInjury* :");
		if (haveAHeadInjury != null)
			auditStr.append(haveAHeadInjury.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*riskOfAutonomicDysreflexia* :");
		if (riskOfAutonomicDysreflexia != null)
			auditStr.append(riskOfAutonomicDysreflexia.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*safetyLevel* :");
		if (safetyLevel != null)
		{
			java.util.Iterator it5 = safetyLevel.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.nursing.assessment.domain.objects.SafetyLevel obj = (ims.nursing.assessment.domain.objects.SafetyLevel)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
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
		
		String keyClassName = "SafeEnvironmentComponent";
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
		if (this.getMaintainOwnSafety() != null)
		{
			sb.append("<maintainOwnSafety>");
			sb.append(this.getMaintainOwnSafety().toXMLString()); 
			sb.append("</maintainOwnSafety>");		
		}
		if (this.getHaveAHeadInjury() != null)
		{
			sb.append("<haveAHeadInjury>");
			sb.append(this.getHaveAHeadInjury().toXMLString()); 
			sb.append("</haveAHeadInjury>");		
		}
		if (this.getRiskOfAutonomicDysreflexia() != null)
		{
			sb.append("<riskOfAutonomicDysreflexia>");
			sb.append(this.getRiskOfAutonomicDysreflexia().toXMLString()); 
			sb.append("</riskOfAutonomicDysreflexia>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.getSafetyLevel() != null)
		{
			if (this.getSafetyLevel().size() > 0 )
			{
			sb.append("<safetyLevel>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSafetyLevel(), domMap));
			sb.append("</safetyLevel>");		
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
			SafeEnvironmentComponent domainObject = getSafeEnvironmentComponentfromXML(itemEl, factory, domMap);

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
			SafeEnvironmentComponent domainObject = getSafeEnvironmentComponentfromXML(itemEl, factory, domMap);

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
		
	public static SafeEnvironmentComponent getSafeEnvironmentComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSafeEnvironmentComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SafeEnvironmentComponent getSafeEnvironmentComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SafeEnvironmentComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SafeEnvironmentComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SafeEnvironmentComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SafeEnvironmentComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SafeEnvironmentComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SafeEnvironmentComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SafeEnvironmentComponent)factory.getImportedDomainObject(SafeEnvironmentComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SafeEnvironmentComponent();
		}
		String keyClassName = "SafeEnvironmentComponent";
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
			return (SafeEnvironmentComponent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SafeEnvironmentComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("maintainOwnSafety");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMaintainOwnSafety(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("haveAHeadInjury");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHaveAHeadInjury(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("riskOfAutonomicDysreflexia");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRiskOfAutonomicDysreflexia(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("safetyLevel");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSafetyLevel(ims.nursing.assessment.domain.objects.SafetyLevel.fromSetXMLString(fldEl, factory, obj.getSafetyLevel(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "safetyLevel"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String MaintainOwnSafety = "maintainOwnSafety";
		public static final String HaveAHeadInjury = "haveAHeadInjury";
		public static final String RiskOfAutonomicDysreflexia = "riskOfAutonomicDysreflexia";
		public static final String Notes = "notes";
		public static final String SafetyLevel = "safetyLevel";
	}
}

