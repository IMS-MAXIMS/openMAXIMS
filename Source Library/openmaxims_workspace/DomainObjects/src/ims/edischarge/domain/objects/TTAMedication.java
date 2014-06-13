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


public class TTAMedication extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100003;
	private static final long serialVersionUID = 1099100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Medication - Dispense/Give Code */
	private String medication;
	/** Date and Time Dispensed */
	private java.util.Date dateDispensed;
	/** Dose Amount - Actual Dispense Amount */
	private java.lang.Float doseAmount;
	/** Does Unit - Actual Dispense Units */
	private ims.domain.lookups.LookupInstance doseUnit;
	/** Days Supply - No of Refills Remaining */
	private Integer daysSupply;
	/** Frequency - Dispense Notes */
	private String frequency;
	/** GP To Continue - Pharmacy/Treatment Supplier's Special Dispensing Instructions */
	private ims.domain.lookups.LookupInstance gpToContinue;
	/** Route */
	private ims.domain.lookups.LookupInstance route;
	/** TTAComment */
	private ims.edischarge.domain.objects.TTANote tTAComment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TTAMedication (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TTAMedication ()
    {
    	super();
    }
    public TTAMedication (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.TTAMedication.class;
	}


	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		if ( null != medication && medication.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for medication. Tried to set value: "+
				medication);
		}
		this.medication = medication;
	}

	public java.util.Date getDateDispensed() {
		return dateDispensed;
	}
	public void setDateDispensed(java.util.Date dateDispensed) {
		this.dateDispensed = dateDispensed;
	}

	public java.lang.Float getDoseAmount() {
		return doseAmount;
	}
	public void setDoseAmount(java.lang.Float doseAmount) {
		this.doseAmount = doseAmount;
	}

	public ims.domain.lookups.LookupInstance getDoseUnit() {
		return doseUnit;
	}
	public void setDoseUnit(ims.domain.lookups.LookupInstance doseUnit) {
		this.doseUnit = doseUnit;
	}

	public Integer getDaysSupply() {
		return daysSupply;
	}
	public void setDaysSupply(Integer daysSupply) {
		this.daysSupply = daysSupply;
	}

	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		if ( null != frequency && frequency.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for frequency. Tried to set value: "+
				frequency);
		}
		this.frequency = frequency;
	}

	public ims.domain.lookups.LookupInstance getGpToContinue() {
		return gpToContinue;
	}
	public void setGpToContinue(ims.domain.lookups.LookupInstance gpToContinue) {
		this.gpToContinue = gpToContinue;
	}

	public ims.domain.lookups.LookupInstance getRoute() {
		return route;
	}
	public void setRoute(ims.domain.lookups.LookupInstance route) {
		this.route = route;
	}

	public ims.edischarge.domain.objects.TTANote getTTAComment() {
		return tTAComment;
	}
	public void setTTAComment(ims.edischarge.domain.objects.TTANote tTAComment) {
		this.tTAComment = tTAComment;
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
		
		auditStr.append("\r\n*medication* :");
		auditStr.append(medication);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateDispensed* :");
		auditStr.append(dateDispensed);
	    auditStr.append("; ");
		auditStr.append("\r\n*doseAmount* :");
		auditStr.append(doseAmount);
	    auditStr.append("; ");
		auditStr.append("\r\n*doseUnit* :");
		if (doseUnit != null)
			auditStr.append(doseUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*daysSupply* :");
		auditStr.append(daysSupply);
	    auditStr.append("; ");
		auditStr.append("\r\n*frequency* :");
		auditStr.append(frequency);
	    auditStr.append("; ");
		auditStr.append("\r\n*gpToContinue* :");
		if (gpToContinue != null)
			auditStr.append(gpToContinue.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*route* :");
		if (route != null)
			auditStr.append(route.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*tTAComment* :");
		if (tTAComment != null)
		{
			auditStr.append(toShortClassName(tTAComment));
				
		    auditStr.append(tTAComment.getId());
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
		
		String keyClassName = "TTAMedication";
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
		if (this.getMedication() != null)
		{
			sb.append("<medication>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMedication().toString()));
			sb.append("</medication>");		
		}
		if (this.getDateDispensed() != null)
		{
			sb.append("<dateDispensed>");
			sb.append(new ims.framework.utils.DateTime(this.getDateDispensed()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateDispensed>");		
		}
		if (this.getDoseAmount() != null)
		{
			sb.append("<doseAmount>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDoseAmount().toString()));
			sb.append("</doseAmount>");		
		}
		if (this.getDoseUnit() != null)
		{
			sb.append("<doseUnit>");
			sb.append(this.getDoseUnit().toXMLString()); 
			sb.append("</doseUnit>");		
		}
		if (this.getDaysSupply() != null)
		{
			sb.append("<daysSupply>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDaysSupply().toString()));
			sb.append("</daysSupply>");		
		}
		if (this.getFrequency() != null)
		{
			sb.append("<frequency>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFrequency().toString()));
			sb.append("</frequency>");		
		}
		if (this.getGpToContinue() != null)
		{
			sb.append("<gpToContinue>");
			sb.append(this.getGpToContinue().toXMLString()); 
			sb.append("</gpToContinue>");		
		}
		if (this.getRoute() != null)
		{
			sb.append("<route>");
			sb.append(this.getRoute().toXMLString()); 
			sb.append("</route>");		
		}
		if (this.getTTAComment() != null)
		{
			sb.append("<tTAComment>");
			sb.append(this.getTTAComment().toXMLString(domMap)); 	
			sb.append("</tTAComment>");		
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
			TTAMedication domainObject = getTTAMedicationfromXML(itemEl, factory, domMap);

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
			TTAMedication domainObject = getTTAMedicationfromXML(itemEl, factory, domMap);

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
		
	public static TTAMedication getTTAMedicationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTTAMedicationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TTAMedication getTTAMedicationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TTAMedication.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TTAMedication.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TTAMedication class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TTAMedication)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TTAMedication.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TTAMedication ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TTAMedication)factory.getImportedDomainObject(TTAMedication.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TTAMedication();
		}
		String keyClassName = "TTAMedication";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TTAMedication)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TTAMedication obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("medication");
		if(fldEl != null)
		{	
    		obj.setMedication(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateDispensed");
		if(fldEl != null)
		{	
    		obj.setDateDispensed(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("doseAmount");
		if(fldEl != null)
		{	
    		obj.setDoseAmount(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("doseUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDoseUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("daysSupply");
		if(fldEl != null)
		{	
    		obj.setDaysSupply(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("frequency");
		if(fldEl != null)
		{	
    		obj.setFrequency(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("gpToContinue");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGpToContinue(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("route");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRoute(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("tTAComment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTTAComment(ims.edischarge.domain.objects.TTANote.getTTANotefromXML(fldEl, factory, domMap)); 
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
		public static final String Medication = "medication";
		public static final String DateDispensed = "dateDispensed";
		public static final String DoseAmount = "doseAmount";
		public static final String DoseUnit = "doseUnit";
		public static final String DaysSupply = "daysSupply";
		public static final String Frequency = "frequency";
		public static final String GpToContinue = "gpToContinue";
		public static final String Route = "route";
		public static final String TTAComment = "tTAComment";
	}
}

