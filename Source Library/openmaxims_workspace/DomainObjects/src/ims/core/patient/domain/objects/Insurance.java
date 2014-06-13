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
package ims.core.patient.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class Insurance extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1001100005;
	private static final long serialVersionUID = 1001100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String medicalCardNo;
	private ims.domain.lookups.LookupInstance healthActCategory;
	private String eHICNumber;
	private Integer eHICExpiryDate;
	private ims.domain.lookups.LookupInstance eHICCountry;
	private String eHICInstitution;
	private ims.domain.lookups.LookupInstance medicalCardProved;
	private String eligibilityProof;
	private Integer medicalCardExpiryDate;
    public Insurance (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public Insurance ()
    {
    	super();
		isComponentClass=true;
    }
    public Insurance (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.Insurance.class;
	}


	public String getMedicalCardNo() {
		return medicalCardNo;
	}
	public void setMedicalCardNo(String medicalCardNo) {
		if ( null != medicalCardNo && medicalCardNo.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for medicalCardNo. Tried to set value: "+
				medicalCardNo);
		}
		this.medicalCardNo = medicalCardNo;
	}

	public ims.domain.lookups.LookupInstance getHealthActCategory() {
		return healthActCategory;
	}
	public void setHealthActCategory(ims.domain.lookups.LookupInstance healthActCategory) {
		this.healthActCategory = healthActCategory;
	}

	public String getEHICNumber() {
		return eHICNumber;
	}
	public void setEHICNumber(String eHICNumber) {
		if ( null != eHICNumber && eHICNumber.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for eHICNumber. Tried to set value: "+
				eHICNumber);
		}
		this.eHICNumber = eHICNumber;
	}

	public Integer getEHICExpiryDate() {
		return eHICExpiryDate;
	}
	public void setEHICExpiryDate(Integer eHICExpiryDate) {
		this.eHICExpiryDate = eHICExpiryDate;
	}

	public ims.domain.lookups.LookupInstance getEHICCountry() {
		return eHICCountry;
	}
	public void setEHICCountry(ims.domain.lookups.LookupInstance eHICCountry) {
		this.eHICCountry = eHICCountry;
	}

	public String getEHICInstitution() {
		return eHICInstitution;
	}
	public void setEHICInstitution(String eHICInstitution) {
		if ( null != eHICInstitution && eHICInstitution.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for eHICInstitution. Tried to set value: "+
				eHICInstitution);
		}
		this.eHICInstitution = eHICInstitution;
	}

	public ims.domain.lookups.LookupInstance getMedicalCardProved() {
		return medicalCardProved;
	}
	public void setMedicalCardProved(ims.domain.lookups.LookupInstance medicalCardProved) {
		this.medicalCardProved = medicalCardProved;
	}

	public String getEligibilityProof() {
		return eligibilityProof;
	}
	public void setEligibilityProof(String eligibilityProof) {
		if ( null != eligibilityProof && eligibilityProof.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for eligibilityProof. Tried to set value: "+
				eligibilityProof);
		}
		this.eligibilityProof = eligibilityProof;
	}

	public Integer getMedicalCardExpiryDate() {
		return medicalCardExpiryDate;
	}
	public void setMedicalCardExpiryDate(Integer medicalCardExpiryDate) {
		this.medicalCardExpiryDate = medicalCardExpiryDate;
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
		
		auditStr.append("\r\n*medicalCardNo* :");
		auditStr.append(medicalCardNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*healthActCategory* :");
		if (healthActCategory != null)
			auditStr.append(healthActCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*eHICNumber* :");
		auditStr.append(eHICNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*eHICExpiryDate* :");
		auditStr.append(eHICExpiryDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*eHICCountry* :");
		if (eHICCountry != null)
			auditStr.append(eHICCountry.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*eHICInstitution* :");
		auditStr.append(eHICInstitution);
	    auditStr.append("; ");
		auditStr.append("\r\n*medicalCardProved* :");
		if (medicalCardProved != null)
			auditStr.append(medicalCardProved.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*eligibilityProof* :");
		auditStr.append(eligibilityProof);
	    auditStr.append("; ");
		auditStr.append("\r\n*medicalCardExpiryDate* :");
		auditStr.append(medicalCardExpiryDate);
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
		if (this.getMedicalCardNo() != null)
		{
			sb.append("<medicalCardNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMedicalCardNo().toString()));
			sb.append("</medicalCardNo>");		
		}
		if (this.getHealthActCategory() != null)
		{
			sb.append("<healthActCategory>");
			sb.append(this.getHealthActCategory().toXMLString()); 
			sb.append("</healthActCategory>");		
		}
		if (this.getEHICNumber() != null)
		{
			sb.append("<eHICNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEHICNumber().toString()));
			sb.append("</eHICNumber>");		
		}
		if (this.getEHICExpiryDate() != null)
		{
			sb.append("<eHICExpiryDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEHICExpiryDate().toString()));
			sb.append("</eHICExpiryDate>");		
		}
		if (this.getEHICCountry() != null)
		{
			sb.append("<eHICCountry>");
			sb.append(this.getEHICCountry().toXMLString()); 
			sb.append("</eHICCountry>");		
		}
		if (this.getEHICInstitution() != null)
		{
			sb.append("<eHICInstitution>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEHICInstitution().toString()));
			sb.append("</eHICInstitution>");		
		}
		if (this.getMedicalCardProved() != null)
		{
			sb.append("<medicalCardProved>");
			sb.append(this.getMedicalCardProved().toXMLString()); 
			sb.append("</medicalCardProved>");		
		}
		if (this.getEligibilityProof() != null)
		{
			sb.append("<eligibilityProof>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEligibilityProof().toString()));
			sb.append("</eligibilityProof>");		
		}
		if (this.getMedicalCardExpiryDate() != null)
		{
			sb.append("<medicalCardExpiryDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMedicalCardExpiryDate().toString()));
			sb.append("</medicalCardExpiryDate>");		
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
			Insurance domainObject = getInsurancefromXML(itemEl, factory, domMap);

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
			Insurance domainObject = getInsurancefromXML(itemEl, factory, domMap);

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
		
	public static Insurance getInsurancefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getInsurancefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Insurance getInsurancefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Insurance.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Insurance.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Insurance class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Insurance)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Insurance.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Insurance ret = null;
		if (ret == null)
		{
			ret = new Insurance();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Insurance obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("medicalCardNo");
		if(fldEl != null)
		{	
    		obj.setMedicalCardNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("healthActCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHealthActCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("eHICNumber");
		if(fldEl != null)
		{	
    		obj.setEHICNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("eHICExpiryDate");
		if(fldEl != null)
		{	
    		obj.setEHICExpiryDate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("eHICCountry");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEHICCountry(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("eHICInstitution");
		if(fldEl != null)
		{	
    		obj.setEHICInstitution(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("medicalCardProved");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMedicalCardProved(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("eligibilityProof");
		if(fldEl != null)
		{	
    		obj.setEligibilityProof(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("medicalCardExpiryDate");
		if(fldEl != null)
		{	
    		obj.setMedicalCardExpiryDate(new Integer(fldEl.getTextTrim()));	
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
		if (null == obj) {
			return false;
		}
		if (!(obj instanceof ims.core.patient.domain.objects.Insurance)) 
		{
			return false;
		}
		ims.core.patient.domain.objects.Insurance tmp = (ims.core.patient.domain.objects.Insurance)obj;
		
		if ((medicalCardNo!= null && tmp.getMedicalCardNo() != null) && !medicalCardNo.equals(tmp.getMedicalCardNo())) return false;
		if ((medicalCardNo!= null && tmp.getMedicalCardNo() == null) || (medicalCardNo== null && tmp.getMedicalCardNo() != null)) return false;

		if ((healthActCategory!= null && tmp.getHealthActCategory() != null) && !healthActCategory.equals(tmp.getHealthActCategory())) return false;
		if ((healthActCategory!= null && tmp.getHealthActCategory() == null) || (healthActCategory== null && tmp.getHealthActCategory() != null)) return false;

		return true;
	}



	/**
	hashCode:
	*/
	public int hashCode()
	{
		int hash = 0;

		if (medicalCardNo!= null) hash += medicalCardNo.hashCode();
		if (healthActCategory!= null) hash += healthActCategory.hashCode();

		return hash;
	}




	/**
	toString
	*/
	public String toString()
	{	
		StringBuffer objStr = new StringBuffer();
	
		if (healthActCategory != null)
			objStr.append(healthActCategory.getText() + "-");
		objStr.append(medicalCardNo);
		return objStr.toString();
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String MedicalCardNo = "medicalCardNo";
		public static final String HealthActCategory = "healthActCategory";
		public static final String EHICNumber = "eHICNumber";
		public static final String EHICExpiryDate = "eHICExpiryDate";
		public static final String EHICCountry = "eHICCountry";
		public static final String EHICInstitution = "eHICInstitution";
		public static final String MedicalCardProved = "medicalCardProved";
		public static final String EligibilityProof = "eligibilityProof";
		public static final String MedicalCardExpiryDate = "medicalCardExpiryDate";
	}
}

