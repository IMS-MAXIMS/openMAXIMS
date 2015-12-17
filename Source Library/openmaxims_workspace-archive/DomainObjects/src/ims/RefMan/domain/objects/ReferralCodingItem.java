/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ReferralCodingItem extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100038;
	private static final long serialVersionUID = 1096100038L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient Procedure */
	private ims.core.clinical.domain.objects.PatientProcedure patientProcedure;
	/** Patient Diagnosis */
	private ims.core.clinical.domain.objects.PatientDiagnosis patientDiagnosis;
	/** OPCS4 */
	private String oPCS4;
	/** ICD10 */
	private String iCD10;
	/** Laterality */
	private ims.domain.lookups.LookupInstance procLaterality;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ReferralCodingItem (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ReferralCodingItem ()
    {
    	super();
    }
    public ReferralCodingItem (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.ReferralCodingItem.class;
	}


	public ims.core.clinical.domain.objects.PatientProcedure getPatientProcedure() {
		return patientProcedure;
	}
	public void setPatientProcedure(ims.core.clinical.domain.objects.PatientProcedure patientProcedure) {
		this.patientProcedure = patientProcedure;
	}

	public ims.core.clinical.domain.objects.PatientDiagnosis getPatientDiagnosis() {
		return patientDiagnosis;
	}
	public void setPatientDiagnosis(ims.core.clinical.domain.objects.PatientDiagnosis patientDiagnosis) {
		this.patientDiagnosis = patientDiagnosis;
	}

	public String getOPCS4() {
		return oPCS4;
	}
	public void setOPCS4(String oPCS4) {
		if ( null != oPCS4 && oPCS4.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for oPCS4. Tried to set value: "+
				oPCS4);
		}
		this.oPCS4 = oPCS4;
	}

	public String getICD10() {
		return iCD10;
	}
	public void setICD10(String iCD10) {
		if ( null != iCD10 && iCD10.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for iCD10. Tried to set value: "+
				iCD10);
		}
		this.iCD10 = iCD10;
	}

	public ims.domain.lookups.LookupInstance getProcLaterality() {
		return procLaterality;
	}
	public void setProcLaterality(ims.domain.lookups.LookupInstance procLaterality) {
		this.procLaterality = procLaterality;
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
		
		auditStr.append("\r\n*patientProcedure* :");
		if (patientProcedure != null)
		{
			auditStr.append(toShortClassName(patientProcedure));
				
		    auditStr.append(patientProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientDiagnosis* :");
		if (patientDiagnosis != null)
		{
			auditStr.append(toShortClassName(patientDiagnosis));
				
		    auditStr.append(patientDiagnosis.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*oPCS4* :");
		auditStr.append(oPCS4);
	    auditStr.append("; ");
		auditStr.append("\r\n*iCD10* :");
		auditStr.append(iCD10);
	    auditStr.append("; ");
		auditStr.append("\r\n*procLaterality* :");
		if (procLaterality != null)
			auditStr.append(procLaterality.getText());
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
		
		String keyClassName = "ReferralCodingItem";
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
		if (this.getPatientProcedure() != null)
		{
			sb.append("<patientProcedure>");
			sb.append(this.getPatientProcedure().toXMLString(domMap)); 	
			sb.append("</patientProcedure>");		
		}
		if (this.getPatientDiagnosis() != null)
		{
			sb.append("<patientDiagnosis>");
			sb.append(this.getPatientDiagnosis().toXMLString(domMap)); 	
			sb.append("</patientDiagnosis>");		
		}
		if (this.getOPCS4() != null)
		{
			sb.append("<oPCS4>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOPCS4().toString()));
			sb.append("</oPCS4>");		
		}
		if (this.getICD10() != null)
		{
			sb.append("<iCD10>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getICD10().toString()));
			sb.append("</iCD10>");		
		}
		if (this.getProcLaterality() != null)
		{
			sb.append("<procLaterality>");
			sb.append(this.getProcLaterality().toXMLString()); 
			sb.append("</procLaterality>");		
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
			ReferralCodingItem domainObject = getReferralCodingItemfromXML(itemEl, factory, domMap);

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
			ReferralCodingItem domainObject = getReferralCodingItemfromXML(itemEl, factory, domMap);

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
		
	public static ReferralCodingItem getReferralCodingItemfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getReferralCodingItemfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ReferralCodingItem getReferralCodingItemfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ReferralCodingItem.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ReferralCodingItem.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ReferralCodingItem class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ReferralCodingItem)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ReferralCodingItem.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ReferralCodingItem ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ReferralCodingItem)factory.getImportedDomainObject(ReferralCodingItem.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ReferralCodingItem();
		}
		String keyClassName = "ReferralCodingItem";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ReferralCodingItem)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ReferralCodingItem obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patientProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientProcedure(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientDiagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientDiagnosis(ims.core.clinical.domain.objects.PatientDiagnosis.getPatientDiagnosisfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("oPCS4");
		if(fldEl != null)
		{	
    		obj.setOPCS4(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("iCD10");
		if(fldEl != null)
		{	
    		obj.setICD10(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procLaterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String PatientProcedure = "patientProcedure";
		public static final String PatientDiagnosis = "patientDiagnosis";
		public static final String OPCS4 = "oPCS4";
		public static final String ICD10 = "iCD10";
		public static final String ProcLaterality = "procLaterality";
	}
}

