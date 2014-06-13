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
package ims.ocrr.configuration.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class InvestigationIndex extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1061100003;
	private static final long serialVersionUID = 1061100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Category */
	private ims.domain.lookups.LookupInstance category;
	/** Name */
	private String name;
	/** Description */
	private String description;
	/** Investigations
	  * Collection of ims.ocrr.configuration.domain.objects.Investigation.
	  */
	private java.util.Set investigations;
	/** Colour */
	private ims.framework.utils.Color colour;
	/** Synonyms
	  * Collection of ims.ocrr.configuration.domain.objects.InvSynonym.
	  */
	private java.util.Set synonyms;
	/** ActiveStatus */
	private ims.domain.lookups.LookupInstance activeStatus;
	/** TaxonomyMap
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List taxonomyMap;
	/** GenderSpecific */
	private ims.domain.lookups.LookupInstance genderSpecific;
	/** ShowLast */
	private Boolean showLast;
	/** Activity */
	private ims.core.resource.place.domain.objects.Activity activity;
	/** isProfile */
	private Boolean isProfile;
	/** UpperName */
	private String upperName;
	/** Phlebotomist May Collect */
	private Boolean phlebMayCollect;
	/** Whether this investigation is orderable, resultable or both. Null should be interpreted as both */
	private ims.domain.lookups.LookupInstance orderability;
	/** For Biochemistry Investigations, if they require site, the site becomes the specimen type effective;y */
	private Boolean requiresSiteSpecifier;
	/** Body Site that the specimen can be collected from
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List sites;
	/** Dont make any calls to interface when this is true */
	private Boolean noInterface;
	/** Security Level */
	private ims.ocrr.configuration.domain.objects.SecurityLevel securityLevel;
	private String timeSeriesInstructionsURL;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public InvestigationIndex (Integer id, int ver)
    {
    	super(id, ver);
    }
    public InvestigationIndex ()
    {
    	super();
    }
    public InvestigationIndex (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.configuration.domain.objects.InvestigationIndex.class;
	}


	public ims.domain.lookups.LookupInstance getCategory() {
		return category;
	}
	public void setCategory(ims.domain.lookups.LookupInstance category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public java.util.Set getInvestigations() {
		if ( null == investigations ) {
			investigations = new java.util.HashSet();
		}
		return investigations;
	}
	public void setInvestigations(java.util.Set paramValue) {
		this.investigations = paramValue;
	}

	public ims.framework.utils.Color getColour() {
		return colour;
	}
	public void setColour(ims.framework.utils.Color colour) {
		this.colour = colour;
	}

	public java.util.Set getSynonyms() {
		if ( null == synonyms ) {
			synonyms = new java.util.HashSet();
		}
		return synonyms;
	}
	public void setSynonyms(java.util.Set paramValue) {
		this.synonyms = paramValue;
	}

	public ims.domain.lookups.LookupInstance getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(ims.domain.lookups.LookupInstance activeStatus) {
		this.activeStatus = activeStatus;
	}

	public java.util.List getTaxonomyMap() {
		if ( null == taxonomyMap ) {
			taxonomyMap = new java.util.ArrayList();
		}
		return taxonomyMap;
	}
	public void setTaxonomyMap(java.util.List paramValue) {
		this.taxonomyMap = paramValue;
	}

	public ims.domain.lookups.LookupInstance getGenderSpecific() {
		return genderSpecific;
	}
	public void setGenderSpecific(ims.domain.lookups.LookupInstance genderSpecific) {
		this.genderSpecific = genderSpecific;
	}

	public Boolean isShowLast() {
		return showLast;
	}
	public void setShowLast(Boolean showLast) {
		this.showLast = showLast;
	}

	public ims.core.resource.place.domain.objects.Activity getActivity() {
		return activity;
	}
	public void setActivity(ims.core.resource.place.domain.objects.Activity activity) {
		this.activity = activity;
	}

	public Boolean isIsProfile() {
		return isProfile;
	}
	public void setIsProfile(Boolean isProfile) {
		this.isProfile = isProfile;
	}

	public String getUpperName() {
		return upperName;
	}
	public void setUpperName(String upperName) {
		if ( null != upperName && upperName.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for upperName. Tried to set value: "+
				upperName);
		}
		this.upperName = upperName;
	}

	public Boolean isPhlebMayCollect() {
		return phlebMayCollect;
	}
	public void setPhlebMayCollect(Boolean phlebMayCollect) {
		this.phlebMayCollect = phlebMayCollect;
	}

	public ims.domain.lookups.LookupInstance getOrderability() {
		return orderability;
	}
	public void setOrderability(ims.domain.lookups.LookupInstance orderability) {
		this.orderability = orderability;
	}

	public Boolean isRequiresSiteSpecifier() {
		return requiresSiteSpecifier;
	}
	public void setRequiresSiteSpecifier(Boolean requiresSiteSpecifier) {
		this.requiresSiteSpecifier = requiresSiteSpecifier;
	}

	public java.util.List getSites() {
		if ( null == sites ) {
			sites = new java.util.ArrayList();
		}
		return sites;
	}
	public void setSites(java.util.List paramValue) {
		this.sites = paramValue;
	}

	public Boolean isNoInterface() {
		return noInterface;
	}
	public void setNoInterface(Boolean noInterface) {
		this.noInterface = noInterface;
	}

	public ims.ocrr.configuration.domain.objects.SecurityLevel getSecurityLevel() {
		return securityLevel;
	}
	public void setSecurityLevel(ims.ocrr.configuration.domain.objects.SecurityLevel securityLevel) {
		this.securityLevel = securityLevel;
	}

	public String getTimeSeriesInstructionsURL() {
		return timeSeriesInstructionsURL;
	}
	public void setTimeSeriesInstructionsURL(String timeSeriesInstructionsURL) {
		if ( null != timeSeriesInstructionsURL && timeSeriesInstructionsURL.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for timeSeriesInstructionsURL. Tried to set value: "+
				timeSeriesInstructionsURL);
		}
		this.timeSeriesInstructionsURL = timeSeriesInstructionsURL;
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
		
		auditStr.append("\r\n*category* :");
		if (category != null)
			auditStr.append(category.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*investigations* :");
		if (investigations != null)
		{
			java.util.Iterator it4 = investigations.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.ocrr.configuration.domain.objects.Investigation obj = (ims.ocrr.configuration.domain.objects.Investigation)it4.next();
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
		auditStr.append("\r\n*colour* :");
		auditStr.append(colour);
	    auditStr.append("; ");
		auditStr.append("\r\n*synonyms* :");
		if (synonyms != null)
		{
			java.util.Iterator it6 = synonyms.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.ocrr.configuration.domain.objects.InvSynonym obj = (ims.ocrr.configuration.domain.objects.InvSynonym)it6.next();
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
		auditStr.append("\r\n*activeStatus* :");
		if (activeStatus != null)
			auditStr.append(activeStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyMap* :");
		if (taxonomyMap != null)
		{
		int i8=0;
		for (i8=0; i8<taxonomyMap.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)taxonomyMap.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*genderSpecific* :");
		if (genderSpecific != null)
			auditStr.append(genderSpecific.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*showLast* :");
		auditStr.append(showLast);
	    auditStr.append("; ");
		auditStr.append("\r\n*activity* :");
		if (activity != null)
		{
			auditStr.append(toShortClassName(activity));
				
		    auditStr.append(activity.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isProfile* :");
		auditStr.append(isProfile);
	    auditStr.append("; ");
		auditStr.append("\r\n*upperName* :");
		auditStr.append(upperName);
	    auditStr.append("; ");
		auditStr.append("\r\n*phlebMayCollect* :");
		auditStr.append(phlebMayCollect);
	    auditStr.append("; ");
		auditStr.append("\r\n*orderability* :");
		if (orderability != null)
			auditStr.append(orderability.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresSiteSpecifier* :");
		auditStr.append(requiresSiteSpecifier);
	    auditStr.append("; ");
		auditStr.append("\r\n*sites* :");
		if (sites != null)
		{
			java.util.Iterator it17 = sites.iterator();
			int i17=0;
			while (it17.hasNext())
			{
				if (i17 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it17.next();
			auditStr.append(obj.getText());
			i17++;
		}
		if (i17 > 0)
			auditStr.append("] " + i17);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*noInterface* :");
		auditStr.append(noInterface);
	    auditStr.append("; ");
		auditStr.append("\r\n*securityLevel* :");
		if (securityLevel != null)
		{
			auditStr.append(toShortClassName(securityLevel));
				
		    auditStr.append(securityLevel.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*timeSeriesInstructionsURL* :");
		auditStr.append(timeSeriesInstructionsURL);
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
		
		String keyClassName = "InvestigationIndex";
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
		if (this.getCategory() != null)
		{
			sb.append("<category>");
			sb.append(this.getCategory().toXMLString()); 
			sb.append("</category>");		
		}
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getInvestigations() != null)
		{
			if (this.getInvestigations().size() > 0 )
			{
			sb.append("<investigations>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInvestigations(), domMap));
			sb.append("</investigations>");		
			}
		}
		if (this.getColour() != null)
		{
			sb.append("<colour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getColour().toString()));
			sb.append("</colour>");		
		}
		if (this.getSynonyms() != null)
		{
			if (this.getSynonyms().size() > 0 )
			{
			sb.append("<synonyms>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSynonyms(), domMap));
			sb.append("</synonyms>");		
			}
		}
		if (this.getActiveStatus() != null)
		{
			sb.append("<activeStatus>");
			sb.append(this.getActiveStatus().toXMLString()); 
			sb.append("</activeStatus>");		
		}
		if (this.getTaxonomyMap() != null)
		{
			if (this.getTaxonomyMap().size() > 0 )
			{
			sb.append("<taxonomyMap>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTaxonomyMap(), domMap));
			sb.append("</taxonomyMap>");		
			}
		}
		if (this.getGenderSpecific() != null)
		{
			sb.append("<genderSpecific>");
			sb.append(this.getGenderSpecific().toXMLString()); 
			sb.append("</genderSpecific>");		
		}
		if (this.isShowLast() != null)
		{
			sb.append("<showLast>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isShowLast().toString()));
			sb.append("</showLast>");		
		}
		if (this.getActivity() != null)
		{
			sb.append("<activity>");
			sb.append(this.getActivity().toXMLString(domMap)); 	
			sb.append("</activity>");		
		}
		if (this.isIsProfile() != null)
		{
			sb.append("<isProfile>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsProfile().toString()));
			sb.append("</isProfile>");		
		}
		if (this.getUpperName() != null)
		{
			sb.append("<upperName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUpperName().toString()));
			sb.append("</upperName>");		
		}
		if (this.isPhlebMayCollect() != null)
		{
			sb.append("<phlebMayCollect>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPhlebMayCollect().toString()));
			sb.append("</phlebMayCollect>");		
		}
		if (this.getOrderability() != null)
		{
			sb.append("<orderability>");
			sb.append(this.getOrderability().toXMLString()); 
			sb.append("</orderability>");		
		}
		if (this.isRequiresSiteSpecifier() != null)
		{
			sb.append("<requiresSiteSpecifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresSiteSpecifier().toString()));
			sb.append("</requiresSiteSpecifier>");		
		}
		if (this.getSites() != null)
		{
			if (this.getSites().size() > 0 )
			{
			sb.append("<sites>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getSites())); 
			sb.append("</sites>");		
			}
		}
		if (this.isNoInterface() != null)
		{
			sb.append("<noInterface>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNoInterface().toString()));
			sb.append("</noInterface>");		
		}
		if (this.getSecurityLevel() != null)
		{
			sb.append("<securityLevel>");
			sb.append(this.getSecurityLevel().toXMLString(domMap)); 	
			sb.append("</securityLevel>");		
		}
		if (this.getTimeSeriesInstructionsURL() != null)
		{
			sb.append("<timeSeriesInstructionsURL>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeSeriesInstructionsURL().toString()));
			sb.append("</timeSeriesInstructionsURL>");		
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
			InvestigationIndex domainObject = getInvestigationIndexfromXML(itemEl, factory, domMap);

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
			InvestigationIndex domainObject = getInvestigationIndexfromXML(itemEl, factory, domMap);

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
		
	public static InvestigationIndex getInvestigationIndexfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getInvestigationIndexfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static InvestigationIndex getInvestigationIndexfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!InvestigationIndex.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!InvestigationIndex.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the InvestigationIndex class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (InvestigationIndex)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(InvestigationIndex.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		InvestigationIndex ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (InvestigationIndex)factory.getImportedDomainObject(InvestigationIndex.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new InvestigationIndex();
		}
		String keyClassName = "InvestigationIndex";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (InvestigationIndex)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, InvestigationIndex obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("category");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("investigations");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInvestigations(ims.ocrr.configuration.domain.objects.Investigation.fromSetXMLString(fldEl, factory, obj.getInvestigations(), domMap));
		}
		fldEl = el.element("colour");
		if(fldEl != null)
		{	
    		obj.setColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("synonyms");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSynonyms(ims.ocrr.configuration.domain.objects.InvSynonym.fromSetXMLString(fldEl, factory, obj.getSynonyms(), domMap));
		}
		fldEl = el.element("activeStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActiveStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("taxonomyMap");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTaxonomyMap(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getTaxonomyMap(), domMap));
		}
		fldEl = el.element("genderSpecific");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGenderSpecific(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("showLast");
		if(fldEl != null)
		{	
    		obj.setShowLast(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActivity(ims.core.resource.place.domain.objects.Activity.getActivityfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isProfile");
		if(fldEl != null)
		{	
    		obj.setIsProfile(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("upperName");
		if(fldEl != null)
		{	
    		obj.setUpperName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("phlebMayCollect");
		if(fldEl != null)
		{	
    		obj.setPhlebMayCollect(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("orderability");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOrderability(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("requiresSiteSpecifier");
		if(fldEl != null)
		{	
    		obj.setRequiresSiteSpecifier(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sites");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSites(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getSites())); 
		}
		fldEl = el.element("noInterface");
		if(fldEl != null)
		{	
    		obj.setNoInterface(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("securityLevel");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSecurityLevel(ims.ocrr.configuration.domain.objects.SecurityLevel.getSecurityLevelfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("timeSeriesInstructionsURL");
		if(fldEl != null)
		{	
    		obj.setTimeSeriesInstructionsURL(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "investigations"
		, "synonyms"
		, "taxonomyMap"
		, "sites"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Category = "category";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String Investigations = "investigations";
		public static final String Colour = "colour";
		public static final String Synonyms = "synonyms";
		public static final String ActiveStatus = "activeStatus";
		public static final String TaxonomyMap = "taxonomyMap";
		public static final String GenderSpecific = "genderSpecific";
		public static final String ShowLast = "showLast";
		public static final String Activity = "activity";
		public static final String IsProfile = "isProfile";
		public static final String UpperName = "upperName";
		public static final String PhlebMayCollect = "phlebMayCollect";
		public static final String Orderability = "orderability";
		public static final String RequiresSiteSpecifier = "requiresSiteSpecifier";
		public static final String Sites = "sites";
		public static final String NoInterface = "noInterface";
		public static final String SecurityLevel = "securityLevel";
		public static final String TimeSeriesInstructionsURL = "timeSeriesInstructionsURL";
	}
}

