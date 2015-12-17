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
package ims.therapies.mobilitytransfers.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class WheelchairCushion extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100043;
	private static final long serialVersionUID = 1019100043L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Authoring Date Time */
	private java.util.Date authoringDateTime;
	/** Authoring Care Professional */
	private ims.core.resource.people.domain.objects.Hcp authoringCP;
	/** Cushion Type */
	private ims.domain.lookups.LookupInstance cushionType;
	/** Cushion Category. TO BE REVIEWED */
	private ims.domain.lookups.LookupInstance cushionCategory;
	/** Cover Type */
	private ims.domain.lookups.LookupInstance coverType;
	/** Cushion Size */
	private ims.domain.lookups.LookupInstance cushionSize;
	/** Start Date */
	private java.util.Date startDate;
	/** End Date */
	private java.util.Date endDate;
	/** Pressure Reading Date
	  * Collection of java.util.Date.
	  */
	private java.util.List pressureReadingDate;
	/** Cushion Modification
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List cushionModification;
	/** Cushion Accessory
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List cushionAccessory;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WheelchairCushion (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WheelchairCushion ()
    {
    	super();
    }
    public WheelchairCushion (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.mobilitytransfers.domain.objects.WheelchairCushion.class;
	}


	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringCP() {
		return authoringCP;
	}
	public void setAuthoringCP(ims.core.resource.people.domain.objects.Hcp authoringCP) {
		this.authoringCP = authoringCP;
	}

	public ims.domain.lookups.LookupInstance getCushionType() {
		return cushionType;
	}
	public void setCushionType(ims.domain.lookups.LookupInstance cushionType) {
		this.cushionType = cushionType;
	}

	public ims.domain.lookups.LookupInstance getCushionCategory() {
		return cushionCategory;
	}
	public void setCushionCategory(ims.domain.lookups.LookupInstance cushionCategory) {
		this.cushionCategory = cushionCategory;
	}

	public ims.domain.lookups.LookupInstance getCoverType() {
		return coverType;
	}
	public void setCoverType(ims.domain.lookups.LookupInstance coverType) {
		this.coverType = coverType;
	}

	public ims.domain.lookups.LookupInstance getCushionSize() {
		return cushionSize;
	}
	public void setCushionSize(ims.domain.lookups.LookupInstance cushionSize) {
		this.cushionSize = cushionSize;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public java.util.Date getEndDate() {
		return endDate;
	}
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	public java.util.List getPressureReadingDate() {
		if ( null == pressureReadingDate ) {
			pressureReadingDate = new java.util.ArrayList();
		}
		return pressureReadingDate;
	}
	public void setPressureReadingDate(java.util.List pressureReadingDate) {
		this.pressureReadingDate = pressureReadingDate;
	}

	public java.util.List getCushionModification() {
		if ( null == cushionModification ) {
			cushionModification = new java.util.ArrayList();
		}
		return cushionModification;
	}
	public void setCushionModification(java.util.List paramValue) {
		this.cushionModification = paramValue;
	}

	public java.util.List getCushionAccessory() {
		if ( null == cushionAccessory ) {
			cushionAccessory = new java.util.ArrayList();
		}
		return cushionAccessory;
	}
	public void setCushionAccessory(java.util.List paramValue) {
		this.cushionAccessory = paramValue;
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
		
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringCP* :");
		if (authoringCP != null)
		{
			auditStr.append(toShortClassName(authoringCP));
				
		    auditStr.append(authoringCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*cushionType* :");
		if (cushionType != null)
			auditStr.append(cushionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cushionCategory* :");
		if (cushionCategory != null)
			auditStr.append(cushionCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*coverType* :");
		if (coverType != null)
			auditStr.append(coverType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cushionSize* :");
		if (cushionSize != null)
			auditStr.append(cushionSize.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDate* :");
		auditStr.append(endDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*pressureReadingDate* :");
		if (pressureReadingDate != null)
		{
			java.util.Iterator it11 = pressureReadingDate.iterator();
			int i11=0;
			while (it11.hasNext())
			{
				if (i11 > 0)
					auditStr.append(",");
				java.util.Date obj = (java.util.Date)it11.next();
	auditStr.append(obj);		
			i11++;
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*cushionModification* :");
		if (cushionModification != null)
		{
			java.util.Iterator it12 = cushionModification.iterator();
			int i12=0;
			while (it12.hasNext())
			{
				if (i12 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it12.next();
			auditStr.append(obj.getText());
			i12++;
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*cushionAccessory* :");
		if (cushionAccessory != null)
		{
			java.util.Iterator it13 = cushionAccessory.iterator();
			int i13=0;
			while (it13.hasNext())
			{
				if (i13 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it13.next();
			auditStr.append(obj.getText());
			i13++;
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
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
		
		String keyClassName = "WheelchairCushion";
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
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getAuthoringCP() != null)
		{
			sb.append("<authoringCP>");
			sb.append(this.getAuthoringCP().toXMLString(domMap)); 	
			sb.append("</authoringCP>");		
		}
		if (this.getCushionType() != null)
		{
			sb.append("<cushionType>");
			sb.append(this.getCushionType().toXMLString()); 
			sb.append("</cushionType>");		
		}
		if (this.getCushionCategory() != null)
		{
			sb.append("<cushionCategory>");
			sb.append(this.getCushionCategory().toXMLString()); 
			sb.append("</cushionCategory>");		
		}
		if (this.getCoverType() != null)
		{
			sb.append("<coverType>");
			sb.append(this.getCoverType().toXMLString()); 
			sb.append("</coverType>");		
		}
		if (this.getCushionSize() != null)
		{
			sb.append("<cushionSize>");
			sb.append(this.getCushionSize().toXMLString()); 
			sb.append("</cushionSize>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getEndDate() != null)
		{
			sb.append("<endDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDate>");		
		}
		if (this.getPressureReadingDate() != null)
		{
			if (this.getPressureReadingDate().size() > 0 )
			{
			sb.append("<pressureReadingDate>");
			sb.append("<list>");
			java.util.Iterator iter = this.getPressureReadingDate().iterator();
			while (iter.hasNext())
			{
				sb.append("<item>");
				sb.append(ims.framework.utils.StringUtils.encodeXML(iter.next().toString()));
				sb.append("</item>");
			}
			sb.append("</list>");			
			sb.append("</pressureReadingDate>");		
			}
		}
		if (this.getCushionModification() != null)
		{
			if (this.getCushionModification().size() > 0 )
			{
			sb.append("<cushionModification>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getCushionModification())); 
			sb.append("</cushionModification>");		
			}
		}
		if (this.getCushionAccessory() != null)
		{
			if (this.getCushionAccessory().size() > 0 )
			{
			sb.append("<cushionAccessory>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getCushionAccessory())); 
			sb.append("</cushionAccessory>");		
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
			WheelchairCushion domainObject = getWheelchairCushionfromXML(itemEl, factory, domMap);

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
			WheelchairCushion domainObject = getWheelchairCushionfromXML(itemEl, factory, domMap);

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
		
	public static WheelchairCushion getWheelchairCushionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWheelchairCushionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WheelchairCushion getWheelchairCushionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WheelchairCushion.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WheelchairCushion.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WheelchairCushion class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WheelchairCushion)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WheelchairCushion.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WheelchairCushion ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WheelchairCushion)factory.getImportedDomainObject(WheelchairCushion.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WheelchairCushion();
		}
		String keyClassName = "WheelchairCushion";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WheelchairCushion)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WheelchairCushion obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("authoringCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("cushionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCushionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cushionCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCushionCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("coverType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCoverType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cushionSize");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCushionSize(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDate");
		if(fldEl != null)
		{	
    		obj.setEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("pressureReadingDate");
		if(fldEl != null)
		{
  			fldEl = fldEl.element("list");
			java.util.List elList = fldEl.elements("item");
    		java.util.List objList = obj.getPressureReadingDate();
			if (objList == null)
				objList = new java.util.ArrayList();
			
    		int i;
    		for (i=0; i < elList.size(); i++)
    		{
				org.dom4j.Element itemEl = (org.dom4j.Element)elList.get(i);
				java.util.Date lstValue = new java.util.Date(itemEl.getTextTrim());
    			int idx = objList.indexOf(lstValue);
    			if (idx == -1)
    				objList.add(i, lstValue);
    			else if (i != idx && i < objList.size())
    			{
    				String tmp = (String) objList.get(i);
    				objList.set(i, lstValue);
    				objList.set(idx, tmp);    				
    			}
    		}
    		i = objList.size();
    		while (i > elList.size())
    		{
    			objList.remove(i-1);
    			i = objList.size();
    		}	
			
    		obj.setPressureReadingDate(objList);
		}
		fldEl = el.element("cushionModification");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCushionModification(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getCushionModification())); 
		}
		fldEl = el.element("cushionAccessory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCushionAccessory(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getCushionAccessory())); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "pressureReadingDate"
		, "cushionModification"
		, "cushionAccessory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String AuthoringCP = "authoringCP";
		public static final String CushionType = "cushionType";
		public static final String CushionCategory = "cushionCategory";
		public static final String CoverType = "coverType";
		public static final String CushionSize = "cushionSize";
		public static final String StartDate = "startDate";
		public static final String EndDate = "endDate";
		public static final String PressureReadingDate = "pressureReadingDate";
		public static final String CushionModification = "cushionModification";
		public static final String CushionAccessory = "cushionAccessory";
	}
}

