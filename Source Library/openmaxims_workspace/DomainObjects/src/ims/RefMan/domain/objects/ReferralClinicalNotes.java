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


public class ReferralClinicalNotes extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100058;
	private static final long serialVersionUID = 1096100058L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Cats Referral */
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** ClinicalNotes
	  * Collection of ims.RefMan.domain.objects.AppointmentClinicalNotes.
	  */
	private java.util.Set clinicalNotes;
	/** Diagnosis
	  * Collection of ims.RefMan.domain.objects.PatientDiagnosisApptDetail.
	  */
	private java.util.Set diagnosis;
	/** Procedures
	  * Collection of ims.RefMan.domain.objects.PatientProcedureApptDetail.
	  */
	private java.util.Set procedures;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ReferralClinicalNotes (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ReferralClinicalNotes ()
    {
    	super();
    }
    public ReferralClinicalNotes (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.ReferralClinicalNotes.class;
	}


	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public java.util.Set getClinicalNotes() {
		if ( null == clinicalNotes ) {
			clinicalNotes = new java.util.HashSet();
		}
		return clinicalNotes;
	}
	public void setClinicalNotes(java.util.Set paramValue) {
		this.clinicalNotes = paramValue;
	}

	public java.util.Set getDiagnosis() {
		if ( null == diagnosis ) {
			diagnosis = new java.util.HashSet();
		}
		return diagnosis;
	}
	public void setDiagnosis(java.util.Set paramValue) {
		this.diagnosis = paramValue;
	}

	public java.util.Set getProcedures() {
		if ( null == procedures ) {
			procedures = new java.util.HashSet();
		}
		return procedures;
	}
	public void setProcedures(java.util.Set paramValue) {
		this.procedures = paramValue;
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
		
		auditStr.append("\r\n*catsReferral* :");
		if (catsReferral != null)
		{
			auditStr.append(toShortClassName(catsReferral));
				
		    auditStr.append(catsReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalNotes* :");
		if (clinicalNotes != null)
		{
			java.util.Iterator it2 = clinicalNotes.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.AppointmentClinicalNotes obj = (ims.RefMan.domain.objects.AppointmentClinicalNotes)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosis* :");
		if (diagnosis != null)
		{
			java.util.Iterator it3 = diagnosis.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.PatientDiagnosisApptDetail obj = (ims.RefMan.domain.objects.PatientDiagnosisApptDetail)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedures* :");
		if (procedures != null)
		{
			java.util.Iterator it4 = procedures.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.PatientProcedureApptDetail obj = (ims.RefMan.domain.objects.PatientProcedureApptDetail)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
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
		
		String keyClassName = "ReferralClinicalNotes";
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
		if (this.getCatsReferral() != null)
		{
			sb.append("<catsReferral>");
			sb.append(this.getCatsReferral().toXMLString(domMap)); 	
			sb.append("</catsReferral>");		
		}
		if (this.getClinicalNotes() != null)
		{
			if (this.getClinicalNotes().size() > 0 )
			{
			sb.append("<clinicalNotes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getClinicalNotes(), domMap));
			sb.append("</clinicalNotes>");		
			}
		}
		if (this.getDiagnosis() != null)
		{
			if (this.getDiagnosis().size() > 0 )
			{
			sb.append("<diagnosis>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDiagnosis(), domMap));
			sb.append("</diagnosis>");		
			}
		}
		if (this.getProcedures() != null)
		{
			if (this.getProcedures().size() > 0 )
			{
			sb.append("<procedures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProcedures(), domMap));
			sb.append("</procedures>");		
			}
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
			ReferralClinicalNotes domainObject = getReferralClinicalNotesfromXML(itemEl, factory, domMap);

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
			ReferralClinicalNotes domainObject = getReferralClinicalNotesfromXML(itemEl, factory, domMap);

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
		
	public static ReferralClinicalNotes getReferralClinicalNotesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getReferralClinicalNotesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ReferralClinicalNotes getReferralClinicalNotesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ReferralClinicalNotes.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ReferralClinicalNotes.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ReferralClinicalNotes class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ReferralClinicalNotes)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ReferralClinicalNotes.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ReferralClinicalNotes ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ReferralClinicalNotes)factory.getImportedDomainObject(ReferralClinicalNotes.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ReferralClinicalNotes();
		}
		String keyClassName = "ReferralClinicalNotes";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ReferralClinicalNotes)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ReferralClinicalNotes obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalNotes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setClinicalNotes(ims.RefMan.domain.objects.AppointmentClinicalNotes.fromSetXMLString(fldEl, factory, obj.getClinicalNotes(), domMap));
		}
		fldEl = el.element("diagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDiagnosis(ims.RefMan.domain.objects.PatientDiagnosisApptDetail.fromSetXMLString(fldEl, factory, obj.getDiagnosis(), domMap));
		}
		fldEl = el.element("procedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setProcedures(ims.RefMan.domain.objects.PatientProcedureApptDetail.fromSetXMLString(fldEl, factory, obj.getProcedures(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "clinicalNotes"
		, "diagnosis"
		, "procedures"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CatsReferral = "catsReferral";
		public static final String ClinicalNotes = "clinicalNotes";
		public static final String Diagnosis = "diagnosis";
		public static final String Procedures = "procedures";
	}
}

