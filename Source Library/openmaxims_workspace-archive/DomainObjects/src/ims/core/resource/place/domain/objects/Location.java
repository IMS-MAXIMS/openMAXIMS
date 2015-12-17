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
package ims.core.resource.place.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class Location extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1007100007;
	private static final long serialVersionUID = 1007100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return false;
	}

	/** Location Name */
	private String name;
	/** Location Address */
	private ims.core.generic.domain.objects.Address address;
	/** Location Type - Ward, OT, Health Centre, Hospital */
	private ims.domain.lookups.LookupInstance type;
	/** isActive */
	private Boolean isActive;
	/** True = Secure Accommodation, False = Not Secure Accommodation */
	private Boolean secureAccommodation;
	/** 
	  * Collection of ims.core.resource.place.domain.objects.Location.
	  */
	private java.util.Set locations;
	private ims.core.resource.place.domain.objects.Location parentLocation;
	/** Services delivered from this Location
	  * Collection of ims.core.resource.place.domain.objects.LocationService.
	  */
	private java.util.Set services;
	/** TreatingHospital */
	private Boolean treatingHosp;
	/** ReferringHospital */
	private Boolean referringHospital;
	/** Activity Limit Group
	  * Collection of ims.core.clinical.domain.objects.ActivityLimitGroup.
	  */
	private java.util.Set activityLimitGroup;
	/** 
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List codeMappings;
	/** The set of printers at this Location
	  * Collection of ims.core.configuration.domain.objects.Printer.
	  */
	private java.util.List printers;
	/** upper cased and indexed, used for searches only */
	private String upperName;
	private Boolean isVirtual;
	/** DefaultPrinter */
	private ims.core.configuration.domain.objects.Printer defaultPrinter;
	/** Designated Printer For New Results */
	private ims.core.configuration.domain.objects.Printer designatedPrinterForNewResults;
	/** Designated printer for OCS Order */
	private ims.core.configuration.domain.objects.Printer designatedPrinterForOCSOrder;
	/** VTE Asessment Not Required */
	private Boolean vTEAsessmentNotRequired;
	/** Display in ED Tracking */
	private Boolean displayInEDTracking;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Location (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Location ()
    {
    	super();
    }
    public Location (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.place.domain.objects.Location.class;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 120 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public ims.core.generic.domain.objects.Address getAddress() {
		return address;
	}
	public void setAddress(ims.core.generic.domain.objects.Address address) {
		this.address = address;
	}

	public ims.domain.lookups.LookupInstance getType() {
		return type;
	}
	public void setType(ims.domain.lookups.LookupInstance type) {
		this.type = type;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean isSecureAccommodation() {
		return secureAccommodation;
	}
	public void setSecureAccommodation(Boolean secureAccommodation) {
		this.secureAccommodation = secureAccommodation;
	}

	public java.util.Set getLocations() {
		if ( null == locations ) {
			locations = new java.util.HashSet();
		}
		return locations;
	}
	public void setLocations(java.util.Set paramValue) {
		this.locations = paramValue;
	}

	public ims.core.resource.place.domain.objects.Location getParentLocation() {
		return parentLocation;
	}
	public void setParentLocation(ims.core.resource.place.domain.objects.Location parentLocation) {
		this.parentLocation = parentLocation;
	}

	public java.util.Set getServices() {
		if ( null == services ) {
			services = new java.util.HashSet();
		}
		return services;
	}
	public void setServices(java.util.Set paramValue) {
		this.services = paramValue;
	}

	public Boolean isTreatingHosp() {
		return treatingHosp;
	}
	public void setTreatingHosp(Boolean treatingHosp) {
		this.treatingHosp = treatingHosp;
	}

	public Boolean isReferringHospital() {
		return referringHospital;
	}
	public void setReferringHospital(Boolean referringHospital) {
		this.referringHospital = referringHospital;
	}

	public java.util.Set getActivityLimitGroup() {
		if ( null == activityLimitGroup ) {
			activityLimitGroup = new java.util.HashSet();
		}
		return activityLimitGroup;
	}
	public void setActivityLimitGroup(java.util.Set paramValue) {
		this.activityLimitGroup = paramValue;
	}

	public java.util.List getCodeMappings() {
		if ( null == codeMappings ) {
			codeMappings = new java.util.ArrayList();
		}
		return codeMappings;
	}
	public void setCodeMappings(java.util.List paramValue) {
		this.codeMappings = paramValue;
	}

	public java.util.List getPrinters() {
		if ( null == printers ) {
			printers = new java.util.ArrayList();
		}
		return printers;
	}
	public void setPrinters(java.util.List paramValue) {
		this.printers = paramValue;
	}

	public String getUpperName() {
		return upperName;
	}
	public void setUpperName(String upperName) {
		if ( null != upperName && upperName.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for upperName. Tried to set value: "+
				upperName);
		}
		this.upperName = upperName;
	}

	public Boolean isIsVirtual() {
		return isVirtual;
	}
	public void setIsVirtual(Boolean isVirtual) {
		this.isVirtual = isVirtual;
	}

	public ims.core.configuration.domain.objects.Printer getDefaultPrinter() {
		return defaultPrinter;
	}
	public void setDefaultPrinter(ims.core.configuration.domain.objects.Printer defaultPrinter) {
		this.defaultPrinter = defaultPrinter;
	}

	public ims.core.configuration.domain.objects.Printer getDesignatedPrinterForNewResults() {
		return designatedPrinterForNewResults;
	}
	public void setDesignatedPrinterForNewResults(ims.core.configuration.domain.objects.Printer designatedPrinterForNewResults) {
		this.designatedPrinterForNewResults = designatedPrinterForNewResults;
	}

	public ims.core.configuration.domain.objects.Printer getDesignatedPrinterForOCSOrder() {
		return designatedPrinterForOCSOrder;
	}
	public void setDesignatedPrinterForOCSOrder(ims.core.configuration.domain.objects.Printer designatedPrinterForOCSOrder) {
		this.designatedPrinterForOCSOrder = designatedPrinterForOCSOrder;
	}

	public Boolean isVTEAsessmentNotRequired() {
		return vTEAsessmentNotRequired;
	}
	public void setVTEAsessmentNotRequired(Boolean vTEAsessmentNotRequired) {
		this.vTEAsessmentNotRequired = vTEAsessmentNotRequired;
	}

	public Boolean isDisplayInEDTracking() {
		return displayInEDTracking;
	}
	public void setDisplayInEDTracking(Boolean displayInEDTracking) {
		this.displayInEDTracking = displayInEDTracking;
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
		if ( "Configuration".equals("Configuration") )
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*address* :");
		if (address != null)
		{
			auditStr.append(toShortClassName(address));
				
		    auditStr.append(address.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*type* :");
		if (type != null)
			auditStr.append(type.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*secureAccommodation* :");
		auditStr.append(secureAccommodation);
	    auditStr.append("; ");
		auditStr.append("\r\n*locations* :");
		if (locations != null)
		{
			java.util.Iterator it6 = locations.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.core.resource.place.domain.objects.Location obj = (ims.core.resource.place.domain.objects.Location)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*parentLocation* :");
		if (parentLocation != null)
		{
			auditStr.append(toShortClassName(parentLocation));
				
		    auditStr.append(parentLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*services* :");
		if (services != null)
		{
			java.util.Iterator it8 = services.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.core.resource.place.domain.objects.LocationService obj = (ims.core.resource.place.domain.objects.LocationService)it8.next();
		if (obj != null)
		{
		   if (i8 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingHosp* :");
		auditStr.append(treatingHosp);
	    auditStr.append("; ");
		auditStr.append("\r\n*referringHospital* :");
		auditStr.append(referringHospital);
	    auditStr.append("; ");
		auditStr.append("\r\n*activityLimitGroup* :");
		if (activityLimitGroup != null)
		{
			java.util.Iterator it11 = activityLimitGroup.iterator();
			int i11=0;
			while (it11.hasNext())
			{
				if (i11 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.ActivityLimitGroup obj = (ims.core.clinical.domain.objects.ActivityLimitGroup)it11.next();
		if (obj != null)
		{
		   if (i11 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i11++;
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*codeMappings* :");
		if (codeMappings != null)
		{
		int i12=0;
		for (i12=0; i12<codeMappings.size(); i12++)
		{
			if (i12 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)codeMappings.get(i12);
		    if (obj != null)
			{
				if (i12 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*printers* :");
		if (printers != null)
		{
		int i13=0;
		for (i13=0; i13<printers.size(); i13++)
		{
			if (i13 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.Printer obj = (ims.core.configuration.domain.objects.Printer)printers.get(i13);
		    if (obj != null)
			{
				if (i13 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*upperName* :");
		auditStr.append(upperName);
	    auditStr.append("; ");
		auditStr.append("\r\n*isVirtual* :");
		auditStr.append(isVirtual);
	    auditStr.append("; ");
		auditStr.append("\r\n*defaultPrinter* :");
		if (defaultPrinter != null)
		{
			auditStr.append(toShortClassName(defaultPrinter));
				
		    auditStr.append(defaultPrinter.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*designatedPrinterForNewResults* :");
		if (designatedPrinterForNewResults != null)
		{
			auditStr.append(toShortClassName(designatedPrinterForNewResults));
				
		    auditStr.append(designatedPrinterForNewResults.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*designatedPrinterForOCSOrder* :");
		if (designatedPrinterForOCSOrder != null)
		{
			auditStr.append(toShortClassName(designatedPrinterForOCSOrder));
				
		    auditStr.append(designatedPrinterForOCSOrder.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*vTEAsessmentNotRequired* :");
		auditStr.append(vTEAsessmentNotRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayInEDTracking* :");
		auditStr.append(displayInEDTracking);
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
		
		String keyClassName = "Location";
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
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getAddress() != null)
		{
			sb.append("<address>");
			sb.append(this.getAddress().toXMLString(domMap)); 	
			sb.append("</address>");		
		}
		if (this.getType() != null)
		{
			sb.append("<type>");
			sb.append(this.getType().toXMLString()); 
			sb.append("</type>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.isSecureAccommodation() != null)
		{
			sb.append("<secureAccommodation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSecureAccommodation().toString()));
			sb.append("</secureAccommodation>");		
		}
		if (this.getLocations() != null)
		{
			if (this.getLocations().size() > 0 )
			{
			sb.append("<locations>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLocations(), domMap));
			sb.append("</locations>");		
			}
		}
		if (this.getParentLocation() != null)
		{
			sb.append("<parentLocation>");
			sb.append(this.getParentLocation().toXMLString(domMap)); 	
			sb.append("</parentLocation>");		
		}
		if (this.getServices() != null)
		{
			if (this.getServices().size() > 0 )
			{
			sb.append("<services>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getServices(), domMap));
			sb.append("</services>");		
			}
		}
		if (this.isTreatingHosp() != null)
		{
			sb.append("<treatingHosp>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTreatingHosp().toString()));
			sb.append("</treatingHosp>");		
		}
		if (this.isReferringHospital() != null)
		{
			sb.append("<referringHospital>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isReferringHospital().toString()));
			sb.append("</referringHospital>");		
		}
		if (this.getActivityLimitGroup() != null)
		{
			if (this.getActivityLimitGroup().size() > 0 )
			{
			sb.append("<activityLimitGroup>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActivityLimitGroup(), domMap));
			sb.append("</activityLimitGroup>");		
			}
		}
		if (this.getCodeMappings() != null)
		{
			if (this.getCodeMappings().size() > 0 )
			{
			sb.append("<codeMappings>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCodeMappings(), domMap));
			sb.append("</codeMappings>");		
			}
		}
		if (this.getPrinters() != null)
		{
			if (this.getPrinters().size() > 0 )
			{
			sb.append("<printers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPrinters(), domMap));
			sb.append("</printers>");		
			}
		}
		if (this.getUpperName() != null)
		{
			sb.append("<upperName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUpperName().toString()));
			sb.append("</upperName>");		
		}
		if (this.isIsVirtual() != null)
		{
			sb.append("<isVirtual>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsVirtual().toString()));
			sb.append("</isVirtual>");		
		}
		if (this.getDefaultPrinter() != null)
		{
			sb.append("<defaultPrinter>");
			sb.append(this.getDefaultPrinter().toXMLString(domMap)); 	
			sb.append("</defaultPrinter>");		
		}
		if (this.getDesignatedPrinterForNewResults() != null)
		{
			sb.append("<designatedPrinterForNewResults>");
			sb.append(this.getDesignatedPrinterForNewResults().toXMLString(domMap)); 	
			sb.append("</designatedPrinterForNewResults>");		
		}
		if (this.getDesignatedPrinterForOCSOrder() != null)
		{
			sb.append("<designatedPrinterForOCSOrder>");
			sb.append(this.getDesignatedPrinterForOCSOrder().toXMLString(domMap)); 	
			sb.append("</designatedPrinterForOCSOrder>");		
		}
		if (this.isVTEAsessmentNotRequired() != null)
		{
			sb.append("<vTEAsessmentNotRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isVTEAsessmentNotRequired().toString()));
			sb.append("</vTEAsessmentNotRequired>");		
		}
		if (this.isDisplayInEDTracking() != null)
		{
			sb.append("<displayInEDTracking>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayInEDTracking().toString()));
			sb.append("</displayInEDTracking>");		
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
			Location domainObject = getLocationfromXML(itemEl, factory, domMap);

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
			Location domainObject = getLocationfromXML(itemEl, factory, domMap);

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
		
	public static Location getLocationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getLocationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Location getLocationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Location.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Location.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Location class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Location)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Location.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Location ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Location)factory.getImportedDomainObject(Location.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Location();
		}
		String keyClassName = "Location";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Location)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Location obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("address");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAddress(ims.core.generic.domain.objects.Address.getAddressfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("type");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("secureAccommodation");
		if(fldEl != null)
		{	
    		obj.setSecureAccommodation(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("locations");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setLocations(ims.core.resource.place.domain.objects.Location.fromSetXMLString(fldEl, factory, obj.getLocations(), domMap));
		}
		fldEl = el.element("parentLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setParentLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("services");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setServices(ims.core.resource.place.domain.objects.LocationService.fromSetXMLString(fldEl, factory, obj.getServices(), domMap));
		}
		fldEl = el.element("treatingHosp");
		if(fldEl != null)
		{	
    		obj.setTreatingHosp(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referringHospital");
		if(fldEl != null)
		{	
    		obj.setReferringHospital(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activityLimitGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setActivityLimitGroup(ims.core.clinical.domain.objects.ActivityLimitGroup.fromSetXMLString(fldEl, factory, obj.getActivityLimitGroup(), domMap));
		}
		fldEl = el.element("codeMappings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCodeMappings(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getCodeMappings(), domMap));
		}
		fldEl = el.element("printers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPrinters(ims.core.configuration.domain.objects.Printer.fromListXMLString(fldEl, factory, obj.getPrinters(), domMap));
		}
		fldEl = el.element("upperName");
		if(fldEl != null)
		{	
    		obj.setUpperName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isVirtual");
		if(fldEl != null)
		{	
    		obj.setIsVirtual(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("defaultPrinter");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDefaultPrinter(ims.core.configuration.domain.objects.Printer.getPrinterfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("designatedPrinterForNewResults");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDesignatedPrinterForNewResults(ims.core.configuration.domain.objects.Printer.getPrinterfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("designatedPrinterForOCSOrder");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDesignatedPrinterForOCSOrder(ims.core.configuration.domain.objects.Printer.getPrinterfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("vTEAsessmentNotRequired");
		if(fldEl != null)
		{	
    		obj.setVTEAsessmentNotRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayInEDTracking");
		if(fldEl != null)
		{	
    		obj.setDisplayInEDTracking(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "locations"
		, "services"
		, "activityLimitGroup"
		, "codeMappings"
		, "printers"
		};
	}

	/**
	getExtCode
	*/
public String getExtCode(int taxTypeId)
{
	java.util.List l = this.getCodeMappings();
	if (l == null || l.size() == 0) 
		return null;
	
	for (int i = 0; i < l.size(); i++)
	{
		ims.core.clinical.domain.objects.TaxonomyMap map = (ims.core.clinical.domain.objects.TaxonomyMap)l.get(i);
		if (map.getTaxonomyName().getId() == taxTypeId)
		{
			return map.getTaxonomyCode();
		}
	}
	return null;
}

	/**
	getPrinters(boolean includeSubLocations)
	*/
	public ims.framework.interfaces.IPrinter[] getPrinters(boolean includeSubLocations)
	{
		java.util.Set s = new java.util.HashSet();
		fillPrinters(s, this, includeSubLocations);
		ims.framework.interfaces.IPrinter[] ret = new ims.framework.interfaces.IPrinter[s.size()];
		s.toArray(ret);
		return ret;			
	}

	private void fillPrinters(java.util.Set s, Location loc, boolean includeSubLocations)
	{
		if (includeSubLocations == false || loc.getLocations().size() == 0)
		{
			s.addAll(loc.getPrinters());
			return;
		}
		java.util.Iterator iter = loc.getLocations().iterator();
		while (iter.hasNext())
		{
			Location childLoc = (Location)iter.next();
			fillPrinters(s,childLoc,includeSubLocations);
		}
		
	}


	/**
	setUpperNames
	*/
	public void setUpperNames()
	{
		if (this.getName() != null)
		{
			this.setUpperName(this.getName().toUpperCase().substring(0, Math.min(30,this.getName().length())));
		}
		java.util.Iterator iter = this.getLocations().iterator();
		while (iter.hasNext())
		{
			((Location)iter.next()).setUpperNames();
		}
	}



	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Address = "address";
		public static final String Type = "type";
		public static final String IsActive = "isActive";
		public static final String SecureAccommodation = "secureAccommodation";
		public static final String Locations = "locations";
		public static final String ParentLocation = "parentLocation";
		public static final String Services = "services";
		public static final String TreatingHosp = "treatingHosp";
		public static final String ReferringHospital = "referringHospital";
		public static final String ActivityLimitGroup = "activityLimitGroup";
		public static final String CodeMappings = "codeMappings";
		public static final String Printers = "printers";
		public static final String UpperName = "upperName";
		public static final String IsVirtual = "isVirtual";
		public static final String DefaultPrinter = "defaultPrinter";
		public static final String DesignatedPrinterForNewResults = "designatedPrinterForNewResults";
		public static final String DesignatedPrinterForOCSOrder = "designatedPrinterForOCSOrder";
		public static final String VTEAsessmentNotRequired = "vTEAsessmentNotRequired";
		public static final String DisplayInEDTracking = "displayInEDTracking";
	}
}

