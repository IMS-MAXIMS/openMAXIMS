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
package ims.ntpf.locall.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class GPDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1039100001;
	private static final long serialVersionUID = 1039100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** GP to which this checklist refers */
	private ims.core.resource.people.domain.objects.Gp gP;
	/** GP Checklist
	  * Collection of ims.ntpf.locall.domain.objects.GPChecklist.
	  */
	private java.util.Set gPChecklist;
	/** Treating Country */
	private ims.domain.lookups.LookupInstance treatingCountry;
	/** Treating Country Rec Date Time */
	private java.util.Date treatingCountryRecDateTime;
	/** Treating Country Rec User */
	private ims.core.resource.people.domain.objects.MemberOfStaff treatingCountryRecUser;
	/** Treating Hospital */
	private ims.core.resource.place.domain.objects.Location treatingHospital;
	/** Treating Hospital Rec Date Time */
	private java.util.Date treatingHospitalRecDateTime;
	/** Treating Hospital Rec User */
	private ims.core.resource.people.domain.objects.MemberOfStaff treatingHospitalRecUser;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public GPDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public GPDetails ()
    {
    	super();
    }
    public GPDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ntpf.locall.domain.objects.GPDetails.class;
	}


	public ims.core.resource.people.domain.objects.Gp getGP() {
		return gP;
	}
	public void setGP(ims.core.resource.people.domain.objects.Gp gP) {
		this.gP = gP;
	}

	public java.util.Set getGPChecklist() {
		if ( null == gPChecklist ) {
			gPChecklist = new java.util.HashSet();
		}
		return gPChecklist;
	}
	public void setGPChecklist(java.util.Set paramValue) {
		this.gPChecklist = paramValue;
	}

	public ims.domain.lookups.LookupInstance getTreatingCountry() {
		return treatingCountry;
	}
	public void setTreatingCountry(ims.domain.lookups.LookupInstance treatingCountry) {
		this.treatingCountry = treatingCountry;
	}

	public java.util.Date getTreatingCountryRecDateTime() {
		return treatingCountryRecDateTime;
	}
	public void setTreatingCountryRecDateTime(java.util.Date treatingCountryRecDateTime) {
		this.treatingCountryRecDateTime = treatingCountryRecDateTime;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getTreatingCountryRecUser() {
		return treatingCountryRecUser;
	}
	public void setTreatingCountryRecUser(ims.core.resource.people.domain.objects.MemberOfStaff treatingCountryRecUser) {
		this.treatingCountryRecUser = treatingCountryRecUser;
	}

	public ims.core.resource.place.domain.objects.Location getTreatingHospital() {
		return treatingHospital;
	}
	public void setTreatingHospital(ims.core.resource.place.domain.objects.Location treatingHospital) {
		this.treatingHospital = treatingHospital;
	}

	public java.util.Date getTreatingHospitalRecDateTime() {
		return treatingHospitalRecDateTime;
	}
	public void setTreatingHospitalRecDateTime(java.util.Date treatingHospitalRecDateTime) {
		this.treatingHospitalRecDateTime = treatingHospitalRecDateTime;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getTreatingHospitalRecUser() {
		return treatingHospitalRecUser;
	}
	public void setTreatingHospitalRecUser(ims.core.resource.people.domain.objects.MemberOfStaff treatingHospitalRecUser) {
		this.treatingHospitalRecUser = treatingHospitalRecUser;
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
		
		auditStr.append("\r\n*gP* :");
		if (gP != null)
		{
			auditStr.append(toShortClassName(gP));
				
		    auditStr.append(gP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*gPChecklist* :");
		if (gPChecklist != null)
		{
			java.util.Iterator it2 = gPChecklist.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.ntpf.locall.domain.objects.GPChecklist obj = (ims.ntpf.locall.domain.objects.GPChecklist)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingCountry* :");
		if (treatingCountry != null)
			auditStr.append(treatingCountry.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingCountryRecDateTime* :");
		auditStr.append(treatingCountryRecDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingCountryRecUser* :");
		if (treatingCountryRecUser != null)
		{
			auditStr.append(toShortClassName(treatingCountryRecUser));
				
		    auditStr.append(treatingCountryRecUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingHospital* :");
		if (treatingHospital != null)
		{
			auditStr.append(toShortClassName(treatingHospital));
				
		    auditStr.append(treatingHospital.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingHospitalRecDateTime* :");
		auditStr.append(treatingHospitalRecDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingHospitalRecUser* :");
		if (treatingHospitalRecUser != null)
		{
			auditStr.append(toShortClassName(treatingHospitalRecUser));
				
		    auditStr.append(treatingHospitalRecUser.getId());
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
		
		String keyClassName = "GPDetails";
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
		if (this.getGP() != null)
		{
			sb.append("<gP>");
			sb.append(this.getGP().toXMLString(domMap)); 	
			sb.append("</gP>");		
		}
		if (this.getGPChecklist() != null)
		{
			if (this.getGPChecklist().size() > 0 )
			{
			sb.append("<gPChecklist>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getGPChecklist(), domMap));
			sb.append("</gPChecklist>");		
			}
		}
		if (this.getTreatingCountry() != null)
		{
			sb.append("<treatingCountry>");
			sb.append(this.getTreatingCountry().toXMLString()); 
			sb.append("</treatingCountry>");		
		}
		if (this.getTreatingCountryRecDateTime() != null)
		{
			sb.append("<treatingCountryRecDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getTreatingCountryRecDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</treatingCountryRecDateTime>");		
		}
		if (this.getTreatingCountryRecUser() != null)
		{
			sb.append("<treatingCountryRecUser>");
			sb.append(this.getTreatingCountryRecUser().toXMLString(domMap)); 	
			sb.append("</treatingCountryRecUser>");		
		}
		if (this.getTreatingHospital() != null)
		{
			sb.append("<treatingHospital>");
			sb.append(this.getTreatingHospital().toXMLString(domMap)); 	
			sb.append("</treatingHospital>");		
		}
		if (this.getTreatingHospitalRecDateTime() != null)
		{
			sb.append("<treatingHospitalRecDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getTreatingHospitalRecDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</treatingHospitalRecDateTime>");		
		}
		if (this.getTreatingHospitalRecUser() != null)
		{
			sb.append("<treatingHospitalRecUser>");
			sb.append(this.getTreatingHospitalRecUser().toXMLString(domMap)); 	
			sb.append("</treatingHospitalRecUser>");		
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
			GPDetails domainObject = getGPDetailsfromXML(itemEl, factory, domMap);

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
			GPDetails domainObject = getGPDetailsfromXML(itemEl, factory, domMap);

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
		
	public static GPDetails getGPDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getGPDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static GPDetails getGPDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!GPDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!GPDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the GPDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (GPDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(GPDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		GPDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (GPDetails)factory.getImportedDomainObject(GPDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new GPDetails();
		}
		String keyClassName = "GPDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (GPDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, GPDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("gP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGP(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("gPChecklist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setGPChecklist(ims.ntpf.locall.domain.objects.GPChecklist.fromSetXMLString(fldEl, factory, obj.getGPChecklist(), domMap));
		}
		fldEl = el.element("treatingCountry");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatingCountry(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatingCountryRecDateTime");
		if(fldEl != null)
		{	
    		obj.setTreatingCountryRecDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("treatingCountryRecUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatingCountryRecUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("treatingHospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatingHospital(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("treatingHospitalRecDateTime");
		if(fldEl != null)
		{	
    		obj.setTreatingHospitalRecDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("treatingHospitalRecUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatingHospitalRecUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "gPChecklist"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String GP = "gP";
		public static final String GPChecklist = "gPChecklist";
		public static final String TreatingCountry = "treatingCountry";
		public static final String TreatingCountryRecDateTime = "treatingCountryRecDateTime";
		public static final String TreatingCountryRecUser = "treatingCountryRecUser";
		public static final String TreatingHospital = "treatingHospital";
		public static final String TreatingHospitalRecDateTime = "treatingHospitalRecDateTime";
		public static final String TreatingHospitalRecUser = "treatingHospitalRecUser";
	}
}

