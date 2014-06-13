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


public class IllicitDrugs extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100038;
	private static final long serialVersionUID = 1003100038L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Drugs Used In The Past Month */
	private ims.domain.lookups.LookupInstance drugsUsedInThePastMonth;
	/** Drugs Used Intravenously */
	private ims.domain.lookups.LookupInstance drugsUsedIntravenously;
	/** Use Any Other Drugs */
	private ims.domain.lookups.LookupInstance useAnyOtherDrugs;
	/** Other Drug Details - what and how much */
	private String otherDrugDetails;
	/** Drug Details
	  * Collection of ims.core.clinical.domain.objects.IllicitDrugDetails.
	  */
	private java.util.Set drugDetails;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public IllicitDrugs (Integer id, int ver)
    {
    	super(id, ver);
    }
    public IllicitDrugs ()
    {
    	super();
    }
    public IllicitDrugs (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.IllicitDrugs.class;
	}


	public ims.domain.lookups.LookupInstance getDrugsUsedInThePastMonth() {
		return drugsUsedInThePastMonth;
	}
	public void setDrugsUsedInThePastMonth(ims.domain.lookups.LookupInstance drugsUsedInThePastMonth) {
		this.drugsUsedInThePastMonth = drugsUsedInThePastMonth;
	}

	public ims.domain.lookups.LookupInstance getDrugsUsedIntravenously() {
		return drugsUsedIntravenously;
	}
	public void setDrugsUsedIntravenously(ims.domain.lookups.LookupInstance drugsUsedIntravenously) {
		this.drugsUsedIntravenously = drugsUsedIntravenously;
	}

	public ims.domain.lookups.LookupInstance getUseAnyOtherDrugs() {
		return useAnyOtherDrugs;
	}
	public void setUseAnyOtherDrugs(ims.domain.lookups.LookupInstance useAnyOtherDrugs) {
		this.useAnyOtherDrugs = useAnyOtherDrugs;
	}

	public String getOtherDrugDetails() {
		return otherDrugDetails;
	}
	public void setOtherDrugDetails(String otherDrugDetails) {
		this.otherDrugDetails = otherDrugDetails;
	}

	public java.util.Set getDrugDetails() {
		if ( null == drugDetails ) {
			drugDetails = new java.util.HashSet();
		}
		return drugDetails;
	}
	public void setDrugDetails(java.util.Set paramValue) {
		this.drugDetails = paramValue;
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
		
		auditStr.append("\r\n*drugsUsedInThePastMonth* :");
		if (drugsUsedInThePastMonth != null)
			auditStr.append(drugsUsedInThePastMonth.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*drugsUsedIntravenously* :");
		if (drugsUsedIntravenously != null)
			auditStr.append(drugsUsedIntravenously.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*useAnyOtherDrugs* :");
		if (useAnyOtherDrugs != null)
			auditStr.append(useAnyOtherDrugs.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*otherDrugDetails* :");
		auditStr.append(otherDrugDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*drugDetails* :");
		if (drugDetails != null)
		{
			java.util.Iterator it5 = drugDetails.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.IllicitDrugDetails obj = (ims.core.clinical.domain.objects.IllicitDrugDetails)it5.next();
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
		
		String keyClassName = "IllicitDrugs";
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
		if (this.getDrugsUsedInThePastMonth() != null)
		{
			sb.append("<drugsUsedInThePastMonth>");
			sb.append(this.getDrugsUsedInThePastMonth().toXMLString()); 
			sb.append("</drugsUsedInThePastMonth>");		
		}
		if (this.getDrugsUsedIntravenously() != null)
		{
			sb.append("<drugsUsedIntravenously>");
			sb.append(this.getDrugsUsedIntravenously().toXMLString()); 
			sb.append("</drugsUsedIntravenously>");		
		}
		if (this.getUseAnyOtherDrugs() != null)
		{
			sb.append("<useAnyOtherDrugs>");
			sb.append(this.getUseAnyOtherDrugs().toXMLString()); 
			sb.append("</useAnyOtherDrugs>");		
		}
		if (this.getOtherDrugDetails() != null)
		{
			sb.append("<otherDrugDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherDrugDetails().toString()));
			sb.append("</otherDrugDetails>");		
		}
		if (this.getDrugDetails() != null)
		{
			if (this.getDrugDetails().size() > 0 )
			{
			sb.append("<drugDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDrugDetails(), domMap));
			sb.append("</drugDetails>");		
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
			IllicitDrugs domainObject = getIllicitDrugsfromXML(itemEl, factory, domMap);

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
			IllicitDrugs domainObject = getIllicitDrugsfromXML(itemEl, factory, domMap);

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
		
	public static IllicitDrugs getIllicitDrugsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getIllicitDrugsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static IllicitDrugs getIllicitDrugsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!IllicitDrugs.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!IllicitDrugs.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the IllicitDrugs class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (IllicitDrugs)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(IllicitDrugs.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		IllicitDrugs ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (IllicitDrugs)factory.getImportedDomainObject(IllicitDrugs.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new IllicitDrugs();
		}
		String keyClassName = "IllicitDrugs";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (IllicitDrugs)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, IllicitDrugs obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("drugsUsedInThePastMonth");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDrugsUsedInThePastMonth(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("drugsUsedIntravenously");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDrugsUsedIntravenously(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("useAnyOtherDrugs");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUseAnyOtherDrugs(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("otherDrugDetails");
		if(fldEl != null)
		{	
    		obj.setOtherDrugDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("drugDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDrugDetails(ims.core.clinical.domain.objects.IllicitDrugDetails.fromSetXMLString(fldEl, factory, obj.getDrugDetails(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "drugDetails"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String DrugsUsedInThePastMonth = "drugsUsedInThePastMonth";
		public static final String DrugsUsedIntravenously = "drugsUsedIntravenously";
		public static final String UseAnyOtherDrugs = "useAnyOtherDrugs";
		public static final String OtherDrugDetails = "otherDrugDetails";
		public static final String DrugDetails = "drugDetails";
	}
}

