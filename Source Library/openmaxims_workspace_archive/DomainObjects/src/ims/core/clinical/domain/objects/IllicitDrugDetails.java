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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class IllicitDrugDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100039;
	private static final long serialVersionUID = 1003100039L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Substance Used - Illicit Drugs */
	private ims.domain.lookups.LookupInstance substance;
	/** Frequency */
	private ims.domain.lookups.LookupInstance frequency;
	/** Last Used */
	private Integer lastUsed;
	/** Urine Test Result */
	private ims.domain.lookups.LookupInstance urineTestResult;
	/** Current Status */
	private ims.domain.lookups.LookupInstance currentStatus;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public IllicitDrugDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public IllicitDrugDetails ()
    {
    	super();
    }
    public IllicitDrugDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.IllicitDrugDetails.class;
	}


	public ims.domain.lookups.LookupInstance getSubstance() {
		return substance;
	}
	public void setSubstance(ims.domain.lookups.LookupInstance substance) {
		this.substance = substance;
	}

	public ims.domain.lookups.LookupInstance getFrequency() {
		return frequency;
	}
	public void setFrequency(ims.domain.lookups.LookupInstance frequency) {
		this.frequency = frequency;
	}

	public Integer getLastUsed() {
		return lastUsed;
	}
	public void setLastUsed(Integer lastUsed) {
		this.lastUsed = lastUsed;
	}

	public ims.domain.lookups.LookupInstance getUrineTestResult() {
		return urineTestResult;
	}
	public void setUrineTestResult(ims.domain.lookups.LookupInstance urineTestResult) {
		this.urineTestResult = urineTestResult;
	}

	public ims.domain.lookups.LookupInstance getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.domain.lookups.LookupInstance currentStatus) {
		this.currentStatus = currentStatus;
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
		
		auditStr.append("\r\n*substance* :");
		if (substance != null)
			auditStr.append(substance.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*frequency* :");
		if (frequency != null)
			auditStr.append(frequency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*lastUsed* :");
		auditStr.append(lastUsed);
	    auditStr.append("; ");
		auditStr.append("\r\n*urineTestResult* :");
		if (urineTestResult != null)
			auditStr.append(urineTestResult.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
			auditStr.append(currentStatus.getText());
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
		
		String keyClassName = "IllicitDrugDetails";
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
		if (this.getSubstance() != null)
		{
			sb.append("<substance>");
			sb.append(this.getSubstance().toXMLString()); 
			sb.append("</substance>");		
		}
		if (this.getFrequency() != null)
		{
			sb.append("<frequency>");
			sb.append(this.getFrequency().toXMLString()); 
			sb.append("</frequency>");		
		}
		if (this.getLastUsed() != null)
		{
			sb.append("<lastUsed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLastUsed().toString()));
			sb.append("</lastUsed>");		
		}
		if (this.getUrineTestResult() != null)
		{
			sb.append("<urineTestResult>");
			sb.append(this.getUrineTestResult().toXMLString()); 
			sb.append("</urineTestResult>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString()); 
			sb.append("</currentStatus>");		
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
			IllicitDrugDetails domainObject = getIllicitDrugDetailsfromXML(itemEl, factory, domMap);

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
			IllicitDrugDetails domainObject = getIllicitDrugDetailsfromXML(itemEl, factory, domMap);

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
		
	public static IllicitDrugDetails getIllicitDrugDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getIllicitDrugDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static IllicitDrugDetails getIllicitDrugDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!IllicitDrugDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!IllicitDrugDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the IllicitDrugDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (IllicitDrugDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(IllicitDrugDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		IllicitDrugDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (IllicitDrugDetails)factory.getImportedDomainObject(IllicitDrugDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new IllicitDrugDetails();
		}
		String keyClassName = "IllicitDrugDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (IllicitDrugDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, IllicitDrugDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("substance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSubstance(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("frequency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFrequency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("lastUsed");
		if(fldEl != null)
		{	
    		obj.setLastUsed(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("urineTestResult");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUrineTestResult(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCurrentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String Substance = "substance";
		public static final String Frequency = "frequency";
		public static final String LastUsed = "lastUsed";
		public static final String UrineTestResult = "urineTestResult";
		public static final String CurrentStatus = "currentStatus";
	}
}

