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


public class PatientId extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1001100004;
	private static final long serialVersionUID = 1001100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance type;
	private String value;
	/** Default 0, used for NHS Number verification */
	private Boolean verified;
	/** Flag to indicate whether this id is from a Merged Patient */
	private Boolean merged;
	/** Default 0 */
	private Integer duplicateNHSNum;
	/** The date from which the alternative identifier has been indicated to be effective. */
	private java.util.Date beffdate;
	/** Beffdate confirmed */
	private Boolean beffdatecnf;
	/** The date until which the alternative identifier has been indicated to be effective. */
	private java.util.Date betdate;
	/** Betdate confirmed */
	private Boolean betdatecnf;
	/** The NHS Number Status indicator of the Patient (e.g. 01-Number Present and Verified)  */
	private ims.domain.lookups.LookupInstance nhsNumberStatus;
    public PatientId (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public PatientId ()
    {
    	super();
		isComponentClass=true;
    }
    public PatientId (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.PatientId.class;
	}


	public ims.domain.lookups.LookupInstance getType() {
		return type;
	}
	public void setType(ims.domain.lookups.LookupInstance type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		if ( null != value && value.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for value. Tried to set value: "+
				value);
		}
		this.value = value;
	}

	public Boolean isVerified() {
		return verified;
	}
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public Boolean isMerged() {
		return merged;
	}
	public void setMerged(Boolean merged) {
		this.merged = merged;
	}

	public Integer getDuplicateNHSNum() {
		return duplicateNHSNum;
	}
	public void setDuplicateNHSNum(Integer duplicateNHSNum) {
		this.duplicateNHSNum = duplicateNHSNum;
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

	public ims.domain.lookups.LookupInstance getNhsNumberStatus() {
		return nhsNumberStatus;
	}
	public void setNhsNumberStatus(ims.domain.lookups.LookupInstance nhsNumberStatus) {
		this.nhsNumberStatus = nhsNumberStatus;
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
	// method generated based on 'type_val_idx' unique index.
	public static boolean recordExistForTypeAndValueAndVerifiedAndDuplicateNHSNum(ims.domain.ILightweightDomainFactory factory,
		 ims.domain.lookups.LookupInstance type
	,
	 String value
	,
	 Boolean verified
	,
	 Integer duplicateNHSNum
	)	
	{
		return recordExistForTypeAndValueAndVerifiedAndDuplicateNHSNum(factory, type, value, verified, duplicateNHSNum, null);
	}	

	// method generated based on 'type_val_idx' unique index.
	public static boolean recordExistForTypeAndValueAndVerifiedAndDuplicateNHSNum(ims.domain.ILightweightDomainFactory factory,
		 ims.domain.lookups.LookupInstance type
	,
	 String value
	,
	 Boolean verified
	,
	 Integer duplicateNHSNum
	, Integer recordId)	
	{
		String[] names = new String[4];
		Object[] values = new Object[4];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from PatientId c where ");
		hql.append(" c.type = :type ");
		names[0] = "type";
		values[0] = type;		
		hql.append(" and "); 
		hql.append(" c.value = :value ");
		names[1] = "value";
		values[1] = value;		
		hql.append(" and "); 
		hql.append(" c.verified = :verified ");
		names[2] = "verified";
		values[2] = verified;		
		hql.append(" and "); 
		hql.append(" c.duplicateNHSNum = :duplicateNHSNum ");
		names[3] = "duplicateNHSNum";
		values[3] = duplicateNHSNum;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'type_val_idx' unique index.
	public static PatientId getRecordByTypeAndValueAndVerifiedAndDuplicateNHSNum(ims.domain.ILightweightDomainFactory factory,
	 ims.domain.lookups.LookupInstance type
	,
	 String value
	,
	 Boolean verified
	,
	 Integer duplicateNHSNum
	)
	{
		String[] names = new String[4];
		Object[] values = new Object[4];
		StringBuffer hql = new StringBuffer();
		hql.append("from PatientId c where ");
		hql.append(" c.type = :type ");
		names[0] = "type";
		values[0] = type;		
		hql.append(" and "); 
		hql.append(" c.value = :value ");
		names[1] = "value";
		values[1] = value;		
		hql.append(" and "); 
		hql.append(" c.verified = :verified ");
		names[2] = "verified";
		values[2] = verified;		
		hql.append(" and "); 
		hql.append(" c.duplicateNHSNum = :duplicateNHSNum ");
		names[3] = "duplicateNHSNum";
		values[3] = duplicateNHSNum;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (PatientId)l.get(0);
	}

	public static PatientId getPatientIdFromtype_val_idx(ims.domain.ILightweightDomainFactory factory,
	 ims.domain.lookups.LookupInstance type
	,
	 String value
	,
	 Boolean verified
	,
	 Integer duplicateNHSNum
	)
	{
		String[] names = new String[4];
		Object[] values = new Object[4];
		StringBuffer hql = new StringBuffer();
		hql.append("from PatientId c where ");
		hql.append(" c.type = :type ");
		names[0] = "type";
		values[0] = type;		
		hql.append(" and "); 
		hql.append(" c.value = :value ");
		names[1] = "value";
		values[1] = value;		
		hql.append(" and "); 
		hql.append(" c.verified = :verified ");
		names[2] = "verified";
		values[2] = verified;		
		hql.append(" and "); 
		hql.append(" c.duplicateNHSNum = :duplicateNHSNum ");
		names[3] = "duplicateNHSNum";
		values[3] = duplicateNHSNum;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (PatientId)l.get(0);
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
		
		auditStr.append("\r\n*type* :");
		if (type != null)
			auditStr.append(type.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*value* :");
		auditStr.append(value);
	    auditStr.append("; ");
		auditStr.append("\r\n*verified* :");
		auditStr.append(verified);
	    auditStr.append("; ");
		auditStr.append("\r\n*merged* :");
		auditStr.append(merged);
	    auditStr.append("; ");
		auditStr.append("\r\n*duplicateNHSNum* :");
		auditStr.append(duplicateNHSNum);
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
		auditStr.append("\r\n*nhsNumberStatus* :");
		if (nhsNumberStatus != null)
			auditStr.append(nhsNumberStatus.getText());
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
		if (this.getType() != null)
		{
			sb.append("<type>");
			sb.append(this.getType().toXMLString()); 
			sb.append("</type>");		
		}
		if (this.getValue() != null)
		{
			sb.append("<value>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getValue().toString()));
			sb.append("</value>");		
		}
		if (this.isVerified() != null)
		{
			sb.append("<verified>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isVerified().toString()));
			sb.append("</verified>");		
		}
		if (this.isMerged() != null)
		{
			sb.append("<merged>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMerged().toString()));
			sb.append("</merged>");		
		}
		if (this.getDuplicateNHSNum() != null)
		{
			sb.append("<duplicateNHSNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuplicateNHSNum().toString()));
			sb.append("</duplicateNHSNum>");		
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
		if (this.getNhsNumberStatus() != null)
		{
			sb.append("<nhsNumberStatus>");
			sb.append(this.getNhsNumberStatus().toXMLString()); 
			sb.append("</nhsNumberStatus>");		
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
			PatientId domainObject = getPatientIdfromXML(itemEl, factory, domMap);

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
			PatientId domainObject = getPatientIdfromXML(itemEl, factory, domMap);

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
		
	public static PatientId getPatientIdfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientIdfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientId getPatientIdfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientId.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientId.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientId class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientId)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientId.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientId ret = null;
		if (ret == null)
		{
			ret = new PatientId();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientId obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("type");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("value");
		if(fldEl != null)
		{	
    		obj.setValue(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("verified");
		if(fldEl != null)
		{	
    		obj.setVerified(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("merged");
		if(fldEl != null)
		{	
    		obj.setMerged(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("duplicateNHSNum");
		if(fldEl != null)
		{	
    		obj.setDuplicateNHSNum(new Integer(fldEl.getTextTrim()));	
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
		fldEl = el.element("nhsNumberStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNhsNumberStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
	PatientId other = (PatientId) obj;
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
	if (duplicateNHSNum == null)
	{
		if (other.duplicateNHSNum != null)
			return false;
	}
	if (nhsNumberStatus == null)
	{
		if (other.nhsNumberStatus != null)
			return false;
	}
	else if (!nhsNumberStatus.equals(other.nhsNumberStatus))
		return false;
	else if (!duplicateNHSNum.equals(other.duplicateNHSNum))
		return false;
	if (merged == null)
	{
		if (other.merged != null)
			return false;
	}
	else if (!merged.equals(other.merged))
		return false;
	if (type == null)
	{
		if (other.type != null)
			return false;
	}
	else if (!type.equals(other.type))
		return false;
	if (value == null)
	{
		if (other.value != null)
			return false;
	}
	else if (!value.equals(other.value))
		return false;
	if (verified == null)
	{
		if (other.verified != null)
			return false;
	}
	else if (!verified.equals(other.verified))
		return false;
	return true;
}

	/**
	hashcode:
	*/
public int hashCode()
{
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((beffdate == null) ? 0 : beffdate.hashCode());
	result = prime * result + ((beffdatecnf == null) ? 0 : beffdatecnf.hashCode());
	result = prime * result + ((betdate == null) ? 0 : betdate.hashCode());
	result = prime * result + ((betdatecnf == null) ? 0 : betdatecnf.hashCode());
	result = prime * result + ((nhsNumberStatus== null) ? 0 : nhsNumberStatus.hashCode());
	result = prime * result + ((duplicateNHSNum == null) ? 0 : duplicateNHSNum.hashCode());
	result = prime * result + ((merged == null) ? 0 : merged.hashCode());
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	result = prime * result + ((value == null) ? 0 : value.hashCode());
	result = prime * result + ((verified == null) ? 0 : verified.hashCode());
	return result;
}

	/**
	toString
	*/
public String toString()
	{	
		StringBuffer objStr = new StringBuffer();
	
		if (type != null)
			objStr.append(type.getText() + "-");
		objStr.append(value);
            if (verified != null)
                  objStr.append(":" + verified);
		return objStr.toString();
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Type = "type";
		public static final String Value = "value";
		public static final String Verified = "verified";
		public static final String Merged = "merged";
		public static final String DuplicateNHSNum = "duplicateNHSNum";
		public static final String Beffdate = "beffdate";
		public static final String Beffdatecnf = "beffdatecnf";
		public static final String Betdate = "betdate";
		public static final String Betdatecnf = "betdatecnf";
		public static final String NhsNumberStatus = "nhsNumberStatus";
	}
}

