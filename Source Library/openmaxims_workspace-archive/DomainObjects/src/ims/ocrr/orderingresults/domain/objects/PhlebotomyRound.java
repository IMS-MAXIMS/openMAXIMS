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


public class PhlebotomyRound extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100006;
	private static final long serialVersionUID = 1070100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Date */
	private java.util.Date date;
	/** Collector */
	private ims.core.resource.people.domain.objects.Hcp collector;
	/** Wards
	  * Collection of ims.core.resource.place.domain.objects.Location.
	  */
	private java.util.Set wards;
	/** CollectionItems
	  * Collection of ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem.
	  */
	private java.util.Set collectionItems;
	/** Round To Collect */
	private ims.domain.lookups.LookupInstance roundToCollect;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PhlebotomyRound (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PhlebotomyRound ()
    {
    	super();
    }
    public PhlebotomyRound (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.PhlebotomyRound.class;
	}


	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public ims.core.resource.people.domain.objects.Hcp getCollector() {
		return collector;
	}
	public void setCollector(ims.core.resource.people.domain.objects.Hcp collector) {
		this.collector = collector;
	}

	public java.util.Set getWards() {
		if ( null == wards ) {
			wards = new java.util.HashSet();
		}
		return wards;
	}
	public void setWards(java.util.Set paramValue) {
		this.wards = paramValue;
	}

	public java.util.Set getCollectionItems() {
		if ( null == collectionItems ) {
			collectionItems = new java.util.HashSet();
		}
		return collectionItems;
	}
	public void setCollectionItems(java.util.Set paramValue) {
		this.collectionItems = paramValue;
	}

	public ims.domain.lookups.LookupInstance getRoundToCollect() {
		return roundToCollect;
	}
	public void setRoundToCollect(ims.domain.lookups.LookupInstance roundToCollect) {
		this.roundToCollect = roundToCollect;
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
		
		auditStr.append("\r\n*date* :");
		auditStr.append(date);
	    auditStr.append("; ");
		auditStr.append("\r\n*collector* :");
		if (collector != null)
		{
			auditStr.append(toShortClassName(collector));
				
		    auditStr.append(collector.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wards* :");
		if (wards != null)
		{
			java.util.Iterator it3 = wards.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.core.resource.place.domain.objects.Location obj = (ims.core.resource.place.domain.objects.Location)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*collectionItems* :");
		if (collectionItems != null)
		{
			java.util.Iterator it4 = collectionItems.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem obj = (ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*roundToCollect* :");
		if (roundToCollect != null)
			auditStr.append(roundToCollect.getText());
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
		
		String keyClassName = "PhlebotomyRound";
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
		if (this.getDate() != null)
		{
			sb.append("<date>");
			sb.append(new ims.framework.utils.DateTime(this.getDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</date>");		
		}
		if (this.getCollector() != null)
		{
			sb.append("<collector>");
			sb.append(this.getCollector().toXMLString(domMap)); 	
			sb.append("</collector>");		
		}
		if (this.getWards() != null)
		{
			if (this.getWards().size() > 0 )
			{
			sb.append("<wards>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getWards(), domMap));
			sb.append("</wards>");		
			}
		}
		if (this.getCollectionItems() != null)
		{
			if (this.getCollectionItems().size() > 0 )
			{
			sb.append("<collectionItems>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCollectionItems(), domMap));
			sb.append("</collectionItems>");		
			}
		}
		if (this.getRoundToCollect() != null)
		{
			sb.append("<roundToCollect>");
			sb.append(this.getRoundToCollect().toXMLString()); 
			sb.append("</roundToCollect>");		
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
			PhlebotomyRound domainObject = getPhlebotomyRoundfromXML(itemEl, factory, domMap);

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
			PhlebotomyRound domainObject = getPhlebotomyRoundfromXML(itemEl, factory, domMap);

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
		
	public static PhlebotomyRound getPhlebotomyRoundfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPhlebotomyRoundfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PhlebotomyRound getPhlebotomyRoundfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PhlebotomyRound.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PhlebotomyRound.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PhlebotomyRound class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PhlebotomyRound)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PhlebotomyRound.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PhlebotomyRound ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PhlebotomyRound)factory.getImportedDomainObject(PhlebotomyRound.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PhlebotomyRound();
		}
		String keyClassName = "PhlebotomyRound";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PhlebotomyRound)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PhlebotomyRound obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("date");
		if(fldEl != null)
		{	
    		obj.setDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("collector");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCollector(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("wards");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setWards(ims.core.resource.place.domain.objects.Location.fromSetXMLString(fldEl, factory, obj.getWards(), domMap));
		}
		fldEl = el.element("collectionItems");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setCollectionItems(ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem.fromSetXMLString(fldEl, factory, obj.getCollectionItems(), domMap));
		}
		fldEl = el.element("roundToCollect");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRoundToCollect(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "wards"
		, "collectionItems"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Date = "date";
		public static final String Collector = "collector";
		public static final String Wards = "wards";
		public static final String CollectionItems = "collectionItems";
		public static final String RoundToCollect = "roundToCollect";
	}
}

