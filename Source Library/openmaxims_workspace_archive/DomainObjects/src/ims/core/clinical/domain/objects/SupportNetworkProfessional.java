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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class SupportNetworkProfessional extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100006;
	private static final long serialVersionUID = 1003100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Is currently an active Professional Support Network member */
	private Boolean isCurrActiveProfSupp;
	/** HCP active on admission  */
	private Boolean isAdmissionHCP;
	/** The sub Type of the hcp (child Instance of the hierarchical lookup) */
	private ims.domain.lookups.LookupInstance hcpSubType;
	private ims.core.resource.place.domain.objects.Location currentLocation;
	/** Member of Staff */
	private ims.core.resource.people.domain.objects.MemberOfStaff mOS;
	/** SuppliedProfessional */
	private ims.core.clinical.domain.objects.SuppNetworkServiceProfessionDetail suppliedProfessional;
	/** Profession */
	private ims.domain.lookups.LookupInstance profession;
	private ims.core.clinical.domain.objects.AuthoringInformation authorngInfo;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SupportNetworkProfessional (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SupportNetworkProfessional ()
    {
    	super();
    }
    public SupportNetworkProfessional (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.SupportNetworkProfessional.class;
	}


	public Boolean isIsCurrActiveProfSupp() {
		return isCurrActiveProfSupp;
	}
	public void setIsCurrActiveProfSupp(Boolean isCurrActiveProfSupp) {
		this.isCurrActiveProfSupp = isCurrActiveProfSupp;
	}

	public Boolean isIsAdmissionHCP() {
		return isAdmissionHCP;
	}
	public void setIsAdmissionHCP(Boolean isAdmissionHCP) {
		this.isAdmissionHCP = isAdmissionHCP;
	}

	public ims.domain.lookups.LookupInstance getHcpSubType() {
		return hcpSubType;
	}
	public void setHcpSubType(ims.domain.lookups.LookupInstance hcpSubType) {
		this.hcpSubType = hcpSubType;
	}

	public ims.core.resource.place.domain.objects.Location getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(ims.core.resource.place.domain.objects.Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getMOS() {
		return mOS;
	}
	public void setMOS(ims.core.resource.people.domain.objects.MemberOfStaff mOS) {
		this.mOS = mOS;
	}

	public ims.core.clinical.domain.objects.SuppNetworkServiceProfessionDetail getSuppliedProfessional() {
		return suppliedProfessional;
	}
	public void setSuppliedProfessional(ims.core.clinical.domain.objects.SuppNetworkServiceProfessionDetail suppliedProfessional) {
		this.suppliedProfessional = suppliedProfessional;
	}

	public ims.domain.lookups.LookupInstance getProfession() {
		return profession;
	}
	public void setProfession(ims.domain.lookups.LookupInstance profession) {
		this.profession = profession;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthorngInfo() {
		return authorngInfo;
	}
	public void setAuthorngInfo(ims.core.clinical.domain.objects.AuthoringInformation authorngInfo) {
		this.authorngInfo = authorngInfo;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
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
		
		auditStr.append("\r\n*isCurrActiveProfSupp* :");
		auditStr.append(isCurrActiveProfSupp);
	    auditStr.append("; ");
		auditStr.append("\r\n*isAdmissionHCP* :");
		auditStr.append(isAdmissionHCP);
	    auditStr.append("; ");
		auditStr.append("\r\n*hcpSubType* :");
		if (hcpSubType != null)
			auditStr.append(hcpSubType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*currentLocation* :");
		if (currentLocation != null)
		{
			auditStr.append(toShortClassName(currentLocation));
				
		    auditStr.append(currentLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mOS* :");
		if (mOS != null)
		{
			auditStr.append(toShortClassName(mOS));
				
		    auditStr.append(mOS.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*suppliedProfessional* :");
		if (suppliedProfessional != null)
		{
			auditStr.append(toShortClassName(suppliedProfessional));
				
		    auditStr.append(suppliedProfessional.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*profession* :");
		if (profession != null)
			auditStr.append(profession.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*authorngInfo* :");
		if (authorngInfo != null)
		{
			auditStr.append(toShortClassName(authorngInfo));
				
		    auditStr.append(authorngInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
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
		
		String keyClassName = "SupportNetworkProfessional";
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
		if (this.isIsCurrActiveProfSupp() != null)
		{
			sb.append("<isCurrActiveProfSupp>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCurrActiveProfSupp().toString()));
			sb.append("</isCurrActiveProfSupp>");		
		}
		if (this.isIsAdmissionHCP() != null)
		{
			sb.append("<isAdmissionHCP>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsAdmissionHCP().toString()));
			sb.append("</isAdmissionHCP>");		
		}
		if (this.getHcpSubType() != null)
		{
			sb.append("<hcpSubType>");
			sb.append(this.getHcpSubType().toXMLString()); 
			sb.append("</hcpSubType>");		
		}
		if (this.getCurrentLocation() != null)
		{
			sb.append("<currentLocation>");
			sb.append(this.getCurrentLocation().toXMLString(domMap)); 	
			sb.append("</currentLocation>");		
		}
		if (this.getMOS() != null)
		{
			sb.append("<mOS>");
			sb.append(this.getMOS().toXMLString(domMap)); 	
			sb.append("</mOS>");		
		}
		if (this.getSuppliedProfessional() != null)
		{
			sb.append("<suppliedProfessional>");
			sb.append(this.getSuppliedProfessional().toXMLString(domMap)); 	
			sb.append("</suppliedProfessional>");		
		}
		if (this.getProfession() != null)
		{
			sb.append("<profession>");
			sb.append(this.getProfession().toXMLString()); 
			sb.append("</profession>");		
		}
		if (this.getAuthorngInfo() != null)
		{
			sb.append("<authorngInfo>");
			sb.append(this.getAuthorngInfo().toXMLString(domMap)); 	
			sb.append("</authorngInfo>");		
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
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
			SupportNetworkProfessional domainObject = getSupportNetworkProfessionalfromXML(itemEl, factory, domMap);

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
			SupportNetworkProfessional domainObject = getSupportNetworkProfessionalfromXML(itemEl, factory, domMap);

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
		
	public static SupportNetworkProfessional getSupportNetworkProfessionalfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSupportNetworkProfessionalfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SupportNetworkProfessional getSupportNetworkProfessionalfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SupportNetworkProfessional.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SupportNetworkProfessional.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SupportNetworkProfessional class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SupportNetworkProfessional)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SupportNetworkProfessional.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SupportNetworkProfessional ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SupportNetworkProfessional)factory.getImportedDomainObject(SupportNetworkProfessional.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SupportNetworkProfessional();
		}
		String keyClassName = "SupportNetworkProfessional";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SupportNetworkProfessional)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SupportNetworkProfessional obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("isCurrActiveProfSupp");
		if(fldEl != null)
		{	
    		obj.setIsCurrActiveProfSupp(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isAdmissionHCP");
		if(fldEl != null)
		{	
    		obj.setIsAdmissionHCP(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hcpSubType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHcpSubType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("currentLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("mOS");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMOS(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("suppliedProfessional");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSuppliedProfessional(ims.core.clinical.domain.objects.SuppNetworkServiceProfessionDetail.getSuppNetworkServiceProfessionDetailfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("profession");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProfession(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("authorngInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthorngInfo(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
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
		public static final String IsCurrActiveProfSupp = "isCurrActiveProfSupp";
		public static final String IsAdmissionHCP = "isAdmissionHCP";
		public static final String HcpSubType = "hcpSubType";
		public static final String CurrentLocation = "currentLocation";
		public static final String MOS = "mOS";
		public static final String SuppliedProfessional = "suppliedProfessional";
		public static final String Profession = "profession";
		public static final String AuthorngInfo = "authorngInfo";
		public static final String RecordingInformation = "recordingInformation";
	}
}

