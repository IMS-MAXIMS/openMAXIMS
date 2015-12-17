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
package ims.core.cds.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class CDSCriticalCareDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1104100005;
	private static final long serialVersionUID = 1104100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return false;
	}
	@Override
	public boolean canNeverBeAudited()
	{
		return true;
	}

	/** Local Identifier */
	private String localId;
	/** Start Date */
	private java.util.Date startDate;
	/** Start Time */
	private String startTime;
	/** Unit Function */
	private String unitFunction;
	/** Gestation Length (at delivery) */
	private String gestationLen;
	/** Activity Date */
	private java.util.Date activityDate;
	/** Person Weight */
	private String personWeight;
	/** Activity Code */
	private String activityCode;
	/** High Cost Drugs */
	private String highCostDrugs;
	/** Discharge Date */
	private java.util.Date dischargeDate;
	/** Discharge Time */
	private String dischargeTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CDSCriticalCareDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CDSCriticalCareDetails ()
    {
    	super();
    }
    public CDSCriticalCareDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.cds.domain.objects.CDSCriticalCareDetails.class;
	}


	public String getLocalId() {
		return localId;
	}
	public void setLocalId(String localId) {
		if ( null != localId && localId.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for localId. Tried to set value: "+
				localId);
		}
		this.localId = localId;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getUnitFunction() {
		return unitFunction;
	}
	public void setUnitFunction(String unitFunction) {
		if ( null != unitFunction && unitFunction.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for unitFunction. Tried to set value: "+
				unitFunction);
		}
		this.unitFunction = unitFunction;
	}

	public String getGestationLen() {
		return gestationLen;
	}
	public void setGestationLen(String gestationLen) {
		if ( null != gestationLen && gestationLen.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for gestationLen. Tried to set value: "+
				gestationLen);
		}
		this.gestationLen = gestationLen;
	}

	public java.util.Date getActivityDate() {
		return activityDate;
	}
	public void setActivityDate(java.util.Date activityDate) {
		this.activityDate = activityDate;
	}

	public String getPersonWeight() {
		return personWeight;
	}
	public void setPersonWeight(String personWeight) {
		if ( null != personWeight && personWeight.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for personWeight. Tried to set value: "+
				personWeight);
		}
		this.personWeight = personWeight;
	}

	public String getActivityCode() {
		return activityCode;
	}
	public void setActivityCode(String activityCode) {
		if ( null != activityCode && activityCode.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for activityCode. Tried to set value: "+
				activityCode);
		}
		this.activityCode = activityCode;
	}

	public String getHighCostDrugs() {
		return highCostDrugs;
	}
	public void setHighCostDrugs(String highCostDrugs) {
		if ( null != highCostDrugs && highCostDrugs.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for highCostDrugs. Tried to set value: "+
				highCostDrugs);
		}
		this.highCostDrugs = highCostDrugs;
	}

	public java.util.Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(java.util.Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public String getDischargeTime() {
		return dischargeTime;
	}
	public void setDischargeTime(String dischargeTime) {
		this.dischargeTime = dischargeTime;
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
		
		auditStr.append("\r\n*localId* :");
		auditStr.append(localId);
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*startTime* :");
		auditStr.append(startTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*unitFunction* :");
		auditStr.append(unitFunction);
	    auditStr.append("; ");
		auditStr.append("\r\n*gestationLen* :");
		auditStr.append(gestationLen);
	    auditStr.append("; ");
		auditStr.append("\r\n*activityDate* :");
		auditStr.append(activityDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*personWeight* :");
		auditStr.append(personWeight);
	    auditStr.append("; ");
		auditStr.append("\r\n*activityCode* :");
		auditStr.append(activityCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*highCostDrugs* :");
		auditStr.append(highCostDrugs);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDate* :");
		auditStr.append(dischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeTime* :");
		auditStr.append(dischargeTime);
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
		
		String keyClassName = "CDSCriticalCareDetails";
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
		if (this.getLocalId() != null)
		{
			sb.append("<localId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocalId().toString()));
			sb.append("</localId>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getStartTime() != null)
		{
			sb.append("<startTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStartTime().toString()));
			sb.append("</startTime>");		
		}
		if (this.getUnitFunction() != null)
		{
			sb.append("<unitFunction>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUnitFunction().toString()));
			sb.append("</unitFunction>");		
		}
		if (this.getGestationLen() != null)
		{
			sb.append("<gestationLen>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGestationLen().toString()));
			sb.append("</gestationLen>");		
		}
		if (this.getActivityDate() != null)
		{
			sb.append("<activityDate>");
			sb.append(new ims.framework.utils.DateTime(this.getActivityDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</activityDate>");		
		}
		if (this.getPersonWeight() != null)
		{
			sb.append("<personWeight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPersonWeight().toString()));
			sb.append("</personWeight>");		
		}
		if (this.getActivityCode() != null)
		{
			sb.append("<activityCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActivityCode().toString()));
			sb.append("</activityCode>");		
		}
		if (this.getHighCostDrugs() != null)
		{
			sb.append("<highCostDrugs>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHighCostDrugs().toString()));
			sb.append("</highCostDrugs>");		
		}
		if (this.getDischargeDate() != null)
		{
			sb.append("<dischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDate>");		
		}
		if (this.getDischargeTime() != null)
		{
			sb.append("<dischargeTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDischargeTime().toString()));
			sb.append("</dischargeTime>");		
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
			CDSCriticalCareDetails domainObject = getCDSCriticalCareDetailsfromXML(itemEl, factory, domMap);

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
			CDSCriticalCareDetails domainObject = getCDSCriticalCareDetailsfromXML(itemEl, factory, domMap);

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
		
	public static CDSCriticalCareDetails getCDSCriticalCareDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCDSCriticalCareDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CDSCriticalCareDetails getCDSCriticalCareDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CDSCriticalCareDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CDSCriticalCareDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CDSCriticalCareDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CDSCriticalCareDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CDSCriticalCareDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CDSCriticalCareDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CDSCriticalCareDetails)factory.getImportedDomainObject(CDSCriticalCareDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CDSCriticalCareDetails();
		}
		String keyClassName = "CDSCriticalCareDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CDSCriticalCareDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CDSCriticalCareDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("localId");
		if(fldEl != null)
		{	
    		obj.setLocalId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("startTime");
		if(fldEl != null)
		{	
    		obj.setStartTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("unitFunction");
		if(fldEl != null)
		{	
    		obj.setUnitFunction(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("gestationLen");
		if(fldEl != null)
		{	
    		obj.setGestationLen(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activityDate");
		if(fldEl != null)
		{	
    		obj.setActivityDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("personWeight");
		if(fldEl != null)
		{	
    		obj.setPersonWeight(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activityCode");
		if(fldEl != null)
		{	
    		obj.setActivityCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("highCostDrugs");
		if(fldEl != null)
		{	
    		obj.setHighCostDrugs(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeDate");
		if(fldEl != null)
		{	
    		obj.setDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dischargeTime");
		if(fldEl != null)
		{	
    		obj.setDischargeTime(new String(fldEl.getTextTrim()));	
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
		public static final String LocalId = "localId";
		public static final String StartDate = "startDate";
		public static final String StartTime = "startTime";
		public static final String UnitFunction = "unitFunction";
		public static final String GestationLen = "gestationLen";
		public static final String ActivityDate = "activityDate";
		public static final String PersonWeight = "personWeight";
		public static final String ActivityCode = "activityCode";
		public static final String HighCostDrugs = "highCostDrugs";
		public static final String DischargeDate = "dischargeDate";
		public static final String DischargeTime = "dischargeTime";
	}
}

