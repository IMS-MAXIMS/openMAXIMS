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
package ims.dto_move.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class RadiotherapyMachine extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1105100003;
	private static final long serialVersionUID = 1105100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Internal Location of the machine */
	private ims.dto_move.domain.objects.InternalLocation location;
	private String name;
	/** Date Commissioned */
	private java.util.Date dateComm;
	/** Machine Type */
	private Integer machineType;
	private String active;
	/** Date Decommissioned */
	private java.util.Date dateDeComm;
	/** Machine Modalities
	  * Collection of ims.dto_move.domain.objects.MachineModality.
	  */
	private java.util.List modalities;
	/** 
	  * Collection of ims.dto_move.domain.objects.MachineExclusionTime.
	  */
	private java.util.List exclusionTimes;
	/** 
	  * Collection of ims.dto_move.domain.objects.MachineExclusionDate.
	  */
	private java.util.List exclusionDates;
	/** 
	  * Collection of ims.dto_move.domain.objects.MachineAction.
	  */
	private java.util.List actions;
	/** 
	  * Collection of ims.dto_move.domain.objects.ActivityResource.
	  */
	private java.util.List activityResource;
	/** 
	  * Collection of ims.dto_move.domain.objects.SiteTechnique.
	  */
	private java.util.List siteTechniques;
    public RadiotherapyMachine (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RadiotherapyMachine ()
    {
    	super();
    }
    public RadiotherapyMachine (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.RadiotherapyMachine.class;
	}


	public ims.dto_move.domain.objects.InternalLocation getLocation() {
		return location;
	}
	public void setLocation(ims.dto_move.domain.objects.InternalLocation location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public java.util.Date getDateComm() {
		return dateComm;
	}
	public void setDateComm(java.util.Date dateComm) {
		this.dateComm = dateComm;
	}

	public Integer getMachineType() {
		return machineType;
	}
	public void setMachineType(Integer machineType) {
		this.machineType = machineType;
	}

	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		if ( null != active && active.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for active. Tried to set value: "+
				active);
		}
		this.active = active;
	}

	public java.util.Date getDateDeComm() {
		return dateDeComm;
	}
	public void setDateDeComm(java.util.Date dateDeComm) {
		this.dateDeComm = dateDeComm;
	}

	public java.util.List getModalities() {
		if ( null == modalities ) {
			modalities = new java.util.ArrayList();
		}
		return modalities;
	}
	public void setModalities(java.util.List paramValue) {
		this.modalities = paramValue;
	}

	public java.util.List getExclusionTimes() {
		if ( null == exclusionTimes ) {
			exclusionTimes = new java.util.ArrayList();
		}
		return exclusionTimes;
	}
	public void setExclusionTimes(java.util.List paramValue) {
		this.exclusionTimes = paramValue;
	}

	public java.util.List getExclusionDates() {
		if ( null == exclusionDates ) {
			exclusionDates = new java.util.ArrayList();
		}
		return exclusionDates;
	}
	public void setExclusionDates(java.util.List paramValue) {
		this.exclusionDates = paramValue;
	}

	public java.util.List getActions() {
		if ( null == actions ) {
			actions = new java.util.ArrayList();
		}
		return actions;
	}
	public void setActions(java.util.List paramValue) {
		this.actions = paramValue;
	}

	public java.util.List getActivityResource() {
		if ( null == activityResource ) {
			activityResource = new java.util.ArrayList();
		}
		return activityResource;
	}
	public void setActivityResource(java.util.List paramValue) {
		this.activityResource = paramValue;
	}

	public java.util.List getSiteTechniques() {
		if ( null == siteTechniques ) {
			siteTechniques = new java.util.ArrayList();
		}
		return siteTechniques;
	}
	public void setSiteTechniques(java.util.List paramValue) {
		this.siteTechniques = paramValue;
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
		
		auditStr.append("\r\n*location* :");
		if (location != null)
		{
			auditStr.append(toShortClassName(location));
				
		    auditStr.append(location.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateComm* :");
		auditStr.append(dateComm);
	    auditStr.append("; ");
		auditStr.append("\r\n*machineType* :");
		auditStr.append(machineType);
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateDeComm* :");
		auditStr.append(dateDeComm);
	    auditStr.append("; ");
		auditStr.append("\r\n*modalities* :");
		if (modalities != null)
		{
		int i7=0;
		for (i7=0; i7<modalities.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.MachineModality obj = (ims.dto_move.domain.objects.MachineModality)modalities.get(i7);
		    if (obj != null)
			{
				if (i7 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*exclusionTimes* :");
		if (exclusionTimes != null)
		{
		int i8=0;
		for (i8=0; i8<exclusionTimes.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.MachineExclusionTime obj = (ims.dto_move.domain.objects.MachineExclusionTime)exclusionTimes.get(i8);
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
		auditStr.append("\r\n*exclusionDates* :");
		if (exclusionDates != null)
		{
		int i9=0;
		for (i9=0; i9<exclusionDates.size(); i9++)
		{
			if (i9 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.MachineExclusionDate obj = (ims.dto_move.domain.objects.MachineExclusionDate)exclusionDates.get(i9);
		    if (obj != null)
			{
				if (i9 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*actions* :");
		if (actions != null)
		{
		int i10=0;
		for (i10=0; i10<actions.size(); i10++)
		{
			if (i10 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.MachineAction obj = (ims.dto_move.domain.objects.MachineAction)actions.get(i10);
		    if (obj != null)
			{
				if (i10 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*activityResource* :");
		if (activityResource != null)
		{
		int i11=0;
		for (i11=0; i11<activityResource.size(); i11++)
		{
			if (i11 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.ActivityResource obj = (ims.dto_move.domain.objects.ActivityResource)activityResource.get(i11);
		    if (obj != null)
			{
				if (i11 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*siteTechniques* :");
		if (siteTechniques != null)
		{
		int i12=0;
		for (i12=0; i12<siteTechniques.size(); i12++)
		{
			if (i12 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.SiteTechnique obj = (ims.dto_move.domain.objects.SiteTechnique)siteTechniques.get(i12);
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
		
		String keyClassName = "RadiotherapyMachine";
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
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(this.getLocation().toXMLString(domMap)); 	
			sb.append("</location>");		
		}
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getDateComm() != null)
		{
			sb.append("<dateComm>");
			sb.append(new ims.framework.utils.DateTime(this.getDateComm()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateComm>");		
		}
		if (this.getMachineType() != null)
		{
			sb.append("<machineType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMachineType().toString()));
			sb.append("</machineType>");		
		}
		if (this.getActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActive().toString()));
			sb.append("</active>");		
		}
		if (this.getDateDeComm() != null)
		{
			sb.append("<dateDeComm>");
			sb.append(new ims.framework.utils.DateTime(this.getDateDeComm()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateDeComm>");		
		}
		if (this.getModalities() != null)
		{
			if (this.getModalities().size() > 0 )
			{
			sb.append("<modalities>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getModalities(), domMap));
			sb.append("</modalities>");		
			}
		}
		if (this.getExclusionTimes() != null)
		{
			if (this.getExclusionTimes().size() > 0 )
			{
			sb.append("<exclusionTimes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getExclusionTimes(), domMap));
			sb.append("</exclusionTimes>");		
			}
		}
		if (this.getExclusionDates() != null)
		{
			if (this.getExclusionDates().size() > 0 )
			{
			sb.append("<exclusionDates>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getExclusionDates(), domMap));
			sb.append("</exclusionDates>");		
			}
		}
		if (this.getActions() != null)
		{
			if (this.getActions().size() > 0 )
			{
			sb.append("<actions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActions(), domMap));
			sb.append("</actions>");		
			}
		}
		if (this.getActivityResource() != null)
		{
			if (this.getActivityResource().size() > 0 )
			{
			sb.append("<activityResource>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActivityResource(), domMap));
			sb.append("</activityResource>");		
			}
		}
		if (this.getSiteTechniques() != null)
		{
			if (this.getSiteTechniques().size() > 0 )
			{
			sb.append("<siteTechniques>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSiteTechniques(), domMap));
			sb.append("</siteTechniques>");		
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
			RadiotherapyMachine domainObject = getRadiotherapyMachinefromXML(itemEl, factory, domMap);

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
			RadiotherapyMachine domainObject = getRadiotherapyMachinefromXML(itemEl, factory, domMap);

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
		
	public static RadiotherapyMachine getRadiotherapyMachinefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRadiotherapyMachinefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RadiotherapyMachine getRadiotherapyMachinefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RadiotherapyMachine.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RadiotherapyMachine.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RadiotherapyMachine class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RadiotherapyMachine)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RadiotherapyMachine.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RadiotherapyMachine ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RadiotherapyMachine)factory.getImportedDomainObject(RadiotherapyMachine.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RadiotherapyMachine();
		}
		String keyClassName = "RadiotherapyMachine";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RadiotherapyMachine)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RadiotherapyMachine obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("location");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocation(ims.dto_move.domain.objects.InternalLocation.getInternalLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateComm");
		if(fldEl != null)
		{	
    		obj.setDateComm(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("machineType");
		if(fldEl != null)
		{	
    		obj.setMachineType(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateDeComm");
		if(fldEl != null)
		{	
    		obj.setDateDeComm(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("modalities");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setModalities(ims.dto_move.domain.objects.MachineModality.fromListXMLString(fldEl, factory, obj.getModalities(), domMap));
		}
		fldEl = el.element("exclusionTimes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setExclusionTimes(ims.dto_move.domain.objects.MachineExclusionTime.fromListXMLString(fldEl, factory, obj.getExclusionTimes(), domMap));
		}
		fldEl = el.element("exclusionDates");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setExclusionDates(ims.dto_move.domain.objects.MachineExclusionDate.fromListXMLString(fldEl, factory, obj.getExclusionDates(), domMap));
		}
		fldEl = el.element("actions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setActions(ims.dto_move.domain.objects.MachineAction.fromListXMLString(fldEl, factory, obj.getActions(), domMap));
		}
		fldEl = el.element("activityResource");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setActivityResource(ims.dto_move.domain.objects.ActivityResource.fromListXMLString(fldEl, factory, obj.getActivityResource(), domMap));
		}
		fldEl = el.element("siteTechniques");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSiteTechniques(ims.dto_move.domain.objects.SiteTechnique.fromListXMLString(fldEl, factory, obj.getSiteTechniques(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "modalities"
		, "exclusionTimes"
		, "exclusionDates"
		, "actions"
		, "activityResource"
		, "siteTechniques"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Location = "location";
		public static final String Name = "name";
		public static final String DateComm = "dateComm";
		public static final String MachineType = "machineType";
		public static final String Active = "active";
		public static final String DateDeComm = "dateDeComm";
		public static final String Modalities = "modalities";
		public static final String ExclusionTimes = "exclusionTimes";
		public static final String ExclusionDates = "exclusionDates";
		public static final String Actions = "actions";
		public static final String ActivityResource = "activityResource";
		public static final String SiteTechniques = "siteTechniques";
	}
}

