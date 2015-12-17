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
 * @author Kevin O'Carroll
 * Generated.
 */


public class WheelchairAssessment extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1019100047;
	private static final long serialVersionUID = 1019100047L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Authoring Date Time */
	private java.util.Date authoringDateTime;
	/** Authoring Care Professional */
	private ims.core.resource.people.domain.objects.Hcp authoringCP;
	/** Chair Type */
	private ims.domain.lookups.LookupInstance chairType;
	/** Surface Distance
	  * Collection of ims.therapies.mobilitytransfers.domain.objects.WheelchairSurfaceDistance.
	  */
	private java.util.Set surfaceDistance;
	/** Powerchair Skills Assess
	  * Collection of ims.therapies.mobilitytransfers.domain.objects.PowerchairSkillsAssessment.
	  */
	private java.util.Set powerchairSkillsAssess;
	/** Wheelchair Skills Assess
	  * Collection of ims.therapies.mobilitytransfers.domain.objects.WheelchairSkillsAssessment.
	  */
	private java.util.Set wheelchairSkillsAssess;
    public WheelchairAssessment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WheelchairAssessment ()
    {
    	super();
    }
    public WheelchairAssessment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.mobilitytransfers.domain.objects.WheelchairAssessment.class;
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

	public ims.core.resource.people.domain.objects.Hcp getAuthoringCP() {
		return authoringCP;
	}
	public void setAuthoringCP(ims.core.resource.people.domain.objects.Hcp authoringCP) {
		this.authoringCP = authoringCP;
	}

	public ims.domain.lookups.LookupInstance getChairType() {
		return chairType;
	}
	public void setChairType(ims.domain.lookups.LookupInstance chairType) {
		this.chairType = chairType;
	}

	public java.util.Set getSurfaceDistance() {
		if ( null == surfaceDistance ) {
			surfaceDistance = new java.util.HashSet();
		}
		return surfaceDistance;
	}
	public void setSurfaceDistance(java.util.Set paramValue) {
		this.surfaceDistance = paramValue;
	}

	public java.util.Set getPowerchairSkillsAssess() {
		if ( null == powerchairSkillsAssess ) {
			powerchairSkillsAssess = new java.util.HashSet();
		}
		return powerchairSkillsAssess;
	}
	public void setPowerchairSkillsAssess(java.util.Set paramValue) {
		this.powerchairSkillsAssess = paramValue;
	}

	public java.util.Set getWheelchairSkillsAssess() {
		if ( null == wheelchairSkillsAssess ) {
			wheelchairSkillsAssess = new java.util.HashSet();
		}
		return wheelchairSkillsAssess;
	}
	public void setWheelchairSkillsAssess(java.util.Set paramValue) {
		this.wheelchairSkillsAssess = paramValue;
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
		auditStr.append("\r\n*chairType* :");
		if (chairType != null)
			auditStr.append(chairType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*surfaceDistance* :");
		if (surfaceDistance != null)
		{
			java.util.Iterator it5 = surfaceDistance.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.therapies.mobilitytransfers.domain.objects.WheelchairSurfaceDistance obj = (ims.therapies.mobilitytransfers.domain.objects.WheelchairSurfaceDistance)it5.next();
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
		auditStr.append("\r\n*powerchairSkillsAssess* :");
		if (powerchairSkillsAssess != null)
		{
			java.util.Iterator it6 = powerchairSkillsAssess.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.therapies.mobilitytransfers.domain.objects.PowerchairSkillsAssessment obj = (ims.therapies.mobilitytransfers.domain.objects.PowerchairSkillsAssessment)it6.next();
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
		auditStr.append("\r\n*wheelchairSkillsAssess* :");
		if (wheelchairSkillsAssess != null)
		{
			java.util.Iterator it7 = wheelchairSkillsAssess.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.therapies.mobilitytransfers.domain.objects.WheelchairSkillsAssessment obj = (ims.therapies.mobilitytransfers.domain.objects.WheelchairSkillsAssessment)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
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
		
		String keyClassName = "WheelchairAssessment";
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
		if (this.getChairType() != null)
		{
			sb.append("<chairType>");
			sb.append(this.getChairType().toXMLString()); 
			sb.append("</chairType>");		
		}
		if (this.getSurfaceDistance() != null)
		{
			if (this.getSurfaceDistance().size() > 0 )
			{
			sb.append("<surfaceDistance>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSurfaceDistance(), domMap));
			sb.append("</surfaceDistance>");		
			}
		}
		if (this.getPowerchairSkillsAssess() != null)
		{
			if (this.getPowerchairSkillsAssess().size() > 0 )
			{
			sb.append("<powerchairSkillsAssess>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPowerchairSkillsAssess(), domMap));
			sb.append("</powerchairSkillsAssess>");		
			}
		}
		if (this.getWheelchairSkillsAssess() != null)
		{
			if (this.getWheelchairSkillsAssess().size() > 0 )
			{
			sb.append("<wheelchairSkillsAssess>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getWheelchairSkillsAssess(), domMap));
			sb.append("</wheelchairSkillsAssess>");		
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
			WheelchairAssessment domainObject = getWheelchairAssessmentfromXML(itemEl, factory, domMap);

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
			WheelchairAssessment domainObject = getWheelchairAssessmentfromXML(itemEl, factory, domMap);

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
		
	public static WheelchairAssessment getWheelchairAssessmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWheelchairAssessmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WheelchairAssessment getWheelchairAssessmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WheelchairAssessment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WheelchairAssessment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WheelchairAssessment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WheelchairAssessment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WheelchairAssessment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WheelchairAssessment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WheelchairAssessment)factory.getImportedDomainObject(WheelchairAssessment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WheelchairAssessment();
		}
		String keyClassName = "WheelchairAssessment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WheelchairAssessment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WheelchairAssessment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
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
		fldEl = el.element("authoringCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("chairType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setChairType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("surfaceDistance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSurfaceDistance(ims.therapies.mobilitytransfers.domain.objects.WheelchairSurfaceDistance.fromSetXMLString(fldEl, factory, obj.getSurfaceDistance(), domMap));
		}
		fldEl = el.element("powerchairSkillsAssess");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPowerchairSkillsAssess(ims.therapies.mobilitytransfers.domain.objects.PowerchairSkillsAssessment.fromSetXMLString(fldEl, factory, obj.getPowerchairSkillsAssess(), domMap));
		}
		fldEl = el.element("wheelchairSkillsAssess");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setWheelchairSkillsAssess(ims.therapies.mobilitytransfers.domain.objects.WheelchairSkillsAssessment.fromSetXMLString(fldEl, factory, obj.getWheelchairSkillsAssess(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "surfaceDistance"
		, "powerchairSkillsAssess"
		, "wheelchairSkillsAssess"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String AuthoringCP = "authoringCP";
		public static final String ChairType = "chairType";
		public static final String SurfaceDistance = "surfaceDistance";
		public static final String PowerchairSkillsAssess = "powerchairSkillsAssess";
		public static final String WheelchairSkillsAssess = "wheelchairSkillsAssess";
	}
}

