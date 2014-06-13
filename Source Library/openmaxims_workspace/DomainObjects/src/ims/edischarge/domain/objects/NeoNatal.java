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
 * @author Daniel Laffan
 * Generated.
 */


public class NeoNatal extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100013;
	private static final long serialVersionUID = 1099100013L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Discharging Nurse */
	private ims.core.resource.people.domain.objects.Nurse dischargingNurse;
	/** Gestation Weeks */
	private Integer gestationWeeks;
	/** Midwife */
	private Boolean isMidwife;
	/** Health Visitor */
	private Boolean isHealthVisitor;
	/** Feeding */
	private ims.domain.lookups.LookupInstance feeding;
	/** Is VitaminK Given */
	private Boolean isVitaminKGiven;
	/** Route */
	private ims.domain.lookups.LookupInstance route;
	/** PKU Test Date */
	private java.util.Date _1stPKUTestDate;
	/** PKU Test Date */
	private java.util.Date _2ndPKUTestDate;
	/** Apgar at 1 minute */
	private Integer apgar1Minute;
	/** Apgar at 5 minutes */
	private Integer apgar5Minute;
	/** Birth Weight kgs */
	private java.lang.Float birthWeight;
	/** Length cms */
	private Integer length;
	/** Discharge Weight kgs */
	private java.lang.Float dischargeWeight;
	/** Is Complete */
	private Boolean isComplete;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public NeoNatal (Integer id, int ver)
    {
    	super(id, ver);
    }
    public NeoNatal ()
    {
    	super();
    }
    public NeoNatal (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.NeoNatal.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.resource.people.domain.objects.Nurse getDischargingNurse() {
		return dischargingNurse;
	}
	public void setDischargingNurse(ims.core.resource.people.domain.objects.Nurse dischargingNurse) {
		this.dischargingNurse = dischargingNurse;
	}

	public Integer getGestationWeeks() {
		return gestationWeeks;
	}
	public void setGestationWeeks(Integer gestationWeeks) {
		this.gestationWeeks = gestationWeeks;
	}

	public Boolean isIsMidwife() {
		return isMidwife;
	}
	public void setIsMidwife(Boolean isMidwife) {
		this.isMidwife = isMidwife;
	}

	public Boolean isIsHealthVisitor() {
		return isHealthVisitor;
	}
	public void setIsHealthVisitor(Boolean isHealthVisitor) {
		this.isHealthVisitor = isHealthVisitor;
	}

	public ims.domain.lookups.LookupInstance getFeeding() {
		return feeding;
	}
	public void setFeeding(ims.domain.lookups.LookupInstance feeding) {
		this.feeding = feeding;
	}

	public Boolean isIsVitaminKGiven() {
		return isVitaminKGiven;
	}
	public void setIsVitaminKGiven(Boolean isVitaminKGiven) {
		this.isVitaminKGiven = isVitaminKGiven;
	}

	public ims.domain.lookups.LookupInstance getRoute() {
		return route;
	}
	public void setRoute(ims.domain.lookups.LookupInstance route) {
		this.route = route;
	}

	public java.util.Date get_1stPKUTestDate() {
		return _1stPKUTestDate;
	}
	public void set_1stPKUTestDate(java.util.Date _1stPKUTestDate) {
		this._1stPKUTestDate = _1stPKUTestDate;
	}

	public java.util.Date get_2ndPKUTestDate() {
		return _2ndPKUTestDate;
	}
	public void set_2ndPKUTestDate(java.util.Date _2ndPKUTestDate) {
		this._2ndPKUTestDate = _2ndPKUTestDate;
	}

	public Integer getApgar1Minute() {
		return apgar1Minute;
	}
	public void setApgar1Minute(Integer apgar1Minute) {
		this.apgar1Minute = apgar1Minute;
	}

	public Integer getApgar5Minute() {
		return apgar5Minute;
	}
	public void setApgar5Minute(Integer apgar5Minute) {
		this.apgar5Minute = apgar5Minute;
	}

	public java.lang.Float getBirthWeight() {
		return birthWeight;
	}
	public void setBirthWeight(java.lang.Float birthWeight) {
		this.birthWeight = birthWeight;
	}

	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}

	public java.lang.Float getDischargeWeight() {
		return dischargeWeight;
	}
	public void setDischargeWeight(java.lang.Float dischargeWeight) {
		this.dischargeWeight = dischargeWeight;
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
		auditStr.append("\r\n*dischargingNurse* :");
		if (dischargingNurse != null)
		{
			auditStr.append(toShortClassName(dischargingNurse));
				
		    auditStr.append(dischargingNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*gestationWeeks* :");
		auditStr.append(gestationWeeks);
	    auditStr.append("; ");
		auditStr.append("\r\n*isMidwife* :");
		auditStr.append(isMidwife);
	    auditStr.append("; ");
		auditStr.append("\r\n*isHealthVisitor* :");
		auditStr.append(isHealthVisitor);
	    auditStr.append("; ");
		auditStr.append("\r\n*feeding* :");
		if (feeding != null)
			auditStr.append(feeding.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isVitaminKGiven* :");
		auditStr.append(isVitaminKGiven);
	    auditStr.append("; ");
		auditStr.append("\r\n*route* :");
		if (route != null)
			auditStr.append(route.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*_1stPKUTestDate* :");
		auditStr.append(_1stPKUTestDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*_2ndPKUTestDate* :");
		auditStr.append(_2ndPKUTestDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*apgar1Minute* :");
		auditStr.append(apgar1Minute);
	    auditStr.append("; ");
		auditStr.append("\r\n*apgar5Minute* :");
		auditStr.append(apgar5Minute);
	    auditStr.append("; ");
		auditStr.append("\r\n*birthWeight* :");
		auditStr.append(birthWeight);
	    auditStr.append("; ");
		auditStr.append("\r\n*length* :");
		auditStr.append(length);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeWeight* :");
		auditStr.append(dischargeWeight);
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
		
		String keyClassName = "NeoNatal";
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
		if (this.getDischargingNurse() != null)
		{
			sb.append("<dischargingNurse>");
			sb.append(this.getDischargingNurse().toXMLString(domMap)); 	
			sb.append("</dischargingNurse>");		
		}
		if (this.getGestationWeeks() != null)
		{
			sb.append("<gestationWeeks>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGestationWeeks().toString()));
			sb.append("</gestationWeeks>");		
		}
		if (this.isIsMidwife() != null)
		{
			sb.append("<isMidwife>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMidwife().toString()));
			sb.append("</isMidwife>");		
		}
		if (this.isIsHealthVisitor() != null)
		{
			sb.append("<isHealthVisitor>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsHealthVisitor().toString()));
			sb.append("</isHealthVisitor>");		
		}
		if (this.getFeeding() != null)
		{
			sb.append("<feeding>");
			sb.append(this.getFeeding().toXMLString()); 
			sb.append("</feeding>");		
		}
		if (this.isIsVitaminKGiven() != null)
		{
			sb.append("<isVitaminKGiven>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsVitaminKGiven().toString()));
			sb.append("</isVitaminKGiven>");		
		}
		if (this.getRoute() != null)
		{
			sb.append("<route>");
			sb.append(this.getRoute().toXMLString()); 
			sb.append("</route>");		
		}
		if (this.get_1stPKUTestDate() != null)
		{
			sb.append("<_1stPKUTestDate>");
			sb.append(new ims.framework.utils.DateTime(this.get_1stPKUTestDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</_1stPKUTestDate>");		
		}
		if (this.get_2ndPKUTestDate() != null)
		{
			sb.append("<_2ndPKUTestDate>");
			sb.append(new ims.framework.utils.DateTime(this.get_2ndPKUTestDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</_2ndPKUTestDate>");		
		}
		if (this.getApgar1Minute() != null)
		{
			sb.append("<apgar1Minute>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApgar1Minute().toString()));
			sb.append("</apgar1Minute>");		
		}
		if (this.getApgar5Minute() != null)
		{
			sb.append("<apgar5Minute>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApgar5Minute().toString()));
			sb.append("</apgar5Minute>");		
		}
		if (this.getBirthWeight() != null)
		{
			sb.append("<birthWeight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBirthWeight().toString()));
			sb.append("</birthWeight>");		
		}
		if (this.getLength() != null)
		{
			sb.append("<length>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLength().toString()));
			sb.append("</length>");		
		}
		if (this.getDischargeWeight() != null)
		{
			sb.append("<dischargeWeight>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDischargeWeight().toString()));
			sb.append("</dischargeWeight>");		
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
			NeoNatal domainObject = getNeoNatalfromXML(itemEl, factory, domMap);

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
			NeoNatal domainObject = getNeoNatalfromXML(itemEl, factory, domMap);

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
		
	public static NeoNatal getNeoNatalfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getNeoNatalfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static NeoNatal getNeoNatalfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!NeoNatal.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!NeoNatal.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the NeoNatal class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (NeoNatal)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(NeoNatal.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		NeoNatal ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (NeoNatal)factory.getImportedDomainObject(NeoNatal.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new NeoNatal();
		}
		String keyClassName = "NeoNatal";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (NeoNatal)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, NeoNatal obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dischargingNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDischargingNurse(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("gestationWeeks");
		if(fldEl != null)
		{	
    		obj.setGestationWeeks(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isMidwife");
		if(fldEl != null)
		{	
    		obj.setIsMidwife(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isHealthVisitor");
		if(fldEl != null)
		{	
    		obj.setIsHealthVisitor(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("feeding");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFeeding(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isVitaminKGiven");
		if(fldEl != null)
		{	
    		obj.setIsVitaminKGiven(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("route");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRoute(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("_1stPKUTestDate");
		if(fldEl != null)
		{	
    		obj.set_1stPKUTestDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("_2ndPKUTestDate");
		if(fldEl != null)
		{	
    		obj.set_2ndPKUTestDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("apgar1Minute");
		if(fldEl != null)
		{	
    		obj.setApgar1Minute(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("apgar5Minute");
		if(fldEl != null)
		{	
    		obj.setApgar5Minute(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("birthWeight");
		if(fldEl != null)
		{	
    		obj.setBirthWeight(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("length");
		if(fldEl != null)
		{	
    		obj.setLength(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeWeight");
		if(fldEl != null)
		{	
    		obj.setDischargeWeight(new java.lang.Float(fldEl.getTextTrim()));	
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
		public static final String DischargingNurse = "dischargingNurse";
		public static final String GestationWeeks = "gestationWeeks";
		public static final String IsMidwife = "isMidwife";
		public static final String IsHealthVisitor = "isHealthVisitor";
		public static final String Feeding = "feeding";
		public static final String IsVitaminKGiven = "isVitaminKGiven";
		public static final String Route = "route";
		public static final String _1stPKUTestDate = "_1stPKUTestDate";
		public static final String _2ndPKUTestDate = "_2ndPKUTestDate";
		public static final String Apgar1Minute = "apgar1Minute";
		public static final String Apgar5Minute = "apgar5Minute";
		public static final String BirthWeight = "birthWeight";
		public static final String Length = "length";
		public static final String DischargeWeight = "dischargeWeight";
		public static final String IsComplete = "isComplete";
	}
}

