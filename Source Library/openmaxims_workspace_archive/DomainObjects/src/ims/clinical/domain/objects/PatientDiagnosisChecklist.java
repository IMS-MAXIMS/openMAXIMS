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
package ims.clinical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class PatientDiagnosisChecklist extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100052;
	private static final long serialVersionUID = 1072100052L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Patient Positive Diagnosis
	  * Collection of ims.core.clinical.domain.objects.PatientDiagnosis.
	  */
	private java.util.Set presentDiagnoses;
	/** Absent/Unknown Diagnosis
	  * Collection of ims.clinical.domain.objects.PatientAbsentDiagnosis.
	  */
	private java.util.Set otherDiagnoses;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientDiagnosisChecklist (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientDiagnosisChecklist ()
    {
    	super();
    }
    public PatientDiagnosisChecklist (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.PatientDiagnosisChecklist.class;
	}


	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public java.util.Set getPresentDiagnoses() {
		if ( null == presentDiagnoses ) {
			presentDiagnoses = new java.util.HashSet();
		}
		return presentDiagnoses;
	}
	public void setPresentDiagnoses(java.util.Set paramValue) {
		this.presentDiagnoses = paramValue;
	}

	public java.util.Set getOtherDiagnoses() {
		if ( null == otherDiagnoses ) {
			otherDiagnoses = new java.util.HashSet();
		}
		return otherDiagnoses;
	}
	public void setOtherDiagnoses(java.util.Set paramValue) {
		this.otherDiagnoses = paramValue;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
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
		
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*presentDiagnoses* :");
		if (presentDiagnoses != null)
		{
			java.util.Iterator it2 = presentDiagnoses.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientDiagnosis obj = (ims.core.clinical.domain.objects.PatientDiagnosis)it2.next();
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
		auditStr.append("\r\n*otherDiagnoses* :");
		if (otherDiagnoses != null)
		{
			java.util.Iterator it3 = otherDiagnoses.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.PatientAbsentDiagnosis obj = (ims.clinical.domain.objects.PatientAbsentDiagnosis)it3.next();
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
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
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
		
		String keyClassName = "PatientDiagnosisChecklist";
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
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getPresentDiagnoses() != null)
		{
			if (this.getPresentDiagnoses().size() > 0 )
			{
			sb.append("<presentDiagnoses>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPresentDiagnoses(), domMap));
			sb.append("</presentDiagnoses>");		
			}
		}
		if (this.getOtherDiagnoses() != null)
		{
			if (this.getOtherDiagnoses().size() > 0 )
			{
			sb.append("<otherDiagnoses>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOtherDiagnoses(), domMap));
			sb.append("</otherDiagnoses>");		
			}
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
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
			PatientDiagnosisChecklist domainObject = getPatientDiagnosisChecklistfromXML(itemEl, factory, domMap);

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
			PatientDiagnosisChecklist domainObject = getPatientDiagnosisChecklistfromXML(itemEl, factory, domMap);

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
		
	public static PatientDiagnosisChecklist getPatientDiagnosisChecklistfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientDiagnosisChecklistfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientDiagnosisChecklist getPatientDiagnosisChecklistfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientDiagnosisChecklist.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientDiagnosisChecklist.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientDiagnosisChecklist class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientDiagnosisChecklist)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientDiagnosisChecklist.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientDiagnosisChecklist ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientDiagnosisChecklist)factory.getImportedDomainObject(PatientDiagnosisChecklist.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientDiagnosisChecklist();
		}
		String keyClassName = "PatientDiagnosisChecklist";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientDiagnosisChecklist)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientDiagnosisChecklist obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("presentDiagnoses");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPresentDiagnoses(ims.core.clinical.domain.objects.PatientDiagnosis.fromSetXMLString(fldEl, factory, obj.getPresentDiagnoses(), domMap));
		}
		fldEl = el.element("otherDiagnoses");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setOtherDiagnoses(ims.clinical.domain.objects.PatientAbsentDiagnosis.fromSetXMLString(fldEl, factory, obj.getOtherDiagnoses(), domMap));
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "presentDiagnoses"
		, "otherDiagnoses"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String PresentDiagnoses = "presentDiagnoses";
		public static final String OtherDiagnoses = "otherDiagnoses";
		public static final String AuthoringInformation = "authoringInformation";
	}
}

