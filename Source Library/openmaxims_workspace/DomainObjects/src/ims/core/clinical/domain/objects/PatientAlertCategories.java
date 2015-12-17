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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PatientAlertCategories extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100137;
	private static final long serialVersionUID = 1003100137L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** The Patient has active alerts of type category 1 */
	private Boolean hasAlertCategory1;
	/** The Patient has active alerts of type category 2 */
	private Boolean hasAlertCategory2;
	/** The Patient has active alerts of type category 3 */
	private Boolean hasAlertCategory3;
	/** The Patient has active alerts of type category 4 */
	private Boolean hasAlertCategory4;
	/** The Patient has active other alerts */
	private Boolean hasAlertCategoryOther;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientAlertCategories (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientAlertCategories ()
    {
    	super();
    }
    public PatientAlertCategories (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientAlertCategories.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public Boolean isHasAlertCategory1() {
		return hasAlertCategory1;
	}
	public void setHasAlertCategory1(Boolean hasAlertCategory1) {
		this.hasAlertCategory1 = hasAlertCategory1;
	}

	public Boolean isHasAlertCategory2() {
		return hasAlertCategory2;
	}
	public void setHasAlertCategory2(Boolean hasAlertCategory2) {
		this.hasAlertCategory2 = hasAlertCategory2;
	}

	public Boolean isHasAlertCategory3() {
		return hasAlertCategory3;
	}
	public void setHasAlertCategory3(Boolean hasAlertCategory3) {
		this.hasAlertCategory3 = hasAlertCategory3;
	}

	public Boolean isHasAlertCategory4() {
		return hasAlertCategory4;
	}
	public void setHasAlertCategory4(Boolean hasAlertCategory4) {
		this.hasAlertCategory4 = hasAlertCategory4;
	}

	public Boolean isHasAlertCategoryOther() {
		return hasAlertCategoryOther;
	}
	public void setHasAlertCategoryOther(Boolean hasAlertCategoryOther) {
		this.hasAlertCategoryOther = hasAlertCategoryOther;
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
	// method generated based on 'ponrpatient_idx' unique index.
	public static boolean recordExistForPatient(ims.domain.ILightweightDomainFactory factory,
		 ims.core.patient.domain.objects.Patient patient
	)	
	{
		return recordExistForPatient(factory, patient, null);
	}	

	// method generated based on 'ponrpatient_idx' unique index.
	public static boolean recordExistForPatient(ims.domain.ILightweightDomainFactory factory,
		 ims.core.patient.domain.objects.Patient patient
	, Integer recordId)	
	{
		String[] names = new String[1];
		Object[] values = new Object[1];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from PatientAlertCategories c where ");
		hql.append(" c.patient = :patient ");
		names[0] = "patient";
		values[0] = patient;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'ponrpatient_idx' unique index.
	public static PatientAlertCategories getRecordByPatient(ims.domain.ILightweightDomainFactory factory,
	 ims.core.patient.domain.objects.Patient patient
	)
	{
		String[] names = new String[1];
		Object[] values = new Object[1];
		StringBuffer hql = new StringBuffer();
		hql.append("from PatientAlertCategories c where ");
		hql.append(" c.patient = :patient ");
		names[0] = "patient";
		values[0] = patient;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (PatientAlertCategories)l.get(0);
	}

	public static PatientAlertCategories getPatientAlertCategoriesFromponrpatient_idx(ims.domain.ILightweightDomainFactory factory,
	 ims.core.patient.domain.objects.Patient patient
	)
	{
		String[] names = new String[1];
		Object[] values = new Object[1];
		StringBuffer hql = new StringBuffer();
		hql.append("from PatientAlertCategories c where ");
		hql.append(" c.patient = :patient ");
		names[0] = "patient";
		values[0] = patient;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (PatientAlertCategories)l.get(0);
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
		
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasAlertCategory1* :");
		auditStr.append(hasAlertCategory1);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasAlertCategory2* :");
		auditStr.append(hasAlertCategory2);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasAlertCategory3* :");
		auditStr.append(hasAlertCategory3);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasAlertCategory4* :");
		auditStr.append(hasAlertCategory4);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasAlertCategoryOther* :");
		auditStr.append(hasAlertCategoryOther);
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
		
		String keyClassName = "PatientAlertCategories";
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
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.isHasAlertCategory1() != null)
		{
			sb.append("<hasAlertCategory1>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasAlertCategory1().toString()));
			sb.append("</hasAlertCategory1>");		
		}
		if (this.isHasAlertCategory2() != null)
		{
			sb.append("<hasAlertCategory2>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasAlertCategory2().toString()));
			sb.append("</hasAlertCategory2>");		
		}
		if (this.isHasAlertCategory3() != null)
		{
			sb.append("<hasAlertCategory3>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasAlertCategory3().toString()));
			sb.append("</hasAlertCategory3>");		
		}
		if (this.isHasAlertCategory4() != null)
		{
			sb.append("<hasAlertCategory4>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasAlertCategory4().toString()));
			sb.append("</hasAlertCategory4>");		
		}
		if (this.isHasAlertCategoryOther() != null)
		{
			sb.append("<hasAlertCategoryOther>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasAlertCategoryOther().toString()));
			sb.append("</hasAlertCategoryOther>");		
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
			PatientAlertCategories domainObject = getPatientAlertCategoriesfromXML(itemEl, factory, domMap);

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
			PatientAlertCategories domainObject = getPatientAlertCategoriesfromXML(itemEl, factory, domMap);

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
		
	public static PatientAlertCategories getPatientAlertCategoriesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientAlertCategoriesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientAlertCategories getPatientAlertCategoriesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientAlertCategories.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientAlertCategories.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientAlertCategories class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientAlertCategories)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientAlertCategories.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientAlertCategories ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientAlertCategories)factory.getImportedDomainObject(PatientAlertCategories.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientAlertCategories();
		}
		String keyClassName = "PatientAlertCategories";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientAlertCategories)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientAlertCategories obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hasAlertCategory1");
		if(fldEl != null)
		{	
    		obj.setHasAlertCategory1(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasAlertCategory2");
		if(fldEl != null)
		{	
    		obj.setHasAlertCategory2(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasAlertCategory3");
		if(fldEl != null)
		{	
    		obj.setHasAlertCategory3(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasAlertCategory4");
		if(fldEl != null)
		{	
    		obj.setHasAlertCategory4(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasAlertCategoryOther");
		if(fldEl != null)
		{	
    		obj.setHasAlertCategoryOther(new Boolean(fldEl.getTextTrim()));	
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
		public static final String Patient = "patient";
		public static final String HasAlertCategory1 = "hasAlertCategory1";
		public static final String HasAlertCategory2 = "hasAlertCategory2";
		public static final String HasAlertCategory3 = "hasAlertCategory3";
		public static final String HasAlertCategory4 = "hasAlertCategory4";
		public static final String HasAlertCategoryOther = "hasAlertCategoryOther";
	}
}

