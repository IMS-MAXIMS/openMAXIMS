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
 * @author Sean Nesbitt
 * Generated.
 */


public class PDSBatchTraceParams extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1001100028;
	private static final long serialVersionUID = 1001100028L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** New Style NHS NUmber */
	private String nHSNumber;
	/** Surname */
	private String surname;
	/** Forename */
	private String forename;
	/** Full Date of Birth */
	private java.util.Date dateOfBirth;
	/** Gender */
	private ims.domain.lookups.LookupInstance gender;
	/** Date of Death or Date of Death range From */
	private java.util.Date dateOfDeathFrom;
	/** Death range To */
	private java.util.Date dateOfDeathTo;
	/** Post Code */
	private String postCode;
	/** PAF Key  */
	private String pafKey;
	/** Address Lines */
	private ims.core.patient.domain.objects.PDSAddr addressLines;
	/** GP Practice code */
	private String gpPracticeCode;
	/** Status of batch item */
	private ims.domain.lookups.LookupInstance status;
	/** Reason for failed batch trace/update */
	private String errorReason;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PDSBatchTraceParams (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PDSBatchTraceParams ()
    {
    	super();
    }
    public PDSBatchTraceParams (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.PDSBatchTraceParams.class;
	}


	public String getNHSNumber() {
		return nHSNumber;
	}
	public void setNHSNumber(String nHSNumber) {
		if ( null != nHSNumber && nHSNumber.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nHSNumber. Tried to set value: "+
				nHSNumber);
		}
		this.nHSNumber = nHSNumber;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		if ( null != surname && surname.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for surname. Tried to set value: "+
				surname);
		}
		this.surname = surname;
	}

	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		if ( null != forename && forename.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for forename. Tried to set value: "+
				forename);
		}
		this.forename = forename;
	}

	public java.util.Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(java.util.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public ims.domain.lookups.LookupInstance getGender() {
		return gender;
	}
	public void setGender(ims.domain.lookups.LookupInstance gender) {
		this.gender = gender;
	}

	public java.util.Date getDateOfDeathFrom() {
		return dateOfDeathFrom;
	}
	public void setDateOfDeathFrom(java.util.Date dateOfDeathFrom) {
		this.dateOfDeathFrom = dateOfDeathFrom;
	}

	public java.util.Date getDateOfDeathTo() {
		return dateOfDeathTo;
	}
	public void setDateOfDeathTo(java.util.Date dateOfDeathTo) {
		this.dateOfDeathTo = dateOfDeathTo;
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

	public String getPafKey() {
		return pafKey;
	}
	public void setPafKey(String pafKey) {
		if ( null != pafKey && pafKey.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pafKey. Tried to set value: "+
				pafKey);
		}
		this.pafKey = pafKey;
	}

	public ims.core.patient.domain.objects.PDSAddr getAddressLines() {
		return addressLines;
	}
	public void setAddressLines(ims.core.patient.domain.objects.PDSAddr addressLines) {
		this.addressLines = addressLines;
	}

	public String getGpPracticeCode() {
		return gpPracticeCode;
	}
	public void setGpPracticeCode(String gpPracticeCode) {
		if ( null != gpPracticeCode && gpPracticeCode.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for gpPracticeCode. Tried to set value: "+
				gpPracticeCode);
		}
		this.gpPracticeCode = gpPracticeCode;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public String getErrorReason() {
		return errorReason;
	}
	public void setErrorReason(String errorReason) {
		if ( null != errorReason && errorReason.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for errorReason. Tried to set value: "+
				errorReason);
		}
		this.errorReason = errorReason;
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
		
		auditStr.append("\r\n*nHSNumber* :");
		auditStr.append(nHSNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*surname* :");
		auditStr.append(surname);
	    auditStr.append("; ");
		auditStr.append("\r\n*forename* :");
		auditStr.append(forename);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfBirth* :");
		auditStr.append(dateOfBirth);
	    auditStr.append("; ");
		auditStr.append("\r\n*gender* :");
		if (gender != null)
			auditStr.append(gender.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfDeathFrom* :");
		auditStr.append(dateOfDeathFrom);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfDeathTo* :");
		auditStr.append(dateOfDeathTo);
	    auditStr.append("; ");
		auditStr.append("\r\n*postCode* :");
		auditStr.append(postCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*pafKey* :");
		auditStr.append(pafKey);
	    auditStr.append("; ");
		auditStr.append("\r\n*addressLines* :");
		if (addressLines != null)
		{
			auditStr.append(toShortClassName(addressLines));
				
		    auditStr.append(addressLines.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*gpPracticeCode* :");
		auditStr.append(gpPracticeCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*errorReason* :");
		auditStr.append(errorReason);
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
		
		String keyClassName = "PDSBatchTraceParams";
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
		if (this.getNHSNumber() != null)
		{
			sb.append("<nHSNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNHSNumber().toString()));
			sb.append("</nHSNumber>");		
		}
		if (this.getSurname() != null)
		{
			sb.append("<surname>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSurname().toString()));
			sb.append("</surname>");		
		}
		if (this.getForename() != null)
		{
			sb.append("<forename>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getForename().toString()));
			sb.append("</forename>");		
		}
		if (this.getDateOfBirth() != null)
		{
			sb.append("<dateOfBirth>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOfBirth()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOfBirth>");		
		}
		if (this.getGender() != null)
		{
			sb.append("<gender>");
			sb.append(this.getGender().toXMLString()); 
			sb.append("</gender>");		
		}
		if (this.getDateOfDeathFrom() != null)
		{
			sb.append("<dateOfDeathFrom>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOfDeathFrom()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOfDeathFrom>");		
		}
		if (this.getDateOfDeathTo() != null)
		{
			sb.append("<dateOfDeathTo>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOfDeathTo()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOfDeathTo>");		
		}
		if (this.getPostCode() != null)
		{
			sb.append("<postCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPostCode().toString()));
			sb.append("</postCode>");		
		}
		if (this.getPafKey() != null)
		{
			sb.append("<pafKey>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPafKey().toString()));
			sb.append("</pafKey>");		
		}
		if (this.getAddressLines() != null)
		{
			sb.append("<addressLines>");
			sb.append(this.getAddressLines().toXMLString(domMap)); 	
			sb.append("</addressLines>");		
		}
		if (this.getGpPracticeCode() != null)
		{
			sb.append("<gpPracticeCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGpPracticeCode().toString()));
			sb.append("</gpPracticeCode>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getErrorReason() != null)
		{
			sb.append("<errorReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getErrorReason().toString()));
			sb.append("</errorReason>");		
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
			PDSBatchTraceParams domainObject = getPDSBatchTraceParamsfromXML(itemEl, factory, domMap);

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
			PDSBatchTraceParams domainObject = getPDSBatchTraceParamsfromXML(itemEl, factory, domMap);

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
		
	public static PDSBatchTraceParams getPDSBatchTraceParamsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPDSBatchTraceParamsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PDSBatchTraceParams getPDSBatchTraceParamsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PDSBatchTraceParams.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PDSBatchTraceParams.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PDSBatchTraceParams class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PDSBatchTraceParams)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PDSBatchTraceParams.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PDSBatchTraceParams ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PDSBatchTraceParams)factory.getImportedDomainObject(PDSBatchTraceParams.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PDSBatchTraceParams();
		}
		String keyClassName = "PDSBatchTraceParams";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PDSBatchTraceParams)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PDSBatchTraceParams obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("nHSNumber");
		if(fldEl != null)
		{	
    		obj.setNHSNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("surname");
		if(fldEl != null)
		{	
    		obj.setSurname(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("forename");
		if(fldEl != null)
		{	
    		obj.setForename(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateOfBirth");
		if(fldEl != null)
		{	
    		obj.setDateOfBirth(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("gender");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGender(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateOfDeathFrom");
		if(fldEl != null)
		{	
    		obj.setDateOfDeathFrom(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateOfDeathTo");
		if(fldEl != null)
		{	
    		obj.setDateOfDeathTo(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("postCode");
		if(fldEl != null)
		{	
    		obj.setPostCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pafKey");
		if(fldEl != null)
		{	
    		obj.setPafKey(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("addressLines");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAddressLines(ims.core.patient.domain.objects.PDSAddr.getPDSAddrfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("gpPracticeCode");
		if(fldEl != null)
		{	
    		obj.setGpPracticeCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("errorReason");
		if(fldEl != null)
		{	
    		obj.setErrorReason(new String(fldEl.getTextTrim()));	
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
		public static final String NHSNumber = "nHSNumber";
		public static final String Surname = "surname";
		public static final String Forename = "forename";
		public static final String DateOfBirth = "dateOfBirth";
		public static final String Gender = "gender";
		public static final String DateOfDeathFrom = "dateOfDeathFrom";
		public static final String DateOfDeathTo = "dateOfDeathTo";
		public static final String PostCode = "postCode";
		public static final String PafKey = "pafKey";
		public static final String AddressLines = "addressLines";
		public static final String GpPracticeCode = "gpPracticeCode";
		public static final String Status = "status";
		public static final String ErrorReason = "errorReason";
	}
}

