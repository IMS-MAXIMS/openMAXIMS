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
package ims.core.vitals.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class VentilationTracheostomy extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1022100013;
	private static final long serialVersionUID = 1022100013L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Breaths Spontaneously */
	private ims.domain.lookups.LookupInstance breathsSpontaneously;
	/** Patient Intubated */
	private ims.domain.lookups.LookupInstance patientIntubated;
	/** Intubated via */
	private String intubationMethod;
	/** Patient Ventilated */
	private ims.domain.lookups.LookupInstance patientVentilated;
	/** Type Of Ventilator */
	private ims.domain.lookups.LookupInstance typeOfVentilator;
	/** Mode Of Ventilation */
	private ims.domain.lookups.LookupInstance modeOfVentilation;
	/** Requires A Tracheostomy */
	private ims.domain.lookups.LookupInstance requiresATracheostomy;
	/** Tracheostomy Type */
	private ims.domain.lookups.LookupInstance tracheostomyType;
	/** Tracheostomy Accessories */
	private ims.domain.lookups.LookupInstance tracheostomyAccessories;
	/** Size of CPAP Valve (cm) */
	private String sizeCPAPValve;
	/** Size of tracheostomy */
	private String sizeOfTracheostomy;
	/** Date Inserted */
	private java.util.Date dateInserted;
	/** Date Last Change */
	private java.util.Date dateLastChange;
	/** Date Next Change */
	private java.util.Date dateNextChange;
	/** Date Removed */
	private java.util.Date dateRemoved;
	/** Notes */
	private String notes;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public VentilationTracheostomy (Integer id, int ver)
    {
    	super(id, ver);
    }
    public VentilationTracheostomy ()
    {
    	super();
    }
    public VentilationTracheostomy (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.vitals.domain.objects.VentilationTracheostomy.class;
	}


	public ims.domain.lookups.LookupInstance getBreathsSpontaneously() {
		return breathsSpontaneously;
	}
	public void setBreathsSpontaneously(ims.domain.lookups.LookupInstance breathsSpontaneously) {
		this.breathsSpontaneously = breathsSpontaneously;
	}

	public ims.domain.lookups.LookupInstance getPatientIntubated() {
		return patientIntubated;
	}
	public void setPatientIntubated(ims.domain.lookups.LookupInstance patientIntubated) {
		this.patientIntubated = patientIntubated;
	}

	public String getIntubationMethod() {
		return intubationMethod;
	}
	public void setIntubationMethod(String intubationMethod) {
		this.intubationMethod = intubationMethod;
	}

	public ims.domain.lookups.LookupInstance getPatientVentilated() {
		return patientVentilated;
	}
	public void setPatientVentilated(ims.domain.lookups.LookupInstance patientVentilated) {
		this.patientVentilated = patientVentilated;
	}

	public ims.domain.lookups.LookupInstance getTypeOfVentilator() {
		return typeOfVentilator;
	}
	public void setTypeOfVentilator(ims.domain.lookups.LookupInstance typeOfVentilator) {
		this.typeOfVentilator = typeOfVentilator;
	}

	public ims.domain.lookups.LookupInstance getModeOfVentilation() {
		return modeOfVentilation;
	}
	public void setModeOfVentilation(ims.domain.lookups.LookupInstance modeOfVentilation) {
		this.modeOfVentilation = modeOfVentilation;
	}

	public ims.domain.lookups.LookupInstance getRequiresATracheostomy() {
		return requiresATracheostomy;
	}
	public void setRequiresATracheostomy(ims.domain.lookups.LookupInstance requiresATracheostomy) {
		this.requiresATracheostomy = requiresATracheostomy;
	}

	public ims.domain.lookups.LookupInstance getTracheostomyType() {
		return tracheostomyType;
	}
	public void setTracheostomyType(ims.domain.lookups.LookupInstance tracheostomyType) {
		this.tracheostomyType = tracheostomyType;
	}

	public ims.domain.lookups.LookupInstance getTracheostomyAccessories() {
		return tracheostomyAccessories;
	}
	public void setTracheostomyAccessories(ims.domain.lookups.LookupInstance tracheostomyAccessories) {
		this.tracheostomyAccessories = tracheostomyAccessories;
	}

	public String getSizeCPAPValve() {
		return sizeCPAPValve;
	}
	public void setSizeCPAPValve(String sizeCPAPValve) {
		this.sizeCPAPValve = sizeCPAPValve;
	}

	public String getSizeOfTracheostomy() {
		return sizeOfTracheostomy;
	}
	public void setSizeOfTracheostomy(String sizeOfTracheostomy) {
		this.sizeOfTracheostomy = sizeOfTracheostomy;
	}

	public java.util.Date getDateInserted() {
		return dateInserted;
	}
	public void setDateInserted(java.util.Date dateInserted) {
		this.dateInserted = dateInserted;
	}

	public java.util.Date getDateLastChange() {
		return dateLastChange;
	}
	public void setDateLastChange(java.util.Date dateLastChange) {
		this.dateLastChange = dateLastChange;
	}

	public java.util.Date getDateNextChange() {
		return dateNextChange;
	}
	public void setDateNextChange(java.util.Date dateNextChange) {
		this.dateNextChange = dateNextChange;
	}

	public java.util.Date getDateRemoved() {
		return dateRemoved;
	}
	public void setDateRemoved(java.util.Date dateRemoved) {
		this.dateRemoved = dateRemoved;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
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
		
		auditStr.append("\r\n*breathsSpontaneously* :");
		if (breathsSpontaneously != null)
			auditStr.append(breathsSpontaneously.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientIntubated* :");
		if (patientIntubated != null)
			auditStr.append(patientIntubated.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*intubationMethod* :");
		auditStr.append(intubationMethod);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientVentilated* :");
		if (patientVentilated != null)
			auditStr.append(patientVentilated.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*typeOfVentilator* :");
		if (typeOfVentilator != null)
			auditStr.append(typeOfVentilator.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*modeOfVentilation* :");
		if (modeOfVentilation != null)
			auditStr.append(modeOfVentilation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresATracheostomy* :");
		if (requiresATracheostomy != null)
			auditStr.append(requiresATracheostomy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*tracheostomyType* :");
		if (tracheostomyType != null)
			auditStr.append(tracheostomyType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*tracheostomyAccessories* :");
		if (tracheostomyAccessories != null)
			auditStr.append(tracheostomyAccessories.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sizeCPAPValve* :");
		auditStr.append(sizeCPAPValve);
	    auditStr.append("; ");
		auditStr.append("\r\n*sizeOfTracheostomy* :");
		auditStr.append(sizeOfTracheostomy);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateInserted* :");
		auditStr.append(dateInserted);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateLastChange* :");
		auditStr.append(dateLastChange);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateNextChange* :");
		auditStr.append(dateNextChange);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateRemoved* :");
		auditStr.append(dateRemoved);
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
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
		
		String keyClassName = "VentilationTracheostomy";
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
		if (this.getBreathsSpontaneously() != null)
		{
			sb.append("<breathsSpontaneously>");
			sb.append(this.getBreathsSpontaneously().toXMLString()); 
			sb.append("</breathsSpontaneously>");		
		}
		if (this.getPatientIntubated() != null)
		{
			sb.append("<patientIntubated>");
			sb.append(this.getPatientIntubated().toXMLString()); 
			sb.append("</patientIntubated>");		
		}
		if (this.getIntubationMethod() != null)
		{
			sb.append("<intubationMethod>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIntubationMethod().toString()));
			sb.append("</intubationMethod>");		
		}
		if (this.getPatientVentilated() != null)
		{
			sb.append("<patientVentilated>");
			sb.append(this.getPatientVentilated().toXMLString()); 
			sb.append("</patientVentilated>");		
		}
		if (this.getTypeOfVentilator() != null)
		{
			sb.append("<typeOfVentilator>");
			sb.append(this.getTypeOfVentilator().toXMLString()); 
			sb.append("</typeOfVentilator>");		
		}
		if (this.getModeOfVentilation() != null)
		{
			sb.append("<modeOfVentilation>");
			sb.append(this.getModeOfVentilation().toXMLString()); 
			sb.append("</modeOfVentilation>");		
		}
		if (this.getRequiresATracheostomy() != null)
		{
			sb.append("<requiresATracheostomy>");
			sb.append(this.getRequiresATracheostomy().toXMLString()); 
			sb.append("</requiresATracheostomy>");		
		}
		if (this.getTracheostomyType() != null)
		{
			sb.append("<tracheostomyType>");
			sb.append(this.getTracheostomyType().toXMLString()); 
			sb.append("</tracheostomyType>");		
		}
		if (this.getTracheostomyAccessories() != null)
		{
			sb.append("<tracheostomyAccessories>");
			sb.append(this.getTracheostomyAccessories().toXMLString()); 
			sb.append("</tracheostomyAccessories>");		
		}
		if (this.getSizeCPAPValve() != null)
		{
			sb.append("<sizeCPAPValve>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSizeCPAPValve().toString()));
			sb.append("</sizeCPAPValve>");		
		}
		if (this.getSizeOfTracheostomy() != null)
		{
			sb.append("<sizeOfTracheostomy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSizeOfTracheostomy().toString()));
			sb.append("</sizeOfTracheostomy>");		
		}
		if (this.getDateInserted() != null)
		{
			sb.append("<dateInserted>");
			sb.append(new ims.framework.utils.DateTime(this.getDateInserted()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateInserted>");		
		}
		if (this.getDateLastChange() != null)
		{
			sb.append("<dateLastChange>");
			sb.append(new ims.framework.utils.DateTime(this.getDateLastChange()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateLastChange>");		
		}
		if (this.getDateNextChange() != null)
		{
			sb.append("<dateNextChange>");
			sb.append(new ims.framework.utils.DateTime(this.getDateNextChange()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateNextChange>");		
		}
		if (this.getDateRemoved() != null)
		{
			sb.append("<dateRemoved>");
			sb.append(new ims.framework.utils.DateTime(this.getDateRemoved()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateRemoved>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
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
			VentilationTracheostomy domainObject = getVentilationTracheostomyfromXML(itemEl, factory, domMap);

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
			VentilationTracheostomy domainObject = getVentilationTracheostomyfromXML(itemEl, factory, domMap);

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
		
	public static VentilationTracheostomy getVentilationTracheostomyfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getVentilationTracheostomyfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static VentilationTracheostomy getVentilationTracheostomyfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!VentilationTracheostomy.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!VentilationTracheostomy.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the VentilationTracheostomy class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (VentilationTracheostomy)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(VentilationTracheostomy.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		VentilationTracheostomy ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (VentilationTracheostomy)factory.getImportedDomainObject(VentilationTracheostomy.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new VentilationTracheostomy();
		}
		String keyClassName = "VentilationTracheostomy";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (VentilationTracheostomy)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, VentilationTracheostomy obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("breathsSpontaneously");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBreathsSpontaneously(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientIntubated");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientIntubated(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("intubationMethod");
		if(fldEl != null)
		{	
    		obj.setIntubationMethod(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientVentilated");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientVentilated(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("typeOfVentilator");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTypeOfVentilator(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("modeOfVentilation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setModeOfVentilation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("requiresATracheostomy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRequiresATracheostomy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("tracheostomyType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTracheostomyType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("tracheostomyAccessories");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTracheostomyAccessories(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sizeCPAPValve");
		if(fldEl != null)
		{	
    		obj.setSizeCPAPValve(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sizeOfTracheostomy");
		if(fldEl != null)
		{	
    		obj.setSizeOfTracheostomy(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateInserted");
		if(fldEl != null)
		{	
    		obj.setDateInserted(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateLastChange");
		if(fldEl != null)
		{	
    		obj.setDateLastChange(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateNextChange");
		if(fldEl != null)
		{	
    		obj.setDateNextChange(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateRemoved");
		if(fldEl != null)
		{	
    		obj.setDateRemoved(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
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
		public static final String BreathsSpontaneously = "breathsSpontaneously";
		public static final String PatientIntubated = "patientIntubated";
		public static final String IntubationMethod = "intubationMethod";
		public static final String PatientVentilated = "patientVentilated";
		public static final String TypeOfVentilator = "typeOfVentilator";
		public static final String ModeOfVentilation = "modeOfVentilation";
		public static final String RequiresATracheostomy = "requiresATracheostomy";
		public static final String TracheostomyType = "tracheostomyType";
		public static final String TracheostomyAccessories = "tracheostomyAccessories";
		public static final String SizeCPAPValve = "sizeCPAPValve";
		public static final String SizeOfTracheostomy = "sizeOfTracheostomy";
		public static final String DateInserted = "dateInserted";
		public static final String DateLastChange = "dateLastChange";
		public static final String DateNextChange = "dateNextChange";
		public static final String DateRemoved = "dateRemoved";
		public static final String Notes = "notes";
	}
}

