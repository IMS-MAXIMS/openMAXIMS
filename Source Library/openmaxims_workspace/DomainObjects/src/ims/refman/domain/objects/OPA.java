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
package ims.RefMan.domain.objects;

/**
 * 
 * @author Cristian Belciug
 * Generated.
 */


public class OPA extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100079;
	private static final long serialVersionUID = 1096100079L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private Boolean consultant;
	private Boolean sPR;
	private Boolean associateSpecialist;
	private Boolean anyDoctorToSee;
	private Boolean otherHCP;
	private ims.domain.lookups.LookupInstance otherHCPValue;
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	private Boolean namedConsultant;
	private ims.core.resource.people.domain.objects.Hcp namedConsultantValue;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OPA (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OPA ()
    {
    	super();
    }
    public OPA (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.OPA.class;
	}


	public Boolean isConsultant() {
		return consultant;
	}
	public void setConsultant(Boolean consultant) {
		this.consultant = consultant;
	}

	public Boolean isSPR() {
		return sPR;
	}
	public void setSPR(Boolean sPR) {
		this.sPR = sPR;
	}

	public Boolean isAssociateSpecialist() {
		return associateSpecialist;
	}
	public void setAssociateSpecialist(Boolean associateSpecialist) {
		this.associateSpecialist = associateSpecialist;
	}

	public Boolean isAnyDoctorToSee() {
		return anyDoctorToSee;
	}
	public void setAnyDoctorToSee(Boolean anyDoctorToSee) {
		this.anyDoctorToSee = anyDoctorToSee;
	}

	public Boolean isOtherHCP() {
		return otherHCP;
	}
	public void setOtherHCP(Boolean otherHCP) {
		this.otherHCP = otherHCP;
	}

	public ims.domain.lookups.LookupInstance getOtherHCPValue() {
		return otherHCPValue;
	}
	public void setOtherHCPValue(ims.domain.lookups.LookupInstance otherHCPValue) {
		this.otherHCPValue = otherHCPValue;
	}

	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public Boolean isNamedConsultant() {
		return namedConsultant;
	}
	public void setNamedConsultant(Boolean namedConsultant) {
		this.namedConsultant = namedConsultant;
	}

	public ims.core.resource.people.domain.objects.Hcp getNamedConsultantValue() {
		return namedConsultantValue;
	}
	public void setNamedConsultantValue(ims.core.resource.people.domain.objects.Hcp namedConsultantValue) {
		this.namedConsultantValue = namedConsultantValue;
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
		
		auditStr.append("\r\n*consultant* :");
		auditStr.append(consultant);
	    auditStr.append("; ");
		auditStr.append("\r\n*sPR* :");
		auditStr.append(sPR);
	    auditStr.append("; ");
		auditStr.append("\r\n*associateSpecialist* :");
		auditStr.append(associateSpecialist);
	    auditStr.append("; ");
		auditStr.append("\r\n*anyDoctorToSee* :");
		auditStr.append(anyDoctorToSee);
	    auditStr.append("; ");
		auditStr.append("\r\n*otherHCP* :");
		auditStr.append(otherHCP);
	    auditStr.append("; ");
		auditStr.append("\r\n*otherHCPValue* :");
		if (otherHCPValue != null)
			auditStr.append(otherHCPValue.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*catsReferral* :");
		if (catsReferral != null)
		{
			auditStr.append(toShortClassName(catsReferral));
				
		    auditStr.append(catsReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*namedConsultant* :");
		auditStr.append(namedConsultant);
	    auditStr.append("; ");
		auditStr.append("\r\n*namedConsultantValue* :");
		if (namedConsultantValue != null)
		{
			auditStr.append(toShortClassName(namedConsultantValue));
				
		    auditStr.append(namedConsultantValue.getId());
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
		
		String keyClassName = "OPA";
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
		if (this.isConsultant() != null)
		{
			sb.append("<consultant>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isConsultant().toString()));
			sb.append("</consultant>");		
		}
		if (this.isSPR() != null)
		{
			sb.append("<sPR>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSPR().toString()));
			sb.append("</sPR>");		
		}
		if (this.isAssociateSpecialist() != null)
		{
			sb.append("<associateSpecialist>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAssociateSpecialist().toString()));
			sb.append("</associateSpecialist>");		
		}
		if (this.isAnyDoctorToSee() != null)
		{
			sb.append("<anyDoctorToSee>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAnyDoctorToSee().toString()));
			sb.append("</anyDoctorToSee>");		
		}
		if (this.isOtherHCP() != null)
		{
			sb.append("<otherHCP>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isOtherHCP().toString()));
			sb.append("</otherHCP>");		
		}
		if (this.getOtherHCPValue() != null)
		{
			sb.append("<otherHCPValue>");
			sb.append(this.getOtherHCPValue().toXMLString()); 
			sb.append("</otherHCPValue>");		
		}
		if (this.getCatsReferral() != null)
		{
			sb.append("<catsReferral>");
			sb.append(this.getCatsReferral().toXMLString(domMap)); 	
			sb.append("</catsReferral>");		
		}
		if (this.isNamedConsultant() != null)
		{
			sb.append("<namedConsultant>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNamedConsultant().toString()));
			sb.append("</namedConsultant>");		
		}
		if (this.getNamedConsultantValue() != null)
		{
			sb.append("<namedConsultantValue>");
			sb.append(this.getNamedConsultantValue().toXMLString(domMap)); 	
			sb.append("</namedConsultantValue>");		
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
			OPA domainObject = getOPAfromXML(itemEl, factory, domMap);

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
			OPA domainObject = getOPAfromXML(itemEl, factory, domMap);

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
		
	public static OPA getOPAfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOPAfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OPA getOPAfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OPA.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OPA.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OPA class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OPA)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OPA.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OPA ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OPA)factory.getImportedDomainObject(OPA.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OPA();
		}
		String keyClassName = "OPA";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OPA)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OPA obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("consultant");
		if(fldEl != null)
		{	
    		obj.setConsultant(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sPR");
		if(fldEl != null)
		{	
    		obj.setSPR(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("associateSpecialist");
		if(fldEl != null)
		{	
    		obj.setAssociateSpecialist(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("anyDoctorToSee");
		if(fldEl != null)
		{	
    		obj.setAnyDoctorToSee(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("otherHCP");
		if(fldEl != null)
		{	
    		obj.setOtherHCP(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("otherHCPValue");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOtherHCPValue(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("namedConsultant");
		if(fldEl != null)
		{	
    		obj.setNamedConsultant(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("namedConsultantValue");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNamedConsultantValue(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
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
		public static final String Consultant = "consultant";
		public static final String SPR = "sPR";
		public static final String AssociateSpecialist = "associateSpecialist";
		public static final String AnyDoctorToSee = "anyDoctorToSee";
		public static final String OtherHCP = "otherHCP";
		public static final String OtherHCPValue = "otherHCPValue";
		public static final String CatsReferral = "catsReferral";
		public static final String NamedConsultant = "namedConsultant";
		public static final String NamedConsultantValue = "namedConsultantValue";
	}
}

