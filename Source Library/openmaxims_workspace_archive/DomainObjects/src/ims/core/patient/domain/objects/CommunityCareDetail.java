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
package ims.core.patient.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class CommunityCareDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1001100006;
	private static final long serialVersionUID = 1001100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Local Health Office */
	private ims.core.resource.place.domain.objects.Organisation lho;
	/** Community Care Area */
	private ims.core.resource.place.domain.objects.LocSite cca;
	/** Sector */
	private ims.core.resource.place.domain.objects.Location sector;
	/** PHN District */
	private ims.core.resource.place.domain.objects.Location phnDistrict;
	/** DED */
	private ims.core.resource.place.domain.objects.DED dED;
	/** Registered GP for Immunisation Care */
	private ims.core.resource.people.domain.objects.Gp registeredGp;
	/** Registered GP Surgery where Immunisation Care takes place */
	private ims.core.resource.place.domain.objects.LocSite registeredGpSurgery;
	/** Date GP was registered with the client */
	private java.util.Date gPRegistrationDate;
	/** User Defined Field 1 */
	private ims.domain.lookups.LookupInstance userDefinedField1;
	/** User Defined Field 2 */
	private ims.domain.lookups.LookupInstance userDefinedField2;
	/** User Defined Field 3 */
	private ims.domain.lookups.LookupInstance userDefinedField3;
	/** User Defined Field 4 */
	private ims.domain.lookups.LookupInstance userDefinedField4;
	/** User Defined Field 5 */
	private ims.domain.lookups.LookupInstance userDefinedField5;
	/** Address History
	  * Collection of ims.core.resource.place.domain.objects.PciAddressHistory.
	  */
	private java.util.List addressHistory;
	/** Was the client extracted for a report */
	private Boolean isExtracted;
	/** Current School */
	private ims.core.resource.place.domain.objects.School currentSchool;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CommunityCareDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CommunityCareDetail ()
    {
    	super();
    }
    public CommunityCareDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.CommunityCareDetail.class;
	}


	public ims.core.resource.place.domain.objects.Organisation getLho() {
		return lho;
	}
	public void setLho(ims.core.resource.place.domain.objects.Organisation lho) {
		this.lho = lho;
	}

	public ims.core.resource.place.domain.objects.LocSite getCca() {
		return cca;
	}
	public void setCca(ims.core.resource.place.domain.objects.LocSite cca) {
		this.cca = cca;
	}

	public ims.core.resource.place.domain.objects.Location getSector() {
		return sector;
	}
	public void setSector(ims.core.resource.place.domain.objects.Location sector) {
		this.sector = sector;
	}

	public ims.core.resource.place.domain.objects.Location getPhnDistrict() {
		return phnDistrict;
	}
	public void setPhnDistrict(ims.core.resource.place.domain.objects.Location phnDistrict) {
		this.phnDistrict = phnDistrict;
	}

	public ims.core.resource.place.domain.objects.DED getDED() {
		return dED;
	}
	public void setDED(ims.core.resource.place.domain.objects.DED dED) {
		this.dED = dED;
	}

	public ims.core.resource.people.domain.objects.Gp getRegisteredGp() {
		return registeredGp;
	}
	public void setRegisteredGp(ims.core.resource.people.domain.objects.Gp registeredGp) {
		this.registeredGp = registeredGp;
	}

	public ims.core.resource.place.domain.objects.LocSite getRegisteredGpSurgery() {
		return registeredGpSurgery;
	}
	public void setRegisteredGpSurgery(ims.core.resource.place.domain.objects.LocSite registeredGpSurgery) {
		this.registeredGpSurgery = registeredGpSurgery;
	}

	public java.util.Date getGPRegistrationDate() {
		return gPRegistrationDate;
	}
	public void setGPRegistrationDate(java.util.Date gPRegistrationDate) {
		this.gPRegistrationDate = gPRegistrationDate;
	}

	public ims.domain.lookups.LookupInstance getUserDefinedField1() {
		return userDefinedField1;
	}
	public void setUserDefinedField1(ims.domain.lookups.LookupInstance userDefinedField1) {
		this.userDefinedField1 = userDefinedField1;
	}

	public ims.domain.lookups.LookupInstance getUserDefinedField2() {
		return userDefinedField2;
	}
	public void setUserDefinedField2(ims.domain.lookups.LookupInstance userDefinedField2) {
		this.userDefinedField2 = userDefinedField2;
	}

	public ims.domain.lookups.LookupInstance getUserDefinedField3() {
		return userDefinedField3;
	}
	public void setUserDefinedField3(ims.domain.lookups.LookupInstance userDefinedField3) {
		this.userDefinedField3 = userDefinedField3;
	}

	public ims.domain.lookups.LookupInstance getUserDefinedField4() {
		return userDefinedField4;
	}
	public void setUserDefinedField4(ims.domain.lookups.LookupInstance userDefinedField4) {
		this.userDefinedField4 = userDefinedField4;
	}

	public ims.domain.lookups.LookupInstance getUserDefinedField5() {
		return userDefinedField5;
	}
	public void setUserDefinedField5(ims.domain.lookups.LookupInstance userDefinedField5) {
		this.userDefinedField5 = userDefinedField5;
	}

	public java.util.List getAddressHistory() {
		if ( null == addressHistory ) {
			addressHistory = new java.util.ArrayList();
		}
		return addressHistory;
	}
	public void setAddressHistory(java.util.List paramValue) {
		this.addressHistory = paramValue;
	}

	public Boolean isIsExtracted() {
		return isExtracted;
	}
	public void setIsExtracted(Boolean isExtracted) {
		this.isExtracted = isExtracted;
	}

	public ims.core.resource.place.domain.objects.School getCurrentSchool() {
		return currentSchool;
	}
	public void setCurrentSchool(ims.core.resource.place.domain.objects.School currentSchool) {
		this.currentSchool = currentSchool;
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
		
		auditStr.append("\r\n*lho* :");
		if (lho != null)
		{
			auditStr.append(toShortClassName(lho));
				
		    auditStr.append(lho.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*cca* :");
		if (cca != null)
		{
			auditStr.append(toShortClassName(cca));
				
		    auditStr.append(cca.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sector* :");
		if (sector != null)
		{
			auditStr.append(toShortClassName(sector));
				
		    auditStr.append(sector.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*phnDistrict* :");
		if (phnDistrict != null)
		{
			auditStr.append(toShortClassName(phnDistrict));
				
		    auditStr.append(phnDistrict.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dED* :");
		if (dED != null)
		{
			auditStr.append(toShortClassName(dED));
				
		    auditStr.append(dED.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*registeredGp* :");
		if (registeredGp != null)
		{
			auditStr.append(toShortClassName(registeredGp));
				
		    auditStr.append(registeredGp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*registeredGpSurgery* :");
		if (registeredGpSurgery != null)
		{
			auditStr.append(toShortClassName(registeredGpSurgery));
				
		    auditStr.append(registeredGpSurgery.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*gPRegistrationDate* :");
		auditStr.append(gPRegistrationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*userDefinedField1* :");
		if (userDefinedField1 != null)
			auditStr.append(userDefinedField1.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*userDefinedField2* :");
		if (userDefinedField2 != null)
			auditStr.append(userDefinedField2.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*userDefinedField3* :");
		if (userDefinedField3 != null)
			auditStr.append(userDefinedField3.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*userDefinedField4* :");
		if (userDefinedField4 != null)
			auditStr.append(userDefinedField4.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*userDefinedField5* :");
		if (userDefinedField5 != null)
			auditStr.append(userDefinedField5.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*addressHistory* :");
		if (addressHistory != null)
		{
		int i14=0;
		for (i14=0; i14<addressHistory.size(); i14++)
		{
			if (i14 > 0)
				auditStr.append(",");
			ims.core.resource.place.domain.objects.PciAddressHistory obj = (ims.core.resource.place.domain.objects.PciAddressHistory)addressHistory.get(i14);
		    if (obj != null)
			{
				if (i14 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isExtracted* :");
		auditStr.append(isExtracted);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentSchool* :");
		if (currentSchool != null)
		{
			auditStr.append(toShortClassName(currentSchool));
				
		    auditStr.append(currentSchool.getId());
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
		
		String keyClassName = "CommunityCareDetail";
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
		if (this.getLho() != null)
		{
			sb.append("<lho>");
			sb.append(this.getLho().toXMLString(domMap)); 	
			sb.append("</lho>");		
		}
		if (this.getCca() != null)
		{
			sb.append("<cca>");
			sb.append(this.getCca().toXMLString(domMap)); 	
			sb.append("</cca>");		
		}
		if (this.getSector() != null)
		{
			sb.append("<sector>");
			sb.append(this.getSector().toXMLString(domMap)); 	
			sb.append("</sector>");		
		}
		if (this.getPhnDistrict() != null)
		{
			sb.append("<phnDistrict>");
			sb.append(this.getPhnDistrict().toXMLString(domMap)); 	
			sb.append("</phnDistrict>");		
		}
		if (this.getDED() != null)
		{
			sb.append("<dED>");
			sb.append(this.getDED().toXMLString(domMap)); 	
			sb.append("</dED>");		
		}
		if (this.getRegisteredGp() != null)
		{
			sb.append("<registeredGp>");
			sb.append(this.getRegisteredGp().toXMLString(domMap)); 	
			sb.append("</registeredGp>");		
		}
		if (this.getRegisteredGpSurgery() != null)
		{
			sb.append("<registeredGpSurgery>");
			sb.append(this.getRegisteredGpSurgery().toXMLString(domMap)); 	
			sb.append("</registeredGpSurgery>");		
		}
		if (this.getGPRegistrationDate() != null)
		{
			sb.append("<gPRegistrationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getGPRegistrationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</gPRegistrationDate>");		
		}
		if (this.getUserDefinedField1() != null)
		{
			sb.append("<userDefinedField1>");
			sb.append(this.getUserDefinedField1().toXMLString()); 
			sb.append("</userDefinedField1>");		
		}
		if (this.getUserDefinedField2() != null)
		{
			sb.append("<userDefinedField2>");
			sb.append(this.getUserDefinedField2().toXMLString()); 
			sb.append("</userDefinedField2>");		
		}
		if (this.getUserDefinedField3() != null)
		{
			sb.append("<userDefinedField3>");
			sb.append(this.getUserDefinedField3().toXMLString()); 
			sb.append("</userDefinedField3>");		
		}
		if (this.getUserDefinedField4() != null)
		{
			sb.append("<userDefinedField4>");
			sb.append(this.getUserDefinedField4().toXMLString()); 
			sb.append("</userDefinedField4>");		
		}
		if (this.getUserDefinedField5() != null)
		{
			sb.append("<userDefinedField5>");
			sb.append(this.getUserDefinedField5().toXMLString()); 
			sb.append("</userDefinedField5>");		
		}
		if (this.getAddressHistory() != null)
		{
			if (this.getAddressHistory().size() > 0 )
			{
			sb.append("<addressHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAddressHistory(), domMap));
			sb.append("</addressHistory>");		
			}
		}
		if (this.isIsExtracted() != null)
		{
			sb.append("<isExtracted>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsExtracted().toString()));
			sb.append("</isExtracted>");		
		}
		if (this.getCurrentSchool() != null)
		{
			sb.append("<currentSchool>");
			sb.append(this.getCurrentSchool().toXMLString(domMap)); 	
			sb.append("</currentSchool>");		
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
			CommunityCareDetail domainObject = getCommunityCareDetailfromXML(itemEl, factory, domMap);

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
			CommunityCareDetail domainObject = getCommunityCareDetailfromXML(itemEl, factory, domMap);

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
		
	public static CommunityCareDetail getCommunityCareDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCommunityCareDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CommunityCareDetail getCommunityCareDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CommunityCareDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CommunityCareDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CommunityCareDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CommunityCareDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CommunityCareDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CommunityCareDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CommunityCareDetail)factory.getImportedDomainObject(CommunityCareDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CommunityCareDetail();
		}
		String keyClassName = "CommunityCareDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CommunityCareDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CommunityCareDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("lho");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLho(ims.core.resource.place.domain.objects.Organisation.getOrganisationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("cca");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCca(ims.core.resource.place.domain.objects.LocSite.getLocSitefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sector");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSector(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("phnDistrict");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPhnDistrict(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dED");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDED(ims.core.resource.place.domain.objects.DED.getDEDfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("registeredGp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRegisteredGp(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("registeredGpSurgery");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRegisteredGpSurgery(ims.core.resource.place.domain.objects.LocSite.getLocSitefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("gPRegistrationDate");
		if(fldEl != null)
		{	
    		obj.setGPRegistrationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("userDefinedField1");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUserDefinedField1(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("userDefinedField2");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUserDefinedField2(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("userDefinedField3");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUserDefinedField3(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("userDefinedField4");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUserDefinedField4(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("userDefinedField5");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUserDefinedField5(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("addressHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAddressHistory(ims.core.resource.place.domain.objects.PciAddressHistory.fromListXMLString(fldEl, factory, obj.getAddressHistory(), domMap));
		}
		fldEl = el.element("isExtracted");
		if(fldEl != null)
		{	
    		obj.setIsExtracted(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentSchool");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentSchool(ims.core.resource.place.domain.objects.School.getSchoolfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "addressHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Lho = "lho";
		public static final String Cca = "cca";
		public static final String Sector = "sector";
		public static final String PhnDistrict = "phnDistrict";
		public static final String DED = "dED";
		public static final String RegisteredGp = "registeredGp";
		public static final String RegisteredGpSurgery = "registeredGpSurgery";
		public static final String GPRegistrationDate = "gPRegistrationDate";
		public static final String UserDefinedField1 = "userDefinedField1";
		public static final String UserDefinedField2 = "userDefinedField2";
		public static final String UserDefinedField3 = "userDefinedField3";
		public static final String UserDefinedField4 = "userDefinedField4";
		public static final String UserDefinedField5 = "userDefinedField5";
		public static final String AddressHistory = "addressHistory";
		public static final String IsExtracted = "isExtracted";
		public static final String CurrentSchool = "currentSchool";
	}
}

