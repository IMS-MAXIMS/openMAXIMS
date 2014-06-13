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


public class Procedure extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1003100019;
	private static final long serialVersionUID = 1003100019L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String procedureName;
	/** 
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List taxonomyMap;
	private Boolean isActive;
	/** Activity */
	private ims.core.resource.place.domain.objects.Activity activity;
	/** procedureStatus */
	private ims.domain.lookups.LookupInstance procedureStatus;
	/** Used for searching
	  * Collection of ims.core.generic.domain.objects.Keyword.
	  */
	private java.util.List keywords;
	/** DurationInMins */
	private Integer durationInMins;
	/** Length of Stay in Days */
	private Integer lOS;
	/** Mins before a procedure that Patient will be required */
	private Integer tCILagTime;
	/** Surgeon's Category */
	private ims.domain.lookups.LookupInstance surgeonCategory;
	/** Anaesthetist's Category */
	private ims.domain.lookups.LookupInstance anaesthetistCategory;
	/** Hospital Category */
	private ims.domain.lookups.LookupInstance hospitalCategory;
    public Procedure (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Procedure ()
    {
    	super();
    }
    public Procedure (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.Procedure.class;
	}


	public String getProcedureName() {
		return procedureName;
	}
	public static Procedure getProcedureFromProcedureName(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from Procedure c where c.procedureName = :procedureName";		
		java.util.List l = factory.find(hql, new String[]{"procedureName"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. Procedure.procedureName = " + val + " returned " + l.size() + " records. " );
		return (Procedure)l.get(0);
	}
	public void setProcedureName(String procedureName) {
		if ( null != procedureName && procedureName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for procedureName. Tried to set value: "+
				procedureName);
		}
		this.procedureName = procedureName;
	}

	public java.util.List getTaxonomyMap() {
		if ( null == taxonomyMap ) {
			taxonomyMap = new java.util.ArrayList();
		}
		return taxonomyMap;
	}
	public void setTaxonomyMap(java.util.List paramValue) {
		this.taxonomyMap = paramValue;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.core.resource.place.domain.objects.Activity getActivity() {
		return activity;
	}
	public void setActivity(ims.core.resource.place.domain.objects.Activity activity) {
		this.activity = activity;
	}

	public ims.domain.lookups.LookupInstance getProcedureStatus() {
		return procedureStatus;
	}
	public void setProcedureStatus(ims.domain.lookups.LookupInstance procedureStatus) {
		this.procedureStatus = procedureStatus;
	}

	public java.util.List getKeywords() {
		if ( null == keywords ) {
			keywords = new java.util.ArrayList();
		}
		return keywords;
	}
	public void setKeywords(java.util.List paramValue) {
		this.keywords = paramValue;
	}

	public Integer getDurationInMins() {
		return durationInMins;
	}
	public void setDurationInMins(Integer durationInMins) {
		this.durationInMins = durationInMins;
	}

	public Integer getLOS() {
		return lOS;
	}
	public void setLOS(Integer lOS) {
		this.lOS = lOS;
	}

	public Integer getTCILagTime() {
		return tCILagTime;
	}
	public void setTCILagTime(Integer tCILagTime) {
		this.tCILagTime = tCILagTime;
	}

	public ims.domain.lookups.LookupInstance getSurgeonCategory() {
		return surgeonCategory;
	}
	public void setSurgeonCategory(ims.domain.lookups.LookupInstance surgeonCategory) {
		this.surgeonCategory = surgeonCategory;
	}

	public ims.domain.lookups.LookupInstance getAnaesthetistCategory() {
		return anaesthetistCategory;
	}
	public void setAnaesthetistCategory(ims.domain.lookups.LookupInstance anaesthetistCategory) {
		this.anaesthetistCategory = anaesthetistCategory;
	}

	public ims.domain.lookups.LookupInstance getHospitalCategory() {
		return hospitalCategory;
	}
	public void setHospitalCategory(ims.domain.lookups.LookupInstance hospitalCategory) {
		this.hospitalCategory = hospitalCategory;
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
		
		auditStr.append("\r\n*procedureName* :");
		auditStr.append(procedureName);
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyMap* :");
		if (taxonomyMap != null)
		{
		int i2=0;
		for (i2=0; i2<taxonomyMap.size(); i2++)
		{
			if (i2 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)taxonomyMap.get(i2);
		    if (obj != null)
			{
				if (i2 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*activity* :");
		if (activity != null)
		{
			auditStr.append(toShortClassName(activity));
				
		    auditStr.append(activity.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureStatus* :");
		if (procedureStatus != null)
			auditStr.append(procedureStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*keywords* :");
		if (keywords != null)
		{
		int i6=0;
		for (i6=0; i6<keywords.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.core.generic.domain.objects.Keyword obj = (ims.core.generic.domain.objects.Keyword)keywords.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*durationInMins* :");
		auditStr.append(durationInMins);
	    auditStr.append("; ");
		auditStr.append("\r\n*lOS* :");
		auditStr.append(lOS);
	    auditStr.append("; ");
		auditStr.append("\r\n*tCILagTime* :");
		auditStr.append(tCILagTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*surgeonCategory* :");
		if (surgeonCategory != null)
			auditStr.append(surgeonCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthetistCategory* :");
		if (anaesthetistCategory != null)
			auditStr.append(anaesthetistCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*hospitalCategory* :");
		if (hospitalCategory != null)
			auditStr.append(hospitalCategory.getText());
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
		
		String keyClassName = "Procedure";
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
		if (this.getProcedureName() != null)
		{
			sb.append("<procedureName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcedureName().toString()));
			sb.append("</procedureName>");		
		}
		if (this.getTaxonomyMap() != null)
		{
			if (this.getTaxonomyMap().size() > 0 )
			{
			sb.append("<taxonomyMap>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTaxonomyMap(), domMap));
			sb.append("</taxonomyMap>");		
			}
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getActivity() != null)
		{
			sb.append("<activity>");
			sb.append(this.getActivity().toXMLString(domMap)); 	
			sb.append("</activity>");		
		}
		if (this.getProcedureStatus() != null)
		{
			sb.append("<procedureStatus>");
			sb.append(this.getProcedureStatus().toXMLString()); 
			sb.append("</procedureStatus>");		
		}
		if (this.getKeywords() != null)
		{
			if (this.getKeywords().size() > 0 )
			{
			sb.append("<keywords>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getKeywords(), domMap));
			sb.append("</keywords>");		
			}
		}
		if (this.getDurationInMins() != null)
		{
			sb.append("<durationInMins>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDurationInMins().toString()));
			sb.append("</durationInMins>");		
		}
		if (this.getLOS() != null)
		{
			sb.append("<lOS>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLOS().toString()));
			sb.append("</lOS>");		
		}
		if (this.getTCILagTime() != null)
		{
			sb.append("<tCILagTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTCILagTime().toString()));
			sb.append("</tCILagTime>");		
		}
		if (this.getSurgeonCategory() != null)
		{
			sb.append("<surgeonCategory>");
			sb.append(this.getSurgeonCategory().toXMLString()); 
			sb.append("</surgeonCategory>");		
		}
		if (this.getAnaesthetistCategory() != null)
		{
			sb.append("<anaesthetistCategory>");
			sb.append(this.getAnaesthetistCategory().toXMLString()); 
			sb.append("</anaesthetistCategory>");		
		}
		if (this.getHospitalCategory() != null)
		{
			sb.append("<hospitalCategory>");
			sb.append(this.getHospitalCategory().toXMLString()); 
			sb.append("</hospitalCategory>");		
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
			Procedure domainObject = getProcedurefromXML(itemEl, factory, domMap);

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
			Procedure domainObject = getProcedurefromXML(itemEl, factory, domMap);

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
		
	public static Procedure getProcedurefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getProcedurefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Procedure getProcedurefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Procedure.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Procedure.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Procedure class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Procedure)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Procedure.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Procedure ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Procedure)factory.getImportedDomainObject(Procedure.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Procedure();
		}
		String keyClassName = "Procedure";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Procedure)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Procedure obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("procedureName");
		if(fldEl != null)
		{	
    		obj.setProcedureName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("taxonomyMap");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTaxonomyMap(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getTaxonomyMap(), domMap));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActivity(ims.core.resource.place.domain.objects.Activity.getActivityfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedureStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcedureStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("keywords");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setKeywords(ims.core.generic.domain.objects.Keyword.fromListXMLString(fldEl, factory, obj.getKeywords(), domMap));
		}
		fldEl = el.element("durationInMins");
		if(fldEl != null)
		{	
    		obj.setDurationInMins(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lOS");
		if(fldEl != null)
		{	
    		obj.setLOS(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tCILagTime");
		if(fldEl != null)
		{	
    		obj.setTCILagTime(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("surgeonCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSurgeonCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anaesthetistCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaesthetistCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("hospitalCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHospitalCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "taxonomyMap"
		, "keywords"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ProcedureName = "procedureName";
		public static final String TaxonomyMap = "taxonomyMap";
		public static final String IsActive = "isActive";
		public static final String Activity = "activity";
		public static final String ProcedureStatus = "procedureStatus";
		public static final String Keywords = "keywords";
		public static final String DurationInMins = "durationInMins";
		public static final String LOS = "lOS";
		public static final String TCILagTime = "tCILagTime";
		public static final String SurgeonCategory = "surgeonCategory";
		public static final String AnaesthetistCategory = "anaesthetistCategory";
		public static final String HospitalCategory = "hospitalCategory";
	}
}

