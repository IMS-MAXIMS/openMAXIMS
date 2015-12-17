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
package ims.edischarge.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class MedicationOnAdmissionAndChanges extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100014;
	private static final long serialVersionUID = 1099100014L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Record Medication On Admission */
	private ims.domain.lookups.LookupInstance recordMedicationOnAdmission;
	/** Medication On Admission */
	private String medicationOnAdmission;
	/** Record Medication Changes */
	private ims.domain.lookups.LookupInstance recordMedicationChanges;
	/** MedicationChanges */
	private String medicationChanges;
	/** is Complete */
	private Boolean isComplete;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public MedicationOnAdmissionAndChanges (Integer id, int ver)
    {
    	super(id, ver);
    }
    public MedicationOnAdmissionAndChanges ()
    {
    	super();
    }
    public MedicationOnAdmissionAndChanges (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.MedicationOnAdmissionAndChanges.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.domain.lookups.LookupInstance getRecordMedicationOnAdmission() {
		return recordMedicationOnAdmission;
	}
	public void setRecordMedicationOnAdmission(ims.domain.lookups.LookupInstance recordMedicationOnAdmission) {
		this.recordMedicationOnAdmission = recordMedicationOnAdmission;
	}

	public String getMedicationOnAdmission() {
		return medicationOnAdmission;
	}
	public void setMedicationOnAdmission(String medicationOnAdmission) {
		this.medicationOnAdmission = medicationOnAdmission;
	}

	public ims.domain.lookups.LookupInstance getRecordMedicationChanges() {
		return recordMedicationChanges;
	}
	public void setRecordMedicationChanges(ims.domain.lookups.LookupInstance recordMedicationChanges) {
		this.recordMedicationChanges = recordMedicationChanges;
	}

	public String getMedicationChanges() {
		return medicationChanges;
	}
	public void setMedicationChanges(String medicationChanges) {
		this.medicationChanges = medicationChanges;
	}

	public Boolean isIsComplete() {
		return isComplete;
	}
	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordMedicationOnAdmission* :");
		if (recordMedicationOnAdmission != null)
			auditStr.append(recordMedicationOnAdmission.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*medicationOnAdmission* :");
		auditStr.append(medicationOnAdmission);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordMedicationChanges* :");
		if (recordMedicationChanges != null)
			auditStr.append(recordMedicationChanges.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*medicationChanges* :");
		auditStr.append(medicationChanges);
	    auditStr.append("; ");
		auditStr.append("\r\n*isComplete* :");
		auditStr.append(isComplete);
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
		
		String keyClassName = "MedicationOnAdmissionAndChanges";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getRecordMedicationOnAdmission() != null)
		{
			sb.append("<recordMedicationOnAdmission>");
			sb.append(this.getRecordMedicationOnAdmission().toXMLString()); 
			sb.append("</recordMedicationOnAdmission>");		
		}
		if (this.getMedicationOnAdmission() != null)
		{
			sb.append("<medicationOnAdmission>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMedicationOnAdmission().toString()));
			sb.append("</medicationOnAdmission>");		
		}
		if (this.getRecordMedicationChanges() != null)
		{
			sb.append("<recordMedicationChanges>");
			sb.append(this.getRecordMedicationChanges().toXMLString()); 
			sb.append("</recordMedicationChanges>");		
		}
		if (this.getMedicationChanges() != null)
		{
			sb.append("<medicationChanges>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMedicationChanges().toString()));
			sb.append("</medicationChanges>");		
		}
		if (this.isIsComplete() != null)
		{
			sb.append("<isComplete>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsComplete().toString()));
			sb.append("</isComplete>");		
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
			MedicationOnAdmissionAndChanges domainObject = getMedicationOnAdmissionAndChangesfromXML(itemEl, factory, domMap);

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
			MedicationOnAdmissionAndChanges domainObject = getMedicationOnAdmissionAndChangesfromXML(itemEl, factory, domMap);

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
		
	public static MedicationOnAdmissionAndChanges getMedicationOnAdmissionAndChangesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMedicationOnAdmissionAndChangesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MedicationOnAdmissionAndChanges getMedicationOnAdmissionAndChangesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MedicationOnAdmissionAndChanges.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MedicationOnAdmissionAndChanges.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MedicationOnAdmissionAndChanges class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MedicationOnAdmissionAndChanges)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MedicationOnAdmissionAndChanges.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MedicationOnAdmissionAndChanges ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (MedicationOnAdmissionAndChanges)factory.getImportedDomainObject(MedicationOnAdmissionAndChanges.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new MedicationOnAdmissionAndChanges();
		}
		String keyClassName = "MedicationOnAdmissionAndChanges";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (MedicationOnAdmissionAndChanges)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MedicationOnAdmissionAndChanges obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordMedicationOnAdmission");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRecordMedicationOnAdmission(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("medicationOnAdmission");
		if(fldEl != null)
		{	
    		obj.setMedicationOnAdmission(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recordMedicationChanges");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRecordMedicationChanges(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("medicationChanges");
		if(fldEl != null)
		{	
    		obj.setMedicationChanges(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isComplete");
		if(fldEl != null)
		{	
    		obj.setIsComplete(new Boolean(fldEl.getTextTrim()));	
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
		public static final String CareContext = "careContext";
		public static final String RecordMedicationOnAdmission = "recordMedicationOnAdmission";
		public static final String MedicationOnAdmission = "medicationOnAdmission";
		public static final String RecordMedicationChanges = "recordMedicationChanges";
		public static final String MedicationChanges = "medicationChanges";
		public static final String IsComplete = "isComplete";
	}
}

