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
package ims.nursing.careplans.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class CarePlanEvaluationNote extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1010100004;
	private static final long serialVersionUID = 1010100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private java.util.Date recordedDateTime;
	private ims.core.resource.people.domain.objects.Hcp recordedBy;
	private String note;
	private ims.core.resource.people.domain.objects.Hcp correctedBy;
	private java.util.Date correctionDateTime;
	private String correctionReason;
	/** True = Active, False = Inactive. Evaluation note correction. */
	private Boolean active;
	/** Confirmed By (Required if the user is a student nurse) */
	private ims.core.resource.people.domain.objects.Hcp confirmedBy;
	/** Confirmed Date Time (Required if the user is a student nurse) */
	private java.util.Date confirmedDateTime;
	/** carePlan */
	private ims.nursing.careplans.domain.objects.CarePlan carePlan;
    public CarePlanEvaluationNote (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CarePlanEvaluationNote ()
    {
    	super();
    }
    public CarePlanEvaluationNote (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.nursing.careplans.domain.objects.CarePlanEvaluationNote.class;
	}


	public java.util.Date getRecordedDateTime() {
		return recordedDateTime;
	}
	public void setRecordedDateTime(java.util.Date recordedDateTime) {
		this.recordedDateTime = recordedDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getRecordedBy() {
		return recordedBy;
	}
	public void setRecordedBy(ims.core.resource.people.domain.objects.Hcp recordedBy) {
		this.recordedBy = recordedBy;
	}

	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		if ( null != note && note.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for note. Tried to set value: "+
				note);
		}
		this.note = note;
	}

	public ims.core.resource.people.domain.objects.Hcp getCorrectedBy() {
		return correctedBy;
	}
	public void setCorrectedBy(ims.core.resource.people.domain.objects.Hcp correctedBy) {
		this.correctedBy = correctedBy;
	}

	public java.util.Date getCorrectionDateTime() {
		return correctionDateTime;
	}
	public void setCorrectionDateTime(java.util.Date correctionDateTime) {
		this.correctionDateTime = correctionDateTime;
	}

	public String getCorrectionReason() {
		return correctionReason;
	}
	public void setCorrectionReason(String correctionReason) {
		if ( null != correctionReason && correctionReason.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for correctionReason. Tried to set value: "+
				correctionReason);
		}
		this.correctionReason = correctionReason;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public ims.core.resource.people.domain.objects.Hcp getConfirmedBy() {
		return confirmedBy;
	}
	public void setConfirmedBy(ims.core.resource.people.domain.objects.Hcp confirmedBy) {
		this.confirmedBy = confirmedBy;
	}

	public java.util.Date getConfirmedDateTime() {
		return confirmedDateTime;
	}
	public void setConfirmedDateTime(java.util.Date confirmedDateTime) {
		this.confirmedDateTime = confirmedDateTime;
	}

	public ims.nursing.careplans.domain.objects.CarePlan getCarePlan() {
		return carePlan;
	}
	public void setCarePlan(ims.nursing.careplans.domain.objects.CarePlan carePlan) {
		this.carePlan = carePlan;
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
		
		auditStr.append("\r\n*recordedDateTime* :");
		auditStr.append(recordedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordedBy* :");
		if (recordedBy != null)
		{
			auditStr.append(toShortClassName(recordedBy));
				
		    auditStr.append(recordedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*note* :");
		auditStr.append(note);
	    auditStr.append("; ");
		auditStr.append("\r\n*correctedBy* :");
		if (correctedBy != null)
		{
			auditStr.append(toShortClassName(correctedBy));
				
		    auditStr.append(correctedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*correctionDateTime* :");
		auditStr.append(correctionDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*correctionReason* :");
		auditStr.append(correctionReason);
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedBy* :");
		if (confirmedBy != null)
		{
			auditStr.append(toShortClassName(confirmedBy));
				
		    auditStr.append(confirmedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedDateTime* :");
		auditStr.append(confirmedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*carePlan* :");
		if (carePlan != null)
		{
			auditStr.append(toShortClassName(carePlan));
				
		    auditStr.append(carePlan.getId());
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
		
		String keyClassName = "CarePlanEvaluationNote";
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
		if (this.getRecordedDateTime() != null)
		{
			sb.append("<recordedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRecordedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</recordedDateTime>");		
		}
		if (this.getRecordedBy() != null)
		{
			sb.append("<recordedBy>");
			sb.append(this.getRecordedBy().toXMLString(domMap)); 	
			sb.append("</recordedBy>");		
		}
		if (this.getNote() != null)
		{
			sb.append("<note>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNote().toString()));
			sb.append("</note>");		
		}
		if (this.getCorrectedBy() != null)
		{
			sb.append("<correctedBy>");
			sb.append(this.getCorrectedBy().toXMLString(domMap)); 	
			sb.append("</correctedBy>");		
		}
		if (this.getCorrectionDateTime() != null)
		{
			sb.append("<correctionDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getCorrectionDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</correctionDateTime>");		
		}
		if (this.getCorrectionReason() != null)
		{
			sb.append("<correctionReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCorrectionReason().toString()));
			sb.append("</correctionReason>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
		}
		if (this.getConfirmedBy() != null)
		{
			sb.append("<confirmedBy>");
			sb.append(this.getConfirmedBy().toXMLString(domMap)); 	
			sb.append("</confirmedBy>");		
		}
		if (this.getConfirmedDateTime() != null)
		{
			sb.append("<confirmedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getConfirmedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</confirmedDateTime>");		
		}
		if (this.getCarePlan() != null)
		{
			sb.append("<carePlan>");
			sb.append(this.getCarePlan().toXMLString(domMap)); 	
			sb.append("</carePlan>");		
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
			CarePlanEvaluationNote domainObject = getCarePlanEvaluationNotefromXML(itemEl, factory, domMap);

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
			CarePlanEvaluationNote domainObject = getCarePlanEvaluationNotefromXML(itemEl, factory, domMap);

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
		
	public static CarePlanEvaluationNote getCarePlanEvaluationNotefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCarePlanEvaluationNotefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CarePlanEvaluationNote getCarePlanEvaluationNotefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CarePlanEvaluationNote.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CarePlanEvaluationNote.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CarePlanEvaluationNote class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CarePlanEvaluationNote)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CarePlanEvaluationNote.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CarePlanEvaluationNote ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CarePlanEvaluationNote)factory.getImportedDomainObject(CarePlanEvaluationNote.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CarePlanEvaluationNote();
		}
		String keyClassName = "CarePlanEvaluationNote";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CarePlanEvaluationNote)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CarePlanEvaluationNote obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("recordedDateTime");
		if(fldEl != null)
		{	
    		obj.setRecordedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("recordedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("note");
		if(fldEl != null)
		{	
    		obj.setNote(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("correctedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCorrectedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("correctionDateTime");
		if(fldEl != null)
		{	
    		obj.setCorrectionDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("correctionReason");
		if(fldEl != null)
		{	
    		obj.setCorrectionReason(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("confirmedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConfirmedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("confirmedDateTime");
		if(fldEl != null)
		{	
    		obj.setConfirmedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("carePlan");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCarePlan(ims.nursing.careplans.domain.objects.CarePlan.getCarePlanfromXML(fldEl, factory, domMap)); 
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
		public static final String RecordedDateTime = "recordedDateTime";
		public static final String RecordedBy = "recordedBy";
		public static final String Note = "note";
		public static final String CorrectedBy = "correctedBy";
		public static final String CorrectionDateTime = "correctionDateTime";
		public static final String CorrectionReason = "correctionReason";
		public static final String Active = "active";
		public static final String ConfirmedBy = "confirmedBy";
		public static final String ConfirmedDateTime = "confirmedDateTime";
		public static final String CarePlan = "carePlan";
	}
}

