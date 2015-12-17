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
 * @author Neil McAnaspie
 * Generated.
 */


public class HospitalAtNightListandDates extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100095;
	private static final long serialVersionUID = 1072100095L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Cut Over Points */
	private ims.clinical.configuration.domain.objects.HospitalAtNightCutOverPointsConfig cutOverPoints;
	/** Shift Start Date */
	private java.util.Date shiftStartDate;
	/** Shift End Date */
	private java.util.Date shiftEndDate;
	/** Hospital */
	private ims.core.resource.place.domain.objects.LocSite hospital;
	/** Patient Details
	  * Collection of ims.clinical.domain.objects.HospitalAtNightPatientDetail.
	  */
	private java.util.Set patientDetails;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public HospitalAtNightListandDates (Integer id, int ver)
    {
    	super(id, ver);
    }
    public HospitalAtNightListandDates ()
    {
    	super();
    }
    public HospitalAtNightListandDates (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.domain.objects.HospitalAtNightListandDates.class;
	}


	public ims.clinical.configuration.domain.objects.HospitalAtNightCutOverPointsConfig getCutOverPoints() {
		return cutOverPoints;
	}
	public void setCutOverPoints(ims.clinical.configuration.domain.objects.HospitalAtNightCutOverPointsConfig cutOverPoints) {
		this.cutOverPoints = cutOverPoints;
	}

	public java.util.Date getShiftStartDate() {
		return shiftStartDate;
	}
	public void setShiftStartDate(java.util.Date shiftStartDate) {
		this.shiftStartDate = shiftStartDate;
	}

	public java.util.Date getShiftEndDate() {
		return shiftEndDate;
	}
	public void setShiftEndDate(java.util.Date shiftEndDate) {
		this.shiftEndDate = shiftEndDate;
	}

	public ims.core.resource.place.domain.objects.LocSite getHospital() {
		return hospital;
	}
	public void setHospital(ims.core.resource.place.domain.objects.LocSite hospital) {
		this.hospital = hospital;
	}

	public java.util.Set getPatientDetails() {
		if ( null == patientDetails ) {
			patientDetails = new java.util.HashSet();
		}
		return patientDetails;
	}
	public void setPatientDetails(java.util.Set paramValue) {
		this.patientDetails = paramValue;
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
		
		auditStr.append("\r\n*cutOverPoints* :");
		if (cutOverPoints != null)
		{
			auditStr.append(toShortClassName(cutOverPoints));
				
		    auditStr.append(cutOverPoints.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*shiftStartDate* :");
		auditStr.append(shiftStartDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*shiftEndDate* :");
		auditStr.append(shiftEndDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*hospital* :");
		if (hospital != null)
		{
			auditStr.append(toShortClassName(hospital));
				
		    auditStr.append(hospital.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientDetails* :");
		if (patientDetails != null)
		{
			java.util.Iterator it5 = patientDetails.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.HospitalAtNightPatientDetail obj = (ims.clinical.domain.objects.HospitalAtNightPatientDetail)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
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
		
		String keyClassName = "HospitalAtNightListandDates";
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
		if (this.getCutOverPoints() != null)
		{
			sb.append("<cutOverPoints>");
			sb.append(this.getCutOverPoints().toXMLString(domMap)); 	
			sb.append("</cutOverPoints>");		
		}
		if (this.getShiftStartDate() != null)
		{
			sb.append("<shiftStartDate>");
			sb.append(new ims.framework.utils.DateTime(this.getShiftStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</shiftStartDate>");		
		}
		if (this.getShiftEndDate() != null)
		{
			sb.append("<shiftEndDate>");
			sb.append(new ims.framework.utils.DateTime(this.getShiftEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</shiftEndDate>");		
		}
		if (this.getHospital() != null)
		{
			sb.append("<hospital>");
			sb.append(this.getHospital().toXMLString(domMap)); 	
			sb.append("</hospital>");		
		}
		if (this.getPatientDetails() != null)
		{
			if (this.getPatientDetails().size() > 0 )
			{
			sb.append("<patientDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPatientDetails(), domMap));
			sb.append("</patientDetails>");		
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
			HospitalAtNightListandDates domainObject = getHospitalAtNightListandDatesfromXML(itemEl, factory, domMap);

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
			HospitalAtNightListandDates domainObject = getHospitalAtNightListandDatesfromXML(itemEl, factory, domMap);

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
		
	public static HospitalAtNightListandDates getHospitalAtNightListandDatesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getHospitalAtNightListandDatesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static HospitalAtNightListandDates getHospitalAtNightListandDatesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!HospitalAtNightListandDates.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!HospitalAtNightListandDates.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the HospitalAtNightListandDates class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (HospitalAtNightListandDates)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(HospitalAtNightListandDates.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		HospitalAtNightListandDates ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (HospitalAtNightListandDates)factory.getImportedDomainObject(HospitalAtNightListandDates.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new HospitalAtNightListandDates();
		}
		String keyClassName = "HospitalAtNightListandDates";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (HospitalAtNightListandDates)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, HospitalAtNightListandDates obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("cutOverPoints");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCutOverPoints(ims.clinical.configuration.domain.objects.HospitalAtNightCutOverPointsConfig.getHospitalAtNightCutOverPointsConfigfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("shiftStartDate");
		if(fldEl != null)
		{	
    		obj.setShiftStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("shiftEndDate");
		if(fldEl != null)
		{	
    		obj.setShiftEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("hospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHospital(ims.core.resource.place.domain.objects.LocSite.getLocSitefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPatientDetails(ims.clinical.domain.objects.HospitalAtNightPatientDetail.fromSetXMLString(fldEl, factory, obj.getPatientDetails(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "patientDetails"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CutOverPoints = "cutOverPoints";
		public static final String ShiftStartDate = "shiftStartDate";
		public static final String ShiftEndDate = "shiftEndDate";
		public static final String Hospital = "hospital";
		public static final String PatientDetails = "patientDetails";
	}
}

