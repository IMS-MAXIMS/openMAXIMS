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
package ims.core.generic.domain.objects;

/**
 * Fax number
 * @author John MacEnri
 * Generated.
 */


public class Address extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1002100000;
	private static final long serialVersionUID = 1002100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Address line 1 */
	private String line1;
	/** Address line 2 */
	private String line2;
	/** Address line 3 */
	private String line3;
	/** Address line 4 */
	private String line4;
	/** Address line 5 */
	private String line5;
	/** Post Code */
	private String postCode;
	/** Phone Number */
	private String phone;
	/** County */
	private ims.domain.lookups.LookupInstance county;
	/** Fax number */
	private String fax;
	/** Date Address was last updated */
	private java.util.Date updateDate;
	/** Notification date of Address Change */
	private java.util.Date notificationDate;
	/** Address Type */
	private ims.domain.lookups.LookupInstance addressType;
	/** PCT */
	private String pCT;
	/** Other Phone Number */
	private String otherphone;
	/** AreaOfResidence */
	private ims.domain.lookups.LookupInstance areaOfResidence;
	/** PAF key */
	private String pafkey;
	/** Address Description - Textual description of the usage of a temporary address. For temporary address only (i.e. where the address type='TMP'). */
	private String description;
	/** Object identifier - UID */
	private String objectidentifier;
	/** The date from which the alternative identifier has been indicated to be effective. */
	private java.util.Date beffdate;
	/** Beffdate confirmed */
	private Boolean beffdatecnf;
	/** The date until which the alternative identifier has been indicated to be effective. */
	private java.util.Date betdate;
	/** Betdate confirmed */
	private Boolean betdatecnf;
	/** PDS Update Mode */
	private ims.domain.lookups.LookupInstance pdsUpdateMode;
	/** Country */
	private ims.domain.lookups.LookupInstance country;
	private Boolean noFixedAbode;
	private Boolean careHome;
    public Address (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public Address ()
    {
    	super();
		isComponentClass=true;
    }
    public Address (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.core.generic.domain.objects.Address.class;
	}


	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		if ( null != line1 && line1.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for line1. Tried to set value: "+
				line1);
		}
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		if ( null != line2 && line2.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for line2. Tried to set value: "+
				line2);
		}
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}
	public void setLine3(String line3) {
		if ( null != line3 && line3.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for line3. Tried to set value: "+
				line3);
		}
		this.line3 = line3;
	}

	public String getLine4() {
		return line4;
	}
	public void setLine4(String line4) {
		if ( null != line4 && line4.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for line4. Tried to set value: "+
				line4);
		}
		this.line4 = line4;
	}

	public String getLine5() {
		return line5;
	}
	public void setLine5(String line5) {
		if ( null != line5 && line5.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for line5. Tried to set value: "+
				line5);
		}
		this.line5 = line5;
	}

	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		if ( null != postCode && postCode.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for postCode. Tried to set value: "+
				postCode);
		}
		this.postCode = postCode;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		if ( null != phone && phone.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for phone. Tried to set value: "+
				phone);
		}
		this.phone = phone;
	}

	public ims.domain.lookups.LookupInstance getCounty() {
		return county;
	}
	public void setCounty(ims.domain.lookups.LookupInstance county) {
		this.county = county;
	}

	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		if ( null != fax && fax.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for fax. Tried to set value: "+
				fax);
		}
		this.fax = fax;
	}

	public java.util.Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}

	public java.util.Date getNotificationDate() {
		return notificationDate;
	}
	public void setNotificationDate(java.util.Date notificationDate) {
		this.notificationDate = notificationDate;
	}

	public ims.domain.lookups.LookupInstance getAddressType() {
		return addressType;
	}
	public void setAddressType(ims.domain.lookups.LookupInstance addressType) {
		this.addressType = addressType;
	}

	public String getPCT() {
		return pCT;
	}
	public void setPCT(String pCT) {
		if ( null != pCT && pCT.length() > 15 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pCT. Tried to set value: "+
				pCT);
		}
		this.pCT = pCT;
	}

	public String getOtherphone() {
		return otherphone;
	}
	public void setOtherphone(String otherphone) {
		if ( null != otherphone && otherphone.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherphone. Tried to set value: "+
				otherphone);
		}
		this.otherphone = otherphone;
	}

	public ims.domain.lookups.LookupInstance getAreaOfResidence() {
		return areaOfResidence;
	}
	public void setAreaOfResidence(ims.domain.lookups.LookupInstance areaOfResidence) {
		this.areaOfResidence = areaOfResidence;
	}

	public String getPafkey() {
		return pafkey;
	}
	public void setPafkey(String pafkey) {
		if ( null != pafkey && pafkey.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pafkey. Tried to set value: "+
				pafkey);
		}
		this.pafkey = pafkey;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
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

	public ims.domain.lookups.LookupInstance getPdsUpdateMode() {
		return pdsUpdateMode;
	}
	public void setPdsUpdateMode(ims.domain.lookups.LookupInstance pdsUpdateMode) {
		this.pdsUpdateMode = pdsUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getCountry() {
		return country;
	}
	public void setCountry(ims.domain.lookups.LookupInstance country) {
		this.country = country;
	}

	public Boolean isNoFixedAbode() {
		return noFixedAbode;
	}
	public void setNoFixedAbode(Boolean noFixedAbode) {
		this.noFixedAbode = noFixedAbode;
	}

	public Boolean isCareHome() {
		return careHome;
	}
	public void setCareHome(Boolean careHome) {
		this.careHome = careHome;
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
		
		auditStr.append("\r\n*line1* :");
		auditStr.append(line1);
	    auditStr.append("; ");
		auditStr.append("\r\n*line2* :");
		auditStr.append(line2);
	    auditStr.append("; ");
		auditStr.append("\r\n*line3* :");
		auditStr.append(line3);
	    auditStr.append("; ");
		auditStr.append("\r\n*line4* :");
		auditStr.append(line4);
	    auditStr.append("; ");
		auditStr.append("\r\n*line5* :");
		auditStr.append(line5);
	    auditStr.append("; ");
		auditStr.append("\r\n*postCode* :");
		auditStr.append(postCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*phone* :");
		auditStr.append(phone);
	    auditStr.append("; ");
		auditStr.append("\r\n*county* :");
		if (county != null)
			auditStr.append(county.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*fax* :");
		auditStr.append(fax);
	    auditStr.append("; ");
		auditStr.append("\r\n*updateDate* :");
		auditStr.append(updateDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*notificationDate* :");
		auditStr.append(notificationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*addressType* :");
		if (addressType != null)
			auditStr.append(addressType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pCT* :");
		auditStr.append(pCT);
	    auditStr.append("; ");
		auditStr.append("\r\n*otherphone* :");
		auditStr.append(otherphone);
	    auditStr.append("; ");
		auditStr.append("\r\n*areaOfResidence* :");
		if (areaOfResidence != null)
			auditStr.append(areaOfResidence.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pafkey* :");
		auditStr.append(pafkey);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*objectidentifier* :");
		auditStr.append(objectidentifier);
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
		auditStr.append("\r\n*pdsUpdateMode* :");
		if (pdsUpdateMode != null)
			auditStr.append(pdsUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*country* :");
		if (country != null)
			auditStr.append(country.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*noFixedAbode* :");
		auditStr.append(noFixedAbode);
	    auditStr.append("; ");
		auditStr.append("\r\n*careHome* :");
		auditStr.append(careHome);
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
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getLine1() != null)
		{
			sb.append("<line1>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLine1().toString()));
			sb.append("</line1>");		
		}
		if (this.getLine2() != null)
		{
			sb.append("<line2>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLine2().toString()));
			sb.append("</line2>");		
		}
		if (this.getLine3() != null)
		{
			sb.append("<line3>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLine3().toString()));
			sb.append("</line3>");		
		}
		if (this.getLine4() != null)
		{
			sb.append("<line4>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLine4().toString()));
			sb.append("</line4>");		
		}
		if (this.getLine5() != null)
		{
			sb.append("<line5>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLine5().toString()));
			sb.append("</line5>");		
		}
		if (this.getPostCode() != null)
		{
			sb.append("<postCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPostCode().toString()));
			sb.append("</postCode>");		
		}
		if (this.getPhone() != null)
		{
			sb.append("<phone>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPhone().toString()));
			sb.append("</phone>");		
		}
		if (this.getCounty() != null)
		{
			sb.append("<county>");
			sb.append(this.getCounty().toXMLString()); 
			sb.append("</county>");		
		}
		if (this.getFax() != null)
		{
			sb.append("<fax>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFax().toString()));
			sb.append("</fax>");		
		}
		if (this.getUpdateDate() != null)
		{
			sb.append("<updateDate>");
			sb.append(new ims.framework.utils.DateTime(this.getUpdateDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</updateDate>");		
		}
		if (this.getNotificationDate() != null)
		{
			sb.append("<notificationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getNotificationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</notificationDate>");		
		}
		if (this.getAddressType() != null)
		{
			sb.append("<addressType>");
			sb.append(this.getAddressType().toXMLString()); 
			sb.append("</addressType>");		
		}
		if (this.getPCT() != null)
		{
			sb.append("<pCT>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPCT().toString()));
			sb.append("</pCT>");		
		}
		if (this.getOtherphone() != null)
		{
			sb.append("<otherphone>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherphone().toString()));
			sb.append("</otherphone>");		
		}
		if (this.getAreaOfResidence() != null)
		{
			sb.append("<areaOfResidence>");
			sb.append(this.getAreaOfResidence().toXMLString()); 
			sb.append("</areaOfResidence>");		
		}
		if (this.getPafkey() != null)
		{
			sb.append("<pafkey>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPafkey().toString()));
			sb.append("</pafkey>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getObjectidentifier() != null)
		{
			sb.append("<objectidentifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getObjectidentifier().toString()));
			sb.append("</objectidentifier>");		
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
		if (this.getPdsUpdateMode() != null)
		{
			sb.append("<pdsUpdateMode>");
			sb.append(this.getPdsUpdateMode().toXMLString()); 
			sb.append("</pdsUpdateMode>");		
		}
		if (this.getCountry() != null)
		{
			sb.append("<country>");
			sb.append(this.getCountry().toXMLString()); 
			sb.append("</country>");		
		}
		if (this.isNoFixedAbode() != null)
		{
			sb.append("<noFixedAbode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNoFixedAbode().toString()));
			sb.append("</noFixedAbode>");		
		}
		if (this.isCareHome() != null)
		{
			sb.append("<careHome>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCareHome().toString()));
			sb.append("</careHome>");		
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
			Address domainObject = getAddressfromXML(itemEl, factory, domMap);

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
			Address domainObject = getAddressfromXML(itemEl, factory, domMap);

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
		
	public static Address getAddressfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAddressfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Address getAddressfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Address.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Address.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Address class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Address)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Address.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Address ret = null;
		if (ret == null)
		{
			ret = new Address();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Address obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("line1");
		if(fldEl != null)
		{	
    		obj.setLine1(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("line2");
		if(fldEl != null)
		{	
    		obj.setLine2(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("line3");
		if(fldEl != null)
		{	
    		obj.setLine3(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("line4");
		if(fldEl != null)
		{	
    		obj.setLine4(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("line5");
		if(fldEl != null)
		{	
    		obj.setLine5(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("postCode");
		if(fldEl != null)
		{	
    		obj.setPostCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("phone");
		if(fldEl != null)
		{	
    		obj.setPhone(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("county");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCounty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("fax");
		if(fldEl != null)
		{	
    		obj.setFax(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("updateDate");
		if(fldEl != null)
		{	
    		obj.setUpdateDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("notificationDate");
		if(fldEl != null)
		{	
    		obj.setNotificationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("addressType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAddressType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pCT");
		if(fldEl != null)
		{	
    		obj.setPCT(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("otherphone");
		if(fldEl != null)
		{	
    		obj.setOtherphone(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("areaOfResidence");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAreaOfResidence(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pafkey");
		if(fldEl != null)
		{	
    		obj.setPafkey(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("objectidentifier");
		if(fldEl != null)
		{	
    		obj.setObjectidentifier(new String(fldEl.getTextTrim()));	
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
		fldEl = el.element("pdsUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPdsUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("country");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCountry(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("noFixedAbode");
		if(fldEl != null)
		{	
    		obj.setNoFixedAbode(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("careHome");
		if(fldEl != null)
		{	
    		obj.setCareHome(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	equals:
	*/
public boolean equals(Object obj)
{
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Address other = (Address) obj;
	if (addressType == null)
	{
		if (other.addressType != null)
			return false;
	}
	else if (!addressType.equals(other.addressType))
		return false;
	if (areaOfResidence == null)
	{
		if (other.areaOfResidence != null)
			return false;
	}
	else if (!areaOfResidence.equals(other.areaOfResidence))
		return false;
	if (beffdate == null)
	{
		if (other.beffdate != null)
			return false;
	}
	else if (!beffdate.equals(other.beffdate))
		return false;
	if (beffdatecnf == null)
	{
		if (other.beffdatecnf != null)
			return false;
	}
	else if (!beffdatecnf.equals(other.beffdatecnf))
		return false;
	if (betdate == null)
	{
		if (other.betdate != null)
			return false;
	}
	else if (!betdate.equals(other.betdate))
		return false;
	if (betdatecnf == null)
	{
		if (other.betdatecnf != null)
			return false;
	}
	else if (!betdatecnf.equals(other.betdatecnf))
		return false;
      if (country == null)
  	{
  		if (other.country != null)
  			return false;
  	}
  	else if (!country.equals(other.country))
  		return false;
	if (country== null)
	{
		if (other.county != null)
			return false;
	}
	else if (!county.equals(other.county))
		return false;
	if (description == null)
	{
		if (other.description != null)
			return false;
	}
	if (pdsUpdateMode == null)
	{
		if (other.pdsUpdateMode != null)
			return false;
	}
	else if (!pdsUpdateMode.equals(other.pdsUpdateMode))
		return false;
	else if (!description.equals(other.description))
		return false;
	if (fax == null)
	{
		if (other.fax != null)
			return false;
	}
	else if (!fax.equals(other.fax))
		return false;
	if (line1 == null)
	{
		if (other.line1 != null)
			return false;
	}
	else if (!line1.equals(other.line1))
		return false;
	if (line2 == null)
	{
		if (other.line2 != null)
			return false;
	}
	else if (!line2.equals(other.line2))
		return false;
	if (line3 == null)
	{
		if (other.line3 != null)
			return false;
	}
	else if (!line3.equals(other.line3))
		return false;
	if (line4 == null)
	{
		if (other.line4 != null)
			return false;
	}
	else if (!line4.equals(other.line4))
		return false;
	if (line5 == null)
	{
		if (other.line5 != null)
			return false;
	}
	else if (!line5.equals(other.line5))
		return false;
	if (notificationDate == null)
	{
		if (other.notificationDate != null)
			return false;
	}
	else if (!notificationDate.equals(other.notificationDate))
		return false;
	if (objectidentifier == null)
	{
		if (other.objectidentifier != null)
			return false;
	}
	else if (!objectidentifier.equals(other.objectidentifier))
		return false;
	if (otherphone == null)
	{
		if (other.otherphone != null)
			return false;
	}
	else if (!otherphone.equals(other.otherphone))
		return false;
	if (pCT == null)
	{
		if (other.pCT != null)
			return false;
	}
	else if (!pCT.equals(other.pCT))
		return false;
	if (pafkey == null)
	{
		if (other.pafkey != null)
			return false;
	}
	else if (!pafkey.equals(other.pafkey))
		return false;
	if (phone == null)
	{
		if (other.phone != null)
			return false;
	}
	else if (!phone.equals(other.phone))
		return false;
	if (postCode == null)
	{
		if (other.postCode != null)
			return false;
	}
	else if (!postCode.equals(other.postCode))
		return false;
	if (updateDate == null)
	{
		if (other.updateDate != null)
			return false;
	}
	else if (!updateDate.equals(other.updateDate))
		return false;
	return true;
}

	/**
	hashCode:
	*/
public int hashCode()
{
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((addressType == null) ? 0 : addressType.hashCode());
	result = prime * result + ((areaOfResidence == null) ? 0 : areaOfResidence.hashCode());
	result = prime * result + ((beffdate == null) ? 0 : beffdate.hashCode());
	result = prime * result + ((beffdatecnf == null) ? 0 : beffdatecnf.hashCode());
	result = prime * result + ((betdate == null) ? 0 : betdate.hashCode());
	result = prime * result + ((betdatecnf == null) ? 0 : betdatecnf.hashCode());
	result = prime * result + ((county == null) ? 0 : county.hashCode());
	result = prime * result + ((country== null) ? 0 : country.hashCode());
	result = prime * result + ((pdsUpdateMode== null) ? 0 : pdsUpdateMode.hashCode());
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + ((fax == null) ? 0 : fax.hashCode());
	result = prime * result + ((line1 == null) ? 0 : line1.hashCode());
	result = prime * result + ((line2 == null) ? 0 : line2.hashCode());
	result = prime * result + ((line3 == null) ? 0 : line3.hashCode());
	result = prime * result + ((line4 == null) ? 0 : line4.hashCode());
	result = prime * result + ((line5 == null) ? 0 : line5.hashCode());
	result = prime * result + ((notificationDate == null) ? 0 : notificationDate.hashCode());
	result = prime * result + ((objectidentifier == null) ? 0 : objectidentifier.hashCode());
	result = prime * result + ((otherphone == null) ? 0 : otherphone.hashCode());
	result = prime * result + ((pCT == null) ? 0 : pCT.hashCode());
	result = prime * result + ((pafkey == null) ? 0 : pafkey.hashCode());
	result = prime * result + ((phone == null) ? 0 : phone.hashCode());
	result = prime * result + ((postCode == null) ? 0 : postCode.hashCode());
	result = prime * result + ((updateDate == null) ? 0 : updateDate.hashCode());
	return result;
}

	/**
	toString
	*/
public String toString()
{	
	StringBuffer objStr = new StringBuffer();

	if (line1 != null)
		objStr.append(line1 + "-");
	if (line2 != null)
		objStr.append(line2 + "-");
	if (line3 != null)
		objStr.append(line3 + "-");
	if (line4 != null)
		objStr.append(line4 + "-");
	if (line5 != null)
		objStr.append(line5 + "-");
	if (areaOfResidence != null)
		objStr.append(areaOfResidence.getText() + "-");
	if (postCode != null)
		objStr.append(postCode + "-");
	if (phone != null)
		objStr.append(phone + "-");
	if (county != null)
		objStr.append(county.getText() + "-");
	if (fax != null)
		objStr.append(fax);
	return objStr.toString();
}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Line1 = "line1";
		public static final String Line2 = "line2";
		public static final String Line3 = "line3";
		public static final String Line4 = "line4";
		public static final String Line5 = "line5";
		public static final String PostCode = "postCode";
		public static final String Phone = "phone";
		public static final String County = "county";
		public static final String Fax = "fax";
		public static final String UpdateDate = "updateDate";
		public static final String NotificationDate = "notificationDate";
		public static final String AddressType = "addressType";
		public static final String PCT = "pCT";
		public static final String Otherphone = "otherphone";
		public static final String AreaOfResidence = "areaOfResidence";
		public static final String Pafkey = "pafkey";
		public static final String Description = "description";
		public static final String Objectidentifier = "objectidentifier";
		public static final String Beffdate = "beffdate";
		public static final String Beffdatecnf = "beffdatecnf";
		public static final String Betdate = "betdate";
		public static final String Betdatecnf = "betdatecnf";
		public static final String PdsUpdateMode = "pdsUpdateMode";
		public static final String Country = "country";
		public static final String NoFixedAbode = "noFixedAbode";
		public static final String CareHome = "careHome";
	}
}

