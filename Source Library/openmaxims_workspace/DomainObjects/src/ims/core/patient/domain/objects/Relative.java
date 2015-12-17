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
package ims.core.patient.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class Relative extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1001100002;
	private static final long serialVersionUID = 1001100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.generic.domain.objects.PersonName name;
	private ims.core.generic.domain.objects.Address address;
	private ims.domain.lookups.LookupInstance relationship;
	/** 
	  * Collection of ims.core.generic.domain.objects.CommunicationChannel.
	  */
	private java.util.List commChannels;
	/** pdsUpdateMode */
	private ims.domain.lookups.LookupInstance pdsUpdateMode;
	/** Object identifier - UID */
	private String objectidentifier;
	/** Indicates the class of related person role */
	private ims.domain.lookups.LookupInstance role;
	/** NHS Number link */
	private String nhsNum;
	/** The order in which contact should normally be made with related persons. Value will be in the range 1-99 */
	private String contactRank;
	/** Indicates that the related person is also a next of kin. Only used, and can only have value 'true', if the related person is a next of kin of the patient */
	private Boolean nokInd;
	/** Indicates that correspondence should be copied to this contact. Only used, and can only have value 'true', if correspondence should be copied to the related person */
	private Boolean cpyCorresp;
	/** Willingness of the related person to accept calls from a call centre, such as used by 'Choose and Book', on behalf of the patient. This is only rel-evant where the role type is 'AGNT' (Agent - used for Proxies). */
	private ims.domain.lookups.LookupInstance callbckCons;
	/** The date from which the alternative identifier has been indicated to be effective. */
	private java.util.Date beffdate;
	/** Beffdate confirmed */
	private Boolean beffdatecnf;
	/** The date until which the alternative identifier has been indicated to be effective. */
	private java.util.Date betdate;
	/** Betdate Confirmed */
	private Boolean betdatecnf;
	/** Active/Inactive */
	private Boolean active;
	/** The date of birth of the related person  */
	private Integer dob;
	/** Relative Contact Preferences */
	private ims.core.patient.domain.objects.PDSRelativeContactPref pDScontactPreferences;
	/** Relative preferred language */
	private ims.domain.lookups.LookupInstance pDSlanguage;
	/** PDSInterpreterRequired */
	private Boolean pDSInterpreterRequired;
	/** Pending PDS synchronization */
	private Boolean pending;
	private Boolean isConfidential;
    public Relative (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Relative ()
    {
    	super();
    }
    public Relative (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.Relative.class;
	}


	public ims.core.generic.domain.objects.PersonName getName() {
		return name;
	}
	public void setName(ims.core.generic.domain.objects.PersonName name) {
		this.name = name;
	}

	public ims.core.generic.domain.objects.Address getAddress() {
		return address;
	}
	public void setAddress(ims.core.generic.domain.objects.Address address) {
		this.address = address;
	}

	public ims.domain.lookups.LookupInstance getRelationship() {
		return relationship;
	}
	public void setRelationship(ims.domain.lookups.LookupInstance relationship) {
		this.relationship = relationship;
	}

	public java.util.List getCommChannels() {
		if ( null == commChannels ) {
			commChannels = new java.util.ArrayList();
		}
		return commChannels;
	}
	public void setCommChannels(java.util.List paramValue) {
		this.commChannels = paramValue;
	}

	public ims.domain.lookups.LookupInstance getPdsUpdateMode() {
		return pdsUpdateMode;
	}
	public void setPdsUpdateMode(ims.domain.lookups.LookupInstance pdsUpdateMode) {
		this.pdsUpdateMode = pdsUpdateMode;
	}

	public String getObjectidentifier() {
		return objectidentifier;
	}
	public void setObjectidentifier(String objectidentifier) {
		if ( null != objectidentifier && objectidentifier.length() > 14 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for objectidentifier. Tried to set value: "+
				objectidentifier);
		}
		this.objectidentifier = objectidentifier;
	}

	public ims.domain.lookups.LookupInstance getRole() {
		return role;
	}
	public void setRole(ims.domain.lookups.LookupInstance role) {
		this.role = role;
	}

	public String getNhsNum() {
		return nhsNum;
	}
	public void setNhsNum(String nhsNum) {
		if ( null != nhsNum && nhsNum.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nhsNum. Tried to set value: "+
				nhsNum);
		}
		this.nhsNum = nhsNum;
	}

	public String getContactRank() {
		return contactRank;
	}
	public void setContactRank(String contactRank) {
		if ( null != contactRank && contactRank.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for contactRank. Tried to set value: "+
				contactRank);
		}
		this.contactRank = contactRank;
	}

	public Boolean isNokInd() {
		return nokInd;
	}
	public void setNokInd(Boolean nokInd) {
		this.nokInd = nokInd;
	}

	public Boolean isCpyCorresp() {
		return cpyCorresp;
	}
	public void setCpyCorresp(Boolean cpyCorresp) {
		this.cpyCorresp = cpyCorresp;
	}

	public ims.domain.lookups.LookupInstance getCallbckCons() {
		return callbckCons;
	}
	public void setCallbckCons(ims.domain.lookups.LookupInstance callbckCons) {
		this.callbckCons = callbckCons;
	}

	public java.util.Date getBeffdate() {
		return beffdate;
	}
	public void setBeffdate(java.util.Date beffdate) {
		this.beffdate = beffdate;
	}

	public Boolean isBeffdatecnf() {
		return beffdatecnf;
	}
	public void setBeffdatecnf(Boolean beffdatecnf) {
		this.beffdatecnf = beffdatecnf;
	}

	public java.util.Date getBetdate() {
		return betdate;
	}
	public void setBetdate(java.util.Date betdate) {
		this.betdate = betdate;
	}

	public Boolean isBetdatecnf() {
		return betdatecnf;
	}
	public void setBetdatecnf(Boolean betdatecnf) {
		this.betdatecnf = betdatecnf;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getDob() {
		return dob;
	}
	public void setDob(Integer dob) {
		this.dob = dob;
	}

	public ims.core.patient.domain.objects.PDSRelativeContactPref getPDScontactPreferences() {
		return pDScontactPreferences;
	}
	public void setPDScontactPreferences(ims.core.patient.domain.objects.PDSRelativeContactPref pDScontactPreferences) {
		this.pDScontactPreferences = pDScontactPreferences;
	}

	public ims.domain.lookups.LookupInstance getPDSlanguage() {
		return pDSlanguage;
	}
	public void setPDSlanguage(ims.domain.lookups.LookupInstance pDSlanguage) {
		this.pDSlanguage = pDSlanguage;
	}

	public Boolean isPDSInterpreterRequired() {
		return pDSInterpreterRequired;
	}
	public void setPDSInterpreterRequired(Boolean pDSInterpreterRequired) {
		this.pDSInterpreterRequired = pDSInterpreterRequired;
	}

	public Boolean isPending() {
		return pending;
	}
	public void setPending(Boolean pending) {
		this.pending = pending;
	}

	public Boolean isIsConfidential() {
		return isConfidential;
	}
	public void setIsConfidential(Boolean isConfidential) {
		this.isConfidential = isConfidential;
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
		
		auditStr.append("\r\n*name* :");
		if (name != null)
		{
			auditStr.append(toShortClassName(name));
				
		    auditStr.append(name.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*address* :");
		if (address != null)
		{
			auditStr.append(toShortClassName(address));
				
		    auditStr.append(address.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*relationship* :");
		if (relationship != null)
			auditStr.append(relationship.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*commChannels* :");
		if (commChannels != null)
		{
		int i4=0;
		for (i4=0; i4<commChannels.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.core.generic.domain.objects.CommunicationChannel obj = (ims.core.generic.domain.objects.CommunicationChannel)commChannels.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsUpdateMode* :");
		if (pdsUpdateMode != null)
			auditStr.append(pdsUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*objectidentifier* :");
		auditStr.append(objectidentifier);
	    auditStr.append("; ");
		auditStr.append("\r\n*role* :");
		if (role != null)
			auditStr.append(role.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nhsNum* :");
		auditStr.append(nhsNum);
	    auditStr.append("; ");
		auditStr.append("\r\n*contactRank* :");
		auditStr.append(contactRank);
	    auditStr.append("; ");
		auditStr.append("\r\n*nokInd* :");
		auditStr.append(nokInd);
	    auditStr.append("; ");
		auditStr.append("\r\n*cpyCorresp* :");
		auditStr.append(cpyCorresp);
	    auditStr.append("; ");
		auditStr.append("\r\n*callbckCons* :");
		if (callbckCons != null)
			auditStr.append(callbckCons.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*beffdate* :");
		auditStr.append(beffdate);
	    auditStr.append("; ");
		auditStr.append("\r\n*beffdatecnf* :");
		auditStr.append(beffdatecnf);
	    auditStr.append("; ");
		auditStr.append("\r\n*betdate* :");
		auditStr.append(betdate);
	    auditStr.append("; ");
		auditStr.append("\r\n*betdatecnf* :");
		auditStr.append(betdatecnf);
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*dob* :");
		auditStr.append(dob);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDScontactPreferences* :");
		if (pDScontactPreferences != null)
		{
			auditStr.append(toShortClassName(pDScontactPreferences));
				
		    auditStr.append(pDScontactPreferences.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pDSlanguage* :");
		if (pDSlanguage != null)
			auditStr.append(pDSlanguage.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pDSInterpreterRequired* :");
		auditStr.append(pDSInterpreterRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*pending* :");
		auditStr.append(pending);
	    auditStr.append("; ");
		auditStr.append("\r\n*isConfidential* :");
		auditStr.append(isConfidential);
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
		
		String keyClassName = "Relative";
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
			sb.append(this.getName().toXMLString(domMap)); 	
			sb.append("</name>");		
		}
		if (this.getAddress() != null)
		{
			sb.append("<address>");
			sb.append(this.getAddress().toXMLString(domMap)); 	
			sb.append("</address>");		
		}
		if (this.getRelationship() != null)
		{
			sb.append("<relationship>");
			sb.append(this.getRelationship().toXMLString()); 
			sb.append("</relationship>");		
		}
		if (this.getCommChannels() != null)
		{
			if (this.getCommChannels().size() > 0 )
			{
			sb.append("<commChannels>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCommChannels(), domMap));
			sb.append("</commChannels>");		
			}
		}
		if (this.getPdsUpdateMode() != null)
		{
			sb.append("<pdsUpdateMode>");
			sb.append(this.getPdsUpdateMode().toXMLString()); 
			sb.append("</pdsUpdateMode>");		
		}
		if (this.getObjectidentifier() != null)
		{
			sb.append("<objectidentifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getObjectidentifier().toString()));
			sb.append("</objectidentifier>");		
		}
		if (this.getRole() != null)
		{
			sb.append("<role>");
			sb.append(this.getRole().toXMLString()); 
			sb.append("</role>");		
		}
		if (this.getNhsNum() != null)
		{
			sb.append("<nhsNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNhsNum().toString()));
			sb.append("</nhsNum>");		
		}
		if (this.getContactRank() != null)
		{
			sb.append("<contactRank>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getContactRank().toString()));
			sb.append("</contactRank>");		
		}
		if (this.isNokInd() != null)
		{
			sb.append("<nokInd>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNokInd().toString()));
			sb.append("</nokInd>");		
		}
		if (this.isCpyCorresp() != null)
		{
			sb.append("<cpyCorresp>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCpyCorresp().toString()));
			sb.append("</cpyCorresp>");		
		}
		if (this.getCallbckCons() != null)
		{
			sb.append("<callbckCons>");
			sb.append(this.getCallbckCons().toXMLString()); 
			sb.append("</callbckCons>");		
		}
		if (this.getBeffdate() != null)
		{
			sb.append("<beffdate>");
			sb.append(new ims.framework.utils.DateTime(this.getBeffdate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</beffdate>");		
		}
		if (this.isBeffdatecnf() != null)
		{
			sb.append("<beffdatecnf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBeffdatecnf().toString()));
			sb.append("</beffdatecnf>");		
		}
		if (this.getBetdate() != null)
		{
			sb.append("<betdate>");
			sb.append(new ims.framework.utils.DateTime(this.getBetdate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</betdate>");		
		}
		if (this.isBetdatecnf() != null)
		{
			sb.append("<betdatecnf>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isBetdatecnf().toString()));
			sb.append("</betdatecnf>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
		}
		if (this.getDob() != null)
		{
			sb.append("<dob>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDob().toString()));
			sb.append("</dob>");		
		}
		if (this.getPDScontactPreferences() != null)
		{
			sb.append("<pDScontactPreferences>");
			sb.append(this.getPDScontactPreferences().toXMLString(domMap)); 	
			sb.append("</pDScontactPreferences>");		
		}
		if (this.getPDSlanguage() != null)
		{
			sb.append("<pDSlanguage>");
			sb.append(this.getPDSlanguage().toXMLString()); 
			sb.append("</pDSlanguage>");		
		}
		if (this.isPDSInterpreterRequired() != null)
		{
			sb.append("<pDSInterpreterRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPDSInterpreterRequired().toString()));
			sb.append("</pDSInterpreterRequired>");		
		}
		if (this.isPending() != null)
		{
			sb.append("<pending>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPending().toString()));
			sb.append("</pending>");		
		}
		if (this.isIsConfidential() != null)
		{
			sb.append("<isConfidential>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsConfidential().toString()));
			sb.append("</isConfidential>");		
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
			Relative domainObject = getRelativefromXML(itemEl, factory, domMap);

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
			Relative domainObject = getRelativefromXML(itemEl, factory, domMap);

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
		
	public static Relative getRelativefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRelativefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Relative getRelativefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Relative.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Relative.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Relative class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Relative)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Relative.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Relative ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Relative)factory.getImportedDomainObject(Relative.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Relative();
		}
		String keyClassName = "Relative";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Relative)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Relative obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setName(ims.core.generic.domain.objects.PersonName.getPersonNamefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("address");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAddress(ims.core.generic.domain.objects.Address.getAddressfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("relationship");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRelationship(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("commChannels");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCommChannels(ims.core.generic.domain.objects.CommunicationChannel.fromListXMLString(fldEl, factory, obj.getCommChannels(), domMap));
		}
		fldEl = el.element("pdsUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPdsUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("objectidentifier");
		if(fldEl != null)
		{	
    		obj.setObjectidentifier(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("role");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRole(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nhsNum");
		if(fldEl != null)
		{	
    		obj.setNhsNum(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contactRank");
		if(fldEl != null)
		{	
    		obj.setContactRank(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nokInd");
		if(fldEl != null)
		{	
    		obj.setNokInd(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cpyCorresp");
		if(fldEl != null)
		{	
    		obj.setCpyCorresp(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("callbckCons");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCallbckCons(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("beffdate");
		if(fldEl != null)
		{	
    		obj.setBeffdate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("beffdatecnf");
		if(fldEl != null)
		{	
    		obj.setBeffdatecnf(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("betdate");
		if(fldEl != null)
		{	
    		obj.setBetdate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("betdatecnf");
		if(fldEl != null)
		{	
    		obj.setBetdatecnf(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dob");
		if(fldEl != null)
		{	
    		obj.setDob(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDScontactPreferences");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPDScontactPreferences(ims.core.patient.domain.objects.PDSRelativeContactPref.getPDSRelativeContactPreffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pDSlanguage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPDSlanguage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pDSInterpreterRequired");
		if(fldEl != null)
		{	
    		obj.setPDSInterpreterRequired(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pending");
		if(fldEl != null)
		{	
    		obj.setPending(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isConfidential");
		if(fldEl != null)
		{	
    		obj.setIsConfidential(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "commChannels"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Address = "address";
		public static final String Relationship = "relationship";
		public static final String CommChannels = "commChannels";
		public static final String PdsUpdateMode = "pdsUpdateMode";
		public static final String Objectidentifier = "objectidentifier";
		public static final String Role = "role";
		public static final String NhsNum = "nhsNum";
		public static final String ContactRank = "contactRank";
		public static final String NokInd = "nokInd";
		public static final String CpyCorresp = "cpyCorresp";
		public static final String CallbckCons = "callbckCons";
		public static final String Beffdate = "beffdate";
		public static final String Beffdatecnf = "beffdatecnf";
		public static final String Betdate = "betdate";
		public static final String Betdatecnf = "betdatecnf";
		public static final String Active = "active";
		public static final String Dob = "dob";
		public static final String PDScontactPreferences = "pDScontactPreferences";
		public static final String PDSlanguage = "pDSlanguage";
		public static final String PDSInterpreterRequired = "pDSInterpreterRequired";
		public static final String Pending = "pending";
		public static final String IsConfidential = "isConfidential";
	}
}

