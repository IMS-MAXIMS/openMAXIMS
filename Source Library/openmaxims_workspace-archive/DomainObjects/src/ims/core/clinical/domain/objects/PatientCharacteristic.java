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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class PatientCharacteristic extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100027;
	private static final long serialVersionUID = 1003100027L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Characterestic type */
	private ims.domain.lookups.LookupInstance characteresticType;
	/** ImplantedDevice */
	private String implantedDevice;
	/** InsertionProcedure */
	private ims.core.clinical.domain.objects.PatientProcedure insertionProcedure;
	/** RemovalProcedure */
	private ims.core.clinical.domain.objects.PatientProcedure removalProcedure;
	/** IsRemoved - Boolean */
	private Boolean isRemoved;
	/** DateInserted */
	private java.util.Date dateInserted;
	/** DateRemoved */
	private java.util.Date dateRemoved;
	/** Active Flag to facilitate erroneous user entry */
	private Boolean isActive;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientCharacteristic (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientCharacteristic ()
    {
    	super();
    }
    public PatientCharacteristic (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientCharacteristic.class;
	}


	public ims.domain.lookups.LookupInstance getCharacteresticType() {
		return characteresticType;
	}
	public void setCharacteresticType(ims.domain.lookups.LookupInstance characteresticType) {
		this.characteresticType = characteresticType;
	}

	public String getImplantedDevice() {
		return implantedDevice;
	}
	public void setImplantedDevice(String implantedDevice) {
		if ( null != implantedDevice && implantedDevice.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for implantedDevice. Tried to set value: "+
				implantedDevice);
		}
		this.implantedDevice = implantedDevice;
	}

	public ims.core.clinical.domain.objects.PatientProcedure getInsertionProcedure() {
		return insertionProcedure;
	}
	public void setInsertionProcedure(ims.core.clinical.domain.objects.PatientProcedure insertionProcedure) {
		this.insertionProcedure = insertionProcedure;
	}

	public ims.core.clinical.domain.objects.PatientProcedure getRemovalProcedure() {
		return removalProcedure;
	}
	public void setRemovalProcedure(ims.core.clinical.domain.objects.PatientProcedure removalProcedure) {
		this.removalProcedure = removalProcedure;
	}

	public Boolean isIsRemoved() {
		return isRemoved;
	}
	public void setIsRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public java.util.Date getDateInserted() {
		return dateInserted;
	}
	public void setDateInserted(java.util.Date dateInserted) {
		this.dateInserted = dateInserted;
	}

	public java.util.Date getDateRemoved() {
		return dateRemoved;
	}
	public void setDateRemoved(java.util.Date dateRemoved) {
		this.dateRemoved = dateRemoved;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
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
		
		auditStr.append("\r\n*characteresticType* :");
		if (characteresticType != null)
			auditStr.append(characteresticType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*implantedDevice* :");
		auditStr.append(implantedDevice);
	    auditStr.append("; ");
		auditStr.append("\r\n*insertionProcedure* :");
		if (insertionProcedure != null)
		{
			auditStr.append(toShortClassName(insertionProcedure));
				
		    auditStr.append(insertionProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*removalProcedure* :");
		if (removalProcedure != null)
		{
			auditStr.append(toShortClassName(removalProcedure));
				
		    auditStr.append(removalProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isRemoved* :");
		auditStr.append(isRemoved);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateInserted* :");
		auditStr.append(dateInserted);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateRemoved* :");
		auditStr.append(dateRemoved);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
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
		
		String keyClassName = "PatientCharacteristic";
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
		if (this.getCharacteresticType() != null)
		{
			sb.append("<characteresticType>");
			sb.append(this.getCharacteresticType().toXMLString()); 
			sb.append("</characteresticType>");		
		}
		if (this.getImplantedDevice() != null)
		{
			sb.append("<implantedDevice>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getImplantedDevice().toString()));
			sb.append("</implantedDevice>");		
		}
		if (this.getInsertionProcedure() != null)
		{
			sb.append("<insertionProcedure>");
			sb.append(this.getInsertionProcedure().toXMLString(domMap)); 	
			sb.append("</insertionProcedure>");		
		}
		if (this.getRemovalProcedure() != null)
		{
			sb.append("<removalProcedure>");
			sb.append(this.getRemovalProcedure().toXMLString(domMap)); 	
			sb.append("</removalProcedure>");		
		}
		if (this.isIsRemoved() != null)
		{
			sb.append("<isRemoved>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsRemoved().toString()));
			sb.append("</isRemoved>");		
		}
		if (this.getDateInserted() != null)
		{
			sb.append("<dateInserted>");
			sb.append(new ims.framework.utils.DateTime(this.getDateInserted()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateInserted>");		
		}
		if (this.getDateRemoved() != null)
		{
			sb.append("<dateRemoved>");
			sb.append(new ims.framework.utils.DateTime(this.getDateRemoved()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateRemoved>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
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
			PatientCharacteristic domainObject = getPatientCharacteristicfromXML(itemEl, factory, domMap);

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
			PatientCharacteristic domainObject = getPatientCharacteristicfromXML(itemEl, factory, domMap);

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
		
	public static PatientCharacteristic getPatientCharacteristicfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientCharacteristicfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientCharacteristic getPatientCharacteristicfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientCharacteristic.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientCharacteristic.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientCharacteristic class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientCharacteristic)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientCharacteristic.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientCharacteristic ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientCharacteristic)factory.getImportedDomainObject(PatientCharacteristic.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientCharacteristic();
		}
		String keyClassName = "PatientCharacteristic";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientCharacteristic)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientCharacteristic obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("characteresticType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCharacteresticType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("implantedDevice");
		if(fldEl != null)
		{	
    		obj.setImplantedDevice(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("insertionProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInsertionProcedure(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("removalProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRemovalProcedure(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isRemoved");
		if(fldEl != null)
		{	
    		obj.setIsRemoved(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateInserted");
		if(fldEl != null)
		{	
    		obj.setDateInserted(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateRemoved");
		if(fldEl != null)
		{	
    		obj.setDateRemoved(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
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
		public static final String CharacteresticType = "characteresticType";
		public static final String ImplantedDevice = "implantedDevice";
		public static final String InsertionProcedure = "insertionProcedure";
		public static final String RemovalProcedure = "removalProcedure";
		public static final String IsRemoved = "isRemoved";
		public static final String DateInserted = "dateInserted";
		public static final String DateRemoved = "dateRemoved";
		public static final String IsActive = "isActive";
		public static final String CareContext = "careContext";
		public static final String Patient = "patient";
	}
}

