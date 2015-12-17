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
 * @author Kevin O'Carroll
 * Generated.
 */


public class CarePlanModality extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100018;
	private static final long serialVersionUID = 1074100018L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** TreatmentModality */
	private ims.domain.lookups.LookupInstance treatmentModality;
	/** isMDTModality */
	private Boolean isMDTModality;
	/** MDTSequence */
	private Integer mDTSequence;
	/** PatientAgreed */
	private ims.domain.lookups.LookupInstance patientAgreed;
	/** PatientSequence */
	private Integer patientSequence;
	/** ModalityStatus */
	private ims.domain.lookups.LookupInstance modalityStatus;
	/** CompletedDate */
	private java.util.Date completedDate;
	/** isCommenced */
	private Boolean isCommenced;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CarePlanModality (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CarePlanModality ()
    {
    	super();
    }
    public CarePlanModality (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.CarePlanModality.class;
	}


	public ims.domain.lookups.LookupInstance getTreatmentModality() {
		return treatmentModality;
	}
	public void setTreatmentModality(ims.domain.lookups.LookupInstance treatmentModality) {
		this.treatmentModality = treatmentModality;
	}

	public Boolean isIsMDTModality() {
		return isMDTModality;
	}
	public void setIsMDTModality(Boolean isMDTModality) {
		this.isMDTModality = isMDTModality;
	}

	public Integer getMDTSequence() {
		return mDTSequence;
	}
	public void setMDTSequence(Integer mDTSequence) {
		this.mDTSequence = mDTSequence;
	}

	public ims.domain.lookups.LookupInstance getPatientAgreed() {
		return patientAgreed;
	}
	public void setPatientAgreed(ims.domain.lookups.LookupInstance patientAgreed) {
		this.patientAgreed = patientAgreed;
	}

	public Integer getPatientSequence() {
		return patientSequence;
	}
	public void setPatientSequence(Integer patientSequence) {
		this.patientSequence = patientSequence;
	}

	public ims.domain.lookups.LookupInstance getModalityStatus() {
		return modalityStatus;
	}
	public void setModalityStatus(ims.domain.lookups.LookupInstance modalityStatus) {
		this.modalityStatus = modalityStatus;
	}

	public java.util.Date getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(java.util.Date completedDate) {
		this.completedDate = completedDate;
	}

	public Boolean isIsCommenced() {
		return isCommenced;
	}
	public void setIsCommenced(Boolean isCommenced) {
		this.isCommenced = isCommenced;
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
		
		auditStr.append("\r\n*treatmentModality* :");
		if (treatmentModality != null)
			auditStr.append(treatmentModality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isMDTModality* :");
		auditStr.append(isMDTModality);
	    auditStr.append("; ");
		auditStr.append("\r\n*mDTSequence* :");
		auditStr.append(mDTSequence);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientAgreed* :");
		if (patientAgreed != null)
			auditStr.append(patientAgreed.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*patientSequence* :");
		auditStr.append(patientSequence);
	    auditStr.append("; ");
		auditStr.append("\r\n*modalityStatus* :");
		if (modalityStatus != null)
			auditStr.append(modalityStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*completedDate* :");
		auditStr.append(completedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*isCommenced* :");
		auditStr.append(isCommenced);
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
		
		String keyClassName = "CarePlanModality";
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
		if (this.getTreatmentModality() != null)
		{
			sb.append("<treatmentModality>");
			sb.append(this.getTreatmentModality().toXMLString()); 
			sb.append("</treatmentModality>");		
		}
		if (this.isIsMDTModality() != null)
		{
			sb.append("<isMDTModality>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMDTModality().toString()));
			sb.append("</isMDTModality>");		
		}
		if (this.getMDTSequence() != null)
		{
			sb.append("<mDTSequence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMDTSequence().toString()));
			sb.append("</mDTSequence>");		
		}
		if (this.getPatientAgreed() != null)
		{
			sb.append("<patientAgreed>");
			sb.append(this.getPatientAgreed().toXMLString()); 
			sb.append("</patientAgreed>");		
		}
		if (this.getPatientSequence() != null)
		{
			sb.append("<patientSequence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPatientSequence().toString()));
			sb.append("</patientSequence>");		
		}
		if (this.getModalityStatus() != null)
		{
			sb.append("<modalityStatus>");
			sb.append(this.getModalityStatus().toXMLString()); 
			sb.append("</modalityStatus>");		
		}
		if (this.getCompletedDate() != null)
		{
			sb.append("<completedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCompletedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</completedDate>");		
		}
		if (this.isIsCommenced() != null)
		{
			sb.append("<isCommenced>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCommenced().toString()));
			sb.append("</isCommenced>");		
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
			CarePlanModality domainObject = getCarePlanModalityfromXML(itemEl, factory, domMap);

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
			CarePlanModality domainObject = getCarePlanModalityfromXML(itemEl, factory, domMap);

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
		
	public static CarePlanModality getCarePlanModalityfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCarePlanModalityfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CarePlanModality getCarePlanModalityfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CarePlanModality.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CarePlanModality.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CarePlanModality class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CarePlanModality)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CarePlanModality.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CarePlanModality ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CarePlanModality)factory.getImportedDomainObject(CarePlanModality.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CarePlanModality();
		}
		String keyClassName = "CarePlanModality";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CarePlanModality)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CarePlanModality obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("treatmentModality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatmentModality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isMDTModality");
		if(fldEl != null)
		{	
    		obj.setIsMDTModality(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mDTSequence");
		if(fldEl != null)
		{	
    		obj.setMDTSequence(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientAgreed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientAgreed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("patientSequence");
		if(fldEl != null)
		{	
    		obj.setPatientSequence(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("modalityStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setModalityStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("completedDate");
		if(fldEl != null)
		{	
    		obj.setCompletedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isCommenced");
		if(fldEl != null)
		{	
    		obj.setIsCommenced(new Boolean(fldEl.getTextTrim()));	
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
		public static final String TreatmentModality = "treatmentModality";
		public static final String IsMDTModality = "isMDTModality";
		public static final String MDTSequence = "mDTSequence";
		public static final String PatientAgreed = "patientAgreed";
		public static final String PatientSequence = "patientSequence";
		public static final String ModalityStatus = "modalityStatus";
		public static final String CompletedDate = "completedDate";
		public static final String IsCommenced = "isCommenced";
	}
}

