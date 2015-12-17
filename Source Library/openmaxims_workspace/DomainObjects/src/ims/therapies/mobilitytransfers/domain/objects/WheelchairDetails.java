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
package ims.therapies.mobilitytransfers.domain.objects;

/**
 * Wheelchair Details
 * @author Joan Heelan
 * Generated.
 */


public class WheelchairDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100045;
	private static final long serialVersionUID = 1019100045L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Authoring Date Time */
	private java.util.Date authoringDateTime;
	/** Authoring Health Care Professional */
	private ims.core.resource.people.domain.objects.Hcp authoringHCP;
	/** Wheelchair Type */
	private ims.domain.lookups.LookupInstance wheelchairType;
	/** Wheelchair Model */
	private ims.domain.lookups.LookupInstance wheelchairModel;
	/** Wheelchair Frame */
	private ims.domain.lookups.LookupInstance wheelchairFrame;
	/** Wheelchair Footplates. */
	private ims.domain.lookups.LookupInstance wheelchairFootplates;
	/** Seat Width (cms) */
	private Integer seatWidth;
	/** Seat Depth (cms) */
	private Integer seatDepth;
	/** Seat Overall Width (cms) */
	private Integer seatOverallWidth;
	/** Trial Start Date */
	private java.util.Date trialStartDate;
	/** Trial End Date */
	private java.util.Date trialEndDate;
	/** Wheelchair Accessories */
	private String wheelchairAccessories;
	/** Wheelchair Comments */
	private String wheelchairComments;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WheelchairDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WheelchairDetails ()
    {
    	super();
    }
    public WheelchairDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.mobilitytransfers.domain.objects.WheelchairDetails.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringHCP() {
		return authoringHCP;
	}
	public void setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp authoringHCP) {
		this.authoringHCP = authoringHCP;
	}

	public ims.domain.lookups.LookupInstance getWheelchairType() {
		return wheelchairType;
	}
	public void setWheelchairType(ims.domain.lookups.LookupInstance wheelchairType) {
		this.wheelchairType = wheelchairType;
	}

	public ims.domain.lookups.LookupInstance getWheelchairModel() {
		return wheelchairModel;
	}
	public void setWheelchairModel(ims.domain.lookups.LookupInstance wheelchairModel) {
		this.wheelchairModel = wheelchairModel;
	}

	public ims.domain.lookups.LookupInstance getWheelchairFrame() {
		return wheelchairFrame;
	}
	public void setWheelchairFrame(ims.domain.lookups.LookupInstance wheelchairFrame) {
		this.wheelchairFrame = wheelchairFrame;
	}

	public ims.domain.lookups.LookupInstance getWheelchairFootplates() {
		return wheelchairFootplates;
	}
	public void setWheelchairFootplates(ims.domain.lookups.LookupInstance wheelchairFootplates) {
		this.wheelchairFootplates = wheelchairFootplates;
	}

	public Integer getSeatWidth() {
		return seatWidth;
	}
	public void setSeatWidth(Integer seatWidth) {
		this.seatWidth = seatWidth;
	}

	public Integer getSeatDepth() {
		return seatDepth;
	}
	public void setSeatDepth(Integer seatDepth) {
		this.seatDepth = seatDepth;
	}

	public Integer getSeatOverallWidth() {
		return seatOverallWidth;
	}
	public void setSeatOverallWidth(Integer seatOverallWidth) {
		this.seatOverallWidth = seatOverallWidth;
	}

	public java.util.Date getTrialStartDate() {
		return trialStartDate;
	}
	public void setTrialStartDate(java.util.Date trialStartDate) {
		this.trialStartDate = trialStartDate;
	}

	public java.util.Date getTrialEndDate() {
		return trialEndDate;
	}
	public void setTrialEndDate(java.util.Date trialEndDate) {
		this.trialEndDate = trialEndDate;
	}

	public String getWheelchairAccessories() {
		return wheelchairAccessories;
	}
	public void setWheelchairAccessories(String wheelchairAccessories) {
		if ( null != wheelchairAccessories && wheelchairAccessories.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for wheelchairAccessories. Tried to set value: "+
				wheelchairAccessories);
		}
		this.wheelchairAccessories = wheelchairAccessories;
	}

	public String getWheelchairComments() {
		return wheelchairComments;
	}
	public void setWheelchairComments(String wheelchairComments) {
		if ( null != wheelchairComments && wheelchairComments.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for wheelchairComments. Tried to set value: "+
				wheelchairComments);
		}
		this.wheelchairComments = wheelchairComments;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringHCP* :");
		if (authoringHCP != null)
		{
			auditStr.append(toShortClassName(authoringHCP));
				
		    auditStr.append(authoringHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wheelchairType* :");
		if (wheelchairType != null)
			auditStr.append(wheelchairType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wheelchairModel* :");
		if (wheelchairModel != null)
			auditStr.append(wheelchairModel.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wheelchairFrame* :");
		if (wheelchairFrame != null)
			auditStr.append(wheelchairFrame.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wheelchairFootplates* :");
		if (wheelchairFootplates != null)
			auditStr.append(wheelchairFootplates.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*seatWidth* :");
		auditStr.append(seatWidth);
	    auditStr.append("; ");
		auditStr.append("\r\n*seatDepth* :");
		auditStr.append(seatDepth);
	    auditStr.append("; ");
		auditStr.append("\r\n*seatOverallWidth* :");
		auditStr.append(seatOverallWidth);
	    auditStr.append("; ");
		auditStr.append("\r\n*trialStartDate* :");
		auditStr.append(trialStartDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*trialEndDate* :");
		auditStr.append(trialEndDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*wheelchairAccessories* :");
		auditStr.append(wheelchairAccessories);
	    auditStr.append("; ");
		auditStr.append("\r\n*wheelchairComments* :");
		auditStr.append(wheelchairComments);
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
		
		String keyClassName = "WheelchairDetails";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getAuthoringHCP() != null)
		{
			sb.append("<authoringHCP>");
			sb.append(this.getAuthoringHCP().toXMLString(domMap)); 	
			sb.append("</authoringHCP>");		
		}
		if (this.getWheelchairType() != null)
		{
			sb.append("<wheelchairType>");
			sb.append(this.getWheelchairType().toXMLString()); 
			sb.append("</wheelchairType>");		
		}
		if (this.getWheelchairModel() != null)
		{
			sb.append("<wheelchairModel>");
			sb.append(this.getWheelchairModel().toXMLString()); 
			sb.append("</wheelchairModel>");		
		}
		if (this.getWheelchairFrame() != null)
		{
			sb.append("<wheelchairFrame>");
			sb.append(this.getWheelchairFrame().toXMLString()); 
			sb.append("</wheelchairFrame>");		
		}
		if (this.getWheelchairFootplates() != null)
		{
			sb.append("<wheelchairFootplates>");
			sb.append(this.getWheelchairFootplates().toXMLString()); 
			sb.append("</wheelchairFootplates>");		
		}
		if (this.getSeatWidth() != null)
		{
			sb.append("<seatWidth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSeatWidth().toString()));
			sb.append("</seatWidth>");		
		}
		if (this.getSeatDepth() != null)
		{
			sb.append("<seatDepth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSeatDepth().toString()));
			sb.append("</seatDepth>");		
		}
		if (this.getSeatOverallWidth() != null)
		{
			sb.append("<seatOverallWidth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSeatOverallWidth().toString()));
			sb.append("</seatOverallWidth>");		
		}
		if (this.getTrialStartDate() != null)
		{
			sb.append("<trialStartDate>");
			sb.append(new ims.framework.utils.DateTime(this.getTrialStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</trialStartDate>");		
		}
		if (this.getTrialEndDate() != null)
		{
			sb.append("<trialEndDate>");
			sb.append(new ims.framework.utils.DateTime(this.getTrialEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</trialEndDate>");		
		}
		if (this.getWheelchairAccessories() != null)
		{
			sb.append("<wheelchairAccessories>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWheelchairAccessories().toString()));
			sb.append("</wheelchairAccessories>");		
		}
		if (this.getWheelchairComments() != null)
		{
			sb.append("<wheelchairComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWheelchairComments().toString()));
			sb.append("</wheelchairComments>");		
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
			WheelchairDetails domainObject = getWheelchairDetailsfromXML(itemEl, factory, domMap);

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
			WheelchairDetails domainObject = getWheelchairDetailsfromXML(itemEl, factory, domMap);

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
		
	public static WheelchairDetails getWheelchairDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWheelchairDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WheelchairDetails getWheelchairDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WheelchairDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WheelchairDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WheelchairDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WheelchairDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WheelchairDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WheelchairDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WheelchairDetails)factory.getImportedDomainObject(WheelchairDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WheelchairDetails();
		}
		String keyClassName = "WheelchairDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WheelchairDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WheelchairDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("authoringHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("wheelchairType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWheelchairType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wheelchairModel");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWheelchairModel(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wheelchairFrame");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWheelchairFrame(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wheelchairFootplates");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWheelchairFootplates(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("seatWidth");
		if(fldEl != null)
		{	
    		obj.setSeatWidth(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("seatDepth");
		if(fldEl != null)
		{	
    		obj.setSeatDepth(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("seatOverallWidth");
		if(fldEl != null)
		{	
    		obj.setSeatOverallWidth(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("trialStartDate");
		if(fldEl != null)
		{	
    		obj.setTrialStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("trialEndDate");
		if(fldEl != null)
		{	
    		obj.setTrialEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("wheelchairAccessories");
		if(fldEl != null)
		{	
    		obj.setWheelchairAccessories(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wheelchairComments");
		if(fldEl != null)
		{	
    		obj.setWheelchairComments(new String(fldEl.getTextTrim()));	
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
		public static final String CareContext = "careContext";
		public static final String ClinicalContact = "clinicalContact";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String AuthoringHCP = "authoringHCP";
		public static final String WheelchairType = "wheelchairType";
		public static final String WheelchairModel = "wheelchairModel";
		public static final String WheelchairFrame = "wheelchairFrame";
		public static final String WheelchairFootplates = "wheelchairFootplates";
		public static final String SeatWidth = "seatWidth";
		public static final String SeatDepth = "seatDepth";
		public static final String SeatOverallWidth = "seatOverallWidth";
		public static final String TrialStartDate = "trialStartDate";
		public static final String TrialEndDate = "trialEndDate";
		public static final String WheelchairAccessories = "wheelchairAccessories";
		public static final String WheelchairComments = "wheelchairComments";
	}
}

