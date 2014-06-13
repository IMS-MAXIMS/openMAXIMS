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
package ims.ocrr.orderingresults.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class SpecimenWorkListItem extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1061100014;
	private static final long serialVersionUID = 1061100014L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Specimen */
	private ims.ocrr.orderingresults.domain.objects.OrderSpecimen specimen;
	/** ListType */
	private ims.domain.lookups.LookupInstance listType;
	/** Date To Collect */
	private java.util.Date dateToCollect;
	/** Round To Collect */
	private ims.domain.lookups.LookupInstance roundToCollect;
	/** TimeToCollect */
	private String timeToCollect;
	/** Collection Status */
	private ims.domain.lookups.LookupInstance collectionStatus;
	/** Ward */
	private ims.core.resource.place.domain.objects.Location ward;
	/** Printed */
	private Boolean printed;
	/** DFT Order Investigation */
	private ims.ocrr.orderingresults.domain.objects.OrderInvestigation dFTOrderInvestigation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SpecimenWorkListItem (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SpecimenWorkListItem ()
    {
    	super();
    }
    public SpecimenWorkListItem (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem.class;
	}


	public ims.ocrr.orderingresults.domain.objects.OrderSpecimen getSpecimen() {
		return specimen;
	}
	public void setSpecimen(ims.ocrr.orderingresults.domain.objects.OrderSpecimen specimen) {
		this.specimen = specimen;
	}

	public ims.domain.lookups.LookupInstance getListType() {
		return listType;
	}
	public void setListType(ims.domain.lookups.LookupInstance listType) {
		this.listType = listType;
	}

	public java.util.Date getDateToCollect() {
		return dateToCollect;
	}
	public void setDateToCollect(java.util.Date dateToCollect) {
		this.dateToCollect = dateToCollect;
	}

	public ims.domain.lookups.LookupInstance getRoundToCollect() {
		return roundToCollect;
	}
	public void setRoundToCollect(ims.domain.lookups.LookupInstance roundToCollect) {
		this.roundToCollect = roundToCollect;
	}

	public String getTimeToCollect() {
		return timeToCollect;
	}
	public void setTimeToCollect(String timeToCollect) {
		this.timeToCollect = timeToCollect;
	}

	public ims.domain.lookups.LookupInstance getCollectionStatus() {
		return collectionStatus;
	}
	public void setCollectionStatus(ims.domain.lookups.LookupInstance collectionStatus) {
		this.collectionStatus = collectionStatus;
	}

	public ims.core.resource.place.domain.objects.Location getWard() {
		return ward;
	}
	public void setWard(ims.core.resource.place.domain.objects.Location ward) {
		this.ward = ward;
	}

	public Boolean isPrinted() {
		return printed;
	}
	public void setPrinted(Boolean printed) {
		this.printed = printed;
	}

	public ims.ocrr.orderingresults.domain.objects.OrderInvestigation getDFTOrderInvestigation() {
		return dFTOrderInvestigation;
	}
	public void setDFTOrderInvestigation(ims.ocrr.orderingresults.domain.objects.OrderInvestigation dFTOrderInvestigation) {
		this.dFTOrderInvestigation = dFTOrderInvestigation;
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
		
		auditStr.append("\r\n*specimen* :");
		if (specimen != null)
		{
			auditStr.append(toShortClassName(specimen));
				
		    auditStr.append(specimen.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*listType* :");
		if (listType != null)
			auditStr.append(listType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateToCollect* :");
		auditStr.append(dateToCollect);
	    auditStr.append("; ");
		auditStr.append("\r\n*roundToCollect* :");
		if (roundToCollect != null)
			auditStr.append(roundToCollect.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*timeToCollect* :");
		auditStr.append(timeToCollect);
	    auditStr.append("; ");
		auditStr.append("\r\n*collectionStatus* :");
		if (collectionStatus != null)
			auditStr.append(collectionStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*ward* :");
		if (ward != null)
		{
			auditStr.append(toShortClassName(ward));
				
		    auditStr.append(ward.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*printed* :");
		auditStr.append(printed);
	    auditStr.append("; ");
		auditStr.append("\r\n*dFTOrderInvestigation* :");
		if (dFTOrderInvestigation != null)
		{
			auditStr.append(toShortClassName(dFTOrderInvestigation));
				
		    auditStr.append(dFTOrderInvestigation.getId());
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
		
		String keyClassName = "SpecimenWorkListItem";
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
		if (this.getSpecimen() != null)
		{
			sb.append("<specimen>");
			sb.append(this.getSpecimen().toXMLString(domMap)); 	
			sb.append("</specimen>");		
		}
		if (this.getListType() != null)
		{
			sb.append("<listType>");
			sb.append(this.getListType().toXMLString()); 
			sb.append("</listType>");		
		}
		if (this.getDateToCollect() != null)
		{
			sb.append("<dateToCollect>");
			sb.append(new ims.framework.utils.DateTime(this.getDateToCollect()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateToCollect>");		
		}
		if (this.getRoundToCollect() != null)
		{
			sb.append("<roundToCollect>");
			sb.append(this.getRoundToCollect().toXMLString()); 
			sb.append("</roundToCollect>");		
		}
		if (this.getTimeToCollect() != null)
		{
			sb.append("<timeToCollect>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeToCollect().toString()));
			sb.append("</timeToCollect>");		
		}
		if (this.getCollectionStatus() != null)
		{
			sb.append("<collectionStatus>");
			sb.append(this.getCollectionStatus().toXMLString()); 
			sb.append("</collectionStatus>");		
		}
		if (this.getWard() != null)
		{
			sb.append("<ward>");
			sb.append(this.getWard().toXMLString(domMap)); 	
			sb.append("</ward>");		
		}
		if (this.isPrinted() != null)
		{
			sb.append("<printed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPrinted().toString()));
			sb.append("</printed>");		
		}
		if (this.getDFTOrderInvestigation() != null)
		{
			sb.append("<dFTOrderInvestigation>");
			sb.append(this.getDFTOrderInvestigation().toXMLString(domMap)); 	
			sb.append("</dFTOrderInvestigation>");		
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
			SpecimenWorkListItem domainObject = getSpecimenWorkListItemfromXML(itemEl, factory, domMap);

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
			SpecimenWorkListItem domainObject = getSpecimenWorkListItemfromXML(itemEl, factory, domMap);

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
		
	public static SpecimenWorkListItem getSpecimenWorkListItemfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSpecimenWorkListItemfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SpecimenWorkListItem getSpecimenWorkListItemfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SpecimenWorkListItem.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SpecimenWorkListItem.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SpecimenWorkListItem class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SpecimenWorkListItem)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SpecimenWorkListItem.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SpecimenWorkListItem ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SpecimenWorkListItem)factory.getImportedDomainObject(SpecimenWorkListItem.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SpecimenWorkListItem();
		}
		String keyClassName = "SpecimenWorkListItem";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SpecimenWorkListItem)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SpecimenWorkListItem obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("specimen");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSpecimen(ims.ocrr.orderingresults.domain.objects.OrderSpecimen.getOrderSpecimenfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("listType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setListType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateToCollect");
		if(fldEl != null)
		{	
    		obj.setDateToCollect(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("roundToCollect");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRoundToCollect(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("timeToCollect");
		if(fldEl != null)
		{	
    		obj.setTimeToCollect(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("collectionStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCollectionStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("ward");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("printed");
		if(fldEl != null)
		{	
    		obj.setPrinted(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dFTOrderInvestigation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDFTOrderInvestigation(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.getOrderInvestigationfromXML(fldEl, factory, domMap)); 
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
		public static final String Specimen = "specimen";
		public static final String ListType = "listType";
		public static final String DateToCollect = "dateToCollect";
		public static final String RoundToCollect = "roundToCollect";
		public static final String TimeToCollect = "timeToCollect";
		public static final String CollectionStatus = "collectionStatus";
		public static final String Ward = "ward";
		public static final String Printed = "printed";
		public static final String DFTOrderInvestigation = "dFTOrderInvestigation";
	}
}

