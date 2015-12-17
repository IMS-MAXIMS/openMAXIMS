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
package ims.oncology.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ChemoCycleDetailsCCO extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100047;
	private static final long serialVersionUID = 1074100047L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Treatment Type */
	private ims.domain.lookups.LookupInstance treatmentType;
	/** CycleStartDate */
	private java.util.Date cycleStartDate;
	/** CycleNumber */
	private Integer cycleNumber;
	/** DayNumber */
	private Integer dayNumber;
	/** CycleDuration */
	private Integer cycleDuration;
	/** Weight at start of cycle */
	private Integer weight;
	/** Performance Status at start of cycle */
	private ims.domain.lookups.LookupInstance performanceStatus;
	/** Active? */
	private Boolean isActive;
	/** Regimen  */
	private ims.domain.lookups.LookupInstance regimen;
	/** Procurement Code */
	private ims.domain.lookups.LookupInstance procurementCode;
	/** Day One Delivery Code */
	private ims.domain.lookups.LookupInstance dayOneDeliveryCode;
	/** Delivery Code All Other Days */
	private ims.domain.lookups.LookupInstance deliveryCodeAllOtherDays;
	/** Associated Patient Diary Record */
	private ims.core.scheduler.domain.objects.PatientApptDiary diaryEntry;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ChemoCycleDetailsCCO (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ChemoCycleDetailsCCO ()
    {
    	super();
    }
    public ChemoCycleDetailsCCO (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.ChemoCycleDetailsCCO.class;
	}


	public ims.domain.lookups.LookupInstance getTreatmentType() {
		return treatmentType;
	}
	public void setTreatmentType(ims.domain.lookups.LookupInstance treatmentType) {
		this.treatmentType = treatmentType;
	}

	public java.util.Date getCycleStartDate() {
		return cycleStartDate;
	}
	public void setCycleStartDate(java.util.Date cycleStartDate) {
		this.cycleStartDate = cycleStartDate;
	}

	public Integer getCycleNumber() {
		return cycleNumber;
	}
	public void setCycleNumber(Integer cycleNumber) {
		this.cycleNumber = cycleNumber;
	}

	public Integer getDayNumber() {
		return dayNumber;
	}
	public void setDayNumber(Integer dayNumber) {
		this.dayNumber = dayNumber;
	}

	public Integer getCycleDuration() {
		return cycleDuration;
	}
	public void setCycleDuration(Integer cycleDuration) {
		this.cycleDuration = cycleDuration;
	}

	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public ims.domain.lookups.LookupInstance getPerformanceStatus() {
		return performanceStatus;
	}
	public void setPerformanceStatus(ims.domain.lookups.LookupInstance performanceStatus) {
		this.performanceStatus = performanceStatus;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.domain.lookups.LookupInstance getRegimen() {
		return regimen;
	}
	public void setRegimen(ims.domain.lookups.LookupInstance regimen) {
		this.regimen = regimen;
	}

	public ims.domain.lookups.LookupInstance getProcurementCode() {
		return procurementCode;
	}
	public void setProcurementCode(ims.domain.lookups.LookupInstance procurementCode) {
		this.procurementCode = procurementCode;
	}

	public ims.domain.lookups.LookupInstance getDayOneDeliveryCode() {
		return dayOneDeliveryCode;
	}
	public void setDayOneDeliveryCode(ims.domain.lookups.LookupInstance dayOneDeliveryCode) {
		this.dayOneDeliveryCode = dayOneDeliveryCode;
	}

	public ims.domain.lookups.LookupInstance getDeliveryCodeAllOtherDays() {
		return deliveryCodeAllOtherDays;
	}
	public void setDeliveryCodeAllOtherDays(ims.domain.lookups.LookupInstance deliveryCodeAllOtherDays) {
		this.deliveryCodeAllOtherDays = deliveryCodeAllOtherDays;
	}

	public ims.core.scheduler.domain.objects.PatientApptDiary getDiaryEntry() {
		return diaryEntry;
	}
	public void setDiaryEntry(ims.core.scheduler.domain.objects.PatientApptDiary diaryEntry) {
		this.diaryEntry = diaryEntry;
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
		
		auditStr.append("\r\n*treatmentType* :");
		if (treatmentType != null)
			auditStr.append(treatmentType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cycleStartDate* :");
		auditStr.append(cycleStartDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*cycleNumber* :");
		auditStr.append(cycleNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*dayNumber* :");
		auditStr.append(dayNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*cycleDuration* :");
		auditStr.append(cycleDuration);
	    auditStr.append("; ");
		auditStr.append("\r\n*weight* :");
		auditStr.append(weight);
	    auditStr.append("; ");
		auditStr.append("\r\n*performanceStatus* :");
		if (performanceStatus != null)
			auditStr.append(performanceStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*regimen* :");
		if (regimen != null)
			auditStr.append(regimen.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*procurementCode* :");
		if (procurementCode != null)
			auditStr.append(procurementCode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dayOneDeliveryCode* :");
		if (dayOneDeliveryCode != null)
			auditStr.append(dayOneDeliveryCode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*deliveryCodeAllOtherDays* :");
		if (deliveryCodeAllOtherDays != null)
			auditStr.append(deliveryCodeAllOtherDays.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*diaryEntry* :");
		if (diaryEntry != null)
		{
			auditStr.append(toShortClassName(diaryEntry));
				
		    auditStr.append(diaryEntry.getId());
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
		
		String keyClassName = "ChemoCycleDetailsCCO";
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
		if (this.getTreatmentType() != null)
		{
			sb.append("<treatmentType>");
			sb.append(this.getTreatmentType().toXMLString()); 
			sb.append("</treatmentType>");		
		}
		if (this.getCycleStartDate() != null)
		{
			sb.append("<cycleStartDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCycleStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</cycleStartDate>");		
		}
		if (this.getCycleNumber() != null)
		{
			sb.append("<cycleNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCycleNumber().toString()));
			sb.append("</cycleNumber>");		
		}
		if (this.getDayNumber() != null)
		{
			sb.append("<dayNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDayNumber().toString()));
			sb.append("</dayNumber>");		
		}
		if (this.getCycleDuration() != null)
		{
			sb.append("<cycleDuration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCycleDuration().toString()));
			sb.append("</cycleDuration>");		
		}
		if (this.getWeight() != null)
		{
			sb.append("<weight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWeight().toString()));
			sb.append("</weight>");		
		}
		if (this.getPerformanceStatus() != null)
		{
			sb.append("<performanceStatus>");
			sb.append(this.getPerformanceStatus().toXMLString()); 
			sb.append("</performanceStatus>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getRegimen() != null)
		{
			sb.append("<regimen>");
			sb.append(this.getRegimen().toXMLString()); 
			sb.append("</regimen>");		
		}
		if (this.getProcurementCode() != null)
		{
			sb.append("<procurementCode>");
			sb.append(this.getProcurementCode().toXMLString()); 
			sb.append("</procurementCode>");		
		}
		if (this.getDayOneDeliveryCode() != null)
		{
			sb.append("<dayOneDeliveryCode>");
			sb.append(this.getDayOneDeliveryCode().toXMLString()); 
			sb.append("</dayOneDeliveryCode>");		
		}
		if (this.getDeliveryCodeAllOtherDays() != null)
		{
			sb.append("<deliveryCodeAllOtherDays>");
			sb.append(this.getDeliveryCodeAllOtherDays().toXMLString()); 
			sb.append("</deliveryCodeAllOtherDays>");		
		}
		if (this.getDiaryEntry() != null)
		{
			sb.append("<diaryEntry>");
			sb.append(this.getDiaryEntry().toXMLString(domMap)); 	
			sb.append("</diaryEntry>");		
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
			ChemoCycleDetailsCCO domainObject = getChemoCycleDetailsCCOfromXML(itemEl, factory, domMap);

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
			ChemoCycleDetailsCCO domainObject = getChemoCycleDetailsCCOfromXML(itemEl, factory, domMap);

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
		
	public static ChemoCycleDetailsCCO getChemoCycleDetailsCCOfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getChemoCycleDetailsCCOfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ChemoCycleDetailsCCO getChemoCycleDetailsCCOfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ChemoCycleDetailsCCO.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ChemoCycleDetailsCCO.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ChemoCycleDetailsCCO class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ChemoCycleDetailsCCO)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ChemoCycleDetailsCCO.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ChemoCycleDetailsCCO ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ChemoCycleDetailsCCO)factory.getImportedDomainObject(ChemoCycleDetailsCCO.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ChemoCycleDetailsCCO();
		}
		String keyClassName = "ChemoCycleDetailsCCO";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ChemoCycleDetailsCCO)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ChemoCycleDetailsCCO obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("treatmentType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatmentType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cycleStartDate");
		if(fldEl != null)
		{	
    		obj.setCycleStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("cycleNumber");
		if(fldEl != null)
		{	
    		obj.setCycleNumber(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dayNumber");
		if(fldEl != null)
		{	
    		obj.setDayNumber(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cycleDuration");
		if(fldEl != null)
		{	
    		obj.setCycleDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("weight");
		if(fldEl != null)
		{	
    		obj.setWeight(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("performanceStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPerformanceStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("regimen");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRegimen(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("procurementCode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcurementCode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dayOneDeliveryCode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDayOneDeliveryCode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("deliveryCodeAllOtherDays");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDeliveryCodeAllOtherDays(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("diaryEntry");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiaryEntry(ims.core.scheduler.domain.objects.PatientApptDiary.getPatientApptDiaryfromXML(fldEl, factory, domMap)); 
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
		public static final String TreatmentType = "treatmentType";
		public static final String CycleStartDate = "cycleStartDate";
		public static final String CycleNumber = "cycleNumber";
		public static final String DayNumber = "dayNumber";
		public static final String CycleDuration = "cycleDuration";
		public static final String Weight = "weight";
		public static final String PerformanceStatus = "performanceStatus";
		public static final String IsActive = "isActive";
		public static final String Regimen = "regimen";
		public static final String ProcurementCode = "procurementCode";
		public static final String DayOneDeliveryCode = "dayOneDeliveryCode";
		public static final String DeliveryCodeAllOtherDays = "deliveryCodeAllOtherDays";
		public static final String DiaryEntry = "diaryEntry";
	}
}

