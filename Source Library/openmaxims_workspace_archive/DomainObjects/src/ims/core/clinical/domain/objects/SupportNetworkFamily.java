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


public class SupportNetworkFamily extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100005;
	private static final long serialVersionUID = 1003100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Carer Name */
	private String carerName;
	/** Relationship to Patient */
	private ims.domain.lookups.LookupInstance carerRelationship;
	private String carerAddress;
	private String carerHomePhone;
	private String carerMobilePhone;
	private String carerWorkPhone;
	private String carerEmail;
	/** to Indicat that the Carere is main Carer */
	private Boolean isMainCarer;
	/** First Contact / Second Contact etc */
	private ims.domain.lookups.LookupInstance emergencyContactOrder;
	/** Currently Active */
	private Boolean isCurrentlyActiveFamilySupport;
	/** Discuss Progress */
	private Boolean discussProgress;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInfo;
	/** Fit and Well? */
	private Boolean fitAndWell;
	/** Aware of Client's position? */
	private Boolean awareClientPosition;
	/** Has permission been given to discuss issues with them? */
	private Boolean permissionToContact;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation;
	/** Inactivating User */
	private ims.core.resource.people.domain.objects.MemberOfStaff inactivatingUser;
	/** Inactivating Date Time */
	private java.util.Date inactivatingDateTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SupportNetworkFamily (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SupportNetworkFamily ()
    {
    	super();
    }
    public SupportNetworkFamily (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.SupportNetworkFamily.class;
	}


	public String getCarerName() {
		return carerName;
	}
	public void setCarerName(String carerName) {
		if ( null != carerName && carerName.length() > 60 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for carerName. Tried to set value: "+
				carerName);
		}
		this.carerName = carerName;
	}

	public ims.domain.lookups.LookupInstance getCarerRelationship() {
		return carerRelationship;
	}
	public void setCarerRelationship(ims.domain.lookups.LookupInstance carerRelationship) {
		this.carerRelationship = carerRelationship;
	}

	public String getCarerAddress() {
		return carerAddress;
	}
	public void setCarerAddress(String carerAddress) {
		if ( null != carerAddress && carerAddress.length() > 120 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for carerAddress. Tried to set value: "+
				carerAddress);
		}
		this.carerAddress = carerAddress;
	}

	public String getCarerHomePhone() {
		return carerHomePhone;
	}
	public void setCarerHomePhone(String carerHomePhone) {
		if ( null != carerHomePhone && carerHomePhone.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for carerHomePhone. Tried to set value: "+
				carerHomePhone);
		}
		this.carerHomePhone = carerHomePhone;
	}

	public String getCarerMobilePhone() {
		return carerMobilePhone;
	}
	public void setCarerMobilePhone(String carerMobilePhone) {
		if ( null != carerMobilePhone && carerMobilePhone.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for carerMobilePhone. Tried to set value: "+
				carerMobilePhone);
		}
		this.carerMobilePhone = carerMobilePhone;
	}

	public String getCarerWorkPhone() {
		return carerWorkPhone;
	}
	public void setCarerWorkPhone(String carerWorkPhone) {
		if ( null != carerWorkPhone && carerWorkPhone.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for carerWorkPhone. Tried to set value: "+
				carerWorkPhone);
		}
		this.carerWorkPhone = carerWorkPhone;
	}

	public String getCarerEmail() {
		return carerEmail;
	}
	public void setCarerEmail(String carerEmail) {
		if ( null != carerEmail && carerEmail.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for carerEmail. Tried to set value: "+
				carerEmail);
		}
		this.carerEmail = carerEmail;
	}

	public Boolean isIsMainCarer() {
		return isMainCarer;
	}
	public void setIsMainCarer(Boolean isMainCarer) {
		this.isMainCarer = isMainCarer;
	}

	public ims.domain.lookups.LookupInstance getEmergencyContactOrder() {
		return emergencyContactOrder;
	}
	public void setEmergencyContactOrder(ims.domain.lookups.LookupInstance emergencyContactOrder) {
		this.emergencyContactOrder = emergencyContactOrder;
	}

	public Boolean isIsCurrentlyActiveFamilySupport() {
		return isCurrentlyActiveFamilySupport;
	}
	public void setIsCurrentlyActiveFamilySupport(Boolean isCurrentlyActiveFamilySupport) {
		this.isCurrentlyActiveFamilySupport = isCurrentlyActiveFamilySupport;
	}

	public Boolean isDiscussProgress() {
		return discussProgress;
	}
	public void setDiscussProgress(Boolean discussProgress) {
		this.discussProgress = discussProgress;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInfo() {
		return authoringInfo;
	}
	public void setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation authoringInfo) {
		this.authoringInfo = authoringInfo;
	}

	public Boolean isFitAndWell() {
		return fitAndWell;
	}
	public void setFitAndWell(Boolean fitAndWell) {
		this.fitAndWell = fitAndWell;
	}

	public Boolean isAwareClientPosition() {
		return awareClientPosition;
	}
	public void setAwareClientPosition(Boolean awareClientPosition) {
		this.awareClientPosition = awareClientPosition;
	}

	public Boolean isPermissionToContact() {
		return permissionToContact;
	}
	public void setPermissionToContact(Boolean permissionToContact) {
		this.permissionToContact = permissionToContact;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getInactivatingUser() {
		return inactivatingUser;
	}
	public void setInactivatingUser(ims.core.resource.people.domain.objects.MemberOfStaff inactivatingUser) {
		this.inactivatingUser = inactivatingUser;
	}

	public java.util.Date getInactivatingDateTime() {
		return inactivatingDateTime;
	}
	public void setInactivatingDateTime(java.util.Date inactivatingDateTime) {
		this.inactivatingDateTime = inactivatingDateTime;
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
		
		auditStr.append("\r\n*carerName* :");
		auditStr.append(carerName);
	    auditStr.append("; ");
		auditStr.append("\r\n*carerRelationship* :");
		if (carerRelationship != null)
			auditStr.append(carerRelationship.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*carerAddress* :");
		auditStr.append(carerAddress);
	    auditStr.append("; ");
		auditStr.append("\r\n*carerHomePhone* :");
		auditStr.append(carerHomePhone);
	    auditStr.append("; ");
		auditStr.append("\r\n*carerMobilePhone* :");
		auditStr.append(carerMobilePhone);
	    auditStr.append("; ");
		auditStr.append("\r\n*carerWorkPhone* :");
		auditStr.append(carerWorkPhone);
	    auditStr.append("; ");
		auditStr.append("\r\n*carerEmail* :");
		auditStr.append(carerEmail);
	    auditStr.append("; ");
		auditStr.append("\r\n*isMainCarer* :");
		auditStr.append(isMainCarer);
	    auditStr.append("; ");
		auditStr.append("\r\n*emergencyContactOrder* :");
		if (emergencyContactOrder != null)
			auditStr.append(emergencyContactOrder.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isCurrentlyActiveFamilySupport* :");
		auditStr.append(isCurrentlyActiveFamilySupport);
	    auditStr.append("; ");
		auditStr.append("\r\n*discussProgress* :");
		auditStr.append(discussProgress);
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInfo* :");
		if (authoringInfo != null)
		{
			auditStr.append(toShortClassName(authoringInfo));
				
		    auditStr.append(authoringInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*fitAndWell* :");
		auditStr.append(fitAndWell);
	    auditStr.append("; ");
		auditStr.append("\r\n*awareClientPosition* :");
		auditStr.append(awareClientPosition);
	    auditStr.append("; ");
		auditStr.append("\r\n*permissionToContact* :");
		auditStr.append(permissionToContact);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactivatingUser* :");
		if (inactivatingUser != null)
		{
			auditStr.append(toShortClassName(inactivatingUser));
				
		    auditStr.append(inactivatingUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactivatingDateTime* :");
		auditStr.append(inactivatingDateTime);
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
		
		String keyClassName = "SupportNetworkFamily";
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
		if (this.getCarerName() != null)
		{
			sb.append("<carerName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCarerName().toString()));
			sb.append("</carerName>");		
		}
		if (this.getCarerRelationship() != null)
		{
			sb.append("<carerRelationship>");
			sb.append(this.getCarerRelationship().toXMLString()); 
			sb.append("</carerRelationship>");		
		}
		if (this.getCarerAddress() != null)
		{
			sb.append("<carerAddress>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCarerAddress().toString()));
			sb.append("</carerAddress>");		
		}
		if (this.getCarerHomePhone() != null)
		{
			sb.append("<carerHomePhone>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCarerHomePhone().toString()));
			sb.append("</carerHomePhone>");		
		}
		if (this.getCarerMobilePhone() != null)
		{
			sb.append("<carerMobilePhone>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCarerMobilePhone().toString()));
			sb.append("</carerMobilePhone>");		
		}
		if (this.getCarerWorkPhone() != null)
		{
			sb.append("<carerWorkPhone>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCarerWorkPhone().toString()));
			sb.append("</carerWorkPhone>");		
		}
		if (this.getCarerEmail() != null)
		{
			sb.append("<carerEmail>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCarerEmail().toString()));
			sb.append("</carerEmail>");		
		}
		if (this.isIsMainCarer() != null)
		{
			sb.append("<isMainCarer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMainCarer().toString()));
			sb.append("</isMainCarer>");		
		}
		if (this.getEmergencyContactOrder() != null)
		{
			sb.append("<emergencyContactOrder>");
			sb.append(this.getEmergencyContactOrder().toXMLString()); 
			sb.append("</emergencyContactOrder>");		
		}
		if (this.isIsCurrentlyActiveFamilySupport() != null)
		{
			sb.append("<isCurrentlyActiveFamilySupport>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCurrentlyActiveFamilySupport().toString()));
			sb.append("</isCurrentlyActiveFamilySupport>");		
		}
		if (this.isDiscussProgress() != null)
		{
			sb.append("<discussProgress>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDiscussProgress().toString()));
			sb.append("</discussProgress>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getAuthoringInfo() != null)
		{
			sb.append("<authoringInfo>");
			sb.append(this.getAuthoringInfo().toXMLString(domMap)); 	
			sb.append("</authoringInfo>");		
		}
		if (this.isFitAndWell() != null)
		{
			sb.append("<fitAndWell>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isFitAndWell().toString()));
			sb.append("</fitAndWell>");		
		}
		if (this.isAwareClientPosition() != null)
		{
			sb.append("<awareClientPosition>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAwareClientPosition().toString()));
			sb.append("</awareClientPosition>");		
		}
		if (this.isPermissionToContact() != null)
		{
			sb.append("<permissionToContact>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPermissionToContact().toString()));
			sb.append("</permissionToContact>");		
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
		}
		if (this.getInactivatingUser() != null)
		{
			sb.append("<inactivatingUser>");
			sb.append(this.getInactivatingUser().toXMLString(domMap)); 	
			sb.append("</inactivatingUser>");		
		}
		if (this.getInactivatingDateTime() != null)
		{
			sb.append("<inactivatingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getInactivatingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</inactivatingDateTime>");		
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
			SupportNetworkFamily domainObject = getSupportNetworkFamilyfromXML(itemEl, factory, domMap);

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
			SupportNetworkFamily domainObject = getSupportNetworkFamilyfromXML(itemEl, factory, domMap);

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
		
	public static SupportNetworkFamily getSupportNetworkFamilyfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSupportNetworkFamilyfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SupportNetworkFamily getSupportNetworkFamilyfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SupportNetworkFamily.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SupportNetworkFamily.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SupportNetworkFamily class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SupportNetworkFamily)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SupportNetworkFamily.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SupportNetworkFamily ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SupportNetworkFamily)factory.getImportedDomainObject(SupportNetworkFamily.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SupportNetworkFamily();
		}
		String keyClassName = "SupportNetworkFamily";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SupportNetworkFamily)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SupportNetworkFamily obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("carerName");
		if(fldEl != null)
		{	
    		obj.setCarerName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("carerRelationship");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCarerRelationship(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("carerAddress");
		if(fldEl != null)
		{	
    		obj.setCarerAddress(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("carerHomePhone");
		if(fldEl != null)
		{	
    		obj.setCarerHomePhone(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("carerMobilePhone");
		if(fldEl != null)
		{	
    		obj.setCarerMobilePhone(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("carerWorkPhone");
		if(fldEl != null)
		{	
    		obj.setCarerWorkPhone(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("carerEmail");
		if(fldEl != null)
		{	
    		obj.setCarerEmail(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isMainCarer");
		if(fldEl != null)
		{	
    		obj.setIsMainCarer(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("emergencyContactOrder");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEmergencyContactOrder(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isCurrentlyActiveFamilySupport");
		if(fldEl != null)
		{	
    		obj.setIsCurrentlyActiveFamilySupport(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("discussProgress");
		if(fldEl != null)
		{	
    		obj.setDiscussProgress(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("fitAndWell");
		if(fldEl != null)
		{	
    		obj.setFitAndWell(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("awareClientPosition");
		if(fldEl != null)
		{	
    		obj.setAwareClientPosition(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("permissionToContact");
		if(fldEl != null)
		{	
    		obj.setPermissionToContact(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("inactivatingUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInactivatingUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("inactivatingDateTime");
		if(fldEl != null)
		{	
    		obj.setInactivatingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String CarerName = "carerName";
		public static final String CarerRelationship = "carerRelationship";
		public static final String CarerAddress = "carerAddress";
		public static final String CarerHomePhone = "carerHomePhone";
		public static final String CarerMobilePhone = "carerMobilePhone";
		public static final String CarerWorkPhone = "carerWorkPhone";
		public static final String CarerEmail = "carerEmail";
		public static final String IsMainCarer = "isMainCarer";
		public static final String EmergencyContactOrder = "emergencyContactOrder";
		public static final String IsCurrentlyActiveFamilySupport = "isCurrentlyActiveFamilySupport";
		public static final String DiscussProgress = "discussProgress";
		public static final String Patient = "patient";
		public static final String AuthoringInfo = "authoringInfo";
		public static final String FitAndWell = "fitAndWell";
		public static final String AwareClientPosition = "awareClientPosition";
		public static final String PermissionToContact = "permissionToContact";
		public static final String RecordingInformation = "recordingInformation";
		public static final String InactivatingUser = "inactivatingUser";
		public static final String InactivatingDateTime = "inactivatingDateTime";
	}
}

